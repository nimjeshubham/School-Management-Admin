<%@page import="com.schoolManagement.pack.Model.Sclass"%>
<%@page import="com.schoolManagement.pack.Model.School"%>
<%@page import="com.schoolManagement.pack.Model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Student Information</h1>

<br>
<a href="adminPage.jsp">Admin Home</a> 
<br>

<%Student student =(Student) request.getAttribute("student"); %>
<table border="1">
<thead><td> Enrollment Number </td> <td>Name</td> <td> School </td> <td> Class </td> <td> Father's Name </td>
 <td> Mother's name </td> <td> Address </td> <td> Password </td></thead>
<%
School school = student.getSchool();
Sclass sclass = student.getSclass();%>

<tr><td><%=student.getEnrollmentNo() %></td> <td><%=student.getName() %></td> <td><%=school.getName() %></td>
 <td><%=sclass.getName() %> - <%=sclass.getSection() %></td> <td><%=student.getFName() %></td> <td><%= student.getMName()%>
 </td> <td><%=student.getAddress() %></td> <td><%=student.getPassword() %></td>  </tr>



</table>

<form action="updateStudentForm">
for update Information of Student<br>
<input type ="submit" value="Update">
</form>

<br>
<br>

<form action="deleteStudentForm">
for delete student information<br>
Enter Student ID <input type="text" name="studentID">
<input type="submit" value="Delete">
</form>

<br>
<br>
<a href="adminPage.jsp">Admin Home</a> 


</body>
</html>