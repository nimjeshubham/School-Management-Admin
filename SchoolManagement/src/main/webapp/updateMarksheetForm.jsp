<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Marksheet update form</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<a href="ContactUs.jsp">Contact Us</a>
<br>

<form action="updateMarksheetFinal">
Marksheet Id <input type= "text" name = "marksheetID">
Student Id <input type ="text" name ="studentId"><br>
Exam <input type ="text" name ="exam"><br>
Subject <input type ="text" name ="subject1">
Marks <input type ="text"name="marks1"><br>






<input type="submit" value ="Update"> 

</form>


</body>
</html>