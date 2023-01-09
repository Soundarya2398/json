<%@page import="com.ty.mock.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="navFile.jsp" %>
    <%String msg=(String)request.getAttribute("msg"); 
    Employee employee=(Employee)request.getAttribute("employee");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Searchpage</title>
</head>
<body>

<form action="./search" method="post">
enter id:<input type="text" name="eid" />
<input type="submit" value="submit"/>

</form>

<h2 style="color: green;">
<%if(msg!=null) {%>
<%=msg %>
<%} %>
</h2>

<%if(employee!=null){%>
<%=employee.getEid() %>
<%=employee.getEname() %>
<%=employee.getSal() %>
<%=employee.getPassword() %>
<%} %>




</body>
</html>