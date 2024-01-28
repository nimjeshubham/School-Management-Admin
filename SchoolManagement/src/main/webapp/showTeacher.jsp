<%@page import="com.schoolManagement.pack.Model.School"%>
<%@page import="com.schoolManagement.pack.Model.Teacher"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Teacher Information</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<br>

<%Teacher teacher =(Teacher) request.getAttribute("teacher"); %>
<table border="1">
<thead><td> Teacher ID </td><td> Name </td> <td> School </td> <td> Address </td> <td> Password </td>  </thead>
<% 
School school = teacher.getSchool();%>

<tr><td><%= teacher.getTID() %> </td>  <td><%= teacher.getName() %> </td> <td><%= school.getName() %> </td><td><%= teacher.getAddress() %> </td><td><%=  teacher.getPassword() %> </td>  </tr>



</table>

<form action="updateTeacherForm">
for update Information of teacher<br>
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteTeacherForm">
for delete teacher information<br>
Enter teacher ID <input type="text" name="teacherID">
<input type="submit" value="Delete">
</form>

<br>
<br>
<a href="adminPage.jsp">Admin Home</a> 


</body>
</html>