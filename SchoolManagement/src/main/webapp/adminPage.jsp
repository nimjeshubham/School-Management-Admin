<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Admin Page</h1>
<br>
<br>
<br>
<a href="index.jsp">Log out</a>
<a href="ContactUs.jsp">Contact Us</a> 
<br>
<form action="schoolOperations">
School Operations: for registration, get information, update details and delete information<br>
<input type="submit" value="School"> 
</form>

<br>
<br>
<form action="classOperations">
Class Operations: for registration, get information, update details and delete information<br>
<input type="submit" value="Class"> 
</form>

<br>
<br>
<form action="teacherOperations">
Teacher Operations: for registration, get information, update details and delete information<br>
<input type="submit" value="Teacher"> 
</form>

<br>
<br>
<form action="studentOperations">
Student Operations: for registration, get information, update details and delete information<br>
<input type="submit" value="Student"> 
</form>



<br>
<br>
<form action="subjectOperations">
Subject Operations: for registration, get information, update details and delete information<br>
<input type="submit" value="Subject"> 
</form>

<br>
<br>
<form action="marksheetOperations">
Marksheet Operations: for registration, get information, update details and delete information<br>
<input type="submit" value="Marksheet"> 
</form>



</body>
</html>