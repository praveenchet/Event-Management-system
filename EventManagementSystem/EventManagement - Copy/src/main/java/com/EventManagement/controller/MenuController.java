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

import com.EventManagement.Entities.Menu;
import com.EventManagement.service.MenuServices;

@RestController
@RequestMapping("/Menu")
@Controller
public class MenuController 
{
	@Autowired
	private MenuServices menuServices;

	@PostMapping("/add")
	public ResponseEntity<Menu>  addMenu(@RequestBody Menu menu)
	{
		return new ResponseEntity<Menu>( menuServices.addMenu(menu),HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Menu>>  getAllMenu() 
	{
		return new ResponseEntity<List<Menu>>( menuServices.getAllMenu(),HttpStatus.OK);
	}

	@GetMapping("/get/{menuId}")
	public ResponseEntity<Menu>  getMenuById(@PathVariable Long menuId)
	{
		return new ResponseEntity<Menu>( menuServices.getMenuById(menuId),HttpStatus.OK);
	}

	@PutMapping("/update/{menuId}")
	public ResponseEntity<Menu>  updateMenu(@PathVariable Long menuId,@RequestBody Menu menu) 
	{
		return new ResponseEntity<Menu>( menuServices.updateMenu(menuId, menu),HttpStatus.OK);
	}

	@DeleteMapping("/delete/{menuId}")
	public void deleteMenuById(@PathVariable Long menuId)
	{
		menuServices.deleteMenuById(menuId);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAllMenu() 
	{
		menuServices.deleteAllMenu();
	}

	@GetMapping("/totalDishes")
	public int countTrueValues() 
	{
		return menuServices.countTrueValues();
	}

	
}
