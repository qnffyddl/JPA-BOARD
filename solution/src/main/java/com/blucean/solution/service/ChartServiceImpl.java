package com.blucean.solution.service;

import com.blucean.solution.VO.ChartVO;
import com.blucean.solution.mapper.ChartMapper;
import com.blucean.solution.mapper.IncomeMapper;
import lombok.Setter;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log
public class ChartServiceImpl implements ChartService {
    @Setter(onMethod_=@Autowired)
    private ChartMapper mapper;

    @Override
    public List<ChartVO> getChart() {
        return mapper.getChart();

    }
}
