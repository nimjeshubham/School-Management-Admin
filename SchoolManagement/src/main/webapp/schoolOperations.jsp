<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>School Operation</h1>
<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<br>
<br>
<br>

<form action="schoolRegitration">
For register school<br>
<input type="submit" value ="Register">
</form>

<br>
<br>

<form action="getInfoSchool">
Get Information for all School<br>
<input type="submit" value ="Details">
</form>

<br>
<br>

<form action="getOneSchool">
For Individual School Information<br>
Enter ID
<input type="text" name ="schoolID">
<input type="submit" value="Details">
</form>

<br>
<br>

<form action="updateSchool">
for update Information of school<br>
Enter ID
<input type="text" name="schoolID">
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteSchool">
for delete school information<br>
Enter ID
<input type="text" name="schoolID">
<input type="submit" value="Delete">
</form>

<br>
<br>

</body>
</html>