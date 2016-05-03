package com.ufc.fm.rbac.mapper;

import com.ufc.fm.rbac.po.FmUserRole;
import com.ufc.fm.rbac.po.FmUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmUserRoleMapper {
    int countByExample(FmUserRoleExample example);

    int deleteByExample(FmUserRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(FmUserRole record);

    int insertSelective(FmUserRole record);

    List<FmUserRole> selectByExample(FmUserRoleExample example);

    FmUserRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FmUserRole record, @Param("example") FmUserRoleExample example);

    int updateByExample(@Param("record") FmUserRole record, @Param("example") FmUserRoleExample example);

    int updateByPrimaryKeySelective(FmUserRole record);

    int updateByPrimaryKey(FmUserRole record);
}