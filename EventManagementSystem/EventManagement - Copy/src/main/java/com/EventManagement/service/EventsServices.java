package com.EventManagement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.EventManagement.Entities.Events;

@Component
public interface EventsServices 
{
	Events  addEvents(Events  events );
	
	List<Events > getAllEvents();
	
	Events  getEventsById(Long eventId);
	
	Events updateEvents(Long eventId , Events  events );
	
	void deleteEventsById(Long eventId );
	
	void deleteAllEvents();
	
	boolean isEventsExists(Long eventId);
}
