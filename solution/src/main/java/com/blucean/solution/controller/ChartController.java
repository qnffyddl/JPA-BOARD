package com.blucean.solution.controller;

import com.blucean.solution.VO.ChartVO;
import com.blucean.solution.service.ChartService;
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
public class ChartController {

    @RequestMapping("chart_test")
    public String chart_test(Model model) {
        // ADD START
        // ADD END
        return "chart/chart_test";
    }

    @Setter(onMethod_ = @Autowired)
    private ChartService chartService;

    @RequestMapping(value = "dateChart", method = RequestMethod.GET)
    public void dateChart(Locale locale, Model model) {

    }

    @RequestMapping(value = "chartList", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String chartList(Locale locale, Model model) {
        Gson gson = new Gson();
        List<ChartVO> list = chartService.getChart();

        return gson.toJson(list);
    }

}