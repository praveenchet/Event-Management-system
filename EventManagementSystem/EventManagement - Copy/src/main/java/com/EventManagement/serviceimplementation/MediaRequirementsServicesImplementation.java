package com.EventManagement.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventManagement.Entities.MediaRequirements;
import com.EventManagement.repository.MediaRequirementsRepository;
import com.EventManagement.service.MediaRequirementsServices;

@Service
public class MediaRequirementsServicesImplementation implements MediaRequirementsServices
{
	@Autowired
	private MediaRequirementsRepository mediaRepo;
	
	@Override
	public MediaRequirements addUser(MediaRequirements mediaRequirements) 
	{
		
		return mediaRepo.save(mediaRequirements);
	}

	@Override
	public List<MediaRequirements> getAllUsers() 
	{
		
		return mediaRepo.findAll();
	}

	@Override
	public MediaRequirements getUserById(Long mediaId) 
	{
		
		return mediaRepo.findById(mediaId).get();
	}

	@Override
	public MediaRequirements updateUser(Long mediaId, MediaRequirements mediaRequirements) 
	{
		MediaRequirements m= mediaRepo.findById(mediaId).get();
		m.setAlbum(mediaRequirements.isAlbum());
		m.setCrane(mediaRequirements.isCrane());
		m.setDrone(mediaRequirements.isDrone());
		m.setPhotography(mediaRequirements.isPhotography());
		m.setVideography(mediaRequirements.isVideography());
		m.setStudios(mediaRequirements.getStudios());
		return mediaRepo.save(m);
	}

	@Override
	public void deleteUserById(Long mediaId)
	{
		mediaRepo.findById(mediaId);
		
	}

	@Override
	public void deleteAllUser() 
	{
		mediaRepo.findAll();
		
	}

	@Override
	public boolean isUserExists(Long mediaId)
	{
		return mediaRepo.existsById(mediaId);
	}

	@Override
	public MediaRequirements FindById(Long mediaId) 
	{
		
		return mediaRepo.findById(mediaId).get();
	}

}
