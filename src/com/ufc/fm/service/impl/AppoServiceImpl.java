package com.ufc.fm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufc.fm.dbio.mapper.FmAppoMapper;
import com.ufc.fm.dbio.po.FmAppo;
import com.ufc.fm.dbio.po.FmAppoKey;
import com.ufc.fm.service.AppoService;

/**
 * 
* @ClassName: AppoServiceImpl  
* @Description: TODO 
* @author: disp  
* @date 2015-12-1 上午10:50:46  
* @version 1.0  
*
 */

@Service("appoService")
public class AppoServiceImpl implements AppoService {
	public static final String APPO_STATUS_NEW 			= "10";
	public static final String APPO_STATUS_CANCELED		= "50";
	public static final String APPO_STATUS_COMPLETED	= "90";	
	
	@Autowired
	private FmAppoMapper fmAppoMapper;
	
	@Override
	public FmAppo queryAppo(String cust_id, String task_id, String appo_id) {
		// TODO Auto-generated method stub
		FmAppoKey key = new FmAppoKey();
		key.setCustId(cust_id);
		key.setTaskId(task_id);
		key.setAppoId(appo_id);
		return fmAppoMapper.selectByPrimaryKey(key);
	}

	@Override
	public List<FmAppo> queryAppoList(String custId, String name, String identityType, String identityCard, String mobilePhone, String homePhone, String taskId, String appoId, String appoStatus) {
		return fmAppoMapper.queryAppos(custId, name, identityType, identityCard, mobilePhone, homePhone, taskId, appoId, appoStatus);
	}

	@Override
	public String addAppo(FmAppo appo) {
		// TODO Auto-generated method stub
		String  newAppoId = fmAppoMapper.getNextAppoId(appo.getCustId(),appo.getTaskId());
		if(newAppoId==null){ //设置初始序号，仅演示阶段
			newAppoId="001";
		}
		else{
			int count= 3-newAppoId.length();
			for(int n=0;n<count;n++){
				newAppoId = "0"+ newAppoId;
			}
		}
		appo.setAppoId(newAppoId);
		appo.setAppoStatus(APPO_STATUS_NEW);

		try {
			int nRet = fmAppoMapper.insert(appo);

		} catch (Exception e) {
			newAppoId = null;
		}

		return newAppoId;	
	}

	@Override
	public boolean processAppo(String cust_id, String task_id, String appo_id,
			String proc_type) {
		// TODO Auto-generated method stub
		
		int nRet = -1;
		try {
			
			String status = null;
			if(proc_type.equalsIgnoreCase("C")){	//C：取消
				status = APPO_STATUS_CANCELED;				
			}
			else if(proc_type.equalsIgnoreCase("F")){
				status = APPO_STATUS_COMPLETED;				
			}			
			
			if(status != null){
				FmAppo appo = new FmAppo();
				appo.setCustId(cust_id);
				appo.setTaskId(task_id);	
				appo.setAppoId(appo_id);
				appo.setAppoStatus(status);
				nRet = fmAppoMapper.updateByPrimaryKeySelective(appo);
			}

		} catch (Exception e) {
			;
		}

		return nRet > 0 ? true : false;		
	}

}
