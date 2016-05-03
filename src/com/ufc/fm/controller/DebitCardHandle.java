package com.ufc.fm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.controller.po.ReqMsgHeader;
import com.ufc.fm.controller.po.RspMsgHeader;
import com.ufc.fm.engine.JsonHelper;

/**
 * 
* @ClassName: DebitCardHandle  
* @Description: TODO 
* @author: disp  
* @date 2015-11-4 上午10:32:33  
* @version 1.0  
*
 */

@Controller
@RequestMapping("/fmapp/v1/debitcard")
public class DebitCardHandle extends BaseController {


	@RequestMapping(value = "/apply_saveinfo")
	public ModelAndView doApplySaveinfo(ReqMsgHeader reqMsgHeader,String jsondata)
			throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();
		   
        logger.debug("body:"+jsondata);	 
        
		Map<String, Map<String, Object> > mvm = JsonHelper.mvmFromJson(jsondata);
		if(mvm == null){
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg("传递参数不符");			
		}
		else{
	        Map<String, Object> tmp = mvm.get("tmpkey");			
	        if(tmp != null){
	        	
	        }
	        
        	rspMsgHeader.setStatus("0000");
        	result.put("cust_id", "402");		
        	
		}
   
	        
		return makeResultMav(rspMsgHeader, result);

	}	
	
	@RequestMapping(value = "/apply_saveimg")
	public ModelAndView doApplySaveimg(HttpServletRequest request,ReqMsgHeader reqMsgHeader, 
			String cust_id,String imgtype)
			throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();
		
		if(cust_id == null || cust_id.isEmpty() 
				|| imgtype == null || imgtype.isEmpty()){
			
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg("传递参数不符");			
		}
		else{
			
			try{ 
				logger.debug("cust_id:"+cust_id);	
				logger.debug("imgtype:"+imgtype);	
				
				List<String> imgUrlList = uploadImageFiles(request,"dc",imgtype);
				for(String imgUrl : imgUrlList){
					   logger.debug("imgurl:"+imgUrl);	
					   //将cust_id,imgurl,imgtype关联，并删除已有关联，保存入库
				}
	
				
	        } catch (Exception e) {
	            e.printStackTrace();
				rspMsgHeader.setStatus(ErrorCode.SYSTEM_ERROR);
				rspMsgHeader.setErrorMsg("上传文件失败");
			}
				
		}
		
		return makeResultMav(rspMsgHeader, result);

	}
		
	
	@RequestMapping(value = "/apply")
	public ModelAndView doApply(ReqMsgHeader reqMsgHeader, 
			String cust_id,String dc_cardno,String dc_password)
			throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();
		   

		result.put("dc_status", "5");	
		result.put("txn_num", "3254365345");			
		result.put("dc_rejreason", "有其他借记卡欠费记录");	
		
		rspMsgHeader.setStatus("0000");
		rspMsgHeader.setErrorMsg("dc apply");
		   
		return makeResultMav(rspMsgHeader, result);

	}	
	

}
