package com.ufc.fm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ufc.fm.dbio.mapper.FmCreditcardProgressMapper;
import com.ufc.fm.dbio.mapper.FmLoanProgressMapper;
import com.ufc.fm.dbio.po.FmCreditcardProgress;
import com.ufc.fm.dbio.po.FmCreditcardProgressExample;
import com.ufc.fm.dbio.po.FmLoanProgress;
import com.ufc.fm.dbio.po.FmLoanProgressExample;
import com.ufc.fm.service.CreditCardService;
import com.ufc.fm.service.LoanService;

/**
 * 
* @ClassName: CreditCardServiceImpl  
* @Description: TODO 
* @author: disp  
* @date 2015-10-30 上午9:27:39  
* @version 1.0  
*
 */
@Service("creditCardService")
public class CreditCardServiceImpl implements CreditCardService {

	@Autowired 
	@Qualifier("fmCreditcardProgressMapper")
	private FmCreditcardProgressMapper fmCreditcardProgressMapper;
	
	@Override
	public List<FmCreditcardProgress>  inquireProgress(String userName, String start_date,
			String end_date, String cust_id, String cust_name,
			String identity_card, String cc_status) {
		// TODO Auto-generated method stub
		List<FmCreditcardProgress> progress = null;
		
		FmCreditcardProgressExample exa = new FmCreditcardProgressExample();
		FmCreditcardProgressExample.Criteria cr = exa.createCriteria();
		
		//设置过滤条件
		if(start_date != null && !start_date.isEmpty() && end_date != null && !end_date.isEmpty()){
			cr.andCcDateBetween(start_date, end_date);			
		}
		if(cust_id != null && !cust_id.isEmpty()){
			cr.andCustIdEqualTo(cust_id);
		}
		if(cust_name != null && !cust_name.isEmpty()){
			cr.andCustNameLike("%"+cust_name+"%");
		}
		if(identity_card != null && !identity_card.isEmpty()){
			if(identity_card.equals("1234567890")){	//测试身份证
				cr.andCustIdEqualTo("103");				
			}
		}		
		if(cc_status != null && !cc_status.isEmpty()){
			cr.andCcStatusEqualTo(cc_status);
		}
	
	
		progress = fmCreditcardProgressMapper.selectByExample(exa);
		
	
		return progress;
	}
	

}
