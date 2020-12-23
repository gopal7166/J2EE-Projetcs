package com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.info.service.EmployeeService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if(EmployeeService.verifyEmployee(user,pass))
		{
			RequestDispatcher rd=request.getRequestDispatcher("hello.html");
			rd.forward(request, response);
		}
		else
		{
			out.println("<h2>Wrong username or password!!!</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);		
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
