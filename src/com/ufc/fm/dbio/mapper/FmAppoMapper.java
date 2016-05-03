package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmAppo;
import com.ufc.fm.dbio.po.FmAppoExample;
import com.ufc.fm.dbio.po.FmAppoKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FmAppoMapper {
    int countByExample(FmAppoExample example);

    int deleteByExample(FmAppoExample example);

    int deleteByPrimaryKey(FmAppoKey key);

    int insert(FmAppo record);

    int insertSelective(FmAppo record);

    List<FmAppo> selectByExample(FmAppoExample example);

    FmAppo selectByPrimaryKey(FmAppoKey key);

    int updateByExampleSelective(@Param("record") FmAppo record, @Param("example") FmAppoExample example);

    int updateByExample(@Param("record") FmAppo record, @Param("example") FmAppoExample example);

    int updateByPrimaryKeySelective(FmAppo record);

    int updateByPrimaryKey(FmAppo record);
    
    String getNextAppoId(String custId,String taskId);

	List<FmAppo> queryAppos(@Param("custId") String custId, @Param("name") String name, @Param("identityType") String identityType, @Param("identityCard") String identityCard, @Param("mobilePhone") String mobilePhone, @Param("homePhone") String homePhone, @Param("taskId") String taskId, @Param("appoId") String appoId, @Param("appoStatus") String appoStatus);
}