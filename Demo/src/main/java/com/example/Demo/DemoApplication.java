package com.example.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		// SpringApplication.run(DemoApplication.class, args);
		// make this as ApplicationContext context = the above one, so that it creates IoC container in the JVM to create object

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		// getbean get the object of the class Dev

		App obj1 = context.getBean(App.class); // as we didin't mention @component annotation in the App , it doesn't inject the object in this class
		Dev obj2 = context.getBean(Dev.class);

		obj2.msg();

		obj1.compCheck();


	}

}
