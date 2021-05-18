package com.cts.emp.config;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = { "com.cts.emp.service", "com.cts.emp.dao" })
public class AppConfig {

	public AppConfig() {
		System.out.println("--- AppConfig Object created....");
	}

	//@Bean // invoked by spring context object immedialtly after AppConfig class object is created..
	public void f1() {
		System.out.println("---- AppConfic class f1 method....");
	}

	
	public void f2() {
		System.out.println("---- AppConfig f2 method");
	}

}
