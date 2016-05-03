package com.ufc.fm.dbio.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ufc.fm.dbio.po.FmStatisticsTaskNum;

public interface FmStatisticsMapper {
	List<FmStatisticsTaskNum> getTaskNumByStatus(@Param("userName") String username, @Param("beginDate") String beginDate, @Param("endDate") String endDate);

	List<FmStatisticsTaskNum> getTaskNumByTxntype(@Param("userName") String username, @Param("beginDate") String beginDate, @Param("endDate") String endDate);

	List<FmStatisticsTaskNum> getTaskNumByMonth(@Param("userName") String username, @Param("txnType") String txnType, @Param("beginDate") String beginDate, @Param("endDate") String endDate);
}