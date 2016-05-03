package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmCust;
import com.ufc.fm.dbio.po.FmCustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmCustMapper {
    int countByExample(FmCustExample example);

    int deleteByExample(FmCustExample example);

    int deleteByPrimaryKey(String custId);

    int insert(FmCust record);

    int insertSelective(FmCust record);

    List<FmCust> selectByExample(FmCustExample example);

    FmCust selectByPrimaryKey(String custId);

    int updateByExampleSelective(@Param("record") FmCust record, @Param("example") FmCustExample example);

    int updateByExample(@Param("record") FmCust record, @Param("example") FmCustExample example);

    int updateByPrimaryKeySelective(FmCust record);

    int updateByPrimaryKey(FmCust record);
    
    String maxPrimaryKey();
}