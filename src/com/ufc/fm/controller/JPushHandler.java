package com.ufc.fm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.controller.po.ReqMsgHeader;
import com.ufc.fm.controller.po.RspMsgHeader;
import com.ufc.fm.dbio.po.FmGps;
import com.ufc.fm.dbio.po.FmJpush;
import com.ufc.fm.dbio.po.FmNotice;
import com.ufc.fm.engine.ReflectDbioPo;
import com.ufc.fm.service.IJPushService;

/**
 * 
* @ClassName: JPushHandler  
* @Description: TODO  
* @author: cuigc  
* @date 2015-12-14 下午2:49:34  
* @version 1.0  
*
 */

@Controller
@RequestMapping({"/fmapp/v1/message"})
public class JPushHandler extends BaseController{
	
	@Autowired 
	private IJPushService JPushService;

	@RequestMapping(value = "/jpushreg")
	public ModelAndView jpushReg(ReqMsgHeader reqMsgHeader,String registration_id,String alias,String tag) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();	
	
		String userName = reqMsgHeader.getUserName();
		FmJpush pushReg = new FmJpush();
		pushReg.setUsername(userName);
		pushReg.setRegistrationId(registration_id);
		pushReg.setAlias(alias);
		pushReg.setTag(tag);
		String status = JPushService.registration(pushReg);
		rspMsgHeader.setStatus(status);
		return makeResultMav(rspMsgHeader,result);
	}
	
	@RequestMapping(value = "/show")
	public ModelAndView showMessage(ReqMsgHeader reqMsgHeader,String receiver) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();	
	
		String userName = reqMsgHeader.getUserName();
		
		List<FmNotice> notices = JPushService.getMsgList(userName);
		
		if(notices==null){
			rspMsgHeader.setStatus(ErrorCode.FAIL);
		}
		
		List<Map<String, Object>> resultQuery = null;
		
		if(notices.size()>0){
			resultQuery = new ArrayList<Map<String, Object>>();	
			for(FmNotice notice : notices){
				notice.setReceiver(null);
				notice.setSender(null);
				notice.setStatus(null);
				resultQuery.add( ReflectDbioPo.fmPo2Map(notice));				
			}
			
		}
		return makeResultMav(rspMsgHeader,result,resultQuery);
	}
	
	@RequestMapping(value = "/delete")
	public ModelAndView deleteMessage(ReqMsgHeader reqMsgHeader,String id) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();	
	
		String status = JPushService.deleteMsg(id);
		rspMsgHeader.setStatus(status);
		return makeResultMav(rspMsgHeader,result);
	}

	public IJPushService getJPushService() {
		return JPushService;
	}

	@Resource
	public void setJPushService(IJPushService jPushService) {
		JPushService = jPushService;
	}	
}
