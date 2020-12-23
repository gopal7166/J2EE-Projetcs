package com.info.action;

import com.info.service.EmployeeService;
import com.info.model.Employee;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CheckAction extends ActionSupport implements ModelDriven<Employee>
{
	private Employee emp=new Employee();
	private String error;
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}

	public String execute()
	{
		boolean status=EmployeeService.verifyEmployee(emp);
		if(status)
		{
			System.out.println("Request has been processed");
			return "success";
		}
		else
		{
			System.out.println("Wrong username or password");
			return "failure";
		}
	}
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return emp;
	}
	public void validate()
	{
		System.out.println("check");
		if(emp.getUsername().length()<3)
			addFieldError("username","username is wrong!!!!");
		if(emp.getPassword().length()<6)
			addFieldError("password","password is wrong!!!!");
			
	}

}
