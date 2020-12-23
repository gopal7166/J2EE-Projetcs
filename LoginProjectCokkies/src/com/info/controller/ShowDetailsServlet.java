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
 * Servlet implementation class ShowDetailsServlet
 */
@WebServlet("/submitDetail")
public class ShowDetailsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Cookie[] cookies = request.getCookies();
		String user = cookies[0].getValue();
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		
		out.println("<h2>Username: "+user+"</h2>");
		out.println("<h2>Phone: "+phone+"</h2>");
		out.println("<h2>City: "+city+"</h2>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
