package com.cts.emp.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements EmployeeDao {
	public void save() {
		System.out.println(">>>>> AccountDaoImpl:: save method");

	}

}
