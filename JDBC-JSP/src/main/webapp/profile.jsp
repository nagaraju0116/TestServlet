<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 101 <br>
 Steve<br>
 89<br>
 <!--1. import java.sql.* page  
 add lib in lib folder as from mvnrepository ->mysql connector-java ->jar file ->download and past in lib then connection works -->
 <br>
 <%
 
 	String url ="jdbc:mysql://localhost:3306/nagdb";
 	String name="root";
 	String password="199*";
 	String sql="select * from student where ID=101";
 	Class.forName("com.mysql.jdbc.Driver");
 	Connection con = DriverManager.getConnection(url,name,password);
 	Statement st=con.createStatement();
 	
 	ResultSet rs =st.executeQuery(sql);
 	rs.next();
 %>
 
 ID:<%=rs.getString(1) %><br>
 Name:<%=rs.getString(2) %><br>
 Marks:<%=rs.getString(3) %>
 
</body>
</html>