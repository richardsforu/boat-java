package com;

public class Test {

	public static void main(String[] args) {
		
		Employee re=new RegularEmployee(); // 100% abstraction
		Employee ce=new ContractEmployee();
		
		System.out.println("RegularEmployee HashCode: "+System.identityHashCode(re));
		System.out.println("ContractEmployee HashCode: "+System.identityHashCode(ce));

		re.setEmpId(10);
		re.setEmployeeType("Regular");
		re.setEmpName("James");
		re.setDesignation("SA");
		
		re.processSalary(22);
		
		
		ce.setEmpId(11);
		ce.setEmployeeType("Contract-Base");
		ce.setEmpName("Praveen");
		ce.setDesignation("Trainer");
	
		ce.processSalary(50);
		
		re.display();
		ce.display();
		
		
		
		

	}

}
