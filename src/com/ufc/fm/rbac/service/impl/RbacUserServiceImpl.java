package com.ufc.fm.rbac.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufc.comm.util.DateTimeUtil;
import com.ufc.comm.util.IDTools;
import com.ufc.fm.rbac.mapper.FmResPermissionMapper;
import com.ufc.fm.rbac.mapper.FmResourcesMapper;
import com.ufc.fm.rbac.mapper.FmUserMapper;
import com.ufc.fm.rbac.mapper.FmUserOrgMapper;
import com.ufc.fm.rbac.mapper.FmUserSignMapper;
import com.ufc.fm.rbac.po.FmResPermission;
import com.ufc.fm.rbac.po.FmResPermissionExample;
import com.ufc.fm.rbac.po.FmResources;
import com.ufc.fm.rbac.po.FmResourcesExample;
import com.ufc.fm.rbac.po.FmUser;
import com.ufc.fm.rbac.po.FmUserExample;
import com.ufc.fm.rbac.po.FmUserOrg;
import com.ufc.fm.rbac.po.FmUserOrgExample;
import com.ufc.fm.rbac.po.FmUserSign;
import com.ufc.fm.rbac.po.FmUserSignExample;
import com.ufc.fm.rbac.service.IRbacUserService;
import com.ufc.fm.rbac.util.MobileUserConstant;

@Service("rbacUserService")
@Transactional(rollbackFor = { RuntimeException.class, Exception.class }, timeout = 30)
@Component
public class RbacUserServiceImpl implements IRbacUserService {

	private FmUserOrgMapper fmUserOrgMapper;

	private FmUserMapper fmUserMapper;

	private FmUserSignMapper fmUserSignMapper;
	
	private FmResPermissionMapper fmResPermissionMapper;
	
	private FmResourcesMapper fmResourcesMapper;

	
	/*
	 * 通过柜员号和机构码获取用户账号
	 */
	public FmUser getUserAccount(String userNo, String orgNo) {

		FmUserOrgExample fmUserOrgExample = new FmUserOrgExample();
		fmUserOrgExample.createCriteria().andOrgNoEqualTo(orgNo).andUserNoEqualTo(userNo);
		List<FmUserOrg> userNoList = fmUserOrgMapper
				.selectByExample(fmUserOrgExample);

		if (userNoList != null && userNoList.size() > 0) {
			FmUserOrg user = userNoList.get(0);
			String userId = user.getUserId();

			FmUserExample fmUserExample = new FmUserExample();
			fmUserExample.createCriteria().andUserIdEqualTo(userId);
			List<FmUser> userAccount = fmUserMapper
					.selectByExample(fmUserExample);
			if (userAccount != null && userAccount.size() > 0) {
				return userAccount.get(0);
			}
		}

		return null;

	}
	
	/*
	 * 通过用户名获取用户信息
	 */
	public FmUser getUserInfo(String userName) {

		FmUserExample fmUserExample = new FmUserExample();
		fmUserExample.createCriteria().andUserAccountEqualTo(userName);
		List<FmUser> userAccount = fmUserMapper.selectByExample(fmUserExample);
		if (userAccount != null && userAccount.size() > 0) {
			return userAccount.get(0);
		}

		return null;

	}

	/*
	 * 通过用户账号登录验证密码 成功：SUCESS 失败：FAIL或者错误信息
	 */
	public String verifyPassword(String userAccount, String password) {

		FmUserExample fmUserExample = new FmUserExample();
		fmUserExample.createCriteria().andUserAccountEqualTo(userAccount);
		List<FmUser> fmUser = fmUserMapper.selectByExample(fmUserExample);
		if (fmUser != null && fmUser.size() > 0) {
			String truePS = fmUser.get(0).getPassword();
			if (truePS.equals(password)) {
				return MobileUserConstant.SUCESS;
			}
		} else {
			return MobileUserConstant.NOEXIST;
		}
		return MobileUserConstant.FAIL;

	}
	
	public String getUserRole(String userAccount){
		
		
		return userAccount;
		
	}

	// 签到
	public String signin(String userAccount, String sessionID) {

		String currentDat = DateTimeUtil.format(DateTimeUtil.trunc(new Date(), Calendar.DATE), "yyyy-MM-dd");

		FmUserSignExample fmUserSignExample = new FmUserSignExample();
		fmUserSignExample.createCriteria().andUserAccountEqualTo(userAccount)
				.andSignDateEqualTo(currentDat);
		List<FmUserSign> selectSign = fmUserSignMapper.selectByExample(fmUserSignExample);
		if (selectSign != null && selectSign.size() == 1) {
			FmUserSign signRes = selectSign.get(0);
			String state = signRes.getState();
			if(MobileUserConstant.SIGNINSTATE.equals(state)){
				return MobileUserConstant.SIGNINWARRING;
			}else if(MobileUserConstant.SIGNOUTSTATE.equals(state)){
				signRes.setState(MobileUserConstant.SIGNINSTATE);
				int res = fmUserSignMapper.updateByPrimaryKeySelective(signRes);
				if (res == 1) {
					return MobileUserConstant.SUCESS;
				}
				return MobileUserConstant.FAIL;
			}else{
				return MobileUserConstant.SIGNERROR;
			}
		} else if (selectSign != null && selectSign.size() >= 2) {
			return MobileUserConstant.SIGNERROR;
		}
		String currentTime = DateTimeUtil.format(DateTimeUtil.trunc(new Date(), Calendar.SECOND), "HH:mm:ss");
		FmUserSign fmUserSign = new FmUserSign();
		fmUserSign.setId(IDTools.getUUID());
		fmUserSign.setUserAccount(userAccount);
		fmUserSign.setSignDate(currentDat);
		fmUserSign.setSigninTime(currentTime);
		fmUserSign.setSessionId(sessionID);
		fmUserSign.setState(MobileUserConstant.SIGNINSTATE);
		int res = fmUserSignMapper.insert(fmUserSign);
		if (res == 1) {
			return MobileUserConstant.SUCESS;
		}
		return MobileUserConstant.FAIL;

	}

