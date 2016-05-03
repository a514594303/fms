package com.ufc.fm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.controller.po.ReqMsgHeader;
import com.ufc.fm.controller.po.RspMsgHeader;
import com.ufc.fm.dbio.po.FmCust;
import com.ufc.fm.engine.JsonHelper;
import com.ufc.fm.engine.ReflectDbioPo;
import com.ufc.fm.service.CustService;

/**
 * 
 * @ClassName: CustHandler
 * @Description: TODO
 * @author: disp
 * @date 2015-9-28 下午3:01:41
 * @version 1.0
 * 
 */

@Controller
@RequestMapping("/fmapp/v1/cust") 
public class CustHandler extends BaseController {

	@Autowired 
	@Qualifier("custService")
	private CustService custService;

	@RequestMapping(value = "/query")
	public ModelAndView doQuery(ReqMsgHeader reqMsgHeader, String cust_id, String identity_card) throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		Map<String, Object> resultQuery = null;
		if (StringUtils.isBlank(cust_id) && StringUtils.isBlank(identity_card)) {
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg(ErrorCode.PARAMETER_ERROR_MSG);	
		} else {
			FmCust fmCust = custService.queryCust(cust_id, identity_card);
			if(fmCust == null){
				rspMsgHeader.setStatus(ErrorCode.CUST_NOT_EXIST);
				rspMsgHeader.setErrorMsg(ErrorCode.CUST_NOT_EXIST_MSG);
			} else {
				resultQuery = ReflectDbioPo.fmPo2Map(fmCust);
			}
	
		}
		
		return makeResultMav(rspMsgHeader, result, resultQuery);
	}

	@RequestMapping(value = "/querylist")
	public ModelAndView doQueryList(ReqMsgHeader reqMsgHeader, String cust_id, String name, String identity_type, String identity_card, String cust_type, String mobile_phone, String home_phone) throws Exception {
		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		List<Map<String, Object>> resultQuery = null;

		List<FmCust> fmCustList = custService.queryCustList(cust_id, name, identity_type, identity_card, cust_type, mobile_phone, home_phone);
		if (fmCustList.size() > 0) {
			resultQuery = new ArrayList<Map<String, Object>>();
			for (FmCust cust : fmCustList) {
				resultQuery.add(ReflectDbioPo.fmPo2Map(cust));
			}
		}

		return makeResultMav(rspMsgHeader, result, resultQuery);
	}

	@RequestMapping(value = "/add")
	public ModelAndView doAdd(ReqMsgHeader reqMsgHeader, String jsondata)
			throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		   
        logger.debug("body:"+jsondata);	 
        
		Map<String, Object> rec = JsonHelper.mvmFromJson(jsondata).get("custinfo");
		if(rec == null){
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg(ErrorCode.PARAMETER_ERROR_MSG);
		}
		else
		{
			FmCust cust = (FmCust)ReflectDbioPo.map2FmPop(rec,FmCust.class);
			String cust_id = custService.addCust(cust);
			if(cust_id==null){
				rspMsgHeader.setStatus(ErrorCode.SYSTEM_SOP_ERROR);
				rspMsgHeader.setErrorMsg(ErrorCode.SYSTEM_SOP_ERROR_MSG);					
			}
			else{
				result.put("cust_id", cust_id);
			}
				
		}
	
		return makeResultMav(rspMsgHeader, result);
	}

	@RequestMapping(value = "/update")
	public ModelAndView doUpadae(ReqMsgHeader reqMsgHeader, String jsondata)
			throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		System.out.println("==========="+jsondata);
		
		Map<String, Object> rec = JsonHelper.mvmFromJson(jsondata).get("custinfo");
		if(rec == null){
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg(ErrorCode.PARAMETER_ERROR_MSG);			
		}
		else
		{
			FmCust cust = (FmCust)ReflectDbioPo.map2FmPop(rec,FmCust.class);
			if(!custService.updateCust(cust)){
				rspMsgHeader.setStatus(ErrorCode.SYSTEM_SOP_ERROR);
				rspMsgHeader.setErrorMsg(ErrorCode.SYSTEM_SOP_ERROR_MSG);					
			}
		}

		return makeResultMav(rspMsgHeader, result);
	}

	@RequestMapping(value = "/delete")
	public ModelAndView doDelete(ReqMsgHeader reqMsgHeader, String cust_id)
			throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		if(cust_id == null){
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg(ErrorCode.PARAMETER_ERROR_MSG);			
		}
		else
		{
			if(!custService.deleteCust(cust_id)){
				rspMsgHeader.setStatus(ErrorCode.SYSTEM_SOP_ERROR);
				rspMsgHeader.setErrorMsg(ErrorCode.SYSTEM_SOP_ERROR_MSG);					
			}
		}
		
		return makeResultMav(rspMsgHeader, result);
	}
	

	@RequestMapping(value = "/uploadimg" , method = RequestMethod.POST)
	public ModelAndView doUploadImg(HttpServletRequest request,
			ReqMsgHeader reqMsgHeader, String cust_id) throws Exception {
		
		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		try{
			
			String imgUrl = uploadImageFile(request,"cust");
			result.put("imgurl", imgUrl);
			
        } catch (Exception e) {
            e.printStackTrace();
			rspMsgHeader.setStatus(ErrorCode.SYSTEM_ERROR);
			rspMsgHeader.setErrorMsg("上传文件失败");
		}
			


		return makeResultMav(rspMsgHeader, result);
	}

}
