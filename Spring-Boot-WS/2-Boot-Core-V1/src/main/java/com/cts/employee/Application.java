package com.cts.employee;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.employee.dao.EmployeeDao;
import com.cts.employee.dao.EmployeeDaoImpl;
import com.cts.employee.service.EmployeeService;
import com.cts.employee.service.EmployeeServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		EmployeeService es = ac.getBean(EmployeeService.class);
		es.employeeOperations();
		
		// empDao = ac.getBean(EmployeeDao.class);
		//empDao.saveEmployee();
		
		
		
	}

}
