package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmLoanApplicationHouse;
import com.ufc.fm.dbio.po.FmLoanApplicationHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmLoanApplicationHouseMapper {
    int countByExample(FmLoanApplicationHouseExample example);

    int deleteByExample(FmLoanApplicationHouseExample example);

    int deleteByPrimaryKey(Integer houseId);

    int insert(FmLoanApplicationHouse record);

    int insertSelective(FmLoanApplicationHouse record);

    List<FmLoanApplicationHouse> selectByExample(FmLoanApplicationHouseExample example);

    FmLoanApplicationHouse selectByPrimaryKey(Integer houseId);

    int updateByExampleSelective(@Param("record") FmLoanApplicationHouse record, @Param("example") FmLoanApplicationHouseExample example);

    int updateByExample(@Param("record") FmLoanApplicationHouse record, @Param("example") FmLoanApplicationHouseExample example);

    int updateByPrimaryKeySelective(FmLoanApplicationHouse record);

    int updateByPrimaryKey(FmLoanApplicationHouse record);
}