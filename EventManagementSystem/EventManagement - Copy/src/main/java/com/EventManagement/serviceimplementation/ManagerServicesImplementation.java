package com.EventManagement.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventManagement.Entities.Manager;
import com.EventManagement.repository.ManagerRepository;
import com.EventManagement.service.ManagerServices;

@Service
public class ManagerServicesImplementation implements ManagerServices
{
	@Autowired
	private ManagerRepository managerRepo;
	
	@Override
	public Manager addUser(Manager manager) 
	{
		
		return managerRepo.save(manager);
	}

	@Override
	public List<Manager> getAllManager() 
	{
		
		return managerRepo.findAll();
	}

	@Override
	public Manager getManagerById(Long ManagerId) 
	{
		
		return managerRepo.findById(ManagerId).get();
	}

	@Override
	public Manager updateManager(Long managerId, Manager manager) 
	{
		Manager m=managerRepo.findById(managerId).get();
		m.setEmployee(manager.getEmployee());
		m.setEvents(manager.getEvents());
		m.setName(manager.getName());
		m.setManagerId(manager.getManagerId());
		return managerRepo.save(m);
	}

	@Override
	public void deleteManagerById(Long managerId) 
	{
		managerRepo.findById(managerId);
		
	}

	@Override
	public void deleteAllManager()
	{
		managerRepo.findAll();
		
	}

	@Override
	public boolean isManagerExists(Long managerId) 
	{
		
		return managerRepo.existsById(managerId);
	}

	@Override
	public Manager findById(Long managerId) 
	{
		
		return managerRepo.findById(managerId).get();
	}

}
