package com.letso;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet

{
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		
		/*
		 * String name="martin";
		 * 
		 * req.setAttribute("label", name); 
		 * RequestDispatcher rd=req.getRequestDispatcher("display.jsp"); 
		 * rd.forward(req, res);
		 */
		List<Student> studs =Arrays.asList(new Student(1,"stev"),new Student(2,"harin"),new Student(3,"reins"));
		
		/* Student stud = new Student(1,"steve1"); */
		req.setAttribute("student", studs);
		RequestDispatcher rd =req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
	}

}
