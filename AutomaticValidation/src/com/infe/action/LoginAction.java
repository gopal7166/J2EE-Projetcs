package com.infe.action;

import com.infe.model.User;
import com.infe.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport
{
	public String execute()
	{
		System.out.println("Hi!!!!!!!!!!");
		UserService service = new UserService();
/*		if(service.verifyUser(user))
			return "success";
		else
		{
			System.out.println("Wrong username or password!!!");
			return "failure";
		}	*/	
		return "success";
	}
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
