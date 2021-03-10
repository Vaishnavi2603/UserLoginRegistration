<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
    <h3>This is Admin module</h3>
    
     <% if(session.getAttribute("username") == null)
    	 {    
    	 	 response.sendRedirect("Login.jsp");
    	 }
     %>
</body>
</html>
