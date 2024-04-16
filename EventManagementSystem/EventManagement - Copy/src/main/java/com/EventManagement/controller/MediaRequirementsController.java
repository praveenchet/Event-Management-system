package com.EventManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EventManagement.Entities.MediaRequirements;
import com.EventManagement.service.MediaRequirementsServices;

@RestController
@RequestMapping("/MediaRequirements")
@Controller
public class MediaRequirementsController
{
	@Autowired
	private MediaRequirementsServices mediaServices;

	@PostMapping("/add")
	public ResponseEntity<MediaRequirements> addUser(@RequestBody MediaRequirements mediaRequirements)
	{
		return new ResponseEntity<MediaRequirements>( mediaServices.addUser(mediaRequirements), HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<MediaRequirements>>  getAllUsers() 
	{
		return new ResponseEntity<List<MediaRequirements>>( mediaServices.getAllUsers() ,HttpStatus.OK);
	}

	@GetMapping("/get/{mediaId}")
	public ResponseEntity<MediaRequirements>  getUserById(@PathVariable Long mediaId) 
	{
		return new ResponseEntity<MediaRequirements>( mediaServices.getUserById(mediaId), HttpStatus.OK);
	}

	@PutMapping("/update/{mediaId}")
	public ResponseEntity<MediaRequirements>  updateUser(@PathVariable Long mediaId,@RequestBody MediaRequirements mediaRequirements) 
	{
		return new ResponseEntity<MediaRequirements>( mediaServices.updateUser(mediaId, mediaRequirements), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{mediaId}")
	public void deleteUserById(@PathVariable Long mediaId) 
	{
		mediaServices.deleteUserById(mediaId);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAllUser() 
	{
		mediaServices.deleteAllUser();
	}
	
	
}
