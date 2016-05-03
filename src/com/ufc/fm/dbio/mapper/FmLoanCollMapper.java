package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmLoanColl;
import com.ufc.fm.dbio.po.FmLoanCollExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmLoanCollMapper {
    int countByExample(FmLoanCollExample example);

    int deleteByExample(FmLoanCollExample example);

    int deleteByPrimaryKey(Integer collId);

    int insert(FmLoanColl record);

    int insertSelective(FmLoanColl record);

    List<FmLoanColl> selectByExample(FmLoanCollExample example);

    FmLoanColl selectByPrimaryKey(Integer collId);

    int updateByExampleSelective(@Param("record") FmLoanColl record, @Param("example") FmLoanCollExample example);

    int updateByExample(@Param("record") FmLoanColl record, @Param("example") FmLoanCollExample example);

    int updateByPrimaryKeySelective(FmLoanColl record);

    int updateByPrimaryKey(FmLoanColl record);
}