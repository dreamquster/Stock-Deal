package org.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.stock.dao.StockDAO;
import org.stock.dwr.Clock;
import org.stock.hello.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by DKNIGHT on 2014/11/2.
 */
@RestController
public class GreetingController {
	private static final String template = "Hello,%s!";
	private final AtomicLong counter = new AtomicLong();

    @Autowired
    private StockDAO stockDAO;

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue = "world") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}


}
