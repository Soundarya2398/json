<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="navFile.jsp" %>
    <% String msg=(String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<form action="./delete" method="post">
Enter id:<input type="text" name="id"/></br>
<input type="submit" value="delete"/>
<h2 style="color: green">
<%if(msg!=null){ %>
<%=msg %>
<%} %>
</h2>
</form>

</body>
</html>