package com.cts.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.cts.emp.dao.EmployeeDao;

@Component
@PropertySource("abc.properties")
public class EmployeeServiceImpl { // dependent
	
	
	@Autowired
	private Environment env; // dependency

	private int empId;
	private String empName;
	@Value("${name}")
	private  String name;
	
	@Autowired
	@Qualifier("employeeDaoImpl")
	private EmployeeDao empDao;

	@Autowired
	private Department dept; // dependency
	
	
	public void saveEmployee() {
		System.out.println(">>>> qname::: "+name);
		empDao.save();
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void display() {
		System.out.println("EMpID: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Dept Id: " + dept.getDeptId());
		System.out.println("Dept Name: " + dept.getDeptName());
		System.out.println("---------------------------------------");

	}

}
