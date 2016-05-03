package com.ufc.fm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.controller.po.ReqMsgHeader;
import com.ufc.fm.controller.po.RspMsgHeader;
import com.ufc.fm.rbac.po.FmResources;
import com.ufc.fm.rbac.po.FmUser;
import com.ufc.fm.rbac.service.IRbacUserService;
import com.ufc.fm.rbac.util.MobileUserConstant;
import com.ufc.fm.service.LoanService;
import com.ufc.fm.view.JsonView;

/**
 * 
* @ClassName: UserHandler  
* @Description: TODO  
* @author: disp  
* @date 2015-9-25 下午2:49:34  
* @version 1.0  
*
 */

@Controller
@RequestMapping({"/fmapp/v1/user" , "/fmweb/v1/user"})
public class UserHandler extends BaseController{
	
	@Autowired 
	private IRbacUserService rbacUserService;	

	@RequestMapping(value = "/signin")
	public ModelAndView doSignIn(ReqMsgHeader reqMsgHeader,
			String password,
			String user_no,
			String org_no) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();			
		
		String username = reqMsgHeader.getUserName();
		String sessionid = rspMsgHeader.getSessionId();
		
		if(username == null || username.isEmpty()){
			//转换为username
			logger.debug("机构码："+org_no+" 柜员号："+user_no+" 密码："+password);
			FmUser user =  rbacUserService.getUserAccount(user_no,org_no);
			if(user != null){
				username = user.getUserAccount();
			}
		}
		
		logger.debug("用户名："+username+" 密码："+password);
		if(username == null || password == null){
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg("传递参数不符");	
		}
		else{
			String strRet = rbacUserService.verifyPassword(username,password);
			if(strRet.equals(MobileUserConstant.SUCESS)){
					
				if(rbacUserService.signin(username,sessionid)!=MobileUserConstant.FAIL){
	
					//签到成功，获取用户权限列表
					String permissions="";
					List<FmResources> frList = rbacUserService.getUserPermission(username);
					if(frList != null){
						for(FmResources fr : frList){
							if(!permissions.isEmpty()){
								permissions +=",";
							}
							permissions += fr.getResKey();
						}
					}
					
					rspMsgHeader.setStatus(ErrorCode.SUCCEED);
					result.put("username", username);
					result.put("permissions", permissions);
				}
				else{
					//签到失败，
					rspMsgHeader.setStatus(ErrorCode.SIGNIN_ERROR);
					rspMsgHeader.setErrorMsg(ErrorCode.SIGNIN_ERROR_MSG);							
				}
					
				
			}
			else if(strRet.equals(MobileUserConstant.NOEXIST)){
				rspMsgHeader.setStatus(ErrorCode.USER_NOT_EXIST);
				rspMsgHeader.setErrorMsg(ErrorCode.USER_NOT_EXIST_MSG);					
			}
			else if(strRet.equals(MobileUserConstant.FAIL)){
				rspMsgHeader.setStatus(ErrorCode.PASSWORD_ERROR);
				rspMsgHeader.setErrorMsg(ErrorCode.PASSWORD_ERROR_MSG);					
			}
		}
	
		return makeResultMav(rspMsgHeader,result);
	}	
	
	@RequestMapping(value = "/signout" , method = {RequestMethod.GET,RequestMethod.POST} )
	public ModelAndView doSignOut(HttpSession session,ReqMsgHeader reqMsgHeader) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();	
	
		String username = reqMsgHeader.getUserName();
		String sessionid = rspMsgHeader.getSessionId();
		
		if(rbacUserService.signout(username, sessionid)!=MobileUserConstant.FAIL){
		    // 清除session
			session.invalidate();
			
			rspMsgHeader.setStatus(ErrorCode.SUCCEED);
			//rspMsgHeader.setErrorMsg("签退成功");	
		}
		else{
			rspMsgHeader.setStatus(ErrorCode.SIGNOUT_ERROR);
			rspMsgHeader.setErrorMsg(ErrorCode.SIGNOUT_ERROR_MSG);				
		}
		
		return makeResultMav(rspMsgHeader,result);		
	}
}
