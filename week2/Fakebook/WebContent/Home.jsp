<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<%@page import="java.*" %>
<%
	String uname=(String)session.getAttribute("uname"); 
	if(uname==null){
		response.sendRedirect("http://localhost:8080/Fakebook/index.jsp");
	}
%>


<h2>Welcome <%=uname%></h2>

<a href="signout.jsp">Signout</a>
<h3><%=session.getId() %></h3>
</body>
</html>