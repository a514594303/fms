package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmTask;
import com.ufc.fm.dbio.po.FmTaskExample;
import com.ufc.fm.dbio.po.FmTaskKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmTaskMapper {
    int countByExample(FmTaskExample example);

    int deleteByExample(FmTaskExample example);

    int deleteByPrimaryKey(FmTaskKey key);

    int insert(FmTask record);

    int insertSelective(FmTask record);

    List<FmTask> selectByExample(FmTaskExample example);

    FmTask selectByPrimaryKey(FmTaskKey key);

    int updateByExampleSelective(@Param("record") FmTask record, @Param("example") FmTaskExample example);

    int updateByExample(@Param("record") FmTask record, @Param("example") FmTaskExample example);

    int updateByPrimaryKeySelective(FmTask record);

    int updateByPrimaryKey(FmTask record);
    
    String getNextTaskId(String custId);

	List<FmTask> queryTasks(@Param("custId") String custId, @Param("name") String name, @Param("identityType") String identityType, @Param("identityCard") String identityCard, @Param("mobilePhone") String mobilePhone, @Param("homePhone") String homePhone, @Param("taskStatus") String taskStatus);
}