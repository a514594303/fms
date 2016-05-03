package com.ufc.fm.rbac.mapper;

import com.ufc.fm.rbac.po.FmResources;
import com.ufc.fm.rbac.po.FmResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmResourcesMapper {
    int countByExample(FmResourcesExample example);

    int deleteByExample(FmResourcesExample example);

    int deleteByPrimaryKey(String resourcesId);

    int insert(FmResources record);

    int insertSelective(FmResources record);

    List<FmResources> selectByExample(FmResourcesExample example);

    FmResources selectByPrimaryKey(String resourcesId);

    int updateByExampleSelective(@Param("record") FmResources record, @Param("example") FmResourcesExample example);

    int updateByExample(@Param("record") FmResources record, @Param("example") FmResourcesExample example);

    int updateByPrimaryKeySelective(FmResources record);

    int updateByPrimaryKey(FmResources record);
}