package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmLoanGcn;
import com.ufc.fm.dbio.po.FmLoanGcnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmLoanGcnMapper {
    int countByExample(FmLoanGcnExample example);

    int deleteByExample(FmLoanGcnExample example);

    int deleteByPrimaryKey(Integer gcnId);

    int insert(FmLoanGcn record);

    int insertSelective(FmLoanGcn record);

    List<FmLoanGcn> selectByExample(FmLoanGcnExample example);

    FmLoanGcn selectByPrimaryKey(Integer gcnId);

    int updateByExampleSelective(@Param("record") FmLoanGcn record, @Param("example") FmLoanGcnExample example);

    int updateByExample(@Param("record") FmLoanGcn record, @Param("example") FmLoanGcnExample example);

    int updateByPrimaryKeySelective(FmLoanGcn record);

    int updateByPrimaryKey(FmLoanGcn record);
}