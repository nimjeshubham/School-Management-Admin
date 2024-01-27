<%@page import="com.schoolManagement.pack.Model.Student"%>
<%@page import="com.schoolManagement.pack.Model.Marksheet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Marksheet Information</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<br>

<% Marksheet marksheet =(Marksheet) request.getAttribute("list"); %>
<table border="1">
<thead><td> Marksheet ID </td><td> Student </td> <td> Exam </td> <td> Subject </td> <td> Marks </td>  </thead>

<%Student student = marksheet.getStudent();%>

<tr><td><%=marksheet.getMID() %> </td>  <td><%=student.getName() %> </td> <td><%= marksheet.getExam() %> </td><td><%= marksheet.getSubject() %> </td><td><%=  marksheet.getMarks() %> </td>  </tr>



</table>

<form action="updateMarksheetForm">
for update Information of marksheet<br>

<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteMarksheetForm">
for delete marksheet information<br>
Enter marksheet ID <input type="text" name="markID">
<input type="submit" value="Delete">
</form>

<br>
<br>
<a href="adminPage.jsp">Admin Home</a>


</body>
</html>