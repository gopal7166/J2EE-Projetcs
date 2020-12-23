package com.sevice.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.info.model.Student;
import com.info.service.EmployeeService;

/**
 * Servlet implementation class Searchservlet
 */
@WebServlet("/searchservlet")
public class Searchservlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
    String query=request.getParameter("query");
	ArrayList<Student> stu=EmployeeService.getAllEmployees(query);
	HttpSession session=request.getSession();
	session.setAttribute("empDB",stu);
	RequestDispatcher rd=request.getRequestDispatcher("allEmployee.jsp");
	rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
