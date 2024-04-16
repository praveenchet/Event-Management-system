package com.EventManagement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.EventManagement.Entities.MediaRequirements;

@Component
public interface MediaRequirementsServices 
{

	MediaRequirements  addUser(MediaRequirements  mediaRequirements );
	
	List<MediaRequirements> getAllUsers();
	
	MediaRequirements  getUserById(Long mediaId);
	
	MediaRequirements updateUser(Long mediaId , MediaRequirements  mediaRequirements );
	
	void deleteUserById(Long mediaId );
	
	void deleteAllUser();
	
	boolean isUserExists(Long mediaId);
	
	MediaRequirements FindById(Long mediaId);
}
