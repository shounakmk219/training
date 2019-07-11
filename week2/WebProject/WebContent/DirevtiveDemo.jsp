<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Directives</title>
</head>
<body>
	<%!
		int i=0; 
	%>
	<h2>Directive demo</h2>
	<hr>
	<%@page import="java.util.Date" %>
	<h2>date is:<%= new Date() %></h2><br>
	<h3></h3>
	<%@ include file="login.html" %> 
</body>
</html>