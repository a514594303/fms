package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmLoanContact;
import com.ufc.fm.dbio.po.FmLoanContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmLoanContactMapper {
    int countByExample(FmLoanContactExample example);

    int deleteByExample(FmLoanContactExample example);

    int deleteByPrimaryKey(Integer contactId);

    int insert(FmLoanContact record);

    int insertSelective(FmLoanContact record);

    List<FmLoanContact> selectByExample(FmLoanContactExample example);

    FmLoanContact selectByPrimaryKey(Integer contactId);

    int updateByExampleSelective(@Param("record") FmLoanContact record, @Param("example") FmLoanContactExample example);

    int updateByExample(@Param("record") FmLoanContact record, @Param("example") FmLoanContactExample example);

    int updateByPrimaryKeySelective(FmLoanContact record);

    int updateByPrimaryKey(FmLoanContact record);
}