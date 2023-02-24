package com.blucean.solution.service;

import com.blucean.solution.VO.IncomeVO;
import com.blucean.solution.mapper.IncomeMapper;
import lombok.Setter;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log
public class IncomeServiceImpl implements IncomeService {
    @Setter(onMethod_=@Autowired)
    private IncomeMapper mapper;

    @Override
    public List<IncomeVO> getIncome() {
        return mapper.getIncome();

    }
}
