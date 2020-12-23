package com.info.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeService
{
public static boolean verifyEmployee(String name,String pass)
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mySql://localhost:3306/abhay","root","gillabhay");
		PreparedStatement pr=con.prepareStatement("select * from student where name=? and password=?");
		pr.setString(1,name);
		pr.setString(2,pass);
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
	int n=ps.executeUpdate();
	if(n>0)
	{
		System.out.println("oky!!!");
	}
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
