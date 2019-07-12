package com.spring.springdemo;

public class Woman implements Human{
	private String name;
	private int age;
	private Address address;
	
	
	
	public Woman(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Woman[Name: "+name+", age: "+age+", address: "+address+"]\n";
	}
}
