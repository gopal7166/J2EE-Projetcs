package com.info.service;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.info.model.Employee;

public class EmployeeService
{
public static boolean verifyEmployee(Employee emp)
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mySql://localhost:3306/abhay","root","gillabhay");
		PreparedStatement pr=con.prepareStatement("select * from student where name=? and password=?");
		pr.setString(1,emp.getUsername());
		pr.setString(2,emp.getPassword());
		ResultSet rs=pr.executeQuery();
		while(rs.next())
		{
			return true;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
    }
	return false;
}
public static void insertEmployee(String name,String pass)
{
	try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con;
	con = DriverManager.getConnection("jdbc:mySql://localhost:3306/database1","root","abhaygill");
	PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
	ps.setString(1,name);
	ps.setString(2,pass);
	ps.executeUpdate();
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
