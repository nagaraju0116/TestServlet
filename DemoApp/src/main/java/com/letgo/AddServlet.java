package com.letgo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//Servlet Annotation
//@WebServlet("/add")
public class AddServlet extends HttpServlet

{
	//doPost or doGet can use along with method="post"/"get"in UI.html 
	//actually "service" method runs both doGet and doPost backgroundly because with service only it happens in HttpServlet it has
public void doGet(HttpServletRequest req,HttpServletResponse res ) throws IOException, ServletException {
	
	
	  int i = Integer.parseInt(req.getParameter("num1"));
	   int j =Integer.parseInt(req.getParameter("num2"));
	  
	  int k=i+j;
	  PrintWriter out = res.getWriter(); 
	  out.println("result:"+k);
	 
	//k=k*k;
	
	
	//to print in console
	//System.out.println("result:"+k);
	
	/*  to print in browser
	 * 
	 * 
	 */
	
	//here "sq" is mentioned in web.xml link up with SquareServlet
	//  setattribute(key,value)
	
/* -->request dispatcher
	 * req.setAttribute("k", k);
	 *  RequestDispatcher rd =req.getRequestDispatcher("sq");
	 *   rd.forward(req, res);
	 */
	
/* -->sendredirect    
 		* --used for server to server to connect but it shows to user before going to server to server 
 		*/
	//res.sendRedirect("sq");   
	
/*--> URL rewriting
	 * res.sendRedirect("sq?k="+k);
	 *  // URL rewriting as "sq" --> "sq?k="
	 */
	
/*-->HttpSession
	 * HttpSession session= req.getSession(); 
	 * session.setAttribute("k", k);
	 * 
	 * res.sendRedirect("sq");
	 */ 
	
//-->Cookie
	//k is need to be string so 'k' changes to 'k+""'
	
	
	  Cookie cookie =new Cookie("k", k+""); res.addCookie(cookie);
	  
	  res.sendRedirect("sq");
	 
	 
	
	
}


}
