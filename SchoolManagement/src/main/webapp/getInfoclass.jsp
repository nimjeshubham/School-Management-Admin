<%@page import="com.schoolManagement.pack.Model.School"%>
<%@page import="java.util.List"%>
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
<h1>All Class Information</h1>
<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<br>
<% List<Sclass> list =(List<Sclass>) request.getAttribute("list"); %>
<table border="1">
<thead><td> Class ID </td><td> Class </td> <td> Section </td> <td> Class Teacher </td> <td> School </td>  </thead>
<%for (Sclass sclass: list){ 
School school = sclass.getSchool();%>

<tr><td><%=sclass.getSclass() %> </td>  <td><%=sclass.getName() %> </td> <td><%= sclass.getSection() %> </td><td><%= sclass.getClassTeacher() %> </td><td><%=  school.getName() %> </td>  </tr>


<%} %>
</table>

<form action="updateclass">
for update Information of class<br>
Enter Class ID <input type="text" name="classID">
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteclass">
for delete class information<br>
Enter Class ID <input type="text" name="classID">
<input type="submit" value="Delete">
</form>

<br>
<br>

</body>
</html>