package com.EventManagement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.EventManagement.Entities.Catering;

@Component
public interface CateringServices 
{
	Catering  addCatering(Catering  catering );
	
	List<Catering > getAllCatering();
	
	Catering  getCateringById(Long cateringId);
	
	Catering updateCatering(Long cateringId , Catering  catering );
	
	void deleteCateringById(Long cateringId );
	
	void deleteAllCatering();
	
	boolean isCateringExists(Long cateringId);
}
