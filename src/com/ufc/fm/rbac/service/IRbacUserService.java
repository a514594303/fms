package com.ufc.fm.rbac.service;

import java.util.List;

import com.ufc.fm.rbac.po.FmResources;
import com.ufc.fm.rbac.po.FmUser;

public interface IRbacUserService {

	/*
	 * 通过柜员号和机构码获取用户账号
	 * */
	public FmUser getUserAccount(String userNo,String orgNo);
	
	public FmUser getUserInfo(String userName);
	
	/*
	 * 通过用户账号登录验证密码
	 * 成功：SUCESS
	 * 失败：FAIL或者错误信息
	 * 
	 * */
	public String verifyPassword(String userAccount,String password);
	
	
	public String getUserRole(String userAccount);
	
	//签到
	public String signin(String userAccount,String sessionID);
	
	//签退
	public String signout(String userAccount,String sessionID);
	
	//获取用户的所有权限
	public List<FmResources> getUserPermission(String userAccount);
	
	//获取角色的所有权限
	public String getRolePermission(String role);
	
	//获取组织机构的所有权限
	public String getOrgPermission(String org);
		
}
