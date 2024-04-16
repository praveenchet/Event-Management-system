package com.EventManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.EventManagement.Entities.Venue;
import com.EventManagement.service.VenueServices;


@Controller
@RestController
@RequestMapping("/Venue")
public class VenueController 
{
	@Autowired
	private VenueServices venueServices;
	
	@PostMapping("/add")
	public ResponseEntity<Venue>  addVenue(@RequestBody Venue venue)
	{
		return new ResponseEntity<Venue>( venueServices.addVenue(venue),HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Venue>>  getAllVenue()
	{
		return new ResponseEntity<List<Venue>>( venueServices.getAllVenue(),HttpStatus.OK);
	}

	@GetMapping("/get/{venueId}")
	public ResponseEntity<Venue>  getVenueById(@PathVariable Long venueId)
	{
		return new ResponseEntity<Venue>( venueServices.getVenueById(venueId), HttpStatus.OK);
	}

	@PutMapping("/update/{venueId}")
	public ResponseEntity<Venue>  updateVenue(@PathVariable Long venueId, @RequestBody Venue venue) 
	{
		return new ResponseEntity<Venue>( venueServices.updateVenue(venueId, venue), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{venueId}")
	public void deleteVenueById(@PathVariable Long venueId)
	{
		venueServices.deleteVenueById(venueId);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAllVenue() 
	{
		venueServices.deleteAllVenue();
	}
	

//	@GetMapping("/showVenueList")
//    public String showVenueList(Model model) 
//	{
//        // Fetch all venues from the database
//        List<Venue> venues = venueServices.getAllVenue();
//        
//        // Add venues to the model
//        model.addAttribute("venues", venues);
//        
//        // Return the name of the Thymeleaf template to render
//        return "venueSelectionForm";
//    }
//	
//	
//	@PostMapping("/selectVenue")
//    public String selectVenue(@RequestParam("venueId") Long venueId) {
//        // Logic to handle venue selection
//        // You can redirect to another page or perform other actions
//        return "confirmationPage"; // redirect to confirmation page
//    }
	
	
}
