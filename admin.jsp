<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Admin page</h1>



<%
Integer ram=(Integer)request.getAttribute("c1");
Integer shyam=(Integer)request.getAttribute("c2");
Integer raju=(Integer)request.getAttribute("c3");
%>
<h1>Ram : <%=ram %></h1>
<h1>Shyam : <%=shyam %></h1>
<h1>Raju : <%=raju %></h1>


 
</body>
</html>