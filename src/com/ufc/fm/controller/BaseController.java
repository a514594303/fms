package com.ufc.fm.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.controller.po.RspMsgHeader;


/**
 * 
* @ClassName: BaseController  
* @Description: TODO 控制器基类
* @author: disp  
* @date 2015-9-25 下午2:52:37  
* @version 1.0  
*
 */
public class BaseController {

	public static Logger logger = Logger.getLogger(BaseController.class); 

	/**
	 * 
	 * @Autowired 与  @Resource 的区别：
	 * 1、@Autowired与@Resource都可以用来装配bean. 都可以作用在字段上，或在setter方法上。
	 * 2、@Autowired（Spring提供），默认按类型装配，配合@Qualifier可按名称装配。
	 * 3、@Resource（JavaEE5提供），默认按名称装配，若未匹配则尝试类型。可以通过name属性进行指定名称。
	 * 
	 */
	
	@Autowired
	private  HttpServletRequest request;
	
	//@Autowired	
	//private HttpServletResponse response;
	
	RspMsgHeader makeRspMsgHeader(){
		
		RspMsgHeader header = new RspMsgHeader();
		
		 String sessionid="";
		 if(request.getSession(false) != null)
			 sessionid = request.getSession(false).getId();
		 else
			 sessionid = request.getSession(true).getId();	
		 logger.debug("服务端SessionId："+sessionid);
		 
		header.setSessionId(sessionid);

		//header.setOverTime("false");	//废弃
		//header.setTokenKey("Ignore me"); //暂不使用
		header.setStatus(ErrorCode.SUCCEED);
		
		return header;
	}
	Map<String, Object> makeResultMap(){
		return new HashMap<String, Object>();
	}	

	ModelAndView makeResultMav(RspMsgHeader msgHeader,Map<String, Object>... resultMaps){
		
		//私有参数
		Map<String, Object> all = new HashMap<String, Object>();
		for(Map<String, Object> temp : resultMaps){
			if(temp != null)
				all.putAll(temp);			
		}
		
		//公共参数
		all.put("SessionId", msgHeader.getSessionId());
		//all.put("OverTime", msgHeader.getOverTime());		
		all.put("Status", msgHeader.getStatus());		
		all.put("ErrorMsg", msgHeader.getErrorMsg());		
		all.put("TokenKey", msgHeader.getTokenKey());			
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("jsonView", all);

		//JsonView view = new JsonView();
		//mav.setView(view);
		mav.setViewName("make.json");
		
		logger.debug(msgHeader.getStatus()+":"+msgHeader.getErrorMsg());
		
		return mav;
	}
	
	ModelAndView makeResultMav(RspMsgHeader msgHeader,Map<String, Object> resultMap,List< Map<String, Object> > resultQuery){
		
		//私有参数
		Map<String, Object> all = new HashMap<String, Object>();
		if(resultMap != null){
			all.putAll(resultMap);	
		}
		
		if(resultQuery == null){//终端解析要求 
			resultQuery = new ArrayList<Map<String, Object>>();
		}
		all.put("datalist", resultQuery);	
		
		//公共参数
		all.put("SessionId", msgHeader.getSessionId());
		//all.put("OverTime", msgHeader.getOverTime());		
		all.put("Status", msgHeader.getStatus());		
		all.put("ErrorMsg", msgHeader.getErrorMsg());		
		all.put("TokenKey", msgHeader.getTokenKey());			
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("jsonView", all);

		//JsonView view = new JsonView();
		//mav.setView(view);
		mav.setViewName("make.json");
		
		return mav;		
	}
	
	protected String uploadImageFile(HttpServletRequest request,
			String subTypeName) throws Exception{
		
		String url=null;
		List<String> urlList = uploadImageFiles(request,subTypeName,null);
		if(urlList!=null && urlList.size()>0){
			url = urlList.get(0);
		}
		return url;
	}
	
	protected List<String> uploadImageFiles(HttpServletRequest request,
			String subTypeName,
			String startNum) throws Exception{
		
		List<String> urlList = new ArrayList<String>();
		
		int nStartNum = (startNum == null) ? 0: Integer.parseInt(startNum);	//NumberFormatException 
		

		// 解析器解析request的上下文
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());

		// 先判断request中是否包涵multipart类型的数据，再将request中的数据转化成multipart类型的数据
		if (multipartResolver.isMultipart(request)) {

			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			Iterator<String> iter = multiRequest.getFileNames();
			while (iter.hasNext()) {
				MultipartFile file = multiRequest.getFile((String) iter.next());
				if (file != null) {
					String fileName = file.getOriginalFilename();
					if(fileName != null && !fileName.isEmpty()){
						String title = fileName.substring(0, fileName.lastIndexOf("."));// 获取文件名
				        String suffix = fileName.substring(fileName.lastIndexOf("."));	// 获取后缀名
				        
				        String newFileName=null;
				        if(startNum == null){
				        	newFileName = title + "_" + UUID.randomUUID().toString()+suffix;
				        }
				        else{ //多文件序号命名
				        	String num = String.format("%03d",nStartNum++);
				        	newFileName = title + "_" + num + "_" +UUID.randomUUID().toString()+suffix;				        	
				        }

						File dirTmp = new File(getImgRealPath(request, subTypeName));
						if (!dirTmp.exists()) { // 检测目录并创建
							dirTmp.mkdirs(); // .mkdirs();
						}
						File localFile = new File(dirTmp, newFileName);
						file.transferTo(localFile);

						String url = getImgBaseUrl(request, subTypeName) + "/" + newFileName;
						urlList.add(url);
					}
					else{
						//rspMsgHeader.setStatus(ErrorCode.SYSTEM_ERROR);
						//rspMsgHeader.setErrorMsg("上传文件名为空");	
						throw new IllegalStateException("NullFileName");
					}

					if(startNum == null){
						break;	//仅提取一个文件						
					}

					
				}//endif
				
			}//end while
		}
		else{
			throw new IllegalStateException("IllegalEnctype");
		}
		
		return urlList;
	}

	private String getImgRealPath(HttpServletRequest request, String path) {
		StringBuilder url = new StringBuilder();
		String imgBasePath = getImgBasePath();
		if (imgBasePath.startsWith(".")) {
			url.append(request.getSession().getServletContext().getRealPath(imgBasePath));
		} else {
			url.append(imgBasePath);
		}
		return url.append("/").append(path).toString();
	}

	private String getImgBaseUrl(HttpServletRequest request, String path) {
		StringBuilder url = new StringBuilder();
		String imgBasePath = getImgBasePath();
		if (imgBasePath.startsWith(".")) {
			url.append(request.getScheme()).append("://").append(request.getServerName()).append(":").append(request.getServerPort()).append(request.getContextPath()).append("/");
		}
		return url.append(imgBasePath).append("/").append(path).toString();
	}

	@Value("#{configProperties['config.image.window.basePath']}")
	private String windowImgBasePath;
	@Value("#{configProperties['config.image.linux.basePath']}")
	private String linuxImgBasePath;

	private String getImgBasePath() {
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
			return windowImgBasePath;
		} else {
			return linuxImgBasePath;
		}
	}

}
