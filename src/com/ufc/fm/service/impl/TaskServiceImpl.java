package com.ufc.fm.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufc.fm.dbio.mapper.FmTaskMapper;
import com.ufc.fm.dbio.po.FmTask;
import com.ufc.fm.dbio.po.FmTaskKey;
import com.ufc.fm.service.TaskService;

/**
 * 
* @ClassName: TaskServiceImpl  
* @Description: TODO 
* @author: disp  
* @date 2015-11-25 下午4:31:17  
* @version 1.0  
*
 */

@Service("taskService")
@Transactional(rollbackFor = { RuntimeException.class, Exception.class }, timeout = 30)
public class TaskServiceImpl implements TaskService {

	public static final String TASK_STATUS_NEW 			= "10";
	public static final String TASK_STATUS_WAITING 		= "20";	
	public static final String TASK_STATUS_PROCESSING	= "30";
	public static final String TASK_STATUS_REFUSED		= "40";
	public static final String TASK_STATUS_CANCELED		= "50";
	public static final String TASK_STATUS_COMPLETED	= "90";	
	
	boolean opAutoMode = true; 	//模拟自动审批
	
	@Autowired
	private FmTaskMapper fmTaskMapper;
	
	@Override
	public FmTask queryTask(String cust_id, String task_id) {
		// TODO Auto-generated method stub
		FmTaskKey taskKey = new FmTaskKey();
		taskKey.setCustId(cust_id);
		taskKey.setTaskId(task_id);
		return fmTaskMapper.selectByPrimaryKey(taskKey);
	}

	@Override
	public List<FmTask> queryTaskList(String custId, String name, String identityType, String identityCard, String mobilePhone, String homePhone, String taskStatus) {
		return fmTaskMapper.queryTasks(custId, name, identityType, identityCard, mobilePhone, homePhone, taskStatus);
	}

	@Override
	public String addTask(FmTask task) {
		// TODO Auto-generated method stub
		
		String  newTaskId = fmTaskMapper.getNextTaskId(task.getCustId());
		if(newTaskId==null){ //设置初始序号，仅演示阶段
			newTaskId="001";
		}
		else{
			int count= 3-newTaskId.length();
			for(int n=0;n<count;n++){
				newTaskId = "0"+ newTaskId;
			}
		}
		
		task.setTaskId(newTaskId);
		task.setTaskStatus(opAutoMode ? TASK_STATUS_WAITING : TASK_STATUS_NEW); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String now = dateFormat.format( new Date() ); 
		task.setCreateDate(now);

		try {
			int nRet = fmTaskMapper.insert(task);

		} catch (Exception e) {
			newTaskId = null;
		}

		return newTaskId;		
	}

	@Override
	public boolean updateTask(FmTask task) {
		// TODO Auto-generated method stub
		
		int nRet = -1;
		try {
			nRet = fmTaskMapper.updateByPrimaryKey(task);;

		} catch (Exception e) {
			;
		}

		return nRet > 0 ? true : false;		
	}

	@Override
	public boolean deleteTask(String cust_id, String task_id) {
		// TODO Auto-generated method stub
		int nRet = -1;
		try {
			FmTaskKey taskKey = new FmTaskKey();
			taskKey.setCustId(cust_id);
			taskKey.setTaskId(task_id);
			nRet = fmTaskMapper.deleteByPrimaryKey(taskKey);

		} catch (Exception e) {
			;
		}

		return nRet > 0 ? true : false;	
	}

	@Override
	public boolean setOpMode(String mode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean processTask(String cust_id, String task_id, String proc_type) {
		// TODO Auto-generated method stub
		
		int nRet = -1;
		try {
			
			String task_status = null;
			if(proc_type.equalsIgnoreCase("G")){		//G：领取
				task_status = TASK_STATUS_PROCESSING;
			}
			else if(proc_type.equalsIgnoreCase("R")){	//R：拒绝
				task_status = TASK_STATUS_REFUSED;				
			}
			else if(proc_type.equalsIgnoreCase("C")){	//C：取消
				task_status = TASK_STATUS_CANCELED;				
			}
			else if(proc_type.equalsIgnoreCase("F")){
				task_status = TASK_STATUS_COMPLETED;				
			}			
			
			if(task_status != null){
				FmTask task = new FmTask();
				task.setCustId(cust_id);
				task.setTaskId(task_id);		
				task.setTaskStatus(task_status);
				nRet = fmTaskMapper.updateByPrimaryKeySelective(task);
			}

		} catch (Exception e) {
			;
		}

		return nRet > 0 ? true : false;		
	}

}
