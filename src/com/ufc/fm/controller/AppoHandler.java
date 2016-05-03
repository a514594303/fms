package com.ufc.fm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.controller.po.ReqMsgHeader;
import com.ufc.fm.controller.po.RspMsgHeader;
import com.ufc.fm.dbio.po.FmAppo;
import com.ufc.fm.dbio.po.FmCust;
import com.ufc.fm.dbio.po.FmTask;
import com.ufc.fm.engine.ReflectDbioPo;
import com.ufc.fm.service.AppoService;
import com.ufc.fm.service.CustService;
import com.ufc.fm.service.IJPushService;
import com.ufc.fm.service.TaskService;

/**
 * 
* @ClassName: AppoHandler  
* @Description: TODO 
* @author: disp  
* @date 2015-12-1 上午11:18:34  
* @version 1.0  
*
 */

@Controller
@RequestMapping({"/fmapp/v1/appo"})
public class AppoHandler extends BaseController{

	@Autowired
	private TaskService taskService;
	@Autowired
	private CustService custService;
	@Autowired
	private AppoService appoService;
	@Autowired
	private IJPushService JPushService;
	
	@RequestMapping(value = "/add")
	public ModelAndView doAdd(ReqMsgHeader reqMsgHeader,
			String cust_id,
			String task_id,			
			String appo_dt,
			String appo_place,
			String remark) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();			
	       
		if(cust_id == null || task_id == null){
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg("传递参数不符");
		}
		else
		{
			FmAppo appo = new FmAppo();
			appo.setCustId(cust_id);
			appo.setTaskId(task_id);
			appo.setAppoDt(appo_dt);
			appo.setAppoPlace(appo_place);
			appo.setRemark(remark);
			String newAppoid = appoService.addAppo(appo);
			if(newAppoid==null){
				rspMsgHeader.setStatus(ErrorCode.SYSTEM_SOP_ERROR);
				rspMsgHeader.setErrorMsg(ErrorCode.SYSTEM_SOP_ERROR_MSG);					
			}
			else{
				result.put("appo_id", newAppoid);
				JPushService.sendPushWithUser(reqMsgHeader.getUserName(), "0002:有新预约");
			}
				
		}
		
		return makeResultMav(rspMsgHeader,result);
	}	
	
	@RequestMapping(value = "/process")
	public ModelAndView doProcess(ReqMsgHeader reqMsgHeader,
			String cust_id,String task_id,String appo_id,String proc_type) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();			

		if (appoService.processAppo(cust_id, task_id, appo_id, proc_type)) {
			JPushService.sendPushWithUser(reqMsgHeader.getUserName(), "0002:预约状态有变更");
		} else {
			rspMsgHeader.setStatus(ErrorCode.SYSTEM_SOP_ERROR);
			rspMsgHeader.setErrorMsg(ErrorCode.SYSTEM_SOP_ERROR_MSG);
		}
	
		return makeResultMav(rspMsgHeader,result);
	}	
	
	@RequestMapping(value = "/query")
	public ModelAndView doQuery(ReqMsgHeader reqMsgHeader,
			String cust_id,String task_id,String appo_id) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();	
		
		Map<String, Object> resultQuery = null;
		if(cust_id == null || task_id == null || appo_id==null ){
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg(ErrorCode.PARAMETER_ERROR_MSG);	
		}
		else{
			
			FmAppo fmAppo = appoService.queryAppo(cust_id, task_id,appo_id);
			if(fmAppo == null){
				rspMsgHeader.setStatus(ErrorCode.APPO_NOT_EXIST);
				rspMsgHeader.setErrorMsg(ErrorCode.APPO_NOT_EXIST_MSG);
			}
			else{
				
				resultQuery = new HashMap<String, Object>();
				
				FmCust fmCust = custService.queryCust(cust_id, null);
				FmTask fmTask = taskService.queryTask(cust_id, task_id);
				
				resultQuery.put("custinfo", ReflectDbioPo.fmPo2Map(fmCust));
				resultQuery.put("taskinfo", ReflectDbioPo.fmPo2Map(fmTask));
				resultQuery.put("appoinfo", ReflectDbioPo.fmPo2Map(fmAppo));				

			}
	
		}
		
	
		return makeResultMav(rspMsgHeader,result,resultQuery);
	}	
	
	@RequestMapping(value = "/querylist")
	public ModelAndView doQueryList(ReqMsgHeader reqMsgHeader, String cust_id, String name, String identity_type, String identity_card, String mobile_phone, String home_phone, String task_id, String appo_id, String appo_status) throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		List<Map<String, Object>> resultQuery = null;
		
		List<FmAppo> fmAppoList = appoService.queryAppoList(cust_id, name, identity_type, identity_card, mobile_phone, home_phone, task_id, appo_id, appo_status);
		if(fmAppoList.size()>0){
			resultQuery = new ArrayList<Map<String, Object>>();	
			for(FmAppo appo : fmAppoList){
				resultQuery.add( ReflectDbioPo.fmPo2Map(appo));				
			}
			
		}

		return makeResultMav(rspMsgHeader, result, resultQuery);
	}	
	
	
}
