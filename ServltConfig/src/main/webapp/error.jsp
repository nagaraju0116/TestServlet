<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
Error :
<%= exception.getMessage() %>

<!-- to get error message <%= exception.getMessage() %> can used before to that 
 isErrorPage="true" is need to add in page tag-->
</body>
</html>