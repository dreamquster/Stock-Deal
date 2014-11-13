package org.stock.controllers.stock;

import net.paoding.rose.web.annotation.Path;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by User: Administrator at Date: 2014/11/7 Time: 17:22
 */
@Path("")
public class StockMarketController {

    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("");
        return modelAndView;
    }

}
