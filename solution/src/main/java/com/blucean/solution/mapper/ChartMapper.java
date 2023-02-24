package com.blucean.solution.mapper;

import com.blucean.solution.VO.ChartVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChartMapper {

    List<ChartVO> getChart();

}
