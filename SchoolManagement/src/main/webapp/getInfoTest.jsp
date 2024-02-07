<%@page import="com.schoolManagement.pack.Model.Test"%>
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


<br>
<a href="adminPage.jsp">Admin Home</a> 
<a href="index.jsp">Log out</a> 
<a href="ContactUs.jsp">Contact Us</a>
<br>

<% List<Test> list =(List<Test>) request.getAttribute("list"); %>
<table border="1">
<thead><td> Test ID </td><td> Subject </td> <td> Date </td>  </thead>
<%for (Test test: list){ %>

<tr><td><%=test.getTestId()%> </td>  <td><%=test.getSubject() %> </td> <td><%= test.getDate()%> </td>  </tr>


<%} %>
</table>

<form action="updateTest">
for update Information of teacher<br>
Enter Test ID <input type="text" name="testID">
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteTest">
for delete test information<br>
Enter teacher ID <input type="text" name="testID">
<input type="submit" value="Delete">
</form>

<br>
<br>

</body>
</html>