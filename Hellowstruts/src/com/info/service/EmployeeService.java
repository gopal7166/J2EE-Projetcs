package com.info.service;

import com.info.model.Employee;

public class EmployeeService 
{
	public static boolean verifyEmployee(Employee emp)
	{
		boolean  flag=false;
		if("Abhay".equalsIgnoreCase(emp.getUsername())&&"abhay123".equalsIgnoreCase(emp.getPassword()))
		{
			flag=true;
		}
		return false;
	}

}
