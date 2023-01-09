<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="navFile.jsp" %>
    <%String msg=(String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./add" method="post">
enter id:<input type="text" name="eid" /> 
enter name:<input type="text" name="ename" />
enter salary:<input type="text" name="sal"/>
enter password:<input type="password" name="password"/>
<input type="submit" value="add"/>
<h2 style="color: green;">
<%if(msg!=null) {%>
<%=msg %>
<%} %>
</h2>
</form>

</body>
</html>