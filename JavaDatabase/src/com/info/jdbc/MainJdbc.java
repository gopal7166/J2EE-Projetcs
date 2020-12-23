package com.info.jdbc;

import java.util.Scanner;

import com.info.service.EmployeeService;

public class MainJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Username:");
		String name=sc.nextLine();
		System.out.println("Enter your password:");
		String pass=sc.nextLine();
        if(EmployeeService.verifyEmployee(name,pass))
        {
        	System.out.println("Welcome");
        }
        else
        {
        	System.out.println("User is not valid:");
        }
        
	}

	}
