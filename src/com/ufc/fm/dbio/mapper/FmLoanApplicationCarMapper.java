package com.ufc.fm.dbio.mapper;

import com.ufc.fm.dbio.po.FmLoanApplicationCar;
import com.ufc.fm.dbio.po.FmLoanApplicationCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmLoanApplicationCarMapper {
    int countByExample(FmLoanApplicationCarExample example);

    int deleteByExample(FmLoanApplicationCarExample example);

    int deleteByPrimaryKey(Integer carId);

    int insert(FmLoanApplicationCar record);

    int insertSelective(FmLoanApplicationCar record);

    List<FmLoanApplicationCar> selectByExample(FmLoanApplicationCarExample example);

    FmLoanApplicationCar selectByPrimaryKey(Integer carId);

    int updateByExampleSelective(@Param("record") FmLoanApplicationCar record, @Param("example") FmLoanApplicationCarExample example);

    int updateByExample(@Param("record") FmLoanApplicationCar record, @Param("example") FmLoanApplicationCarExample example);

    int updateByPrimaryKeySelective(FmLoanApplicationCar record);

    int updateByPrimaryKey(FmLoanApplicationCar record);
}