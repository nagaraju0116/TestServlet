package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.login.dao.LoginDao;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		LoginDao dao= new LoginDao();
		if(dao.check(uname,pass)) {
			
			/* if(uname.equals("steven")&&pass.equals("1345")) { */
			
			HttpSession session=request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("welcome.jsp");
		}
		else {
			
			response.sendRedirect("login.jsp");
		}
			
			
			
			
			
			
			
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

}
