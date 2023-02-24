package com.blucean.solution.mapper;

import com.blucean.solution.VO.IncomeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IncomeMapper {
    List<IncomeVO> getIncome();
}
