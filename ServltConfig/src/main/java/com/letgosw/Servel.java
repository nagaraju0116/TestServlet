package com.letgosw;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servel extends HttpServlet {

	public class MyServer extends jakarta.servlet.http.HttpServlet {

		public void service(HttpServletRequest req,HttpServletResponse res ) throws IOException, ServletException {
		
			 
			/*
			 * String user =req.getParameter("name"); String pass
			 * =req.getParameter("Upass");
			 * 
			 * 
			 * 
			 * if((user.equals("steve"))&&(pass.equals("01234"))) { RequestDispatcher rd
			 * =req.getRequestDispatcher("WelcomePage"); rd.forward(req, res);
			 * 
			 * }
			 */
			 
			 
			 
			 
			 
			 PrintWriter out =res.getWriter();		
			 out.println("Hello");
			 
			 //when u run the application at that moment tomcat will give u obj no need to create  
			 //and req.getServletContext() or getServletContext() can used
				/*
				 * ServletContext and ServletConfig had difference as ServletContext takes only
				 * mentioned param but ServletConfig takes inital parameter in servlet tag
				 */
	//-->ServletContext
			 	 ServletContext ctx= req.getServletContext(); 
				  String string = ctx.getInitParameter("name"); 
				  out.println(string);
				 
			 
	 //-->ServletConfig
		
		/*
		 * ServletConfig cg = getServletConfig(); String
		 * str=cg.getInitParameter("name"); out.println(str);
		 */
		 
			 
			 
		}
	}

}
