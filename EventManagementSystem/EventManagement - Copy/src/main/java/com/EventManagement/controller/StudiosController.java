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

import com.EventManagement.Entities.Studios;
import com.EventManagement.service.StudiosServices;
@Controller
@RestController
@RequestMapping("/Studios")
public class StudiosController
{
	@Autowired
	private StudiosServices studiosServices;

	@PostMapping("/add")
	public ResponseEntity<Studios>  addStudios(@RequestBody Studios Studios)
	{
		return new ResponseEntity<Studios>( studiosServices.addStudios(Studios),HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Studios> > getAllStudios()
	{
		return new ResponseEntity<List<Studios>>( studiosServices.getAllStudios(),HttpStatus.OK);
	}

	@GetMapping("/get/{studioId}")
	public ResponseEntity<Studios>  getStudiosById(@PathVariable Long studioId)
	{
		return new ResponseEntity<Studios>( studiosServices.getStudiosById(studioId), HttpStatus.OK);
	}

	@PutMapping("/update/{studioId}")
	public ResponseEntity<Studios>  updateStudios(@PathVariable Long studioId,@RequestBody Studios Studios) 
	{
		return new ResponseEntity<Studios>( studiosServices.updateStudios(studioId, Studios),HttpStatus.OK);
	}

	@DeleteMapping("/delete/{stdioId}")
	public void deleteStudiosById(Long studioId) 
	{
		studiosServices.deleteStudiosById(studioId);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAllStudios() 
	{
		studiosServices.deleteAllStudios();
	}
	
	
}
