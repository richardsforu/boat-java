package com.cts.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.emp.config.AppConfig;
import com.cts.emp.dao.EmployeeDaoImpl;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//ApplicationContext ac1 = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeDaoImpl empDao1 = ac.getBean(EmployeeDaoImpl.class);
		EmployeeDaoImpl empDao2 = ac.getBean(EmployeeDaoImpl.class);
		EmployeeDaoImpl empDao3 = ac.getBean(EmployeeDaoImpl.class);
		
		//ac.getBean(AccountDaoImpl.class);

		empDao1.save();
		empDao2.save();
		empDao3.save();

		// AppConfig app = ac.getBean(AppConfig.class);
//		app.f1();
//		app.f1();
//		app.f1();
//		app.f1();
//		app.f1();

	}

}
