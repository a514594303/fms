package com.ufc.fm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.fm.controller.po.ReqMsgHeader;
import com.ufc.fm.controller.po.RspMsgHeader;
import com.ufc.fm.service.CustomerService;

@Controller
@RequestMapping("/fmapp/v1/test")

public class TestHandler extends BaseController {


	@Autowired 
	@Qualifier("customerService")
	private CustomerService cust;
	
	
	@RequestMapping(value = "/t1")
	public ModelAndView doT1(ReqMsgHeader reqMsgHeader)
			throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();
		
		try{

			cust.add("4005","1","tom");
			rspMsgHeader.setStatus("0000");
			
		}catch(Exception e){
			
		   logger.info("添加内容失败");
		   e.printStackTrace();
		   
		   rspMsgHeader.setStatus("2222");
		   rspMsgHeader.setErrorMsg("添加内容失败");
			
		  }
	
		return makeResultMav(rspMsgHeader, result);

	}
}
