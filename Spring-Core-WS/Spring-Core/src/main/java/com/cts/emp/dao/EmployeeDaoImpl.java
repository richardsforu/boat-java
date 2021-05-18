package com.cts.emp.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
@Scope("prototype")
@Repository
public class EmployeeDaoImpl {

	public EmployeeDaoImpl() {
		System.out.println("--- EmployeeDaoImpl object created on " + System.identityHashCode(this));
	}

	public void save() {
		System.out.println("--- save method called on top of "+System.identityHashCode(this));
	}

}
