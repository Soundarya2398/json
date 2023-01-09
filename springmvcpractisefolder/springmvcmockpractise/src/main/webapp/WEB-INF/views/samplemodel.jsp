<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String errMsg=(String)request.getAttribute("errMsg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>model</title>
</head>
<body>
<%if(errMsg!=null){ %>
<h2 style="color: red;"><%=errMsg %></h2>
<%} %>
<form action="./login" method="post">
ID:<input type="text" name="id" /></br>
password:<input type="password" name="password" /></br>
<input type="submit" value="submit"/>
</form>
</body>
</html>