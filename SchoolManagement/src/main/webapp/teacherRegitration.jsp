<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Teacher Registration form</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<a href="ContactUs.jsp">Contact Us</a>
<br>

<form action="newTeacher">
Name <input type ="text" name ="name"><br>
School Id <input type ="text"name="schoolId"><br>
Address <input type ="text" name ="address"><br>
Password <input type ="number" name ="password"><br>

<input type="submit" value ="Register"> 

</form>

</body>
</html>