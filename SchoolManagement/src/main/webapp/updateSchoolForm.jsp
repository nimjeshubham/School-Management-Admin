<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>School Update form</h1>

<br>
<a href="adminPage.jsp">Admin Home</a>
<a href="index.jsp">Log out</a> 
<a href="ContactUs.jsp">Contact Us</a> 
<br>

<form action="updateSchoolFinal">
School ID <input type ="text" name ="schoolId"><br>
School Name <input type ="text" name ="schoolName"><br>
Principal <input type ="text"name ="principal"><br>
Address <input type ="text" name ="address"><br>

<input type="submit" value ="Update"> 
</form>

</body>
</html>