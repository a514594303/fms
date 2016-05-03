package com.ufc.fm.controller.po;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class RspMsgHeader {

	private String sessionId;	//当前会话号
	private String overTime;	//会话是否超时 true|false
	private String status;		//返回状态码 0：成功
	private String errorMsg;	//仅当Status为非0时，返回错误信息描述
	private String tokenKey;	//保留域	
	
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getOverTime() {
		return overTime;
	}
	public void setOverTime(String overTime) {
		this.overTime = overTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getTokenKey() {
		return tokenKey;
	}
	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}
	
	//---------------------------
	
	public String getSessionIdTitle() {
		return "SessionId";
	}
	public String getStatusTitle() {
		return "Status";
	}	
	public String getOverTimeTitle() {
		return "OverTime";
	}	
	public String getErrorMsgTitle() {
		return "ErrorMsg";
	}	
	public String getTokenKeyTitle() {
		return "TokenKey";
	}	
	
	public String toJsonString(){
		Map<String, Object> mapTemp = new HashMap<String, Object>();
		mapTemp.put(getSessionIdTitle(), getSessionId());
		mapTemp.put(getStatusTitle(),getStatus());
		mapTemp.put(getOverTimeTitle(),getOverTime());
		mapTemp.put(getErrorMsgTitle(),getErrorMsg());
		mapTemp.put(getTokenKeyTitle(),getTokenKey());		
		Gson gsf = new GsonBuilder().setPrettyPrinting().create();
		return gsf.toJson(mapTemp);
		
	}
}
