<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Operations</h1>
<br>
<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<a href="ContactUs.jsp">Contact Us</a>
<br>

<form action="studentRegitration">
For register student<br>
<input type="submit" value ="Register">
</form>

<br>
<br>

<form action="getInfoStudent">
Get Information for all Student<br>
<input type="submit" value ="Details">
</form>

<br>
<br>

<form action="getOneStudent">
For Individual Student Information<br>
<input type="text" name ="studentID">
<input type="submit" value="Details">
</form>

<br>
<br>

<form action="updateStudent">
for update Information of student<br>
<input type="text" name="studentID">
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteStudent">
for delete student information<br>
<input type="text" name="studentID">
<input type="submit" value="Delete">
</form>

<br>
<br>
</body>
</html>