package com;

public class ContractEmployee extends Employee {

	@Override
	public void processSalary(int noOfHoursWorked) {
		this.setSalary(noOfHoursWorked * 2000);
	}

}
