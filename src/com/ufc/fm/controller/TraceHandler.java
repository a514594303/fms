package com.ufc.fm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.fm.controller.po.ReqMsgHeader;
import com.ufc.fm.controller.po.RspMsgHeader;
import com.ufc.fm.dbio.po.FmCust;
import com.ufc.fm.dbio.po.FmGps;
import com.ufc.fm.engine.ReflectDbioPo;
import com.ufc.fm.service.IGPSService;

/**
 * 
* @ClassName: TraceHandler  
* @Description: TODO  
* @author: cuigc  
* @date 2015-12-09 下午2:49:34  
* @version 1.0  
*
 */

@Controller
@RequestMapping({"/fmapp/v1/trace" , "/fmweb/v1/trace"})
public class TraceHandler extends BaseController{
	
	@Autowired 
	private IGPSService gpsService;

	@RequestMapping(value = "/sendgps")
	public ModelAndView sendGPS(ReqMsgHeader reqMsgHeader,String gps) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();	
	
		String userName = reqMsgHeader.getUserName();
		String saveRes = gpsService.saveGps(userName, gps);
		rspMsgHeader.setStatus(saveRes);
		
		
		return makeResultMav(rspMsgHeader,result);
	}	
	
	@RequestMapping(value = "/getgps")
	public ModelAndView getGPS(HttpSession session,ReqMsgHeader reqMsgHeader,String begin_time,String end_time) throws Exception { 
		
		RspMsgHeader rspMsgHeader  = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();	
		String userName = reqMsgHeader.getUserName();
		List<FmGps> gpsList = gpsService.queryUserGPSList(userName, begin_time, end_time);
		
		List<Map<String, Object>> resultQuery = null;
		
		if(gpsList.size()>0){
			resultQuery = new ArrayList<Map<String, Object>>();	
			for(FmGps cust : gpsList){
				resultQuery.add( ReflectDbioPo.fmPo2Map(cust));				
			}
			
		}
		
		return makeResultMav(rspMsgHeader,result,resultQuery);		
	}

	public IGPSService getGpsService() {
		return gpsService;
	}

	@Resource
	public void setGpsService(IGPSService gpsService) {
		this.gpsService = gpsService;
	}
}
