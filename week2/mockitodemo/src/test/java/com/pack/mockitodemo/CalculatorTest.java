package com.pack.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {

	Calculator c=null;
	CalculatorService cs=Mockito.mock(CalculatorService.class);
	@Test
	public void test() {
		assertEquals(30, c.performCalculation(cs));
	}

	@Before
	public void createObject() {
		System.out.println("Object created!");
		c=new Calculator();
	}
}