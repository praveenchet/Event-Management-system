package com.EventManagement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.EventManagement.Entities.Venue;

@Component
public interface VenueServices 

{
	Venue getByname(Venue venue ,String name);
	
	Venue  addVenue(Venue  venue );
	
	List<Venue> getAllVenue();
	
	Venue  getVenueById(Long venueId);
	
	Venue updateVenue(Long venueId , Venue  venue );
	
	void deleteVenueById(Long venueId );
	
	void deleteAllVenue();
	
	boolean isVenueExists(Long venueId);

	Venue FindById(Long venueId);
}
