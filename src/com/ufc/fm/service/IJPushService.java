package com.ufc.fm.service;

import java.util.List;

import com.ufc.fm.dbio.po.FmJpush;
import com.ufc.fm.dbio.po.FmNotice;

/**
 * 
* @ClassName: JPushService  
* @Description: TODO 极光推送
* @author: cuigc  
* @date 2015-12-09 上午11:30:18  
* @version 1.0  
*
 */
public interface IJPushService extends BaseService {
	
	public String registration(FmJpush pushReg);
	
	public String getRegistrationID(String username);
	
	public String getAlias(String username);
	
	public List<String> getTagUser(String tag);
	
	public void sendPushWithUser(String userName, String msg);
	
	public List<FmNotice> getMsgList(String receiver);
	
	public String deleteMsg(String id);
	
}
