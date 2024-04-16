package com.EventManagement.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventManagement.Entities.User;
import com.EventManagement.repository.UserRepository;
import com.EventManagement.service.UserServices;

@Service
public class UserServicesImplementation implements UserServices
{
	@Autowired
	private UserRepository userRepo;

	@Override
	public User findByUsername(String username)
	{
		
		return userRepo.findByUsername(username);
	}

	@Override
	public User addUser(User user) 
	{
		
		return userRepo.save(user);
	}

}
