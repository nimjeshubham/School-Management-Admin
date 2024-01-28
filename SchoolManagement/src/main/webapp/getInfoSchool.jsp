<%@page import="com.schoolManagement.pack.Model.School"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All School Information</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<br>
<br>

<% List<School> list =(List<School>) request.getAttribute("list"); %>
<table border="1">
<thead><td> School ID </td><td> School Name </td> <td> Principal </td> <td> Address </td> </thead>
<%for (School school: list){ %>

<tr><td><%=school.getSchoolID()%> </td>  <td><%=school.getName() %> </td> <td><%= school.getPrincipal() %> </td><td><%= school.getAddress() %> </td>  </tr>


<%} %>
</table>

<form action="updateSchool">
for update Information of School<br>
Enter School ID <input type="text" name="schoolID">
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteSchool">
for delete class information<br>
Enter School ID <input type="text" name="schoolID">
<input type="submit" value="Delete">
</form>

<br>
<br>
<a href="adminPage.jsp">Admin Home</a> 

</body>
</html>