<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
	<h1>Login</h1>
	<form action="login" method="post">
		Employee ID: <input type="text" name="eid"><br>
		Password: <input type="password" name="password"><br>
		<input type="submit" value="Login">
		<input type="reset" value="Reset">
	</form>
</body>
</html>