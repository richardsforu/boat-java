package com.cts.pss.model;

public class Animal {

	private Object id;
	private String name;
	private String type;
	private int age;
	private String country;

	public Object getId() {
		return id;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(Object id, String name, String type, int age, String country) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.age = age;
		this.country = country;
	}

	public void setId(Object id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
