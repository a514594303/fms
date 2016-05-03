package com.ufc.fm.service;

import java.util.List;

import com.ufc.fm.dbio.po.FmGps;

/**
 * 
* @ClassName: GpsService  
* @Description: TODO GPS定位轨迹服务
* @author: cuigc  
* @date 2015-12-09 上午11:30:18  
* @version 1.0  
*
 */
public interface IGPSService extends BaseService {
	
	public String saveGps(String user_id,String gps);	//保存用户GPS信息
	public List<FmGps> queryUserGPSList(String user_id,String beginTime,String endTime);			//查询用户GPS信息	
	
}
