package com.ufc.fm.service.simimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ufc.fm.service.CustomerService;

/**
 * 
* @ClassName: CustomerServiceImpl  
* @Description: TODO 客户管理服务接口，模拟挡板实现
* @author: disp  
* @date 2015-10-28 上午11:31:52  
* @version 1.0  
*
 */

@Service("customerServiceSim")
public class CustomerServiceImpl implements CustomerService {


	/*	
	//无效
	private static Map<String, Object> david = new HashMap<String, Object>() {
		
        {
			this.put("CUST_ID", "100");
			this.put("CUST_NAME", "david");		
			this.put("CREATE_DATE", "20151011");	
        }
    };	
 */   
	
    private static Map<String, Object> tom = new HashMap<String, Object>();
    private static Map<String, Object> jerry = new HashMap<String, Object>();
    private static Map<String, Object> david = new HashMap<String, Object>(); 
    public static ArrayList< Map<String, Object> > alist = new ArrayList< Map<String, Object> >();
    
    static
    {
          	tom.put("cust_id", "101");
        	tom.put("cust_type", "1");
        	tom.put("create_date", "20151013");
        	tom.put("cust_name", "tom");
        	tom.put("gender", "男");
        	tom.put("identity_type", "身份证");
        	tom.put("identity_card", "1234567890");
        	tom.put("hgst_degree", "博士");
        	tom.put("marital_status", "已婚");
        	tom.put("employer_name", "UFC");
        	tom.put("employer_addr", "beijing");
        	tom.put("email", "");
        	tom.put("mobile_phone", "13901088888");
        	tom.put("birthday", "20110601");
        	tom.put("occupation", "学者");  
        	
          	jerry.put("cust_id", "102");
        	jerry.put("cust_type", "1");
        	jerry.put("create_date", "20151013");
        	jerry.put("cust_name", "jerry");
        	jerry.put("gender", "男");
        	jerry.put("identity_type", "军官证");
        	jerry.put("identity_card", "3252345325");
        	jerry.put("hgst_degree", "博士");
        	jerry.put("marital_status", "已婚");
        	jerry.put("employer_name", "UFC");
        	jerry.put("employer_addr", "beijing");
        	jerry.put("email", "");
        	jerry.put("mobile_phone", "13901088888");
        	jerry.put("birthday", "20110601");
        	jerry.put("occupation", "军官"); 
        	
          	david.put("cust_id", "103");
        	david.put("cust_type", "1");
        	david.put("create_date", "20151013");
        	david.put("cust_name", "david");
        	david.put("gender", "男");
        	david.put("identity_type", "身份证");
        	david.put("identity_card", "1234567890");
        	david.put("hgst_degree", "高中");
        	david.put("marital_status", "已婚");
        	david.put("employer_name", "UFC");
        	david.put("employer_addr", "beijing");
        	david.put("email", "");
        	david.put("mobile_phone", "13901088888");
        	david.put("birthday", "20110601");
        	david.put("occupation", "工人");  
        	
    
        	alist.add(jerry);
        	alist.add(tom); 
         	alist.add(david);      
         	
    };

   
    public Map<String, Object> query(String cust_id){
    	
    	Map<String, Object> cust = null;
    	for(int i = 0;i < alist.size(); i ++){

            if(alist.get(i).get("cust_id")  != null && alist.get(i).get("cust_id").equals(cust_id)){
            	cust = alist.get(i); 
            	break;
            	
            }
        	
        }
    	return cust;
    }
    
    public Map<String, Object> query2(String identity_type){
    	
    	Map<String, Object> cust = null;
    	for(int i = 0;i < alist.size(); i ++){

            if(alist.get(i).get("identity_type")  != null && 
            		alist.get(i).get("identity_type").equals(identity_type)){
            	cust = alist.get(i); 
            	break;
            	
            }
        	
        }
    	return cust;
    }   
    
    public ArrayList< Map<String, Object> > queryList(String cust_type){
    	
    	return alist;
    }    
 	
	public int add(String id,String type,String name){
		
		return -1;
	}
		
}
