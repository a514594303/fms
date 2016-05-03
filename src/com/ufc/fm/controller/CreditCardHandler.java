package com.ufc.fm.controller;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.controller.po.ReqMsgHeader;
import com.ufc.fm.controller.po.RspMsgHeader;
import com.ufc.fm.dbio.po.FmCreditcardProgress;
import com.ufc.fm.dbio.po.FmLoanProgress;
import com.ufc.fm.engine.JsonHelper;
import com.ufc.fm.service.CreditCardService;


/**
 * 
 * @ClassName: CreditCardHandler
 * @Description: TODO
 * @author: disp
 * @date 2015-10-20 下午3:01:41
 * @version 1.0
 * 
 */

@Controller
@RequestMapping("/fmapp/v1/creditcard")
public class CreditCardHandler extends BaseController {

	@Autowired 
	@Qualifier("creditCardService")
	private CreditCardService creditCardService;
	
	@RequestMapping(value = "/showprod")
	public ModelAndView doShowprod(HttpServletRequest request,ReqMsgHeader reqMsgHeader)
			throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		StringBuilder hostUrl = new StringBuilder();
		hostUrl.append(request.getScheme()).append("://").append(request.getServerName()).append(":").append(request.getServerPort()).append(request.getContextPath());
		
		ArrayList<Map<String, Object>> resultQuery = new ArrayList<Map<String, Object>>();

		Map<String, Object> p1 = new HashMap<String, Object>();
		p1.put("name", "广发车主信用卡");
		p1.put("imgurl", hostUrl+"/images/cc/czk.jpg");
		p1.put("remark","此信用卡是广发银行与XXXXX公司共同推出的联名行用卡，该卡转为XX人士设计，赠送xxx保险，提供xxxx服务，以满足XXX人士的用卡需求。");
		p1.put("cardtype","1");
		
		Map<String, Object> p2 = new HashMap<String, Object>();
		p2.put("name", "广发淘宝型男卡");
		p2.put("imgurl", hostUrl+"/images/cc/tbn.jpg");
		p2.put("remark","此信用卡是广发银行与XXXXX公司共同推出的联名行用卡，该卡转为XX人士设计，赠送xxx保险，提供xxxx服务，以满足XXX人士的用卡需求。");	
		p2.put("cardtype","2");
		
		Map<String, Object> p3 = new HashMap<String, Object>();
		p3.put("name", "广发淘宝型女卡");
		p3.put("imgurl", hostUrl+"/images/cc/tbv.jpg");
		p3.put("remark","此信用卡是广发银行与XXXXX公司共同推出的联名行用卡，该卡转为XX人士设计，赠送xxx保险，提供xxxx服务，以满足XXX人士的用卡需求。");			
		p3.put("cardtype","3");
		
		Map<String, Object> p4 = new HashMap<String, Object>();
		p4.put("name", "广发携程信用卡");
		p4.put("imgurl", hostUrl+"/images/cc/xck.jpg");	
		p4.put("remark","此信用卡是广发银行与XXXXX公司共同推出的联名行用卡，该卡转为XX人士设计，赠送xxx保险，提供xxxx服务，以满足XXX人士的用卡需求。");		
		p4.put("cardtype","4");
		
		resultQuery.add(p1);
		resultQuery.add(p2);		
		resultQuery.add(p3);		
		resultQuery.add(p4);
		
		return makeResultMav(rspMsgHeader, result, resultQuery);

	}

	
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
        	result.put("cust_id", "302");		
        	
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
				
				List<String> imgUrlList = uploadImageFiles(request,"cc",imgtype);
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
	public ModelAndView doApply(ReqMsgHeader reqMsgHeader, String cust_id)
			throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();
		   
		result.put("txn_num", "881090112430123");	
		
		rspMsgHeader.setStatus("0000");
		rspMsgHeader.setErrorMsg("cc apply");
		   
		return makeResultMav(rspMsgHeader, result);

	}	
	
	
	@RequestMapping(value = "/progress")
	public ModelAndView doProgress(ReqMsgHeader reqMsgHeader,
			String start_date,
			String end_date,
			String cust_id,
			String cust_name,
			String identity_card,
			String cc_status)
			throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();
		List<Map<String, Object> > resultRec = null;
			
		List<FmCreditcardProgress> prog = creditCardService.inquireProgress(reqMsgHeader.getUserName(), 
				start_date,end_date,cust_id,cust_name,identity_card,cc_status);
			
		resultRec = new ArrayList<Map<String, Object> >();		
		
		if(prog != null && prog.size()>0){
			
			for(int n=0;n<prog.size();n++){
				FmCreditcardProgress rec = prog.get(n);
				Map<String, Object> temp = new HashMap<String, Object>();
				temp.put("cust_id", rec.getCustId());
				temp.put("cust_name", rec.getCustName());				
				temp.put("cc_date", rec.getCcDate());				
				temp.put("cc_status", rec.getCcStatus());
				temp.put("cc_rejreason", rec.getCcRejreason()==null ? "":rec.getCcRejreason());	
				resultRec.add(temp);
				
			}
			
		}

		return makeResultMav(rspMsgHeader, result,resultRec);

	}
	
}
