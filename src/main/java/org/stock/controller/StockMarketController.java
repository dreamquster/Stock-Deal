package org.stock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by User: Administrator at Date: 2014/11/7 Time: 17:22
 */
@Controller
public class StockMarketController {

    @RequestMapping("")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("");
        return modelAndView;
    }

}
