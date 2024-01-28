<%@page import="com.schoolManagement.pack.Model.School"%>
<%@page import="com.schoolManagement.pack.Model.Sclass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Class Details</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<br>

<% Sclass sclass =(Sclass) request.getAttribute("sclass"); %>
<table border="1">
<thead><td> Class ID</td><td> Class </td> <td> Section </td> <td> Class Teacher </td> <td> School </td>  </thead>

<%School school = sclass.getSchool();%>

<tr> <td><%=sclass.getSclass() %> </td><td><%=sclass.getName() %> </td> <td><%= sclass.getSection() %> </td><td><%= sclass.getClassTeacher() %> </td><td><%=  school.getName() %> </td>  </tr>


</table>
<br>
<br>
<form action="updateClassForm">
for Update Class information<br>
<input type ="submit" value="Update Class">
</form>
<br>
<br>
<form action="deleteClassForm">
for Delete Class information<br>
Enter Class ID <input type="text" name="classId"> 
<input type ="submit" value ="Delete Class">

<br>
<br>
<a href="adminPage.jsp">Admin Home</a> 
</form>
</body>
</html>