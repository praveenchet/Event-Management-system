package com.EventManagement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.EventManagement.Entities.Studios;

@Component
public interface StudiosServices
{
	Studios  addStudios(Studios  Studios );
	
	List<Studios> getAllStudios();
	
	Studios  getStudiosById(Long studioId);
	
	Studios updateStudios(Long studioId , Studios  Studios );
	
	void deleteStudiosById(Long studioId );
	
	void deleteAllStudios();
	
	boolean isStudiosExists(Long studioId);
}
