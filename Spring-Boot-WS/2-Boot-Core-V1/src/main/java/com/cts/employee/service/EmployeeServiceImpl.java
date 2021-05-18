package com.cts.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.cts.employee.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;
	
	@Value("${name}")
	private String empName;

	@Override
	@Bean
	public void f1() {
		System.out.println("Employee Name::: >> "+empName);
		System.out.println(">>>>> employee-service f1 method:: ");
		
	}

	@Override
	public void employeeOperations() {
		System.out.println(">>> EmployeeServiceImpl::employeeOperations");
		empDao.saveEmployee();
	}

}
