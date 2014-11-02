package org.stock.init_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
/**
 * Created by DKNIGHT on 2014/11/2.
 */
@ComponentScan(basePackages = "org.stock")
@EnableAutoConfiguration
public class MainApp {
	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}
}
