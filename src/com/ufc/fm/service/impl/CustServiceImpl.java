package com.ufc.fm.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufc.fm.dbio.mapper.FmCustMapper;
import com.ufc.fm.dbio.po.FmCust;
import com.ufc.fm.dbio.po.FmCustExample;
import com.ufc.fm.dbio.po.FmCustExample.Criteria;
import com.ufc.fm.service.CustService;

/**
 * 
 * @ClassName: CustServiceImpl
 * @Description: TODO 客户管理服务接口
 * @author: lee
 * @date 2015-11-10 上午9:53:28
 * @version 1.0
 * 
 */

@Service("custService")
@Transactional(rollbackFor = { RuntimeException.class, Exception.class }, timeout = 30)
public class CustServiceImpl implements CustService {

	@Autowired
	@Qualifier("fmCustMapper")
	private FmCustMapper fmCustMapper;

	@Override
	public FmCust queryCust(String cust_id, String identity_card) {
		// TODO Auto-generated method stub
		FmCust fmCust = null;

		if (null != cust_id && !cust_id.isEmpty()) {

			fmCust = fmCustMapper.selectByPrimaryKey(cust_id);
		} else {
			if (identity_card != null && !identity_card.isEmpty()) {

				FmCustExample example = new FmCustExample();
				FmCustExample.Criteria criteria = example.createCriteria();
				criteria.andIdentityCardEqualTo(identity_card);
				List<FmCust> list = fmCustMapper.selectByExample(example);

				if (list.size() > 0) {
					fmCust = list.get(0);
				}
			}
		}

		return fmCust;

	}

	@Override
	public List<FmCust> queryCustList(String cust_id, String name, String identity_type, String identity_card, String cust_type, String mobile_phone, String home_phone) {
		FmCustExample example = new FmCustExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(cust_id)) {
			criteria.andCustIdEqualTo(cust_id);
		}
		if (StringUtils.isNotBlank(name)) {
			criteria.andNameLike("%" + name + "%");
		}
		if (StringUtils.isNotBlank(identity_type)) {
			criteria.andIdentityTypeEqualTo(identity_type);
		}
		if (StringUtils.isNotBlank(identity_card)) {
			criteria.andIdentityCardEqualTo(identity_card);
		}
		if (StringUtils.isNotBlank(cust_type)) {
			criteria.andCustTypeEqualTo(cust_type);
		}
		if (StringUtils.isNotBlank(mobile_phone)) {
			criteria.andMobilePhoneEqualTo(mobile_phone);
		}
		if (StringUtils.isNotBlank(home_phone)) {
			criteria.andHomePhoneEqualTo(home_phone);
		}

		return fmCustMapper.selectByExample(example);
	}

	@Override
	public String addCust(FmCust cust) {
		// TODO Auto-generated method stub
		
		
		// 获取新增客户号，例如：max(cust_id)+1，现暂用uuid代替
		//String cust_id = UUID.randomUUID().toString();
		//select max(cust_id)+1 from fm_cust;获取最大主键+1
		String  cust_id = fmCustMapper.maxPrimaryKey();
		if(cust_id==null){ //设置初始序号
			cust_id="001";
		}
		
		cust.setCustId(cust_id);

		int nRet = -1;
		try {
			nRet = fmCustMapper.insert(cust);

		} catch (Exception e) {
			cust_id = null;
		}

		return cust_id;
	}

	@Override
	public boolean updateCust(FmCust cust) {
		// TODO Auto-generated method stub

		int nRet = -1;
		try {
			nRet = fmCustMapper.updateByPrimaryKey(cust);

		} catch (Exception e) {
			;
		}

		return nRet > 0 ? true : false;
	}

	@Override
	public boolean deleteCust(String cust_id) {
		// TODO Auto-generated method stub

		int nRet = -1;
		try {
			nRet = fmCustMapper.deleteByPrimaryKey(cust_id);

		} catch (Exception e) {
			;
		}

		return nRet > 0 ? true : false;

	}

}
