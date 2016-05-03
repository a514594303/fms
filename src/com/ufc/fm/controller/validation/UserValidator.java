package com.ufc.fm.controller.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.rbac.po.FmUser;

/**
 * 
* @ClassName: UserValidator  
* @Description: TODO 测试使用Validator接口进行验证,并可启用对JSR-303的支持
* @author: disp  
* @date 2015-11-18 上午9:33:36  
* @version 1.0  
*
 */

public class UserValidator implements Validator {
	
	@Override	 
    public boolean supports(Class<?> clazz) {
       // TODO Auto-generated method stub
       return FmUser.class.equals(clazz);
    }
	
	@Override 
    public void validate(Object obj, Errors errors) {
       // TODO Auto-generated method stub
       //ValidationUtils.rejectIfEmpty(errors, "username", null, "Username is empty.");
       
       FmUser user = (FmUser) obj;
       if (null == user.getPassword() || "".equals(user.getPassword())){
            errors.rejectValue("password", null, "Password is empty.");   	   
       }
       else if(user.getName()==null){
    	   errors.rejectValue(ErrorCode.PARAMETER_ERROR, null, ErrorCode.PARAMETER_ERROR_MSG);   
       }
    	   

    }

 
}

