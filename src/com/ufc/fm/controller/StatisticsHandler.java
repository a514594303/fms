package com.ufc.fm.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.comm.util.DateTimeUtil;
import com.ufc.fm.controller.po.ReqMsgHeader;
import com.ufc.fm.controller.po.RspMsgHeader;
import com.ufc.fm.dbio.po.FmStatisticsTaskNum;
import com.ufc.fm.engine.ReflectDbioPo;
import com.ufc.fm.service.StatisticsService;

@Controller
@RequestMapping("/fmapp/v1/statistics")
public class StatisticsHandler extends BaseController {

	public static final String YEAR = "1";
	public static final String QUARTER = "2";
	public static final String MONTH = "3";

	@Autowired
	private StatisticsService statisticsService;

	@RequestMapping(value = "/tasknumbystatus")
	public ModelAndView statisticsTaskNumByStatus(ReqMsgHeader reqMsgHeader, String begin_date, String end_date, String fast_condition) throws Exception {
		if (YEAR.equals(fast_condition) || QUARTER.equals(fast_condition) || MONTH.equals(fast_condition)) {
			Calendar calendar = Calendar.getInstance();
			end_date = DateTimeUtil.format(calendar.getTime(), "yyyyMMdd");
			if (YEAR.equals(fast_condition)) {
				calendar.add(Calendar.YEAR, -1);
			} else if (QUARTER.equals(fast_condition)) {
				calendar.add(Calendar.MONTH, -3);
			} else if (MONTH.equals(fast_condition)) {
				calendar.add(Calendar.MONTH, -1);
			}
			begin_date = DateTimeUtil.format(calendar.getTime(), "yyyyMMdd");
		}
		RspMsgHeader rspMsgHeader = makeRspMsgHeader();

		List<StatusNum> tmpResults = new ArrayList<StatusNum>();
		Map<String, Object> tmpCacheMap = makeResultMap();
		String username = reqMsgHeader.getUserName();
		List<FmStatisticsTaskNum> fmTaskNums = statisticsService.getTaskNumByStatus(username, begin_date, end_date);
		for (FmStatisticsTaskNum fmTaskNum : fmTaskNums) {
			String statusNumKey = fmTaskNum.getTaskStatus();
			StatusNum statusNum = (StatusNum) tmpCacheMap.get(statusNumKey);
			if (statusNum == null) {
				statusNum = new StatusNum(fmTaskNum);
				tmpCacheMap.put(statusNumKey, statusNum);
				tmpResults.add(statusNum);
			}
		}
		List<Map<String, Object>> resultQuery = new ArrayList<Map<String, Object>>();
		for (StatusNum tmpResult : tmpResults) {
			resultQuery.add(ReflectDbioPo.fmPo2Map(tmpResult));
		}
		return makeResultMav(rspMsgHeader, null, resultQuery);
	}

	@RequestMapping(value = "/tasknumbytxntype")
	public ModelAndView statisticsTaskNumByTxntype(ReqMsgHeader reqMsgHeader, String begin_date, String end_date, String fast_condition) throws Exception {
		if (YEAR.equals(fast_condition) || QUARTER.equals(fast_condition) || MONTH.equals(fast_condition)) {
			Calendar calendar = Calendar.getInstance();
			end_date = DateTimeUtil.format(calendar.getTime(), "yyyyMMdd");
			if (YEAR.equals(fast_condition)) {
				calendar.add(Calendar.YEAR, -1);
			} else if (QUARTER.equals(fast_condition)) {
				calendar.add(Calendar.MONTH, -3);
			} else if (MONTH.equals(fast_condition)) {
				calendar.add(Calendar.MONTH, -1);
			}
			begin_date = DateTimeUtil.format(calendar.getTime(), "yyyyMMdd");
		}
		RspMsgHeader rspMsgHeader = makeRspMsgHeader();

		List<TxntypeNum> tmpResults = new ArrayList<TxntypeNum>();
		Map<String, Object> tmpCacheMap = makeResultMap();
		String username = reqMsgHeader.getUserName();
		List<FmStatisticsTaskNum> fmTaskNums = statisticsService.getTaskNumByTxntype(username, begin_date, end_date);
		for (FmStatisticsTaskNum fmTaskNum : fmTaskNums) {
			String txntypeNumKey = fmTaskNum.getTxnType();
			TxntypeNum txntypeNum = (TxntypeNum) tmpCacheMap.get(txntypeNumKey);
			if (txntypeNum == null) {
				txntypeNum = new TxntypeNum(fmTaskNum);
				tmpCacheMap.put(txntypeNumKey, txntypeNum);
				tmpResults.add(txntypeNum);
			}
			String statusNumKey = txntypeNumKey + fmTaskNum.getTaskStatus();
			StatusNum statusNum = (StatusNum) tmpCacheMap.get(statusNumKey);
			if (statusNum == null) {
				statusNum = new StatusNum(fmTaskNum);
				tmpCacheMap.put(statusNumKey, statusNum);
				txntypeNum.addStatusNum(statusNum);
			}
			txntypeNum.addTaskCount(statusNum.getTaskCount());
		}
		List<Map<String, Object>> resultQuery = new ArrayList<Map<String, Object>>();
		for (TxntypeNum tmpResult : tmpResults) {
			resultQuery.add(ReflectDbioPo.fmPo2Map(tmpResult));
		}
		return makeResultMav(rspMsgHeader, null, resultQuery);
	}

