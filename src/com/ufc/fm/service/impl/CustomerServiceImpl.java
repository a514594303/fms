package com.ufc.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ufc.comm.util.SpringContextUtil;
import com.ufc.fm.dbio.mapper.FmCustomerMapper;
import com.ufc.fm.dbio.po.FmCustomer;
import com.ufc.fm.dbio.po.FmCustomerExample;
import com.ufc.fm.service.CustomerService;

/**
 * 
* @ClassName: CustomerServiceImpl  
* @Description: TODO 客户管理服务接口，基于数据库实现
* @author: disp  
* @date 2015-10-28 上午11:30:47  
* @version 1.0  
*
 */

@Service("customerService")
@Transactional(rollbackFor={RuntimeException.class, Exception.class},timeout=30)

public class CustomerServiceImpl  implements CustomerService {
	
	@Autowired 
	@Qualifier("fmCustomerMapper")
	private FmCustomerMapper fmCustomerMapper;
	
	//FmCustomerMapper fmCustomerMapper = SpringContextUtil.getBean("fmCustomerMapper");

	public int add(String id,String type,String name){
      
		FmCustomer rec=new FmCustomer();
		rec.setCustId(id);
		rec.setCustType(type);
		rec.setCustName(name);
		int m = fmCustomerMapper.insert(rec);
		System.out.println("insert return:"+m);	
		
		FmCustomerExample exa = new FmCustomerExample();
		FmCustomerExample.Criteria cr = exa.createCriteria();
		cr.andCustTypeEqualTo("1");
		int count = fmCustomerMapper.countByExample(exa);
		
		//抛出unchecked异常，触发事物，回滚  
		if(count >= 3){
			throw new RuntimeException("test"); 
		}
		
		return 1;
		
	}
}
