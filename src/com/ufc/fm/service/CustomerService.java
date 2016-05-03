package com.ufc.fm.service;

import java.util.List;

/**
 * 
* @ClassName: CustomerService  
* @Description: TODO 客户管理服务接口
* @author: disp  
* @date 2015-10-28 上午11:30:18  
* @version 1.0  
*
 */
public interface CustomerService extends BaseService {
	
//	public Object Query(String cust_id,String identity_card);	//查询指定客户信息
//	public List<Object> QueryList(String cust_type);			//查询客户列表	
//	public int Add(Object cust);								//添加新客户
//	public int Update(Object cust);								//更新客户信息
//	public int Delete(String cust_id);							//删除指定客户
	
	
	public int add(String id,String type,String name);			//测试
	
}
