<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Class Update Form</h1>
<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<br>

<form action="updateClassFinal">
Class ID<input type ="text" name ="classId"><br>
Class <input type ="text" name ="name"><br>
Section <input type ="text"name="section"><br>
Class Teacher <input type ="text" name ="classTeacher"><br>
School Id <input type ="text" name ="schoolId"><br>

<input type="submit" value ="Update"> 

</form>


</body>
</html>