<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Demo</title>
</head>
<body >
<!--java language  -->
<%-- <%
	String name = request.getAttribute("label").toString();
	out.println(name);


%><br> --%>

<!-- expression language =EL in jsp-->
	<%-- ${label}<br> --%>
	
	
	<!--by using taglib =tag   and using "out" tag to print output-->
	<%-- <c:out value="Hello World!"></c:out> --%>
	
	<!--if you get exception while running use jars as 
	jakarta.servlet.jsp.jstl-api-3.0.0.jar (this is the JSTL 3.0 API)
jakarta.servlet.jsp.jstl-3.0.1.jar (this is the JSTL 3.0.1 impl of EE4J)
  for error of --java.lang.NoClassDefFoundError: javax/servlet/jsp/tagext/TagLibraryValidator  -->
	
	
	
<%-- <c:catch>it is used for exception handling</c:catch> --%>
<%-- <c:import url="https://www.youtube.com/">to import the links</c:import> --%>
<%-- <c:set property="">set property or value or target</c:set> --%>

<!--to get only specific object  -->
<%-- ${student.name}   --%>


<c:forEach items="${student}" var="s">
	${s.rollno}
	${s.name}<br/>
</c:forEach>

</body>
</html>