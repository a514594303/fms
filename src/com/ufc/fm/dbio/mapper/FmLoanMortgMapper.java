package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmLoanMortg;
import com.ufc.fm.dbio.po.FmLoanMortgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmLoanMortgMapper {
    int countByExample(FmLoanMortgExample example);

    int deleteByExample(FmLoanMortgExample example);

    int deleteByPrimaryKey(Integer mortId);

    int insert(FmLoanMortg record);

    int insertSelective(FmLoanMortg record);

    List<FmLoanMortg> selectByExample(FmLoanMortgExample example);

    FmLoanMortg selectByPrimaryKey(Integer mortId);

    int updateByExampleSelective(@Param("record") FmLoanMortg record, @Param("example") FmLoanMortgExample example);

    int updateByExample(@Param("record") FmLoanMortg record, @Param("example") FmLoanMortgExample example);

    int updateByPrimaryKeySelective(FmLoanMortg record);

    int updateByPrimaryKey(FmLoanMortg record);
}