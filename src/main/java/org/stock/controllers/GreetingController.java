package org.stock.controllers;

import net.paoding.rose.web.annotation.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.stock.dao.StockDAO;
import org.stock.dwr.Clock;
import org.stock.hello.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by DKNIGHT on 2014/11/2.
 */
@Path("")
public class GreetingController {
	private static final String template = "Hello,%s!";
	private final AtomicLong counter = new AtomicLong();

    @Autowired
    private StockDAO stockDAO;

	public Greeting greeting(@RequestParam(value="name", defaultValue = "world") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}


}
