package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmLoanProgress;
import com.ufc.fm.dbio.po.FmLoanProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmLoanProgressMapper {
    int countByExample(FmLoanProgressExample example);

    int deleteByExample(FmLoanProgressExample example);

    int deleteByPrimaryKey(String custId);

    int insert(FmLoanProgress record);

    int insertSelective(FmLoanProgress record);

    List<FmLoanProgress> selectByExample(FmLoanProgressExample example);

    FmLoanProgress selectByPrimaryKey(String custId);

    int updateByExampleSelective(@Param("record") FmLoanProgress record, @Param("example") FmLoanProgressExample example);

    int updateByExample(@Param("record") FmLoanProgress record, @Param("example") FmLoanProgressExample example);

    int updateByPrimaryKeySelective(FmLoanProgress record);

    int updateByPrimaryKey(FmLoanProgress record);
}