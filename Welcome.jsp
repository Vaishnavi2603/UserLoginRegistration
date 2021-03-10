<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Welcome Page! </title>
</head>
<body>

    <%
       response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
      
       if(session.getAttribute("user") == null){
    	   response.sendRedirect("Login.jsp");
       }
    %>

    <h2> Welcome to ${ user } </h2> <br><br>
    <div class = "container">
           <a href = "Welcome.jsp">Home</a>
           <a href = "about.jsp">About Us</a>
           <a href = "admin.jsp">Admin</a>
           
    </div>
    <br><br>
    <form action = "Logout">
        <input type="submit" value="Logout">
    </form>

</body>
</html>