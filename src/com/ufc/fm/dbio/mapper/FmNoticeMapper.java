package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmNotice;
import com.ufc.fm.dbio.po.FmNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmNoticeMapper {
    int countByExample(FmNoticeExample example);

    int deleteByExample(FmNoticeExample example);

    int deleteByPrimaryKey(String id);

    int insert(FmNotice record);

    int insertSelective(FmNotice record);

    List<FmNotice> selectByExample(FmNoticeExample example);

    FmNotice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FmNotice record, @Param("example") FmNoticeExample example);

    int updateByExample(@Param("record") FmNotice record, @Param("example") FmNoticeExample example);

    int updateByPrimaryKeySelective(FmNotice record);

    int updateByPrimaryKey(FmNotice record);
}