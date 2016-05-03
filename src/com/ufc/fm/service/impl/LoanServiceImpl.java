package com.ufc.fm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ufc.fm.dbio.mapper.FmLoanApplicationCarMapper;
import com.ufc.fm.dbio.mapper.FmLoanApplicationHouseMapper;
import com.ufc.fm.dbio.mapper.FmLoanApplicationRenovMapper;
import com.ufc.fm.dbio.mapper.FmLoanCollMapper;
import com.ufc.fm.dbio.mapper.FmLoanContactMapper;
import com.ufc.fm.dbio.mapper.FmLoanGcnMapper;
import com.ufc.fm.dbio.mapper.FmLoanGuranMapper;
import com.ufc.fm.dbio.mapper.FmLoanMapper;
import com.ufc.fm.dbio.mapper.FmLoanMortgMapper;
import com.ufc.fm.dbio.mapper.FmLoanProgressMapper;
import com.ufc.fm.dbio.mapper.FmLoanRateMapper;
import com.ufc.fm.dbio.po.FmLoan;
import com.ufc.fm.dbio.po.FmLoanApplicationCar;
import com.ufc.fm.dbio.po.FmLoanApplicationHouse;
import com.ufc.fm.dbio.po.FmLoanApplicationRenov;
import com.ufc.fm.dbio.po.FmLoanColl;
import com.ufc.fm.dbio.po.FmLoanContact;
import com.ufc.fm.dbio.po.FmLoanExample;
import com.ufc.fm.dbio.po.FmLoanGcn;
import com.ufc.fm.dbio.po.FmLoanGuran;
import com.ufc.fm.dbio.po.FmLoanMortg;
import com.ufc.fm.dbio.po.FmLoanProgress;
import com.ufc.fm.dbio.po.FmLoanProgressExample;
import com.ufc.fm.dbio.po.FmLoanRate;
import com.ufc.fm.dbio.po.FmLoanRateExample;
import com.ufc.fm.service.LoanService;

/**
 * 
* @ClassName: LoanServiceImpl  
* @Description: TODO 
* @author: disp  
* @date 2015-10-30 上午9:27:39  
* @version 1.0  
*
 */
@Service("loanService")
public class LoanServiceImpl implements LoanService {

	@Autowired 
	@Qualifier("fmLoanProgressMapper")
	private FmLoanProgressMapper fmLoanProgressMapper;
	
	@Autowired	
	@Qualifier("fmLoanRateMapper")
	private FmLoanRateMapper fmLoanRateMapper;
	
	@Autowired	
	@Qualifier("fmLoanMapper")
	private FmLoanMapper fmLoanMapper;
	
	@Autowired	
	@Qualifier("fmLoanContactMapper")
	private FmLoanContactMapper fmLoanContactMapper; 
	
	@Autowired	
	@Qualifier("fmLoanApplicationCarMapper")	
	private FmLoanApplicationCarMapper flac; 
	
	@Autowired	
	@Qualifier("fmLoanApplicationHouseMapper")	
	private FmLoanApplicationHouseMapper flah; 
	
	@Autowired	
	@Qualifier("fmLoanApplicationRenovMapper")	
	private FmLoanApplicationRenovMapper flar; 
	
	@Autowired	
	@Qualifier("fmLoanCollMapper")
	private FmLoanCollMapper flc;
	
	@Autowired	
	@Qualifier("fmLoanGcnMapper")
	private FmLoanGcnMapper flg; 
	
	@Autowired	
	@Qualifier("fmLoanGuranMapper")
	private FmLoanGuranMapper flgn; 
	
	@Autowired	
	@Qualifier("fmLoanMortgMapper")
	private FmLoanMortgMapper flm; 
	
