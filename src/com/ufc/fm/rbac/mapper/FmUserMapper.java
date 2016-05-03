package com.ufc.fm.rbac.mapper;

import com.ufc.fm.rbac.po.FmUser;
import com.ufc.fm.rbac.po.FmUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmUserMapper {
    int countByExample(FmUserExample example);

    int deleteByExample(FmUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(FmUser record);

    int insertSelective(FmUser record);

    List<FmUser> selectByExample(FmUserExample example);

    FmUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") FmUser record, @Param("example") FmUserExample example);

    int updateByExample(@Param("record") FmUser record, @Param("example") FmUserExample example);

    int updateByPrimaryKeySelective(FmUser record);

    int updateByPrimaryKey(FmUser record);
}