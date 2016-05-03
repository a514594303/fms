package com.ufc.fm.service;

import java.util.List;

import com.ufc.fm.dbio.po.FmAppo;
import com.ufc.fm.dbio.po.FmCust;
import com.ufc.fm.dbio.po.FmTask;

/**
 * 
 * @ClassName: AppoService
 * @Description: TODO 预约管理服务接口
 * @author: disp
 * @date 2015-12-1 上午10:46:35
 * @version 1.0
 *
 */
public interface AppoService extends BaseService {

	/**
	 * 查询指定预约
	 */
	public FmAppo queryAppo(String cust_id, String task_id, String appo_id);

	/**
	 * 查询列表
	 */
	public List<FmAppo> queryAppoList(String custId, String name, String identityType, String identityCard, String mobilePhone, String homePhone, String taskId, String appoId, String appoStatus);

	/**
	 * 添加新预约
	 */
	public String addAppo(FmAppo appo);

	/**
	 * 预约处理
	 */
	public boolean processAppo(String cust_id, String task_id, String appo_id, String proc_type);

}
