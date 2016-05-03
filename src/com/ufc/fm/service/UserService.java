package com.ufc.fm.service;

import java.util.List;

/**
 * 
* @ClassName: CustomerService  
* @Description: TODO 客户管理服务接口，废弃，使用IRbacUserService
* @author: disp  
* @date 2015-10-28 上午11:30:18  
* @version 1.0  
*
 */
public interface UserService extends BaseService {
	
	public String getUserName(String org_no,String user_no);			//通过机构号和柜员号获取用户名	
	public boolean validatePassword(String username,String password);	//校验密码
	public String getUserPermissions(String username);					//获取用户权限列表
	public boolean doUserSignIn(String username);						//用户签到
	public boolean doUserSignOut(String username);						//用户签退
}
