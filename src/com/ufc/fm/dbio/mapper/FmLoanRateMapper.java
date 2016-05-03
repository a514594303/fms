package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmLoanRate;
import com.ufc.fm.dbio.po.FmLoanRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmLoanRateMapper {
    int countByExample(FmLoanRateExample example);

    int deleteByExample(FmLoanRateExample example);

    int deleteByPrimaryKey(Integer rateId);

    int insert(FmLoanRate record);

    int insertSelective(FmLoanRate record);

    List<FmLoanRate> selectByExample(FmLoanRateExample example);

    FmLoanRate selectByPrimaryKey(Integer rateId);

    int updateByExampleSelective(@Param("record") FmLoanRate record, @Param("example") FmLoanRateExample example);

    int updateByExample(@Param("record") FmLoanRate record, @Param("example") FmLoanRateExample example);

    int updateByPrimaryKeySelective(FmLoanRate record);

    int updateByPrimaryKey(FmLoanRate record);
}