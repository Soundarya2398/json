<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%  String err=(String)request.getAttribute("err");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>err page</title>
</head>
<body>
<%if(err!=null) {%>
<h2 style="color:red; "><%=err %></h2>
<%} %>


</body>
</html>