package com.cts.emp.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = true)
public class AccountDaoImpl {
	
	public AccountDaoImpl() {
		System.out.println("--- AccountDaoImpl class object created...");
	}

}
