package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmLoanApplicationRenov;
import com.ufc.fm.dbio.po.FmLoanApplicationRenovExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmLoanApplicationRenovMapper {
    int countByExample(FmLoanApplicationRenovExample example);

    int deleteByExample(FmLoanApplicationRenovExample example);

    int deleteByPrimaryKey(Integer renId);

    int insert(FmLoanApplicationRenov record);

    int insertSelective(FmLoanApplicationRenov record);

    List<FmLoanApplicationRenov> selectByExample(FmLoanApplicationRenovExample example);

    FmLoanApplicationRenov selectByPrimaryKey(Integer renId);

    int updateByExampleSelective(@Param("record") FmLoanApplicationRenov record, @Param("example") FmLoanApplicationRenovExample example);

    int updateByExample(@Param("record") FmLoanApplicationRenov record, @Param("example") FmLoanApplicationRenovExample example);

    int updateByPrimaryKeySelective(FmLoanApplicationRenov record);

    int updateByPrimaryKey(FmLoanApplicationRenov record);
}