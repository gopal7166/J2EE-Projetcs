package com.info.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.info.model.Student;

public class EmployeeService
{
	public static boolean verifyEmployee(Student stu)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mySql://localhost:3306/niet","root","gillabhay");
			PreparedStatement pr=con.prepareStatement("select * from student where email=? and password=?");
			pr.setString(1,stu.getEmail());
			pr.setString(2,stu.getPass());
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
	public static boolean insertEmployee(Student stu)
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con;
		con = DriverManager.getConnection("jdbc:mySql://localhost:3306/niet","root","gillabhay");
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
		ps.setString(1,stu.getName());
		ps.setString(2,stu.getRoll());
		ps.setString(3,stu.getEmail());
		ps.setString(4,stu.getMobile());
		ps.setString(5,stu.getPass());
		int n=ps.executeUpdate();
		if(n>0)
		{
		
			return true;
		}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
    public static ArrayList<Student> getAllEmployees()
    {
				ArrayList<Student> emps = new ArrayList<>();
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con;
    		con = DriverManager.getConnection("jdbc:mySql://localhost:3306/niet","root","gillabhay");
    		PreparedStatement ps=con.prepareStatement("select* from student;");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
               Student stu=new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)); 
               emps.add(stu);
            }
    		} 
    		catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
 
    	return emps;
	}
    public static ArrayList<Student> getAllEmployees(String query) {
		
		ArrayList<Student> emps = new ArrayList<>();
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con;
    		con = DriverManager.getConnection("jdbc:mySql://localhost:3306/niet","root","gillabhay");
    		PreparedStatement ps=con.prepareStatement("select* from student where name like ?;");
            ps.setString(1,query+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
               Student stu=new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)); 
               emps.add(stu);
            }
    		} 
    		catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
 
    	return emps;
	}


}
