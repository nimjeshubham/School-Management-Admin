<%@page import="com.schoolManagement.pack.Model.Test"%>
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

<% Test test = (Test)request.getAttribute("test");%>
<p>
 Test ID :<%=test.getTestId() %><br>
 Test subject : <%= test.getSubject() %><br>
 Test Date: <%=test.getDate() %>

</p>
<form action="updateTestForm">
Update Test <br>

<input type = "submit" value ="Update">
</form>

<br>
<br>
<form action="deleteTestForm">
Delete Test <br>
<input type="Text" placeholder=<%=test.getTestId() %> name="testId"><br>
<input type = "submit" value ="Delete">
</form>

</body>
</html>