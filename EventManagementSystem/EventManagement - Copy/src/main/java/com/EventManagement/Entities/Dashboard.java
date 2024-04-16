package com.EventManagement.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Dashboard")
public class Dashboard 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dashId;
	
}
