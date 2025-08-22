package com.letso;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebServlet("/addAlien")
public class IdFilter extends HttpFilter implements Filter {
       
    
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out =response.getWriter();
		//typecasting obj to HttpServletRequest from ServletRequest 
		HttpServletRequest req=(HttpServletRequest) request;
		int id= Integer.parseInt(req.getParameter("id"));
		 
		 if(id>1)
		// pass the request along the filter chain
		chain.doFilter(req, response);
		 else
			 out.print("invalid input");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
