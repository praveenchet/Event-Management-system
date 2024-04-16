package com.EventManagement.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Manager")
public class Manager
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long managerId;
	
	@Column(nullable = false)
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "manager" ,cascade = CascadeType.ALL)
    private List<Employee> employee;
	
	@JsonIgnore
	@OneToMany(mappedBy = "manager",cascade = CascadeType.ALL)
	private List<Events> events;
	
	

	public Manager()
	{
		super();
		
	}
	

	public Manager(String name, List<Employee> employee, List<Events> events) {
		super();
		this.name = name;
		this.employee = employee;
		this.events = events;
	}


	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}


	public List<Events> getEvents() {
		return events;
	}


	public void setEvents(List<Events> events) {
		this.events = events;
	}
	
}
