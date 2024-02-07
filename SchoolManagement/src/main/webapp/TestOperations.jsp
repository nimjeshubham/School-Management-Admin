<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Test Operations</h1>
<br>
<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<a href="ContactUs.jsp">Contact Us</a>
<br>

<form action="testRegitration">
For Create new Test <br>
<input type="submit" value ="Register">
</form>

<br>
<br>

<form action="getInfoTest">
Get Information for all Test<br>
<input type="submit" value ="Details">
</form>

<br>
<br>

<form action="getOneTest">
For Individual Test Information<br>
<input type="text" name ="testID">
<input type="submit" value="Details">
</form>

<br>
<br>

<form action="updateTest">
for update Information of Test<br>
<input type="text" name="testID">
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteTest">
for delete Test information<br>
<input type="text" name="testID">
<input type="submit" value="Delete">
</form>

<br>
<br>
<form action="questionOperations">
Question Operations: for registration, get information, update details and delete information<br>
<input type="submit" value="Question"> 
</form>


</body>
</html>