<%@page import="com.schoolManagement.pack.Model.Question"%>
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
<% List<Question> list =(List<Question>) request.getAttribute("list"); %>
<table border="1">
<thead><td> Test ID </td><td> Question ID </td> <td> Question </td><td> Option A  </td><td> Option B  </td> <td> Option C </td> <td> Option D</td> <td>Answer</td> </thead>
<%for (Question question: list){ %>

<tr><td><%=question.getTestId()%> </td>  <td><%=question.getQuestionId()%> </td> <td><%=question.getQuestion() %> </td> <td><%=question.getOptionA() %> </td> <td><%= question.getOptionB()%> </td> <td><%=question.getOptionC() %> </td> <td><%= question.getOptionD()%> </td> <td><%= question.getAnswer()%> </td>  </tr>


<%} %>
</table>

<br>
<br>

<form action="updateQuestion">
Update Question <br>
Question Id<input type="Text"  name="questionID"><br>
<input type = "submit" value ="Update">
</form>

<br>
<br>
<form action="deleteQuestion">
Delete Question <br>
<input type="Text"  name="questionID"><br>
<input type = "submit" value ="Delete">
</form>

</body>
</html>