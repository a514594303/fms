package com.ufc.fm.service;

import java.util.List;

import com.ufc.fm.dbio.po.FmCust;

/**
 * 
* @ClassName: CustomerService  
* @Description: TODO 客户管理服务接口
* @author: disp  
* @date 2015-10-28 上午11:30:18  
* @version 1.0  
*
 */
public interface CustService extends BaseService {
	
	/**
	 * 查询指定客户信息
	 */
	public FmCust queryCust(String cust_id, String identity_card);

	/**
	 * 查询客户列表
	 */
	public List<FmCust> queryCustList(String cust_id, String name, String identity_type, String identity_card, String cust_type, String mobile_phone, String home_phone);

	/**
	 * 添加新客户
	 */
	public String addCust(FmCust cust);

	/**
	 * 更新客户信息
	 */
	public boolean updateCust(FmCust cust);

	/**
	 * 删除指定客户
	 */
	public boolean deleteCust(String cust_id);											
	
}
