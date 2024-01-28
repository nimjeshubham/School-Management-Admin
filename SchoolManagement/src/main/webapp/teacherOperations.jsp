<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Teacher Operations</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<a href="ContactUs.jsp">Contact Us</a>
<br>

<form action="teacherRegitration">
For register teacher<br>
<input type="submit" value ="Register">
</form>

<br>
<br>

<form action="getInfoTeacher">
Get Information for all teacher<br>
<input type="submit" value ="Details">
</form>

<br>
<br>

<form action="getOneTeacher">
For Individual teacher Information<br>
<input type="text" name ="teacherID">
<input type="submit" value="Details">
</form>

<br>
<br>

<form action="updateTeacher">
for update Information of teacher<br>
<input type="text" name="teacherID">
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteTeacher">
for delete teacher information<br>
<input type="text" name="teacherID">
<input type="submit" value="Delete">
</form>

<br>
<br>

</body>
</html>