package com.cts.emp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@ComponentScan("com.cts.emp.service,com.cts.emp.dao")
@PropertySource("abc.properties")
public class AppConfig {
	
	
	@Autowired
	private Environment env; // dependency
	
	@Bean
	public void f1() {
		System.out.println(">>>>> Hello "+env.getProperty("name"));
	}
	
	

}
