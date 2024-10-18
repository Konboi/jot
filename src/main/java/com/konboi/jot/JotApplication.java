package com.konboi.jot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.konboi.jot.controller")
public class JotApplication {

	public static void main(String[] args) {
		SpringApplication.run(JotApplication.class, args);
	}

}
