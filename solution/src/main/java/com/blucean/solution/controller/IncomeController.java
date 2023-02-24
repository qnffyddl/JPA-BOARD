package com.blucean.solution.controller;

import com.blucean.solution.VO.IncomeVO;
import com.blucean.solution.service.IncomeService;
import com.google.gson.Gson;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Locale;

@Controller
public class IncomeController {

    @Setter(onMethod_ = @Autowired)
    private IncomeService incomeService;

    @RequestMapping(value = "dateIncome", method = RequestMethod.GET)
    public void dateIncome(Locale locale, Model model) {

    }

    @RequestMapping(value = "incomeList", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String incomeList(Locale locale, Model model) {
        Gson gson = new Gson();
        List<IncomeVO> list = incomeService.getIncome();

        return gson.toJson(list);
    }
}