package com.ufc.fm.rbac.mapper;

import com.ufc.fm.rbac.po.FmOrganization;
import com.ufc.fm.rbac.po.FmOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmOrganizationMapper {
    int countByExample(FmOrganizationExample example);

    int deleteByExample(FmOrganizationExample example);

    int deleteByPrimaryKey(String orgId);

    int insert(FmOrganization record);

    int insertSelective(FmOrganization record);

    List<FmOrganization> selectByExample(FmOrganizationExample example);

    FmOrganization selectByPrimaryKey(String orgId);

    int updateByExampleSelective(@Param("record") FmOrganization record, @Param("example") FmOrganizationExample example);

    int updateByExample(@Param("record") FmOrganization record, @Param("example") FmOrganizationExample example);

    int updateByPrimaryKeySelective(FmOrganization record);

    int updateByPrimaryKey(FmOrganization record);
}