<%@page import="com.schoolManagement.pack.Model.Question"%>
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

<% Question question = (Question)request.getAttribute("question");%>
<p>
 Test ID <%=question.getTestId() %>
 Question ID :<%=question.getQuestionId() %><br>
 Question : <%= question.getQuestion() %><br>
 A: <%= question.getOptionA()%>        B:<%= question.getOptionB()%>
 C: <%= question.getOptionC()%>        D:<%= question.getOptionD()%>

 Answer: <%= question.getAnswer()%>
</p>

<br>
<br>

<form action="updateQuestionForm">
Update Question <br>

<input type = "submit" value ="Update">
</form>

<br>
<br>
<form action="deleteQuestionForm">
Delete Question <br>
<input type="Text"  name="questionID"><br>
<input type = "submit" value ="Delete">
</form>

</body>
</html>