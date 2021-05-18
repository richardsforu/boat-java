package com.cts.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.emp.config.AppConfig;
import com.cts.emp.service.Department;
import com.cts.emp.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Department dept = ac.getBean(Department.class);
		dept.setDeptId(10);
		dept.setDeptName("IT");
		
		EmployeeServiceImpl emp = ac.getBean(EmployeeServiceImpl.class);
		emp.setEmpId(1000);
		emp.setEmpName("Praveen");
		
		//emp.setDept(dept);

		
		//emp.display();
		emp.saveEmployee();
		
		
		
		

	}

}
