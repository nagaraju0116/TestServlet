package com.letgosw;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserDashboard extends HttpServlet {
	

	public void doPost(HttpServletRequest req,HttpServletResponse res ) throws IOException, ServletException {
	String user =req.getParameter("userName");
	res.setContentType("text/html");
	
	PrintWriter out =res.getWriter();
	out.println("<font color='green'>Hello"+user+"Welcome</font>");
	
	ServletConfig sc = getServletConfig();
	System.out.println(sc.getInitParameter("topic"));
	 
	 
	 ServletContext scon = getServletContext();
	
	 System.out.println(scon.getInitParameter("globalVaraible"));
	 
	}
}
