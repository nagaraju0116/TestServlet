<!DOCTYPE html>

<%@ page import="java.util.ArrayList"  %>
<%@ include file="header.jsp" %>
<%-- <%@ import = "java.util.Scanner" %> --%>

<%-- <%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%> --%>
<html>

<%-- <body>
<a href="validation">
<%
    request.getParameter("name");

%></a>
form action="validation">
<%
    request.getParameter("name");

%>
</form>
</body> --%>
		<body bgcolor="blue">
		<!-- <h:h1>Hii</h:h1> -->
		<!-- del meter used to hidde the code which shows in inspect and it is java code -->
		<%-- 
		 this is  Scriptlet= <% ****  %> to wirte the java code in jsp
		 this is  declaration= <%! ****  %>   to declare any thing inside class outside the service method
		 this is  Directive= <%@ ****  %>   to import a file
		 this is  expression= <%= ****  %>   used for output instead of out.println()
		 --%>
		 <%! int cod= 3; %>
				<%
				 
				int i = Integer.parseInt(request.getParameter("num1"));
				int j =Integer.parseInt(request.getParameter("num2"));
				
				int k=i+j;
				
				out.println("output :"+k);
				
				%>
				My favr num:<%=cod %>
		
		</body>
		<!-- about page directive -->
		<%-- <%@ page attribute="value" %> 
		language="script langauge"   --ex:java	we use in jsp
		extends="className" -to extend particular class into servlet by adding in jsp
		import="importList" -to import packages and for multipule pages mention cama (,)
		session="true|false" -if u want to add any sessions in jsp or not 
		autoFlush="true|false"  --for buffer like sometime to send to client to snet data after buffer fulls only data send and what if u want to send data before buffer full for that autoflush used.
		contentType="true|false" -- to send html,pdf file,image mention in contentType.
		errorPage="error_url" -to mention error page like has exception page to handle
		isErrorPage="true|false"  --to mention current page is error page
		info="information"  -- to give info about the page
		isELIgnored="true|false" --to ignore EL=Expression language in jsp can mention
		isThreadSafe="true|false"--to make jsp safe from thread
		--%>
		<!-- Implicit Object in JSP --
		
		Builtin Object (can be used in Scriplet and expression)
		
		request (HttpServletRequest)
		response (HttpServletResponse)
		pageContext (PageContext)
		out (JspWriter)~ PrintWriter object
		session (Httpsession)
		application  (ServletContext)
		config (ServletConfig)
		
		-->
		<body>
		<%
		/* as seen request obj is not mentioned but jsp will create it */
		
		/* request.getParameter(arg0); */
		pageContext.setAttribute("name", "naruto",PageContext.SESSION_SCOPE);
		%>
		</body>
		
</html>