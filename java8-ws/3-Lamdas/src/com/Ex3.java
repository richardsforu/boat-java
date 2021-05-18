package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {

		Employee e1 = new Employee(543, "Zjh", 5000);
		Employee e2 = new Employee(298, "Dkj", 9000);
		Employee e3 = new Employee(430, "Kfd", 4000);
		Employee e4 = new Employee(190, "Bfd", 4500);
		Employee e5 = new Employee(100, "Mgd", 6000);
		
		List<Employee> emps=Arrays.asList(e1,e2,e3,e4,e5);
		
		Employee.display(emps);
		
		//Collections.sort(emps,new Employee());
		
		//Employee.display(emps);
		
		Collections.sort(emps,(emp1,e)->e1.getEmpId()-e2.getEmpId());
		
		

		
		
		

	}

}
