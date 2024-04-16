package com.EventManagement.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventManagement.Entities.Catering;
import com.EventManagement.repository.CateringRepository;
import com.EventManagement.service.CateringServices;

@Service
public class CateringServicesImplementation implements CateringServices
{
	@Autowired
	private CateringRepository cateringRepo;
	
	@Override
	public Catering addCatering(Catering catering) 
	{
		
		return cateringRepo.save(catering);
	}

	@Override
	public List<Catering> getAllCatering() 
	{
		
		return cateringRepo.findAll();
	}

	@Override
	public Catering getCateringById(Long cateringId) 
	{
		
		return cateringRepo.findById(cateringId).get();
	}

	@Override
	public Catering updateCatering(Long cateringId, Catering catering)
	{
		Catering c = cateringRepo.findById(cateringId).get();
		c.setName(catering.getName());
		c.setSpecialty(catering.getSpecialty());
		//c.setDays(catering.getDays());
		c.setContact(catering.getContact());
		c.setCharges(catering.getCharges());
		c.setMenus(catering.getMenus());
		c.setCateringId(catering.getCateringId());
		return cateringRepo.save(c);
	}

	@Override
	public void deleteCateringById(Long cateringId)
	{
		cateringRepo.findById(cateringId);
		
	}

	@Override
	public void deleteAllCatering()
	{
		cateringRepo.findAll();
		
	}

	@Override
	public boolean isCateringExists(Long cateringId)
	{
		
		return cateringRepo.existsById(cateringId);
	}
	
}
