package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Sapient123");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from Employee");
			while(rs.next()) {
				System.out.println("Name: "+rs.getString("ename")+"\nAge: "+rs.getInt("Age"));
			}
			
			stm.executeUpdate("insert into Employee values('Harish',41)");
			stm.executeUpdate("delete from Employee where ename='Harish'");
			rs.close();
			stm.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
