package com.employee.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.employee.bean.Employee;
import com.employee.model.EmployeeModel;

public class TestDemo {

	EmployeeModel employeeModel=new EmployeeModel();
	
	@Test
	public void testGetEmployee() {
		Employee employee=new Employee();
		employee.setId("1001");
		employee.setFirstName("Shounak");
		employee.setLastName("Kulkarni");
		employee.setSalary(60000);
		employee.setDesignation("Developer");
		employee.setPassword("123");
		
		;
		assertEquals(employee, employeeModel.getEmployee("1001"));
	}
	
	@Test
	public void testAddEmployee() {
		Employee employee=new Employee();
		employee.setId("1006");
		employee.setFirstName("Shounak");
		employee.setLastName("Kulkarni");
		employee.setSalary(60000);
		employee.setDesignation("Developer");
		employee.setPassword("123");
		
		;
		assertEquals(true, employeeModel.addEmployee(employee));
	}
	
	@Test
	public void testGetAll() {
		int count=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","Sapient123");
			System.out.println("Connection Established");
			Statement stm=con.createStatement();
			ResultSet res=stm.executeQuery("select count(*) from Employee");
			res.next();
			count=res.getInt(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(count, employeeModel.getAll().size());
	}
	
	@Test
	public void testDeleteEmployee() {
		assertEquals(true, employeeModel.deleteEmployee("1008"));
	}

	@Test
	public void testUpdateEmployee() {
		Employee employee=new Employee();
		employee.setId("1006");
		employee.setFirstName("Shounak");
		employee.setLastName("Kulkarni");
		employee.setSalary(60000);
		employee.setDesignation("Manager");
		employee.setPassword("123");
		assertEquals(true, employeeModel.updateEmployee(employee));
	}

}
