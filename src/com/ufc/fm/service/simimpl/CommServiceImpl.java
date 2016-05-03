package com.ufc.fm.service.simimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ufc.fm.service.CommService;

/**
 * 
* @ClassName: CommServiceImpl  
* @Description: TODO 
* @author: disp  
* @date 2015-10-30 上午9:28:28  
* @version 1.0  
*
 */
@Service("commService")
public class CommServiceImpl implements CommService {

	@Override
	public Map<String, Object> getDictlist(String dictListName) {
		// TODO Auto-generated method stub

		Map<String, Object> result = new HashMap<String, Object>();
		
		/*
		zhengjianlx  证件类型 
		jiaoyucd     教育程度 
		daikuanyt	  贷款用途
		daikuanqx    贷款期限
		huankuanfs   还款方式 
		huankuanzl   还款种类 
		diyafs       抵押方式 
		*/
		ArrayList<String> zhengjianlx = new ArrayList<String >();
		zhengjianlx.add("1#身份证");	
		zhengjianlx.add("2#护照");			
		zhengjianlx.add("3#士兵证");	
		result.put("identity_type", zhengjianlx);		
		
		ArrayList<String> jiaoyucd = new ArrayList<String >();
		jiaoyucd.add("1#博士");
		jiaoyucd.add("2#硕士");
		jiaoyucd.add("3#本科");
		jiaoyucd.add("4#专科");	
		result.put("hgst_degree",jiaoyucd);	
		
		ArrayList<String> daikuanyt = new ArrayList<String >();
		daikuanyt.add("1#购房");
		daikuanyt.add("2#购车");
		daikuanyt.add("3#消费");
		daikuanyt.add("4#装修");	
		daikuanyt.add("5#教育");
		daikuanyt.add("6#旅游");
		daikuanyt.add("20#其他");
		result.put("daikuanyt",daikuanyt);	
		
		ArrayList<String> daikuanqx = new ArrayList<String >();
		daikuanqx.add("1#一年");
		daikuanqx.add("2#二年");
		daikuanqx.add("3#三年");
		daikuanqx.add("4#五年");	
		daikuanqx.add("5#十年");
		result.put("daikuanqx",daikuanqx);			
		
		ArrayList<String> huankuanfs = new ArrayList<String >();
		huankuanfs.add("1#一次性利随本清");
		huankuanfs.add("2#等额本息");	
		huankuanfs.add("3#等额本金");	
		huankuanfs.add("4#分期付息一次还本");
		result.put("huankuanfs",huankuanfs);	
		
		ArrayList<String> huankuanzl = new ArrayList<String >();
		huankuanzl.add("1#信用卡");
		huankuanzl.add("2#借记卡");	
		huankuanzl.add("3#存折");		
		result.put("huankuanzl",huankuanzl);	
		
		ArrayList<String> diyafs = new ArrayList<String >();
		diyafs.add("1#质押");
		diyafs.add("2#抵押");	
		diyafs.add("3#保证");	
		diyafs.add("4#无抵押");			
		result.put("diyafs",diyafs);
		
		/*
		 * 交易类别（一手期房、一手现房、二手房） 
		 * 房屋类别（住房、写字楼、商铺、其他）				可手工输入
		 * 质押品名称（储蓄存单、凭证式国债、记名债券、其他）	可手工输入
		 * 币种（人民币、美元、欧元、日元）					可手工输入
		 * 贷款申请进度 LOAN_STATUS
		 */
		
		ArrayList<String> jiaoyilb = new ArrayList<String >();
		jiaoyilb.add("1#一手期房");
		jiaoyilb.add("2#一手现房");	
		jiaoyilb.add("3#二手房");	
		result.put("jiaoyilb",jiaoyilb);
		
		ArrayList<String> loan_status = new ArrayList<String >();
		loan_status.add("1#申请中");
		loan_status.add("2#审批中");	
		loan_status.add("3#复核中");	
		loan_status.add("4#通过");		
		loan_status.add("5#拒绝");			
		result.put("loan_status",loan_status);
		
		//信用卡申请
		ArrayList<String> cardtype = new ArrayList<String >();
		cardtype.add("1#广发车主信用卡");
		cardtype.add("2#广发淘宝型男卡");	
		cardtype.add("3#广发淘宝型女卡");	
		cardtype.add("4#广发携程信用卡");		
		result.put("cardtype",cardtype);
		
		ArrayList<String> cc_status = new ArrayList<String >();
		cc_status.add("1#申请中");
		cc_status.add("2#审批中");	
		cc_status.add("3#复核中");	
		cc_status.add("4#通过");		
		cc_status.add("5#拒绝");			
		result.put("cc_status",cc_status);
		
		ArrayList<String> cardflag = new ArrayList<String >();
		cardflag.add("1#仅申请主卡");
		cardflag.add("2#申请主卡和附属卡");	
		result.put("cardflag",cardflag);		

		ArrayList<String> pay_mode = new ArrayList<String >();
		pay_mode.add("1#凭密码+签名");
		pay_mode.add("2#仅凭签名");	
		result.put("pay_mode",pay_mode);	
		
		ArrayList<String> repay_mode = new ArrayList<String >();
		repay_mode.add("1#最低额还款");
		repay_mode.add("2#全额还款");	
		repay_mode.add("3#不自动还款");			
		result.put("repay_mode",repay_mode);	
		
		ArrayList<String> delivery_mode = new ArrayList<String >();
		delivery_mode.add("1#电子邮件");
		delivery_mode.add("2#挂号信");	
		result.put("delivery_mode",delivery_mode);	
		
		//借记卡
		ArrayList<String> dc_cardtype = new ArrayList<String >();
		dc_cardtype.add("1#校园联名卡");
		dc_cardtype.add("2#电子借记卡");	
		dc_cardtype.add("3#理财贵宾卡");	
		result.put("dc_cardtype",dc_cardtype);
		
		return result;
	}

}
