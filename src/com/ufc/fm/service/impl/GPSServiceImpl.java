package com.ufc.fm.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ufc.comm.util.DateTimeUtil;
import com.ufc.comm.util.IDTools;
import com.ufc.comm.util.SpringContextUtil;
import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.dbio.mapper.FmCustMapper;
import com.ufc.fm.dbio.mapper.FmCustomerMapper;
import com.ufc.fm.dbio.mapper.FmGpsMapper;
import com.ufc.fm.dbio.po.FmCust;
import com.ufc.fm.dbio.po.FmCustExample;
import com.ufc.fm.dbio.po.FmCustomer;
import com.ufc.fm.dbio.po.FmCustomerExample;
import com.ufc.fm.dbio.po.FmGps;
import com.ufc.fm.dbio.po.FmGpsExample;
import com.ufc.fm.service.CustService;
import com.ufc.fm.service.CustomerService;
import com.ufc.fm.service.IGPSService;

/**
 * 
 * @ClassName: CustServiceImpl
 * @Description: TODO 客户管理服务接口
 * @author: lee
 * @date 2015-11-10 上午9:53:28
 * @version 1.0
 * 
 */

@Service("GPSService")
@Transactional(rollbackFor = { RuntimeException.class, Exception.class }, timeout = 30)
public class GPSServiceImpl implements  IGPSService{

	private FmGpsMapper fmGpsMapper;

	@Override
	public String saveGps(String userName, String gps) {
		
		FmGps recordGPS = new FmGps();
		String time=DateTimeUtil.format(new Date(), "yyyyMMddHHmmss");
		recordGPS.setId(IDTools.getUUID());
		recordGPS.setUserName(userName);
		recordGPS.setGps(gps);
		recordGPS.setTime(time);
		int res = fmGpsMapper.insert(recordGPS);
		if(res>0){
			return ErrorCode.SUCCEED;
		}
		
		return ErrorCode.SYSTEM_ERROR_MSG;
	}

	@Override
	public List<FmGps> queryUserGPSList(String userName, String beginTime,
			String endTime) {
		FmGpsExample gpsExample=new FmGpsExample();
		gpsExample.createCriteria().andUserNameEqualTo(userName).andTimeBetween(beginTime, endTime);
		List<FmGps> result = fmGpsMapper.selectByExample(gpsExample);
		return result;
	}

	public FmGpsMapper getFmGpsMapper() {
		return fmGpsMapper;
	}

	@Resource
	public void setFmGpsMapper(FmGpsMapper fmGpsMapper) {
		this.fmGpsMapper = fmGpsMapper;
	}
	
}
