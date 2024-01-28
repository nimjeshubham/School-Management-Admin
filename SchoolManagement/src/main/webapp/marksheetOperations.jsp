<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Marksheet Operations</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<br>

<form action="marksheetRegitration">
For register marksheet<br>
<input type="submit" value ="Register">
</form>

<br>
<br>

<form action="getInfoMarksheet">
Get Information for all marksheet<br>
<input type="submit" value ="Details">
</form>

<br>
<br>

<form action="getOneMarksheet">
For Individual marksheet Information<br>
<input type="text" name ="markID">
<input type="submit" value="Details">
</form>

<br>
<br>

<form action="updateMarksheet">
for update Information of marksheet<br>
<input type="text" name="markID">
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteMarksheet">
for delete marksheet information<br>
<input type="text" name="markID">
<input type="submit" value="Delete">
</form>

<br>
<br>

</body>
</html>