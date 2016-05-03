package com.ufc.fm.rbac.mapper;

import com.ufc.fm.rbac.po.FmRole;
import com.ufc.fm.rbac.po.FmRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmRoleMapper {
    int countByExample(FmRoleExample example);

    int deleteByExample(FmRoleExample example);

    int deleteByPrimaryKey(String roleId);

    int insert(FmRole record);

    int insertSelective(FmRole record);

    List<FmRole> selectByExample(FmRoleExample example);

    FmRole selectByPrimaryKey(String roleId);

    int updateByExampleSelective(@Param("record") FmRole record, @Param("example") FmRoleExample example);

    int updateByExample(@Param("record") FmRole record, @Param("example") FmRoleExample example);

    int updateByPrimaryKeySelective(FmRole record);

    int updateByPrimaryKey(FmRole record);
}