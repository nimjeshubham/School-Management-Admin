<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Class Operation </h1>


<br>
<a href="adminPage.jsp">Admin Home</a> 
<br>

<form action="classRegitration">
For register class<br>
<input type="submit" value ="Register">
</form>

<br>
<br>

<form action="getInfoclass">
Get Information for all class<br>
<input type="submit" value ="Details">
</form>

<br>
<br>

<form action="getOneclass">
For Individual Class Information<br>
<input type="text" name ="classID">
<input type="submit" value="Details">
</form>

<br>
<br>

<form action="updateclass">
for update Information of class<br>
<input type="text" name="classID">
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteclass">
for delete class information<br>
<input type="text" name="classID">
<input type="submit" value="Delete">
</form>

<br>
<br>

</body>
</html>