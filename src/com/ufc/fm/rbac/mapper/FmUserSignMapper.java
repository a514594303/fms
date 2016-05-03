package com.ufc.fm.rbac.mapper;

import com.ufc.fm.rbac.po.FmUserSign;
import com.ufc.fm.rbac.po.FmUserSignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmUserSignMapper {
    int countByExample(FmUserSignExample example);

    int deleteByExample(FmUserSignExample example);

    int deleteByPrimaryKey(String id);

    int insert(FmUserSign record);

    int insertSelective(FmUserSign record);

    List<FmUserSign> selectByExample(FmUserSignExample example);

    FmUserSign selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FmUserSign record, @Param("example") FmUserSignExample example);

    int updateByExample(@Param("record") FmUserSign record, @Param("example") FmUserSignExample example);

    int updateByPrimaryKeySelective(FmUserSign record);

    int updateByPrimaryKey(FmUserSign record);
}