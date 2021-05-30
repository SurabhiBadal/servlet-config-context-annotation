package com.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class MyServlet extends HttpServlet {
	

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
		out.println("My Servlet");
		
		ServletContext ctx=getServletContext();
		String str=ctx.getInitParameter("Name");
		out.println("Servlet Context");
		out.println("Name:"+str);
		
		ServletConfig ctg=getServletConfig();
		String temp=ctg.getInitParameter("Name");
		out.println("Changed Name :"+temp);
		
	}

}
