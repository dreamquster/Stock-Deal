package org.stock.controller.clock;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.stock.hello.Greeting;

/**
 * Created by User: Administrator at Date: 2014/11/6 Time: 14:47
 */
@RestController
public class ClockController {
    @RequestMapping("/clock")
    public ModelAndView clock() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
