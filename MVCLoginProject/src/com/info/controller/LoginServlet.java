package com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.info.model.Employee;
import com.info.service.EmployeeService;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		Employee emp=new Employee();
		emp.setUsername(name);
		emp.setPassword(pass);
		if(EmployeeService.verifyEmployee(emp))
		{
		    HttpSession session=request.getSession();
		    session.setAttribute("username", name);
			RequestDispatcher rd=request.getRequestDispatcher("hello.jsp");
			rd.include(request, response);
			
		}
		else
		{   
			
			request.setAttribute("str", "Sorry, email or password error");
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
			rd.include(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
