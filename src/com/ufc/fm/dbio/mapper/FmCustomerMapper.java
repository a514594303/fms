package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmCustomer;
import com.ufc.fm.dbio.po.FmCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmCustomerMapper {
    int countByExample(FmCustomerExample example);

    int deleteByExample(FmCustomerExample example);

    int deleteByPrimaryKey(String custId);

    int insert(FmCustomer record);

    int insertSelective(FmCustomer record);

    List<FmCustomer> selectByExample(FmCustomerExample example);

    FmCustomer selectByPrimaryKey(String custId);

    int updateByExampleSelective(@Param("record") FmCustomer record, @Param("example") FmCustomerExample example);

    int updateByExample(@Param("record") FmCustomer record, @Param("example") FmCustomerExample example);

    int updateByPrimaryKeySelective(FmCustomer record);

    int updateByPrimaryKey(FmCustomer record);
}