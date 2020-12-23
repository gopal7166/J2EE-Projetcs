package com.info.action;

import com.info.model.Employee;
import com.info.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MyAction extends ActionSupport implements ModelDriven<Employee>
{
	private Employee emp = new Employee();
	
	public String execute()
	{		
		System.out.println("Check2");
		if(EmployeeService.verifyEmployee(emp))
			System.out.println("Valid User!!!!!!!");
		else
			System.out.println("Invalid User!!!");
		
		return "success";
	}
	
	@Override
	public void validate()
	{
		System.out.println("Check1");
		if(emp.getUsername().length() < 3)
			addFieldError("username", "Username is wrong!!!");
		if(emp.getPassword().length()<6)
			addFieldError("password", "Password is wrong!!!");
	}
	
	
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public Employee getModel() {
		return emp;
	}

}
