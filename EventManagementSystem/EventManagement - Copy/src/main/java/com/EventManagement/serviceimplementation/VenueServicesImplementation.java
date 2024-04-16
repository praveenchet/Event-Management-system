package com.EventManagement.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventManagement.Entities.Venue;
import com.EventManagement.repository.VenueRepository;
import com.EventManagement.service.VenueServices;

@Service
public class VenueServicesImplementation implements VenueServices
{
	@Autowired
	private VenueRepository venueRepo;

	@Override
	public Venue addVenue(Venue venue)
	{
		
		return venueRepo.save(venue);
	}

	@Override
	public List<Venue> getAllVenue()
	{
		
		return venueRepo.findAll();
	}

	@Override
	public Venue getVenueById(Long venueId)
	{
		
		return venueRepo.findById(venueId).get();
	}

	@Override
	public Venue updateVenue(Long venueId, Venue venue) 
	{
		Venue v =venueRepo.findById(venueId).get();
		v.setAddress(venue.getAddress());
		v.setCategory(venue.getCategory());
		v.setContactInfo(venue.getContactInfo());
		v.setDescription(venue.getDescription());
		v.setMaxCapacity(venue.getMaxCapacity());
		v.setName(venue.getName());
		v.setVenuecost(venue.getVenuecost());
		return venueRepo.save(v);
	}

	@Override
	public void deleteVenueById(Long venueId) 
	{
		venueRepo.findById(venueId);
		
	}

	@Override
	public void deleteAllVenue() 
	{
		venueRepo.findAll();		
	}

	@Override
	public boolean isVenueExists(Long venueId)
	{
		
		return venueRepo.existsById(venueId);
	}

	@Override
	public Venue getByname(Venue venue, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Venue FindById(Long venueId) 
	{
		// TODO Auto-generated method stub
		return venueRepo.findById(venueId).get();
	}

}
