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

import com.EventManagement.Entities.Manager;
import com.EventManagement.service.ManagerServices;
@Controller
@RestController
@RequestMapping("/Manager")
public class ManagerController 
{
	@Autowired
	private ManagerServices managerServices;

	@PostMapping("/add")
	public ResponseEntity<Manager>  addUser(@RequestBody Manager manager)
	{
		return new ResponseEntity<Manager>( managerServices.addUser(manager), HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Manager>> getAllManager()
	{
		return new ResponseEntity<List<Manager>>( managerServices.getAllManager(), HttpStatus.OK);
	}

	@GetMapping("/get/{managerId}")
	public ResponseEntity<Manager>  getManagerById(@PathVariable Long managerId)
	{
		return new ResponseEntity<Manager>( managerServices.getManagerById(managerId), HttpStatus.OK);
	}

	@PutMapping("/update/{managerId}")
	public ResponseEntity<Manager> updateManager(@PathVariable Long managerId,@RequestBody Manager manager)
	{
		return new ResponseEntity<Manager>( managerServices.updateManager(managerId, manager),HttpStatus.OK);
	}

	@DeleteMapping("/delete/{managerId}")
	public void deleteManagerById(@PathVariable Long managerId)
	{
		managerServices.deleteManagerById(managerId);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAllManager()
	{
		managerServices.deleteAllManager();
	}
	
	
}
