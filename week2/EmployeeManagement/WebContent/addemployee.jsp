<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<h1>Create Employee Profile</h1>
	<form action="addemployee" method="post">
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" required="true"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname" required="true"></td>
			</tr>
			<tr>
				<td>Employee Id</td>
				<td><input type="text" name="eid" required="true"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required="true"></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td><input type="text" name="desig" required="true"></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><input type="text" name="salary" required="true"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>