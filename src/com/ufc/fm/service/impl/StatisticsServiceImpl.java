package com.ufc.fm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufc.fm.dbio.mapper.FmStatisticsMapper;
import com.ufc.fm.dbio.po.FmStatisticsTaskNum;
import com.ufc.fm.service.StatisticsService;

@Service("statisticsService")
@Transactional(rollbackFor = { RuntimeException.class, Exception.class }, timeout = 30)
public class StatisticsServiceImpl implements StatisticsService {

	@Autowired
	private FmStatisticsMapper fmStatisticsMapper;

	@Override
	public List<FmStatisticsTaskNum> getTaskNumByStatus(String userName, String beginDate, String endDate) {
		return fmStatisticsMapper.getTaskNumByStatus(userName, beginDate, endDate);
	}

	@Override
	public List<FmStatisticsTaskNum> getTaskNumByTxntype(String userName, String beginDate, String endDate) {
		return fmStatisticsMapper.getTaskNumByTxntype(userName, beginDate, endDate);
	}

	@Override
	public List<FmStatisticsTaskNum> getTaskNumByMonth(String userName, String txnType, String beginDate, String endDate) {
		return fmStatisticsMapper.getTaskNumByMonth(userName, txnType, beginDate, endDate);
	}

}
