package com.EventManagement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.EventManagement.Entities.Manager;

@Component
public interface ManagerServices
{
	Manager  addUser(Manager  manager );
	
	List<Manager> getAllManager();
	
	Manager  getManagerById(Long managerId);
	
	Manager updateManager(Long managerId , Manager  manager );
	
	void deleteManagerById(Long managerId );
	
	void deleteAllManager();
	
	boolean isManagerExists(Long managerId);

	Manager findById(Long managerId);
}
