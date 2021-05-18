package com.cts.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.employee.dao.EmployeeDao;
import com.cts.employee.dao.EmployeeDaoImpl;
import com.cts.employee.dao.ProductDao;
import com.cts.employee.entity.Employee;
import com.cts.employee.entity.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		EmployeeDao empDao = ac.getBean(EmployeeDao.class);
		EmployeeDaoImpl dao = ac.getBean(EmployeeDaoImpl.class);
		ProductDao prodDao = ac.getBean(ProductDao.class); // internal implemented class object
		
		//Employee e1=new Employee();
		
		//e1.setEmpId(14);
		//e1.setEmpName("Abc");
		//e1.setSalary(12345);
		
		Product p1=new Product();
		p1.setName("Pen");
		p1.setPrice(15);

		prodDao.save(p1);
		
		//empDao.save(e1);
		
		
		
		
		
	}

}
