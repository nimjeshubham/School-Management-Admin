<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>School Registration form</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<br>

<form action="newSchool">
School Name <input type ="text" name ="schoolName"><br>
Principal <input type ="text"name ="principal"><br>
Address <input type ="text" name ="address"><br>

<input type="submit" value ="Register"> 
</form>

</body>
</html>