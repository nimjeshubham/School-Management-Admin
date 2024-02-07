<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Question Registration form</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<a href="ContactUs.jsp">Contact Us</a>
<br>

<form action="newQuestion">
Question <input type ="text" name ="question"><br>
Option A <input type ="text"name="optionA"><br>
Option B <input type ="text"name="optionB"><br>
Option C <input type ="text"name="optionC"><br>
Option D <input type ="text"name="optionD"><br>
Answer <input type ="text" name ="answer"><br>
Test Id <input type ="text" name ="testId"><br>

<input type="submit" value ="Register"> 

</form>

</body>
</html>