package com.infe.service;

import com.infe.model.User;

public class UserService 
{
	public boolean verifyUser(User user)
	{
		if("Abhay".equalsIgnoreCase(user.getUsername()) && "abhay123".equals(user.getPassword()))
			return true;
		else
			return false;			
	}
}
