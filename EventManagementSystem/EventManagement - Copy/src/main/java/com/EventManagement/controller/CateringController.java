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

import com.EventManagement.Entities.Catering;
import com.EventManagement.service.CateringServices;

@Controller
@RestController
@RequestMapping("/Catering")
public class CateringController 
{
	@Autowired
	private CateringServices cateringServices;

	@PostMapping("/add")
	public ResponseEntity<Catering> addCatering(@RequestBody Catering catering) 
	{
		return new ResponseEntity<Catering>(cateringServices.addCatering(catering),HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Catering>> getAllCatering() 
	{
		return new ResponseEntity <List<Catering>>(cateringServices.getAllCatering() ,HttpStatus.OK);
	}

	@GetMapping("/get/{cateringId}")
	public ResponseEntity<Catering>  getCateringById(@PathVariable Long cateringId) 
	{
		return new ResponseEntity<>(cateringServices.getCateringById(cateringId), HttpStatus.OK);
	}

	@PutMapping("/update/{cateringId}")
	public ResponseEntity<Catering>  updateCatering(@PathVariable Long cateringId,@RequestBody Catering catering)
	{
		return new ResponseEntity<Catering>(cateringServices.updateCatering(cateringId, catering),HttpStatus.OK);
	}

	@DeleteMapping("/delete/{cateringId}")
	public void deleteCateringById(@PathVariable Long cateringId) 
	{
		cateringServices.deleteCateringById(cateringId);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAllCatering() 
	{
		cateringServices.deleteAllCatering();
	}
	
	
}
