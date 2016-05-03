package com.ufc.fm.service;

import java.util.List;

import com.ufc.fm.dbio.po.FmTask;

/**
 * 
 * @ClassName: TaskService
 * @Description: TODO 任务管理服务接口
 * @author: disp
 * @date 2015-11-25
 * @version 1.0
 *
 */
public interface TaskService extends BaseService {

	/**
	 * 查询指定息
	 */
	public FmTask queryTask(String cust_id, String task_id);

	/**
	 * 查询列表
	 */
	public List<FmTask> queryTaskList(String custId, String name, String identityType, String identityCard, String mobilePhone, String homePhone, String taskStatus);

	/**
	 * 添加
	 */
	public String addTask(FmTask task);

	/**
	 * 更新
	 */
	public boolean updateTask(FmTask task);

	/**
	 * 删除
	 */
	public boolean deleteTask(String cust_id, String task_id);

	/**
	 * 设置模式
	 */
	public boolean setOpMode(String mode);

	/**
	 * 处理任务
	 */
	public boolean processTask(String cust_id, String task_id, String proc_type);

}
