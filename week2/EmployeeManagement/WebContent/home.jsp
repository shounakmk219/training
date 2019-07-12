<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Welcome <%=session.getAttribute("ename") %></h1>
<table>
<tr><h2>Select Operation:</h2></tr>
<tr><h3><a href="addemployee.jsp">Add Employee</a></h3>
<tr><h3><a href="updateemployee.jsp">Update Employee</a></h3>
<tr><h3><a href="deleteemployee.jsp">Delete Employee</a></h3>
<tr><h3><a href="listall.jsp">List all Employees</a></h3>
</table>
</body>
</html>