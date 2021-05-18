package com.cts.employee;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.employee.dao.CustomerDao;
import com.cts.employee.entity.Customer;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		CustomerDao custDao = ac.getBean(CustomerDao.class); 
		
		Customer cust=new Customer();
		
		//cust.setCustId("CUSTHYTD00");
		cust.setCustName("Praveen");
		cust.setDob(LocalDate.of(1984, 8, 28));
		
		custDao.save(cust);
		
		
		
		
		
		
		
		
		
	}

}
