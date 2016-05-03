package com.ufc.fm.rbac.mapper;

import com.ufc.fm.rbac.po.FmResPermission;
import com.ufc.fm.rbac.po.FmResPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmResPermissionMapper {
    int countByExample(FmResPermissionExample example);

    int deleteByExample(FmResPermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(FmResPermission record);

    int insertSelective(FmResPermission record);

    List<FmResPermission> selectByExample(FmResPermissionExample example);

    FmResPermission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FmResPermission record, @Param("example") FmResPermissionExample example);

    int updateByExample(@Param("record") FmResPermission record, @Param("example") FmResPermissionExample example);

    int updateByPrimaryKeySelective(FmResPermission record);

    int updateByPrimaryKey(FmResPermission record);
}