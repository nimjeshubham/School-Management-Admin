<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Test update form</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<a href="ContactUs.jsp">Contact Us</a>
<br>

<form action="updateTestFinal">
Test Id <input type="text" name ="testId">
Date <input type ="Date" name ="date"><br>
Subject <input type ="text"name="subject"><br>

<input type="submit" value ="Update"> 

</form>

</body>
</html>