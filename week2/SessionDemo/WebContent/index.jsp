<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@page import="java.util.Date" %>
	<h1>Session Demo</h1>
	<h2>Session Id: <%= session.getId() %></h2>
	<h2>Session creation time: <%= new Date(session.getCreationTime()) %></h2>
	<h2>Session last accessed time: <%= new Date(session.getLastAccessedTime()) %></h2>
	<%
		session.setMaxInactiveInterval(15);
	%>
</body>
</html>