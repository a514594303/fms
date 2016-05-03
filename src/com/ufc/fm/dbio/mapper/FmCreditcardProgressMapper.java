package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmCreditcardProgress;
import com.ufc.fm.dbio.po.FmCreditcardProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmCreditcardProgressMapper {
    int countByExample(FmCreditcardProgressExample example);

    int deleteByExample(FmCreditcardProgressExample example);

    int deleteByPrimaryKey(String custId);

    int insert(FmCreditcardProgress record);

    int insertSelective(FmCreditcardProgress record);

    List<FmCreditcardProgress> selectByExample(FmCreditcardProgressExample example);

    FmCreditcardProgress selectByPrimaryKey(String custId);

    int updateByExampleSelective(@Param("record") FmCreditcardProgress record, @Param("example") FmCreditcardProgressExample example);

    int updateByExample(@Param("record") FmCreditcardProgress record, @Param("example") FmCreditcardProgressExample example);

    int updateByPrimaryKeySelective(FmCreditcardProgress record);

    int updateByPrimaryKey(FmCreditcardProgress record);
}