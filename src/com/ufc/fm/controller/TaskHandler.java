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
import com.ufc.fm.dbio.po.FmCust;
import com.ufc.fm.dbio.po.FmTask;
import com.ufc.fm.engine.ReflectDbioPo;
import com.ufc.fm.service.CustService;
import com.ufc.fm.service.IJPushService;
import com.ufc.fm.service.TaskService;

/**
 * 
* @ClassName: TaskHandler  
* @Description: TODO 
* @author: disp  
* @date 2015-11-24 下午2:41:00  
* @version 1.0  
*
 */

@Controller
@RequestMapping({"/fmapp/v1/task"})
public class TaskHandler extends BaseController{

	@Autowired
	private TaskService taskService;
	@Autowired
	private CustService custService;
	@Autowired
	private IJPushService JPushService;

	@RequestMapping(value = "/setopmode")
	public ModelAndView doSetopmode(ReqMsgHeader reqMsgHeader,
			String opmode) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();			
		

	
		return makeResultMav(rspMsgHeader,result);
	}
	
	@RequestMapping(value = "/add")
	public ModelAndView doAdd(ReqMsgHeader reqMsgHeader,
			String cust_id,
			String txn_type,
			String prod_id,
			String remark) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();			
	       
		if(cust_id == null){
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg("传递参数不符");
		}
		else
		{
			FmTask task = new FmTask();
			task.setCustId(cust_id);
			task.setTxnType(txn_type);
			task.setProdId(prod_id);
			task.setRemark(remark);
			String newTaskid = taskService.addTask(task);
			if(newTaskid==null){
				rspMsgHeader.setStatus(ErrorCode.SYSTEM_SOP_ERROR);
				rspMsgHeader.setErrorMsg(ErrorCode.SYSTEM_SOP_ERROR_MSG);					
			}
			else{
				result.put("task_id", newTaskid);
				JPushService.sendPushWithUser(reqMsgHeader.getUserName(), "0001:有新任务");
			}
				
		}
		
		return makeResultMav(rspMsgHeader,result);
	}	
	
	@RequestMapping(value = "/process")
	public ModelAndView doProcess(ReqMsgHeader reqMsgHeader,
			String cust_id,String task_id,String proc_type) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();			

		if (taskService.processTask(cust_id, task_id, proc_type)) {
			JPushService.sendPushWithUser(reqMsgHeader.getUserName(), "0001:任务状态有变更");
		} else {
			rspMsgHeader.setStatus(ErrorCode.SYSTEM_SOP_ERROR);
			rspMsgHeader.setErrorMsg(ErrorCode.SYSTEM_SOP_ERROR_MSG);
		}
	
		return makeResultMav(rspMsgHeader,result);
	}	
	
	@RequestMapping(value = "/query")
	public ModelAndView doQuery(ReqMsgHeader reqMsgHeader,
			String cust_id,String task_id) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();	
		
		Map<String, Object> resultQuery = null;
		if( (cust_id == null || cust_id.isEmpty() ) ||
				(task_id == null || task_id.isEmpty()) ){
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg(ErrorCode.PARAMETER_ERROR_MSG);	
		}
		else{
			
			FmTask fmTask = taskService.queryTask(cust_id, task_id);
			if(fmTask == null){
				rspMsgHeader.setStatus(ErrorCode.TASK_NOT_EXIST);
				rspMsgHeader.setErrorMsg(ErrorCode.TASK_NOT_EXIST_MSG);
			}
			else{
				
				resultQuery = new HashMap<String, Object>();
				
				FmCust fmCust = custService.queryCust(cust_id, null);
				
				resultQuery.put("custinfo", ReflectDbioPo.fmPo2Map(fmCust));
				resultQuery.put("taskinfo", ReflectDbioPo.fmPo2Map(fmTask));

			}
	
		}
		
	
		return makeResultMav(rspMsgHeader,result,resultQuery);
	}	
	
	@RequestMapping(value = "/querylist")
	public ModelAndView doQueryList(ReqMsgHeader reqMsgHeader, String cust_id, String name, String identity_type, String identity_card, String mobile_phone, String home_phone, String task_status) throws Exception {
		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		List<Map<String, Object>> resultQuery = null;

		List<FmTask> fmTaskList = taskService.queryTaskList(cust_id, name, identity_type, identity_card, mobile_phone, home_phone, task_status);
		if (fmTaskList.size() > 0) {
			resultQuery = new ArrayList<Map<String, Object>>();
			for (FmTask task : fmTaskList) {
				resultQuery.add(ReflectDbioPo.fmPo2Map(task));
			}
		}

		return makeResultMav(rspMsgHeader, result, resultQuery);
	}	
	
	
}
