package com;

public class RegularEmployee extends Employee {

	@Override
	public void processSalary(int workingDays) {
		this.setSalary(workingDays * 1500);
	}

}
