package com.Shalini.Autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowiringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AutowiringApplication.class, args);
	    Dev obj = context.getBean(Dev.class);
		obj.compile();
	}

}
