<%@page import="com.schoolManagement.pack.Model.School"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> School Information</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<br>

<% School school =(School) request.getAttribute("school"); %>
<table border="1">
<thead><td> School ID </td><td> School Name </td> <td> Principal </td> <td> Address </td> </thead>


<tr><td><%=school.getSchoolID()%> </td>  <td><%=school.getName() %> </td> <td><%= school.getPrincipal() %> </td><td><%= school.getAddress() %> </td>  </tr>



</table>

<form action="updateSchoolForm">
for update Information of School<br>
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteSchoolForm">
for delete class information<br>
Enter School ID <input type="text" name="schoolID">
<input type="submit" value="Delete">
</form>

<br>
<br>
<a href="adminPage.jsp">Admin Home</a> 


</body>
</html>