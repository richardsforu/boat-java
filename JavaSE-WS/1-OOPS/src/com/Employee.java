package com;

public abstract class Employee { // POJO

	private int empId;
	private String empName;
	private double salary;
	private String designation;
	private String employeeType;

	public abstract  void processSalary(int timeSheet); // declaration 

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		// .. validations...
		
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;

	}

	public void setSalary(double salary) {
		// validations...
		System.out.println("Setting Salary for : "+this.getClass().getTypeName() +" By "+this.hashCode());
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void display() {
		System.out.println("Type of Employeement: " + employeeType);
		System.out.println("EmpID: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("Designation: " + designation);
		System.out.println("------------------------------------------");
	}

}
