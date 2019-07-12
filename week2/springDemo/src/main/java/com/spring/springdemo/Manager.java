package com.spring.springdemo;

public class Manager {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Manager[ name: "+name+"]";
	}

}
