package com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		if("Namit".equalsIgnoreCase(user) && "namit123".equals(pass))
		{
			Cookie c1 = new Cookie("username", user);
			response.addCookie(c1);		
			out.println("<h1>Welcome to the home!!!</h1>");
			out.println("<h2>");
			out.println("<form action='submitDetail'>");
			out.println("Enter Phone: <input type='text' name='phone'>");
			out.println("Enter City: <input type='text' name='city'>");
			out.println("<input type='submit' value='Submit'>");
			out.println("</form>");
			out.println("</h2>");
		}
		else
		{
			out.println("<h2>Wrong username or password!!!</h2>");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
		
	}

}
