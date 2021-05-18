package com.cts.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // Auto discovery
//@ComponentScan("com")
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class,args);

	}

}
