package com.pack.lombokdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

//@ToString
//@Getter
//@Setter
//@RequiredArgsConstructor
//@EqualsAndHashCode

//@AllArgsConstructor
//@Data

@Value
public class Employee {

	final private String name;
	private int age;
	private float salary;
	private String designation;
	
}
