package com;

import java.util.function.Predicate;

class Employee {
	// function ==> method
	public boolean doWork() {
		// condition
		return true;
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Predicate<String> func = s -> s.isEmpty(); // function

		Predicate<Employee> fff = e -> e.doWork();
		
		System.out.println(fff.test(new Employee()));
		System.out.println(func.test(""));

	}

}
