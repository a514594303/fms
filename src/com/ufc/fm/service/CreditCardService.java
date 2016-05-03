package com.ufc.fm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ufc.fm.dbio.po.FmCreditcardProgress;
import com.ufc.fm.dbio.po.FmLoanProgress;

/**
 * 
* @ClassName: CreditCardService  
* @Description: TODO  信用卡服务接口
* @author: disp  
* @date 2015-11-2 上午9:49:12  
* @version 1.0  
*
 */
public interface CreditCardService extends BaseService {

	
	//查询当前客户经理，信用卡办理进度
	public List<FmCreditcardProgress>  inquireProgress(String userName, String start_date,
			String end_date, String cust_id, String cust_name,
			String identity_card, String cc_status);
	
}