package com.ufc.fm.controller.po;

/**
 * 
* @ClassName: ReqMsgHeader  
* @Description: TODO 
* @author: disp  
* @date 2015-9-28 上午11:19:38  
* @version 1.0  
*
 */
public class ReqMsgHeader {

	private String sessionId;	//当前会话号
	private String userName;	//用户名
	private String deviceId;	//设备号 526E6081593553B8DFE6587681016EDE
	private String tokenKey;	//保留域
	
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getTokenKey() {
		return tokenKey;
	}
	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}
	
	//---------------------------
	
	public String getSessionIdTitle() {
		return "TokenKey";
	}
	public String getUserNameTitle() {
		return "UserName";
	}	
	public String getDeviceIdTitle() {
		return "DeviceId";
	}	
	public String getTokenKeyTitle() {
		return "TokenKey";
	}	

}
