package com.cts.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.employee.entity.Product;

public interface ProductDao extends JpaRepository<Product, String>{
	
	// we can not create object to an interface
	// but we cab create a reference of an interface
	// ProductDao prodDao;
	// refernce of an interface can be used to store all its implementation/ sub class objects


	
	

}
