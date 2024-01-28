<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Subject Operation</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<a href="ContactUs.jsp">Contact Us</a>
<br>

<form action="subjectRegitration">
For register subject<br>
<input type="submit" value ="Register">
</form>

<br>
<br>

<form action="getInfoSubject">
Get Information for all Subject<br>
<input type="submit" value ="Details">
</form>

<br>
<br>

<form action="getOneSubject">
For Individual Subject Information<br>
<input type="text" name ="subjectID">
<input type="submit" value="Details">
</form>

<br>
<br>

<form action="updateSubject">
for update Information of subject<br>
<input type="text" name="subjectID">
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteSubject">
for delete subject information<br>
<input type="text" name="subjectID">
<input type="submit" value="Delete">
</form>

<br>
<br>

</body>
</html>