<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fakebook</title>
</head>
<body>
	<h1>Sign-in</h1>
	<form action="sign-in" method="post">
		Username: <input type="text" name="uname"/><br>
		Password: <input type="password" name="pass"/><br>
		<input type="submit" value="Sign-in">
		<input type="reset" value="Reset">
	</form>
	Create new account <a href="signup.jsp">here</a>.<hr><br>
<%-- 	<jsp:useBean id="p1" class="com.model.Profile"></jsp:useBean> --%>
<%-- 	<jsp:setProperty property="uname" name="p1" value="Shounak"/> --%>
<%-- 	<jsp:setProperty property="password" name="p1" value="kulkarni"/> --%>
<%-- 	<jsp:setProperty property="age" name="p1" value="23"/> --%>
	
<%-- 	New user is: <jsp:getProperty property="uname" name="p1"/><br> --%>
<%-- 	password is: <jsp:getProperty property="password" name="p1"/><br> --%>
<%-- 	your age: <jsp:getProperty property="age" name="p1"/> --%>

</body>
</html>