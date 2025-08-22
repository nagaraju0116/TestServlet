<%@page import="com.mvns.web.model.Group"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	<%
	/* to print the data we use this attribute */
	//we use typcast here to get obj of Group instead of obj of obj

	Group g1 = (Group) request.getAttribute("group");

	//redirect
	//Group g1 = (Group)session.getAttribute("group");

	out.println(g1);
	%>
</body>
</html>
<!-- 
package com.maven;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUpload extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			/*
			 * final Collection<Part> parts = request.getParts(); for (final Part part :
			 * parts) {
			 * part.write("C:\\Users\\nagarajuka\\eclipse-workspace\\FileUploadDemo" +
			 * part.getName()); }
			 * response.getWriter().print("The file has been uploaded successfully.");
			 */

			  //another flow
			  ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
			  List<FileItem> multifiles = sf.parseRequest( request);
			  
			  for (FileItem item : multifiles)
			  { 
				  item.write(new File("C:\\Users\\nagarajuka\\eclipse-workspace\\FileUploadDemo" +
			  item.getName())); }
			  response.getWriter().print("The file has been uploaded successfully.");
			 
		    } catch (Exception e) {
			System.out.println(e);
		}
		//System.out.println("file uploaded");
	}

}
 -->