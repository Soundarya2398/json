<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="nav.jsp"%>
<%String errMsg=(String)request.getParameter("errMsg"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
</head>
<body>

<%if(errMsg!=null) {%>
<%=errMsg %>
<%} %>
<center>

		
		<form action="./search" method="post">
			<input type="number" name="empId" placeholder="eg. 1234" ><br>
			<input type="submit" value="Search">
		</form>
		
		
		

</center>
</body>
</html>