	// 签退
	public String signout(String userAccount, String sessionID) {



		String currentDat = DateTimeUtil.format(DateTimeUtil.trunc(new Date(), Calendar.DATE), "yyyy-MM-dd");

		FmUserSignExample fmUserSignExample = new FmUserSignExample();
		fmUserSignExample.createCriteria().andUserAccountEqualTo(userAccount)
				.andSignDateEqualTo(currentDat);
		List<FmUserSign> selectSign = fmUserSignMapper.selectByExample(fmUserSignExample);
		if(selectSign == null || selectSign.size() <1){
			return MobileUserConstant.SIGNOUTERROR;
		}
		
		if (selectSign != null && selectSign.size() == 1) {
			FmUserSign signRes = selectSign.get(0);
			String state = signRes.getState();
			if(MobileUserConstant.SIGNINSTATE.equals(state)){
				String currentTime = DateTimeUtil.format(DateTimeUtil.trunc(new Date(), Calendar.SECOND), "HH:mm:ss");
				signRes.setState(MobileUserConstant.SIGNOUTSTATE);
				signRes.setSignoutTime(currentTime);
				int res = fmUserSignMapper.updateByPrimaryKeySelective(signRes);
				if (res == 1) {
					return MobileUserConstant.SUCESS;
				}
				return MobileUserConstant.SIGNINWARRING;
			}else{
				return MobileUserConstant.SIGNERROR;
			}
		} else if (selectSign != null && selectSign.size() >= 2) {
			return MobileUserConstant.SIGNOUTERROR;
		}
		
		return MobileUserConstant.FAIL;

	

	}

	// 获取用户的所有权限
	public List<FmResources> getUserPermission(String userAccount) {

		FmResPermissionExample permissionExample=new FmResPermissionExample();
		permissionExample.createCriteria().andPermissionTypeEqualTo(MobileUserConstant.USER).andPermissionIdEqualTo(userAccount);
		List<FmResPermission> permissionRes = fmResPermissionMapper.selectByExample(permissionExample);
		
		if(permissionRes!=null&&permissionRes.size()>0){
			
			List<String> resIDList=new ArrayList<String>();
			for (int i = 0; i < permissionRes.size(); i++) {
				FmResPermission pr = permissionRes.get(i);
				resIDList.add(pr.getResourcesId());
			}
			
			FmResourcesExample resourcesExample=new FmResourcesExample();
			resourcesExample.createCriteria().andResourcesIdIn(resIDList);
			List<FmResources> resources = fmResourcesMapper.selectByExample(resourcesExample);
			return resources;
		}
		return null;

	}

	@Override
	public String getRolePermission(String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOrgPermission(String org) {
		// TODO Auto-generated method stub
		return null;
	}

	public FmUserOrgMapper getFmUserOrgMapper() {
		return fmUserOrgMapper;
	}

	@Resource
	public void setFmUserOrgMapper(FmUserOrgMapper fmUserOrgMapper) {
		this.fmUserOrgMapper = fmUserOrgMapper;
	}

	public FmUserMapper getFmUserMapper() {
		return fmUserMapper;
	}

	@Resource
	public void setFmUserMapper(FmUserMapper fmUserMapper) {
		this.fmUserMapper = fmUserMapper;
	}

	public FmUserSignMapper getFmUserSignMapper() {
		return fmUserSignMapper;
	}

	@Resource
	public void setFmUserSignMapper(FmUserSignMapper fmUserSignMapper) {
		this.fmUserSignMapper = fmUserSignMapper;
	}

	public FmResPermissionMapper getFmResPermissionMapper() {
		return fmResPermissionMapper;
	}
	
	@Resource
	public void setFmResPermissionMapper(FmResPermissionMapper fmResPermissionMapper) {
		this.fmResPermissionMapper = fmResPermissionMapper;
	}

	public FmResourcesMapper getFmResourcesMapper() {
		return fmResourcesMapper;
	}

	@Resource
	public void setFmResourcesMapper(FmResourcesMapper fmResourcesMapper) {
		this.fmResourcesMapper = fmResourcesMapper;
	}

}
