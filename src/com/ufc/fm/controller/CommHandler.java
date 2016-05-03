package com.ufc.fm.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.controller.po.ReqMsgHeader;
import com.ufc.fm.controller.po.RspMsgHeader;
import com.ufc.fm.service.CommService;
import com.ufc.fm.service.CustomerService;


/**
 * 
* @ClassName: CommHandler  
* @Description: TODO 
* @author: disp  
* @date 2015-9-28 下午3:00:17  
* @version 1.0  
*
 */

@Controller
@RequestMapping("/fmapp/v1/comm")
public class CommHandler extends BaseController{

	@Autowired 
	@Qualifier("commService")
	private CommService commService;
	
	@RequestMapping(value = "/getdictlist")
	public ModelAndView doGetDictlist(ReqMsgHeader reqMsgHeader, String dictlist)
			throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = commService.getDictlist(dictlist);
	

		return makeResultMav(rspMsgHeader, result);
	}
	
	@Value("#{configProperties['config.doc.window.basePath']}")
	private String windowDocBasePath;
	@Value("#{configProperties['config.doc.linux.basePath']}")
	private String linuxDocBasePath;
	
	@Value("#{configProperties['config.licurl.ln001']}")	 
    private String licUrlLn001; 	
	@Value("#{configProperties['config.licurl.cc001']}")	 
    private String licUrlCc001; 	
	@Value("#{configProperties['config.licurl.dc001']}")	 
    private String licUrlDc001; 	
	
	@RequestMapping(value = "/getlicurl")
	public ModelAndView doGetLicUrl(HttpServletRequest request,ReqMsgHeader reqMsgHeader, String lic_type)
			throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();
		
		if(lic_type == null || lic_type.isEmpty()){
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg("传递参数不符");			
		}
		else{
			
			String licUrl=null;
			if(lic_type.equalsIgnoreCase("LN001")){
				licUrl = getDocBaseUrl(request,licUrlLn001);
			}
			else if(lic_type.equalsIgnoreCase("CC001")){
				licUrl =getDocBaseUrl(request,licUrlCc001) ;			
			}
			else if(lic_type.equalsIgnoreCase("DC001")){
				licUrl = getDocBaseUrl(request,licUrlDc001);			
			}
			else{
				;//carefully
			}
			
			result.put("lic_url", licUrl);
		}

		return makeResultMav(rspMsgHeader, result);
	}	

	
	private String getDocBaseUrl(HttpServletRequest request, String path) {
		StringBuilder url = new StringBuilder();
		String imgBasePath = getDocBasePath();
		if (imgBasePath.startsWith(".")) {
			url.append(request.getScheme()).append("://").append(request.getServerName()).append(":").append(request.getServerPort()).append(request.getContextPath());
			imgBasePath=imgBasePath.substring(1, imgBasePath.length());
		}
		return url.append(imgBasePath).append(path).toString();
	}
	
	private String getDocBasePath() {
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
			return windowDocBasePath;
		} else {
			return linuxDocBasePath;
		}
	}
}
