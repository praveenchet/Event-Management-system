//EventsController.java
package com.EventManagement.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.EventManagement.Entities.Customer;
import com.EventManagement.Entities.Events;
import com.EventManagement.Entities.Manager;
import com.EventManagement.Entities.MediaRequirements;
import com.EventManagement.Entities.Venue;
import com.EventManagement.service.CustomerServices;
import com.EventManagement.service.EventsServices;
import com.EventManagement.service.ManagerServices;
import com.EventManagement.service.MediaRequirementsServices;
import com.EventManagement.service.VenueServices;

@Controller
@RestController
@RequestMapping("/Events")
public class EventsController {

    @Autowired
    private EventsServices eventService;

    @PostMapping("/add")
	public ResponseEntity<Events>addEvents(@RequestBody Events events) 
    {
		return new ResponseEntity<Events>( eventService.addEvents(events),HttpStatus.CREATED);
	}

    @GetMapping("/getAll")
	public ResponseEntity<List<Events>> getAllEvents() 
    {
		return new ResponseEntity<List<Events>>( eventService.getAllEvents(),HttpStatus.OK);
	}

    @GetMapping("/get/{eventId}")
	public ResponseEntity<Events>  getEventsById(@PathVariable Long eventId) {
		return new ResponseEntity<Events>( eventService.getEventsById(eventId), HttpStatus.OK);
	}

    @PutMapping("/update/{eventId}")
	public ResponseEntity<Events>  updateEvents(@PathVariable Long eventId, @RequestBody Events events) {
		return new ResponseEntity<Events>( eventService.updateEvents(eventId, events),HttpStatus.OK);
	}
    
    @DeleteMapping("/delete/{eventId}")
	public void deleteEventsById(@PathVariable Long eventId)
    {
		eventService.deleteEventsById(eventId);
	}
    
    @DeleteMapping("/deleteAll")
	public void deleteAllEvents() 
    {
		eventService.deleteAllEvents();
	}
    
   
//    @Autowired
//    private ManagerServices managerService; // Assuming you have a ManagerService
//    @Autowired
//    private CustomerServices customerService; // Assuming you have a CustomerService
//    // Other autowired services
//    
//    @Autowired
//    private MediaRequirementsServices mediaService;
//    
//    @Autowired
//    private VenueServices venueService;
//    
//    @GetMapping("/showBookEventForm")
//    public String showBookEventForm(Model model) 
//    {
//    	//create model attribute to bind form data
//    	Events events=new Events();
//        model.addAttribute("Events", events);
//        return "bookEventForm";
//    }
//    
//    @PostMapping("/addEvents")
//    public String addEvents(@ModelAttribute("events") Events events) 
//    {
//        eventService.addEvents(events);
//        return "venueSelectionForm";
//}
////    @PostMapping("/add")
////    public String addEvent(@ModelAttribute("event") Events event,
////                           @RequestParam("managerId") Long managerId,
////                           @RequestParam("customerId") Long customerId,
////                           @RequestParam("mediaId") Long mediaId,
////                           @RequestParam("venueId") Long venueId) {
////        
////        // Retrieve manager, customer, media, and venue objects based on their IDs
////        Manager manager = managerService.findById(managerId);
////        Customer customer = customerService.FindById(customerId);
////        MediaRequirements media = mediaService.FindById(mediaId);
////        Venue venue = venueService.FindById(venueId);
////        
////        // Set the retrieved objects in the event
////        event.setManager(manager);
////        event.setCustomer(customer);
////        event.setMediaRequirements(media);//(media);
////        event.setVenue(venue);
////        
////        // Save the event
////        eventService.addEvents(event);
////        
////        return "venueSelectionForm"; // Redirect to a page showing event list
////    }
    
    
}