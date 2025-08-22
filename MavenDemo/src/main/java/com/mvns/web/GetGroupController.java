package com.mvns.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.mvns.web.dao.GroupDao;
import com.mvns.web.model.Group;

import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GetGroupController
 */
@WebServlet("/getDetails")
public class GetGroupController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
	
		GroupDao dao= new GroupDao();
		
		Group g1 = dao.getGroup(id);
		/* to set the data we use this attribute */
		request.setAttribute("group", g1);		
		
				//redirect  not used only request dispatcher used so in url showgroup.jsp not shows
		RequestDispatcher rd = request.getRequestDispatcher("showGroup.jsp");
		rd.forward(request, response);
		
		/* also we can use redirect */
		/*
		 * HttpSession session = request.getSession(); 
		 * session.setAttribute("group",g1);
		 * 
		 * response.sendRedirect("showGroup.jsp");
		 */
	}

	

}
