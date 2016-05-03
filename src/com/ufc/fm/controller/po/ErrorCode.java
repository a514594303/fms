package com.ufc.fm.controller.po;

/**
 * 
* @ClassName: ErrorCode  
* @Description: TODO 
* @author: disp  
* @date 2015-10-13 下午2:20:49  
* @version 1.0  
*
 */
public class ErrorCode {
	
	//成功
	public static final String SUCCEED = "0000";//操作成功
	//失败
	public static final String FAIL = "9999";//操作失败
	
	//错误 0001~0999 暂保留


	//用户相关 1000~1999
	public static final String USER_EXIST 		= "1001";	//用户已存在
	public static final String USER_NOT_EXIST 	= "1002";	//用户不存在
	public static final String PASSWORD_ERROR 	= "1003";	//密码错误
	public static final String SIGNIN_ERROR 	= "1004";	//用户签到失败
	public static final String SIGNOUT_ERROR 	= "1005";	//用户签退失败
	
	public static final String USER_EXIST_MSG 		= "用户已存在";		//
	public static final String USER_NOT_EXIST_MSG 	= "用户不存在";		//
	public static final String PASSWORD_ERROR_MSG 	= "密码错误";		//
	public static final String SIGNIN_ERROR_MSG		= "用户签到失败";	//
	public static final String SIGNOUT_ERROR_MSG 	= "用户签退失败";	//	
	
	//客户相关 2000~2999
	public static final String CUST_EXIST 		= "2001";	//客户已存在
	public static final String CUST_NOT_EXIST 	= "2002";	//客户不存在	
	
	public static final String CUST_EXIST_MSG 		= "客户已存在";	//
	public static final String CUST_NOT_EXIST_MSG 	= "指定客户不存在";	//	
	
	//任务相关 3000~3999
	public static final String TASK_EXIST 		= "3001";	//已存在
	public static final String TASK_NOT_EXIST 	= "3002";	//不存在	
	
	public static final String TASK_EXIST_MSG 		= "任务已存在";	//
	public static final String TASK_NOT_EXIST_MSG 	= "指定任务不存在";	//		
	
	
	//预约相关 4000~4999
	public static final String APPO_EXIST 		= "4001";	//已存在
	public static final String APPO_NOT_EXIST 	= "4002";	//不存在	
	
	public static final String APPO_EXIST_MSG 		= "预约已存在";	//
	public static final String APPO_NOT_EXIST_MSG 	= "指定预约不存在";	//	
	
	
	//个人贷款相关 5000~5999
	
	
	//其他系统错误 9000~9999
	public static final String SYSTEM_ERROR	 	= "9001";	//系统异常
	public static final String SESSION_TIMEOUT 	= "9002";	//会话超时
	public static final String PARAMETER_ERROR 	= "9003";	//传递参数不符	
	public static final String DEVICE_ERROR 	= "9004";	//移动设备错误	
	public static final String VERSION_ERROR	= "9005";	//系统版本错误	
	public static final String SYSTEM_SOP_ERROR	= "9006";	//系统操作失败	
	public static final String REQUEST_TIMEOUT 	= "9408";	//请求超时
	
	public static final String SYSTEM_ERROR_MSG	 	= "系统异常";		//
	public static final String SESSION_TIMEOUT_MSG 	= "会话超时";		//
	public static final String PARAMETER_ERROR_MSG 	= "传递参数不符";	//	
	public static final String DEVICE_ERROR_MSG 	= "移动设备错误";	//	
	public static final String VERSION_ERROR_MSG	= "系统版本错误";	//	
	public static final String SYSTEM_SOP_ERROR_MSG	= "系统操作失败";	//	
	public static final String REQUEST_TIMEOUT_MSG 	= "请求超时";		//	
	
	
	
	
	
	
	
	public static String getErrorMsg(String errorCode){
		String errorMsg = "";
		
		try{
			
			switch(Integer.parseInt(errorCode)){
			
			case 1001:
				errorMsg="用户已经存在";
				break;
	
			}
		}
		catch(NumberFormatException ex){
			
		}

		return errorMsg;
	}
	
	
}