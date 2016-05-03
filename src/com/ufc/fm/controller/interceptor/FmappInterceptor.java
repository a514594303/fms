package com.ufc.fm.controller.interceptor;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.controller.po.ReqMsgHeader;
import com.ufc.fm.controller.po.RspMsgHeader;

/**
 * 
* @ClassName: FmappInterceptor  
* @Description: TODO 
* @author: disp  
* @date 2015-9-28 下午3:44:24  
* @version 1.0  
*
 */
public class FmappInterceptor extends BaseInterceptor implements HandlerInterceptor {

	@Override
	/**
	 * 
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		
		//可以进行检查用户是否登录，Session是否超时等

		
		 //模拟检查客户端IP地址
		 String ipAddr = getRequestRemoteAddr(request);
		 //log.debug("客户端IP地址：" + ipAddr);
		 logger.debug("客户端IP地址：" + ipAddr);		 
		 

		 //除signin请求外，检查Session是否超时（实际使用user+Sessionid列表判断）
		 /* 可以创建一个user list，保存用户ID和session id，登陆的时候只要判断user list里
		  * 是否已经存在就行了，再来就是写个监听Http会话的特殊servlet，
		  * 可以通过HttpSessionListener接口监听Http会话的创建和销毁，当session销毁时候
		  * 执行相应的代码，即把user list里session id所对应的用户ID删除
		  */
		 boolean isSignin=false;	
		 String url=request.getRequestURI().toString();		
		 if(url.contains("signin")){
			 isSignin=true;
		 }
		 
		 if(!isSignin) {
			 
			 String reqSessionId = request.getParameter("SessionId");
			 String sessionid="";
			 logger.debug("报文域SessionId："+reqSessionId);
			 
			 if(request.getSession(false) != null){
				 sessionid = request.getSession(false).getId();	
				 logger.debug("服务端 SessionId："+sessionid);			 
			 }			 
			 /*
			 if(request.getSession(false) == null){ // || !sessionid.equalsIgnoreCase(reqSessionId)){
				
				RspMsgHeader rspMsgHeader = new RspMsgHeader();
				rspMsgHeader.setSessionId(reqSessionId);
				//rspMsgHeader.setOverTime("true"); //废弃
				//rspMsgHeader.setTokenKey("Ignore me"); //暂不使用
				rspMsgHeader.setStatus(ErrorCode.SESSION_TIMEOUT);
				rspMsgHeader.setErrorMsg("会话超时，请重新签到！");
				String str = rspMsgHeader.toJsonString();
				response.setContentType("application/json;charset=UTF-8");
				response.getWriter().write(str);	
				
				logger.debug(rspMsgHeader.getStatus()+":"+rspMsgHeader.getErrorMsg());
				
				return false;	
			 }
			 */
		 }
		
		 /*
		//模拟拦截
		String strTemp = request.getParameter("TokenKey");
		if(strTemp == null || !strTemp.equals("AAAAA"))
		{
			
			RspMsgHeader rspMsgHeader = new RspMsgHeader();
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg("非法调用");
			String str = rspMsgHeader.toJsonString();
			response.setContentType("application/json;charset=UTF-8");
			response.getWriter().write(str);	
			
			return false;
		}
		*/
	
		return true;
	}

	@Override
	/**
	 * 
	 */
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	/**
	 * 
	 */
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
