package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmGps;
import com.ufc.fm.dbio.po.FmGpsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmGpsMapper {
    int countByExample(FmGpsExample example);

    int deleteByExample(FmGpsExample example);

    int deleteByPrimaryKey(String id);

    int insert(FmGps record);

    int insertSelective(FmGps record);

    List<FmGps> selectByExample(FmGpsExample example);

    FmGps selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FmGps record, @Param("example") FmGpsExample example);

    int updateByExample(@Param("record") FmGps record, @Param("example") FmGpsExample example);

    int updateByPrimaryKeySelective(FmGps record);

    int updateByPrimaryKey(FmGps record);
}