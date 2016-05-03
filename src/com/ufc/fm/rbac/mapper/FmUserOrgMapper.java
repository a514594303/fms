package com.ufc.fm.rbac.mapper;

import com.ufc.fm.rbac.po.FmUserOrg;
import com.ufc.fm.rbac.po.FmUserOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmUserOrgMapper {
    int countByExample(FmUserOrgExample example);

    int deleteByExample(FmUserOrgExample example);

    int deleteByPrimaryKey(String id);

    int insert(FmUserOrg record);

    int insertSelective(FmUserOrg record);

    List<FmUserOrg> selectByExample(FmUserOrgExample example);

    FmUserOrg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FmUserOrg record, @Param("example") FmUserOrgExample example);

    int updateByExample(@Param("record") FmUserOrg record, @Param("example") FmUserOrgExample example);

    int updateByPrimaryKeySelective(FmUserOrg record);

    int updateByPrimaryKey(FmUserOrg record);
}