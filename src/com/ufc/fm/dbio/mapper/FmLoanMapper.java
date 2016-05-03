package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmLoan;
import com.ufc.fm.dbio.po.FmLoanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmLoanMapper {
    int countByExample(FmLoanExample example);

    int deleteByExample(FmLoanExample example);

    int deleteByPrimaryKey(Integer loanId);

    int insert(FmLoan record);

    int insertSelective(FmLoan record);

    List<FmLoan> selectByExample(FmLoanExample example);

    FmLoan selectByPrimaryKey(Integer loanId);

    int updateByExampleSelective(@Param("record") FmLoan record, @Param("example") FmLoanExample example);

    int updateByExample(@Param("record") FmLoan record, @Param("example") FmLoanExample example);

    int updateByPrimaryKeySelective(FmLoan record);

    int updateByPrimaryKey(FmLoan record);
}