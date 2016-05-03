package com.ufc.fm.controller.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;

public class BaseInterceptor {

	public static Log log=LogFactory.getLog(BaseInterceptor.class); 
	public static Logger logger = Logger.getLogger(BaseInterceptor.class); 
	
	protected String getRequestRemoteAddr(HttpServletRequest request){
		
		 if (request.getHeader("x-forwarded-for") == null){
			   return request.getRemoteAddr();
		 }
		 
		 //Apache,Squid等反向代理情况下
		 return request.getHeader("x-forwarded-for");
		
	}
}
