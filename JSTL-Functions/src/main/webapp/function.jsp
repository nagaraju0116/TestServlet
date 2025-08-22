<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
     

<html>

<body>



<c:set var="str" value="This is a function servlet"/>

${str}
<br>
<!-- to find length of string -->
Length : ${fn:length(str)}

<!-- to split the array in words  -->
<c:forEach items="${fn:split(str,' ') }" var="s">
<br>
${s}
</c:forEach>

<!-- index tag will give index of particular string -->

index : ${fn:indexOf(str,'a') }
<br>
<!-- contains TAG used for string to say as boolean -->

is there : ${fn:contains(str,"function") }
<br>
<!-- contains TAG  used in if condition -->
	<c:if test="${ fn:contains(str,'servlet') }">
	servlet is there
	</c:if>
	<br>
	<!-- endsWith -->
	 <c:if test="${ fn:endsWith(str,'servlet') }">
	servlet is end
	</c:if>
	<br>
	${fn:toLowerCase(str)}
	<br>
	${fn:toUpperCase(str)}
</body>
</html>