	@Override
	public List<FmLoanProgress>  inquireProgress(String userName, 
			String start_date,
			String end_date,
			String cust_id,
			String cust_name,
			String identity_card,
			String loan_status) {
		// TODO Auto-generated method stub
		List<FmLoanProgress> progress = null;
		
		FmLoanProgressExample exa = new FmLoanProgressExample();
		FmLoanProgressExample.Criteria cr = exa.createCriteria();
		
		//设置过滤条件
		if(start_date != null && !start_date.isEmpty() && end_date != null && !end_date.isEmpty()){
			cr.andLoanDateBetween(start_date, end_date);			
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
		if(loan_status != null && !loan_status.isEmpty()){
			cr.andLoanStatusEqualTo(loan_status);
		}
	
	
		progress = fmLoanProgressMapper.selectByExample(exa);
		
/*		FmLoanProgress lp = fmLoanProgressMapper.selectByPrimaryKey("101");
		if(lp != null){
			progress.add(lp);
		}
		
		FmLoanProgress a = new FmLoanProgress();
		a.setCustId("999");
		a.setCustName("全聚德");
		fmLoanProgressMapper.insert(a);*/
		
		return progress;
	}
    	
	
	@Override
	public List<FmLoanRate> QueryLoanRate(String loanType, String loanPeriod) {
		// TODO Auto-generated method stub
		
		List<FmLoanRate> list = null;
		FmLoanRateExample example = new FmLoanRateExample();
		FmLoanRateExample.Criteria cr = example.createCriteria();
		
		if(loanType != null && !loanType.isEmpty() && loanPeriod != null && !loanPeriod.isEmpty()){		
			
		cr.andLoanTypeEqualTo(loanType).andLoanPeriodEqualTo(loanPeriod);}
    	else  cr.andRateIdIsNotNull();
		
		list =  fmLoanRateMapper.selectByExample(example);
		return list;
	}
	
	
	@Override
	public List<FmLoan> QueryListLoan(String loan_Id) {
		// TODO Auto-generated method stub
		List<FmLoan> list = null;
		FmLoanExample example = new FmLoanExample();
		FmLoanExample.Criteria cr = example.createCriteria();
		if (loan_Id != null &&  !loan_Id.isEmpty()) {
			Integer loanId = Integer.parseInt(loan_Id); 
			cr.andLoanIdEqualTo(loanId);
		} else
			cr.andLoanIdIsNotNull();
		list = fmLoanMapper.selectByExample(example);
		return list;
	}
	
	
	@Override
	public int AddLoan(FmLoan fmLoan) {
		// TODO Auto-generated method stub		
		if(fmLoan.getCustId()!=null && !fmLoan.getCustId().isEmpty()){ //检查客户号是否为空			
			int nRet = -1;
		try {
			nRet = fmLoanMapper.insert(fmLoan);
		

		} catch (Exception e) {
			nRet = 0;
		}
		}
            int loan_id = fmLoan.getLoanId();
		
		return loan_id;
	}


	@Override
	public int AddLoanContact(FmLoanContact fmLoanContact) {
		// TODO Auto-generated method stub

			
			if(fmLoanContact.getLoanId()!=null && !fmLoanContact.getLoanId().isEmpty()){ //检查客户号是否为空			
				int nRet = -1;
			try {
				nRet = fmLoanContactMapper.insert(fmLoanContact);
			

			} catch (Exception e) {
				System.out.println("fmLoanContact"+"贷款单号有误");
			}
			}
			
			int contact_id = fmLoanContact.getContactId();
			
			return contact_id;
		
	}


	@Override
	public int AddLoanCar(FmLoanApplicationCar applicationCar) {
		// TODO Auto-generated method stub
		if(applicationCar.getLoanId()!=null && !applicationCar.getLoanId().isEmpty()){ //检查客户号是否为空			
			int nRet = -1;
		try {
			nRet = flac.insert(applicationCar);
		

		} catch (Exception e) {
			System.out.println("FmLoanApplicationCar:"+"贷款单号有误");
		}
		}
		
		int car_id = applicationCar.getCarId();
		
		return car_id;
	}


	@Override
	public int AddLoanHouse(FmLoanApplicationHouse applicationHouse) {
		// TODO Auto-generated method stub
		if(applicationHouse.getLoanId()!=null && !applicationHouse.getLoanId().isEmpty()){ //检查客户号是否为空			
			int nRet = -1;
		try {
			nRet = flah.insert(applicationHouse);
		

		} catch (Exception e) {
			System.out.println("FmLoanApplicationHouse:"+"贷款单号有误");
		}
		}
		
		int house_id = applicationHouse.getHouseId();
		
		return house_id;
	}


	@Override
	public int AddLoanRenov(FmLoanApplicationRenov applicationRenov) {
		// TODO Auto-generated method stub
		if(applicationRenov.getLoanId()!=null && !applicationRenov.getLoanId().isEmpty()){ //检查客户号是否为空			
			int nRet = -1;
		try {
			nRet = flar.insert(applicationRenov);
		

		} catch (Exception e) {
			System.out.println("FmLoanApplicationRenov:"+"贷款单号有误");
		}
		}
		
		int ren_id = applicationRenov.getRenId();
		
		return ren_id;
	}


	@Override
	public int AddLoanColl(FmLoanColl fmLoanColl) {
		// TODO Auto-generated method stub
		if(fmLoanColl.getLoanId()!=null && !fmLoanColl.getLoanId().isEmpty()){ //检查客户号是否为空			
			int nRet = -1;
		try {
			nRet = flc.insert(fmLoanColl);
		

		} catch (Exception e) {
			System.out.println("FmLoanColl:"+"贷款单号有误");
		}
		}
		
		int coll_id = fmLoanColl.getCollId();
		
		return coll_id;
	}


	@Override
	public int AddLoanGcn(FmLoanGcn fmLoanGcn) {
		// TODO Auto-generated method stub
		if(fmLoanGcn.getLoanId()!=null && !fmLoanGcn.getLoanId().isEmpty()){ //检查客户号是否为空			
			int nRet = -1;
		try {
			nRet = flg.insert(fmLoanGcn);
		

		} catch (Exception e) {
			System.out.println("FmLoanGcn:"+"贷款单号有误");
		}
		}
		
		int gcn_id = fmLoanGcn.getGcnId();
		
		return gcn_id;
	}
	


	@Override
	public int AddLoanGuran(FmLoanGuran fmLoanGuran) {
		// TODO Auto-generated method stub
		if(fmLoanGuran.getLoanId()!=null && !fmLoanGuran.getLoanId().isEmpty()){ //检查客户号是否为空			
			int nRet = -1;
		try {
			nRet = flgn.insert(fmLoanGuran);
		

		} catch (Exception e) {
			System.out.println("fmLoanGuran:"+"贷款单号有误");
		}
		}
		
		int gur_id = fmLoanGuran.getGurId();
		
		return gur_id;
	}


	@Override
	public int AddLoanMortg(FmLoanMortg fmLoanMortg) {
		// TODO Auto-generated method stub
		   
			
			if(fmLoanMortg.getLoanId()!=null && !fmLoanMortg.getLoanId().isEmpty()){ //检查贷款申请号号是否为空			
				int nRet = -1;
			try {
				nRet = flm.insert(fmLoanMortg);
			

			} catch (Exception e) {
				System.out.println("质押品信息插入异常");
			}
			}
			
			int mort_id = fmLoanMortg.getMortId();
			
			return mort_id;
		
	}
	

}
