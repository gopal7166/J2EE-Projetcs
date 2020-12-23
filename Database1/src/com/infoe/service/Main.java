package com.infoe.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) 
	{
	 
		  try {
			  Class.forName("com.mysql.jdbc.Driver");
			  Connection con=DriverManager.getConnection("jdbc:mySql://localhost:3306/shalu","root","gillabhay");	  
            if(con!=null)
            {
        	  System.out.println("Connection okey!!!");
            }
		    } 
		    catch (Exception e) {

				e.printStackTrace();
			}

	}

}