	@RequestMapping(value = "/tasknumbymonth")
	public ModelAndView statisticsTaskNumByMonth(ReqMsgHeader reqMsgHeader, String txn_type, String begin_date, String end_date, String fast_condition) throws Exception {
		if (fast_condition != null) {
			Calendar calendar = Calendar.getInstance();
			end_date = DateTimeUtil.format(calendar.getTime(), "yyyyMMdd");
			calendar.add(Calendar.YEAR, -Integer.parseInt(fast_condition));
			begin_date = DateTimeUtil.format(calendar.getTime(), "yyyyMMdd");
		}
		RspMsgHeader rspMsgHeader = makeRspMsgHeader();

		List<ReptDateNum> tmpResults = new ArrayList<ReptDateNum>();
		Map<String, Object> tmpCacheMap = makeResultMap();
		String username = reqMsgHeader.getUserName();
		List<FmStatisticsTaskNum> fmTaskNums = statisticsService.getTaskNumByMonth(username, txn_type, begin_date, end_date);
		for (FmStatisticsTaskNum fmTaskNum : fmTaskNums) {
			String reptDateNumKey = fmTaskNum.getReptDate();
			ReptDateNum reptDateNum = (ReptDateNum) tmpCacheMap.get(reptDateNumKey);
			if (reptDateNum == null) {
				reptDateNum = new ReptDateNum(fmTaskNum);
				tmpCacheMap.put(reptDateNumKey, reptDateNum);
				tmpResults.add(reptDateNum);
			}
			String statusNumKey = reptDateNumKey + fmTaskNum.getTaskStatus();
			StatusNum statusNum = (StatusNum) tmpCacheMap.get(statusNumKey);
			if (statusNum == null) {
				statusNum = new StatusNum(fmTaskNum);
				tmpCacheMap.put(statusNumKey, statusNum);
				reptDateNum.addStatusNum(statusNum);
			}
			reptDateNum.addTaskCount(statusNum.getTaskCount());
		}
		List<Map<String, Object>> resultQuery = new ArrayList<Map<String, Object>>();
		for (ReptDateNum tmpResult : tmpResults) {
			resultQuery.add(ReflectDbioPo.fmPo2Map(tmpResult));
		}
		return makeResultMav(rspMsgHeader, null, resultQuery);
	}

	public class ReptDateNum {
		private String reptDate;
		private int taskCount;
		private List<StatusNum> statusNums;

		public ReptDateNum(FmStatisticsTaskNum taskNum) {
			setReptDate(taskNum.getReptDate());
		}

		public String getReptDate() {
			return reptDate;
		}

		public void setReptDate(String reptDate) {
			this.reptDate = reptDate;
		}

		public int getTaskCount() {
			return taskCount;
		}

		public void addTaskCount(int taskCount) {
			this.taskCount += taskCount;
		}

		public List<StatusNum> getStatusNums() {
			return statusNums;
		}

		public void addStatusNum(StatusNum statusNum) {
			if (statusNums == null) {
				statusNums = new ArrayList<StatusNum>();
			}
			statusNums.add(statusNum);
		}
	}

	public class TxntypeNum {
		private String txnType;
		private int taskCount;
		private List<StatusNum> statusNums;

		public TxntypeNum(FmStatisticsTaskNum taskNum) {
			setTxnType(taskNum.getTxnType());
		}

		public String getTxnType() {
			return txnType;
		}

		public void setTxnType(String txnType) {
			this.txnType = txnType;
		}

		public int getTaskCount() {
			return taskCount;
		}

		public void addTaskCount(int taskCount) {
			this.taskCount += taskCount;
		}

		public List<StatusNum> getStatusNums() {
			return statusNums;
		}

		public void addStatusNum(StatusNum statusNum) {
			if (statusNums == null) {
				statusNums = new ArrayList<StatusNum>();
			}
			statusNums.add(statusNum);
		}
	}

	public class StatusNum {
		private String taskStatus;
		private int taskCount;

		public StatusNum(FmStatisticsTaskNum taskNum) {
			setTaskStatus(taskNum.getTaskStatus());
			String count = taskNum.getTaskCount();
			setTaskCount(count == null ? 0 : Integer.parseInt(count));
		}

		public String getTaskStatus() {
			return taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public int getTaskCount() {
			return taskCount;
		}

		public void setTaskCount(int taskCount) {
			this.taskCount = taskCount;
		}
	}
}
