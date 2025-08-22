<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  errorPage="error.jsp"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exception handling in jsp</title>
</head>
<body>
<%
/* try{
	int k=9/0;
}
catch(Exception e){
	
	out.println("error"+e.getMessage());
} */
 

int k=9/0;


/* about the exceptions in jsp
if int k=9/0  shows error in UI to get it we can use try catch method
and if not by mentioning in page tag as errorPage="error.jsp" about other page

*/
%>
</body>
</html>