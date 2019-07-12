package com.employee.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDAO;

public class EmployeeModel implements EmployeeDAO{
	
	private Connection con=null;
	public EmployeeModel() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","Sapient123");
			System.out.println("Connection Established");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean addEmployee(Employee employee) {
		try {
			PreparedStatement stm=con.prepareStatement("insert into Employee values(?,?,?,?,?,?)");
			stm.setString(1, employee.getId());
			stm.setString(2, employee.getFirstName());
			stm.setString(3, employee.getLastName());
			stm.setInt(4, employee.getSalary());
			stm.setString(5, employee.getDesignation());
			stm.setString(6, employee.getPassword());
			int r=stm.executeUpdate();
			if(r!=0)
				return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee getEmployee(String id) {
		Employee employee=null;
		try {
			Statement stm=con.createStatement();
			ResultSet res=stm.executeQuery("select * from Employee where id='"+id+"'");
			if(res.next()) {
				employee=new Employee();
				employee.setId(res.getString(1));
				employee.setFirstName(res.getString(2));
				employee.setLastName(res.getString(3));
				employee.setSalary(res.getInt(4));
				employee.setDesignation(res.getString(5));
				employee.setPassword(res.getString(6));
				return employee;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> list=new ArrayList<>();
		try {
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from Employee");
			while(rs.next()) {
				Employee employee=new Employee();
				employee.setId(rs.getString(1));
				employee.setFirstName(rs.getString(2));
				employee.setLastName(rs.getString(3));
				employee.setSalary(rs.getInt(4));
				employee.setDesignation(rs.getString(5));
				list.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean deleteEmployee(String id) {
		try {
			Statement stm=con.createStatement();
			int c=stm.executeUpdate("delete from Employee where id='"+id+"'");
			if(c!=0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		try {
			PreparedStatement stm=con.prepareStatement("update Employee set fname=?, lname=?, salary=?, desig=?, pass=? where id=?");
			//System.out.println("in update: "+employee.getFirstName());
			stm.setString(1, employee.getFirstName());
			stm.setString(2, employee.getLastName());
			stm.setInt(3, employee.getSalary());
			stm.setString(4, employee.getDesignation());
			stm.setString(5, employee.getPassword());
			stm.setString(6, employee.getId());
			int r=stm.executeUpdate();
			if(r!=0)
				return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
