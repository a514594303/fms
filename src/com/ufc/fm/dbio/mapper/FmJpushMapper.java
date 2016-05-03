package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmJpush;
import com.ufc.fm.dbio.po.FmJpushExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmJpushMapper {
    int countByExample(FmJpushExample example);

    int deleteByExample(FmJpushExample example);

    int deleteByPrimaryKey(String id);

    int insert(FmJpush record);

    int insertSelective(FmJpush record);

    List<FmJpush> selectByExample(FmJpushExample example);

    FmJpush selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FmJpush record, @Param("example") FmJpushExample example);

    int updateByExample(@Param("record") FmJpush record, @Param("example") FmJpushExample example);

    int updateByPrimaryKeySelective(FmJpush record);

    int updateByPrimaryKey(FmJpush record);
}