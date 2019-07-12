<%@page import="com.employee.bean.Employee"%>
<%@page import="com.employee.model.EmployeeModel"%>
<%@page import="com.employee.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>

	<h1>Update Employee Profile</h1>
	
	<form action="" method="post">
	 Enter Employee Id: <input type="text" name="geid"></input>
	 <input type="submit" value="Check"> 
	</form>
	<%! Employee e =null; %>
	<% 
		EmployeeDAO emp=new EmployeeModel();
		if("POST".equalsIgnoreCase(request.getMethod()))
		e =emp.getEmployee(request.getParameter("geid"));
		else{
			e=new Employee();
		}
	%>
	<form action="updateemployee" method="post">
		<input name="eid" value="<%=e.getId() %>" hidden="true">
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" value="<%=e.getFirstName() %>"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname" required="true" value="<%=e.getLastName() %>"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required="true" value="<%=e.getPassword() %>"></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td><input type="text" name="desig" required="true" value="<%=e.getDesignation() %>"></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><input type="text" name="salary" required="true" value="<%=e.getSalary() %>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>