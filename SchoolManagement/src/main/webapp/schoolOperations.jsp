<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="schoolRegitration">
For register school<br>
<input type="submit" value ="Register">
</form>

<form action="getInfoSchool">
Get Information for all Student<br>
<input type="submit" value ="Details">
</form>

<form action="getOneSchool">
For Individual School Information<br>
<input type="text" name ="schoolID">
<input type="submit" value="Details">
</form>

<form action="updateSchool">
for update Information of school<br>
<input type="text" name="schoolID">
<input type ="submit" value="Update">
</form>

<form action="deleteSchool">
for delete school information<br>
<input type="text" name="schoolID">
<input type="submit" value="Delete">
</form>
</body>
</html>