package com.ufc.fm.service;


import java.util.List;
import com.ufc.fm.dbio.po.FmLoan;
import com.ufc.fm.dbio.po.FmLoanApplicationCar;
import com.ufc.fm.dbio.po.FmLoanApplicationHouse;
import com.ufc.fm.dbio.po.FmLoanApplicationRenov;
import com.ufc.fm.dbio.po.FmLoanColl;
import com.ufc.fm.dbio.po.FmLoanContact;
import com.ufc.fm.dbio.po.FmLoanGcn;
import com.ufc.fm.dbio.po.FmLoanGuran;
import com.ufc.fm.dbio.po.FmLoanMortg;
import com.ufc.fm.dbio.po.FmLoanProgress;
import com.ufc.fm.dbio.po.FmLoanRate;

/**
 * 
* @ClassName: LoanService  
* @Description: TODO  个人贷款服务接口
* @author: disp  
* @date 2015-10-29 上午9:49:12  
* @version 1.0  
*
 */
public interface LoanService extends BaseService {

	
	//查询当前客户经理，贷款进度
	public List<FmLoanProgress> inquireProgress(String userName,                //查询贷款进度
			String start_date,
			String end_date,
			String cust_id,
			String cust_name,
			String identity_card,
			String loan_status);
	
	public List<FmLoanRate> QueryLoanRate(String loanType,  String loanPeriod);  //输入贷款类型、贷款期限，查询基础利率，
	public List<FmLoan>  QueryListLoan(String loan_Id );                         //查询贷款基本信息
	public int  AddLoan(FmLoan fmLoan );                                      //增加贷款基本信息
	
	public int  AddLoanContact(FmLoanContact fmLoanContact );                 //增加贷款申请人联系人信息   
	
	public int  AddLoanCar(FmLoanApplicationCar applicationCar );             //增加车贷信息
	public int  AddLoanHouse(FmLoanApplicationHouse applicationHouse  );      //增加房贷信息
	public int  AddLoanRenov(FmLoanApplicationRenov applicationRenov  );      //增加装修贷款信息
	
	public int  AddLoanColl(FmLoanColl fmLoanColl );                          //增加 抵押品信息
	public int  AddLoanGcn(FmLoanGcn fmLoanGcn );                             //增加保证人（法人）信息
	public int  AddLoanGuran(FmLoanGuran fmLoanGuran  );                      //增加担保人（自然人）信息
	public int  AddLoanMortg(FmLoanMortg fmLoanMortg  );                      //增加质押品信息
	
}