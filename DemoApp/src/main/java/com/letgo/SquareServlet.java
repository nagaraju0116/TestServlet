package com.letgo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//Servlet Annotation
//@WebServlet("/add")
public class SquareServlet  extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//getted attribute  
		//type cast into 'int'  for object of string
		//get attribute key =k1
/*-->request dispatcher
		 * int k2 = (int)req.getAttribute("k1");
		 *  k2=k2*k2;
		 * 
		 * PrintWriter out = res.getWriter(); 
		 * out.println("result is : "+k2);
		 */
		
//-->send redirect
		//integer.parseInt() used for to convert string to int
		/*
		 * int k = Integer.parseInt(req.getParameter("k"));
		 *  k=k*k;
		 *   PrintWriter out =res.getWriter(); 
		 *   out.println("result is : "+k);
		 */
		 
		//System.out.println("sq results"+k);
		
/*-->HttpSession
		 * HttpSession session= req.getSession();
		 * 
		 * //session.removeAttribute("k"); --> to remove value of k in session. 
		 * int k =(int)session.getAttribute("k");
		 * 
		 * k=k*k;
		 * 
		 * PrintWriter out =res.getWriter(); 
		 * out.println("result is : "+k);
		 */
		
//-->Cookie
/*
 * int k=0;
 * 
 * 
 * Cookie cookies[]=req.getCookies(); 
 * for(Cookie c : cookies) 
 * {
 * if(c.getName().equals("k")) 
		 * { 
		 * k=Integer.parseInt(c.getValue()); 
		 * }
 *  } k=k*k;
 * PrintWriter out =res.getWriter();
 *  out.println("result is : "+k);
 */
 
	}
}
