<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="blue">
<% 

		String firstName =request.getParameter("first");
		String secondName = request.getParameter("second");
		String fullName = firstName+" "+ secondName;
		
		out.println("Name is: " + fullName);
		%>
		

</body>
</html>