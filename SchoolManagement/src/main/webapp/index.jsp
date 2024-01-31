<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome To School Management System</h1>

<br>
<a href="ContactUs.jsp">Contact Us</a>
<br>

<form action="adminLogin">
Admin ID <input type="text" name ="adminID"><br>
Password <input type="password" name ="pass"><br>
<input type ="submit" value ="Login">
</form>

<br>
<br>

<form action="userLogin">
Login as student/teacher
<input type ="submit" value ="Login">
</form>


</body>
</html>