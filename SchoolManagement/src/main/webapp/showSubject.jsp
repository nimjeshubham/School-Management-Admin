<%@page import="com.schoolManagement.pack.Model.Sclass"%>
<%@page import="com.schoolManagement.pack.Model.Teacher"%>
<%@page import="java.util.List"%>
<%@page import="com.schoolManagement.pack.Model.Subject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Subject Information</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<a href="ContactUs.jsp">Contact Us</a>
<br>

<% Subject subject =(Subject) request.getAttribute("subject");
   %>
<table border="1">
<thead><td> Subject ID </td><td> Name </td> <td> Class </td> <td> Teacher </td> <td> Teacher </td>  <td> Teacher </td></thead>
<%
	List<Teacher> tList= subject.getTeacher();
	Teacher teacher1= tList.get(0);
	Teacher teacher2= tList.get(1);
	Teacher teacher3= tList.get(2);
	Sclass sclass = subject.getSclass();%>

<tr><td><%=subject.getSubjectId() %> </td>  <td><%=subject.getName() %> </td> <td><%= sclass.getName() %> </td><td><%= teacher1.getName() %> </td><td><%=  teacher2.getName() %> </td> <td><%=  teacher3.getName() %> </td> </tr>



</table>

<form action="updateSubjectForm">
for update Information of subject<br>
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteSubjectForm">
for delete subject information<br>
Enter subject ID <input type="text" name="subjectID">
<input type="submit" value="Delete">
</form>

<br>
<br>
<a href="adminPage.jsp">Admin Home</a> 



</body>
</html>