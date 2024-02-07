<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Question Operations</h1>
<br>
<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<a href="ContactUs.jsp">Contact Us</a>
<br>

<form action="questionRegitration">
For Create new question <br>
<input type="submit" value ="Register">
</form>

<br>
<br>

<form action="getInfoQuestion">
Get Information for all Questions<br>
<input type="submit" value ="Details">
</form>

<br>
<br>

<form action="getOneQuestion">
For Individual Question Information<br>
<input type="text" name ="questionID">
<input type="submit" value="Details">
</form>

<br>
<br>

<form action="updateQuestion">
for update Information of Question<br>
<input type="text" name="questionID">
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteQuestion">
for delete Question information<br>
<input type="text" name="questionID">
<input type="submit" value="Delete">
</form>
</body>
</html>