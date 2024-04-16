package com.EventManagement.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventManagement.Entities.Customer;
import com.EventManagement.Entities.Events;
import com.EventManagement.repository.CustomerRepository;
import com.EventManagement.repository.EventsRepository;
import com.EventManagement.service.EventsServices;

@Service
public class EventsServicesImplementation implements EventsServices
{
	@Autowired
	private EventsRepository eventsRepo;
	
	@Autowired
	private CustomerRepository custRepo;

	@Override
	public Events addEvents(Events events) 
	{
		
		return eventsRepo.save(events);
	}

	@Override
	public List<Events> getAllEvents()
	{
		
		return eventsRepo.findAll()	;
	}

	@Override
	public Events getEventsById(Long eventId)
	{
		return eventsRepo.findById(eventId).get();
	}

	@Override
	public Events updateEvents(Long eventId, Events events) 
	{
		Events e = eventsRepo.findById(eventId).get();
		e.setCatering(events.getCatering());
		e.setCustomer(events.getCustomer());
		e.setEndingTime(events.getEndingTime());
		e.setEventDate(events.getEventDate());
		e.setGuests(events.getGuests());
		e.setManager(events.getManager());
		e.setMediaRequirements(events.getMediaRequirements());
		e.setName(events.getName());
		e.setStartingTime(events.getStartingTime());
		//e.setTotalCost(events.getTotalCost());
		e.setType(events.getType());
		e.setVenue(events.getVenue());
		return eventsRepo.save(e);
		
	}

	@Override
	public void deleteEventsById(Long eventId)
	{
		eventsRepo.findById(eventId);
		
	}

	@Override
	public void deleteAllEvents()
	{
		eventsRepo.findAll();
		
	}

	@Override
	public boolean isEventsExists(Long eventId) 
	{
		
		return eventsRepo.existsById(eventId);
	}

//	@Override
//	public Events addEventsById(Long custId, Events events)
//	{
//		Optional<Customer> cust=custRepo.findById(custId);
//		return eventsRepo.save(events);
//	}

}
