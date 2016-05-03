package com.ufc.fm.rbac.util;

public class MobileUserConstant {
	
	//用户
	public static final String USER="USER";
	
	//角色
	public static final String ROLE="ROLE";
	
	//组织机构
	public static final String ORG="ORG";
	
	//成功返回
	public static final String SUCESS="SUCESS";
	
	//失败返回
	public static final String FAIL="FAIL";
	
	//不存在返回信息
	public static final String NOEXIST="NOEXIST";

	//正常签到状态
	public static final String SIGNINSTATE = "SIGNIN";
	
	//正常签退状态
	public static final String SIGNOUTSTATE = "SIGNOUT";
	
	//已经签到状态返回信息
	public static final String SIGNINWARRING = "ALREADY_SIGNIN";
	
	//未签到，不能签退
	public static final String SIGNOUTERROR = "NOT_SIGNIN";
	
	//已经签退状态返回信息
	public static final String SIGNOUTWARRING = "ALREADY_SIGNOUT";
	
	//未知签到签退状态返回信息
	public static final String SIGNERROR = "SIGNSTATE_ERROR";

}
