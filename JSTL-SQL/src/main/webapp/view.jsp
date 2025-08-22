<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL-SQL</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/nagdb"  user="root" password="1996"/>

<sql:query var="rs" dataSource="${db}">select * from student</sql:query>

 <c:forEach items="${rs.rows}" var="gadget">
 	<%-- <c:out value="${gadget }" --%>
 	 <c:out value="${gadget.ID}"></c:out>:<c:out value="${gadget.name}"></c:out>:<c:out value="${gadget.marks}"></c:out><br>
 </c:forEach>
</body>
</html>