package com.EventManagement.service;

import com.EventManagement.Entities.User;

public interface UserServices 
{
	 User findByUsername(String username);

	User addUser(User user);
}
