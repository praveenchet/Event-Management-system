package com.EventManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.EventManagement.serviceimplementation.MenuServicesImplementation;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class} )
public class EventManagementApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(EventManagementApplication.class, args);
		
		MenuServicesImplementation menu = new MenuServicesImplementation();
		
		int trueCount=menu.countTrueValues();
		
		trueCount=trueCount*20;
		
		System.out.println("Whole Dish Price ::"+trueCount);
	}
}
