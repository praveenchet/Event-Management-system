package com.EventManagement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.EventManagement.Entities.Menu;

@Component
public interface MenuServices 
{
	Menu  addMenu(Menu  menu );
	
	List<Menu> getAllMenu();
	
	Menu  getMenuById(Long menuId);
	
	Menu updateMenu(Long menuId , Menu  menu );
	
	void deleteMenuById(Long menuId );
	
	void deleteAllMenu();
	
	boolean isMenuExists(Long menuId);
	
	int countTrueValues();
	
	
}