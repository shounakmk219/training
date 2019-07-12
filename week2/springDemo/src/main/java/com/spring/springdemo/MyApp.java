package com.spring.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("roles.xml");
		Object obj1=context.getBean("mgr");
		Object obj2=context.getBean("mgr");
		Object obj3=context.getBean("mgr");
		
		((Manager)obj2).setName("Amey");
		((Manager)obj3).setName("Nassar");
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
	}
}