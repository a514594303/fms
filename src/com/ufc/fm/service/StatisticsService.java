package com.ufc.fm.service;

import java.util.List;

import com.ufc.fm.dbio.po.FmStatisticsTaskNum;

public interface StatisticsService extends BaseService {

	public List<FmStatisticsTaskNum> getTaskNumByStatus(String userName, String beginDate, String endDate);

	public List<FmStatisticsTaskNum> getTaskNumByTxntype(String userName, String beginDate, String endDate);

	public List<FmStatisticsTaskNum> getTaskNumByMonth(String userName, String txnType, String beginDate, String endDate);

}
