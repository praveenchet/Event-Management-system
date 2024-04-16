package com.EventManagement.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventManagement.Entities.Studios;
import com.EventManagement.repository.StudiosRepository;
import com.EventManagement.service.StudiosServices;

@Service
public class StudiosServicesImplementation implements StudiosServices
{
	@Autowired
	private StudiosRepository studioRepo;
	@Override
	public Studios addStudios(Studios Studios)
	{
		
		return studioRepo.save(Studios);
	}

	@Override
	public List<Studios> getAllStudios() 
	{
		return studioRepo.findAll();
	}

	@Override
	public Studios getStudiosById(Long studioId)
	{
		
		return studioRepo.findById(studioId).get();
	}

	@Override
	public Studios updateStudios(Long studioId, Studios Studios) 
	{
		Studios s =studioRepo.findById(studioId).get();
		s.setContactInfo(Studios.getContactInfo());
		s.setMediaList(Studios.getMediaList());
		s.setName(Studios.getName());
		s.setStdioCost(Studios.getStdioCost());
		return studioRepo.save(s);
	}

	@Override
	public void deleteStudiosById(Long studioId) 
	{
		studioRepo.findById(studioId);
		
	}

	@Override
	public void deleteAllStudios() 
	{
		studioRepo.findAll();
		
	}

	@Override
	public boolean isStudiosExists(Long studioId) 
	{
		
		return studioRepo.existsById(studioId);
	}

}
