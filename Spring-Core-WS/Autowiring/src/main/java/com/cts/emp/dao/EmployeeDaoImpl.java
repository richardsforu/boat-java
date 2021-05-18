package com.cts.emp.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	public void save() {
		System.out.println(">>>> EmployeeDaoImpl save method");
	}

}
