<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String check=(String)request.getAttribute("check");
if(check!=null)
{
	%>
<h1>Voting page</h1>
<form action="vote">


<label for="Ram">Ram</label>
<input type="radio" name="cname" value="Ram" id="Ram">

<label for="Shyam">Shyam</label>
<input type="radio" name="cname" value="Shyam" id="Shyam">

<label for="Raju">Raju</label>
<input type="radio" name="cname" value="Raju" id="Raju">

<input type="hidden" name="username" value="<%=check %>">

<button>vote</button>
</form>
<%
}
else
{
	response.sendRedirect("/WEB-INF/views/login.jsp");
}
%>
 
 
</body>
</html>