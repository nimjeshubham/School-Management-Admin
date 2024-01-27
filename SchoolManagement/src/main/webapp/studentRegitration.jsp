<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Student Registration form</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<br>

<form action="newStudent">
School ID <input type ="text" name="schoolId"><br>
Class ID <input type ="text"  name ="classId"><br>
Enrollment Number <input type="text" name="enrollment"><br>
Name <input type="text" name="name"><br>
Father's Name <input type="text" name="fname"><br>
Mother's Name <input type ="text" name="mname"><br>
Address <input type ="text" name = "address"><br>
Password <input type ="text" name ="password"><br>

<input type="submit" value ="Register"> 
  
</form>

</body>
</html>