package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class E5 extends E1{}
class E1 {}
class E2 extends E1{}
class E3 extends E1{}
class E4{}

class Demo{
	void test() {
		List<? super E1> e1= new ArrayList<>();
		e1.add(new E1());
		e1.add(new E2());
		e1.add(new E3());
		e1.add(new E5());
		
	}
}



class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

class C2<T1, T2> {

	void swap(T1 obj1, T2 obj2) {

	}
}

public class C1 {

	public static void main(String[] args) {

		C2<String, String> c2 = new C2<>();
		C2<Integer, String> c3 = new C2<>();
		C2<String, Integer> c4 = new C2<>();
		C2<Object, Object> c5 = new C2<>();

		c2.swap("Abc", "Abc");

		Employee e1 = new Employee(10, "Abc", 8634);
		Employee e2 = new Employee(11, "Xyz", 9884);
		Employee e3 = new Employee(12, "Aaa", 2343);
		Employee e4 = new Employee(13, "Bbb", 2444);
		Employee e5 = new Employee(14, "Ccc", 3847);

		// List<Employee> emps=new ArrayList<>();

		List<Employee> emps = Arrays.asList(e1, e2, e3, e4, e5);

		List<String> names = new ArrayList<>();
		names.add("Praveen");
		names.add("James");
		names.add("Ozvitha");

		System.out.println(names);
	}

}
