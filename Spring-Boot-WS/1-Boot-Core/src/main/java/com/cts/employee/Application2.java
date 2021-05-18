package com.cts.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // Auto discovery
//@ComponentScan("com")
public class Application2 {

	public static void main(String[] args) {
		
		SpringApplication.run(Application2.class,args);

	}

}
