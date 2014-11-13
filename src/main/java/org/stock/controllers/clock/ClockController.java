package org.stock.controllers.clock;

import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.annotation.Path;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.stock.hello.Greeting;

/**
 * Created by User: Administrator at Date: 2014/11/6 Time: 14:47
 */
@Path("")
public class ClockController {

    public String clock(Invocation inv) {
        return "index";
    }
}
