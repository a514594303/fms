package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmLoanGuran;
import com.ufc.fm.dbio.po.FmLoanGuranExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmLoanGuranMapper {
    int countByExample(FmLoanGuranExample example);

    int deleteByExample(FmLoanGuranExample example);

    int deleteByPrimaryKey(Integer gurId);

    int insert(FmLoanGuran record);

    int insertSelective(FmLoanGuran record);

    List<FmLoanGuran> selectByExample(FmLoanGuranExample example);

    FmLoanGuran selectByPrimaryKey(Integer gurId);

    int updateByExampleSelective(@Param("record") FmLoanGuran record, @Param("example") FmLoanGuranExample example);

    int updateByExample(@Param("record") FmLoanGuran record, @Param("example") FmLoanGuranExample example);

    int updateByPrimaryKeySelective(FmLoanGuran record);

    int updateByPrimaryKey(FmLoanGuran record);
}