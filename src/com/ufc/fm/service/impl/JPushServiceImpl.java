package com.ufc.fm.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;

import com.ufc.comm.push.JPushService;
import com.ufc.comm.util.DateTimeUtil;
import com.ufc.comm.util.IDTools;
import com.ufc.comm.util.SpringContextUtil;
import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.dbio.mapper.FmCustMapper;
import com.ufc.fm.dbio.mapper.FmCustomerMapper;
import com.ufc.fm.dbio.mapper.FmGpsMapper;
import com.ufc.fm.dbio.mapper.FmJpushMapper;
import com.ufc.fm.dbio.mapper.FmNoticeMapper;
import com.ufc.fm.dbio.po.FmCust;
import com.ufc.fm.dbio.po.FmCustExample;
import com.ufc.fm.dbio.po.FmCustomer;
import com.ufc.fm.dbio.po.FmCustomerExample;
import com.ufc.fm.dbio.po.FmGps;
import com.ufc.fm.dbio.po.FmGpsExample;
import com.ufc.fm.dbio.po.FmJpush;
import com.ufc.fm.dbio.po.FmJpushExample;
import com.ufc.fm.dbio.po.FmNotice;
import com.ufc.fm.dbio.po.FmNoticeExample;
import com.ufc.fm.service.CustService;
import com.ufc.fm.service.CustomerService;
import com.ufc.fm.service.IGPSService;
import com.ufc.fm.service.IJPushService;

/**
 * 
 * @ClassName: CustServiceImpl
 * @Description: TODO 客户管理服务接口
 * @author: lee
 * @date 2015-11-10 上午9:53:28
 * @version 1.0
 * 
 */

@Service("JPushService")
@Transactional(rollbackFor = { RuntimeException.class, Exception.class }, timeout = 30)
public class JPushServiceImpl implements IJPushService {

	 protected static final Logger LOG = LoggerFactory.getLogger(JPushService.class);
	
	private FmJpushMapper fmJpushMapper;
	
	private FmNoticeMapper fmNoticeMapper;
	
	private static final String appKey ="00acb86539877f11f4dffdd0";
	
	private static final String masterSecret = "f75973a8646ce340925b40c1";

	@Override
	public String registration(FmJpush pushReg) {

		String userName = pushReg.getUsername();
		if (userName == null || "".equals(userName)) {
			return ErrorCode.DEVICE_ERROR;
		}
		pushReg.setStatus("01");
		pushReg.setTime(DateTimeUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		FmJpushExample example = new FmJpushExample();
		example.createCriteria().andUsernameEqualTo(userName);
		List<FmJpush> userReg = fmJpushMapper.selectByExample(example);

		if (userReg != null && userReg.size() > 0) {

			FmJpush recordOld = userReg.get(0);
			pushReg.setId(recordOld.getId());
			int res = fmJpushMapper.updateByPrimaryKey(pushReg);
			if (res == 1) {
				return ErrorCode.SUCCEED;
			}
		} else {
			pushReg.setId(IDTools.getUUID());
			int res = fmJpushMapper.insert(pushReg);
			if (res == 1) {
				return ErrorCode.SUCCEED;
			}

		}

		return ErrorCode.DEVICE_ERROR;
	}

	@Override
	public void sendPushWithUser(String userName, String msg) {

		JPushClient jpushClient = new JPushClient(masterSecret, appKey, 3);

		FmJpushExample example=new FmJpushExample();
		example.createCriteria().andUsernameEqualTo(userName);
		List<FmJpush> jpushUser = fmJpushMapper.selectByExample(example);
		if(jpushUser!=null&&jpushUser.size()>0){
			String registrationId = jpushUser.get(0).getRegistrationId();
			String jpushAlias = jpushUser.get(0).getAlias();
			PushPayload payload = buildPushObject_all_alias_alert(jpushAlias, msg);
			try {
				PushResult result = jpushClient.sendPush(payload);
				LOG.info("Got result - " + result);
				
			} catch (APIConnectionException e) {
				LOG.error("Connection error. Should retry later. ", e);
				
			} catch (APIRequestException e) {
				LOG.error(
						"Error response from JPush server. Should review and fix it. ",
						e);
				LOG.info("HTTP Status: " + e.getStatus());
				LOG.info("Error Code: " + e.getErrorCode());
				LOG.info("Error Message: " + e.getErrorMessage());
				LOG.info("Msg ID: " + e.getMsgId());
			}
		}

	}

	private static PushPayload buildPushObject_all_alias_alert(String alias,
			String alert) {
		return PushPayload.newBuilder().setPlatform(Platform.all())
				.setAudience(Audience.alias(alias))
				.setNotification(Notification.alert(alert)).build();
	}

	@Override
	public String getRegistrationID(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAlias(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getTagUser(String tag) {
		// TODO Auto-generated method stub
		return null;
	}

	public FmJpushMapper getFmJpushMapper() {
		return fmJpushMapper;
	}

	@Resource
	public void setFmJpushMapper(FmJpushMapper fmJpushMapper) {
		this.fmJpushMapper = fmJpushMapper;
	}

	@Override
	public List<FmNotice> getMsgList(String receiver) {
		
		FmNoticeExample fmNoticeExample=new FmNoticeExample();
		fmNoticeExample.createCriteria().andReceiverLike(receiver).andStatusEqualTo("1");
		List<FmNotice> notices = fmNoticeMapper.selectByExample(fmNoticeExample);
		
		return notices;
	}

	@Override
	public String deleteMsg(String id) {
		
		int statu = fmNoticeMapper.deleteByPrimaryKey(id);
		if(statu==1){
			return ErrorCode.SUCCEED;
		}
		return ErrorCode.FAIL;
	}

	public FmNoticeMapper getFmNoticeMapper() {
		return fmNoticeMapper;
	}
	
	@Resource
	public void setFmNoticeMapper(FmNoticeMapper fmNoticeMapper) {
		this.fmNoticeMapper = fmNoticeMapper;
	}

}
