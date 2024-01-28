<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Student Update form</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<br>

<form action="updateStudentFinal">
Enrollment <input type="text" name="enrollment">
School ID <input type ="text" name="schoolId">
Class ID <input type ="text"  name ="classId">
Enrollment Number <input type="text" name="enrollment">
Name <input type="text" name="name">
Father's Name <input type="text" name="fname">
Mother's Name <input type ="text" name="mname">
Address <input type ="text" name = "address">
Password <input type ="text" name ="password">

<input type="submit" value ="Update"> 

</body>
</html>