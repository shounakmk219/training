<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Page</title>
</head>
<body>
<hr>
<%!
	int a=2;
	static int j=0;
%>

<h2>Variable a=<%=a%></h2>
<h2>Site visit #<%=j++ %></h2>
</body>
</html>