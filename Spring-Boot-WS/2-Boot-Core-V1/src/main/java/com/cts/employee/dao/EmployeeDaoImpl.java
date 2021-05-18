package com.cts.employee.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void saveEmployee() {
		System.out.println(">>> DAO::: Saving employee...");
	}

}
