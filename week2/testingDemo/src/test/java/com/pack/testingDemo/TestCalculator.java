package com.pack.testingDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	Calculator c;
	@Test
	public void testAdd() {
		assertEquals("Incorrect addition", 30, c.add(10, 20));
		System.out.println("testAdd checking");
	}

	@Test
	public void testSub() {
		assertEquals("Incorrect subtraction", 20, c.sub(40, 20));
		System.out.println("testSub checking");
	}
	
	@Test
	public void compareTest() {
		assertTrue(c.compare(20, 20));
	}
	
	@Before
	public void createObject() {
		c=new Calculator();
		System.out.println("object created!");
	}
	
	@After
	public void removeObject() {
		c=null;
		System.out.println("object dereferenced");
	}
}
