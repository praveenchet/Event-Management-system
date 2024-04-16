package com.EventManagement.Entities;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="Customer")
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long custId;
	
	@Column (nullable = false)
 	private String name;
	
	@Column (nullable = false)
	private int age;
	
	@Column(nullable = false)
	private String contactDetails;

	@Column
	private String username;
	
	@Column(nullable = false)
	private String emailAddress;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String confirmPassword;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Events> events;
	

	
	public Customer() 
	{
		super();
		
	}

	




	public Customer(String name, int age, String contactDetails, String username, String emailAddress, String address,
			String password, String confirmPassword, List<Events> events) {
		super();
		this.name = name;
		this.age = age;
		this.contactDetails = contactDetails;
		this.username = username;
		this.emailAddress = emailAddress;
		this.address = address;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.events = events;
	}






	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getContactDetails()
	{
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) 
	{
		this.contactDetails = contactDetails;
	}

	public String getEmailAddress()
	{
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) 
	{
		this.emailAddress = emailAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}



	public Long getCustId() {
		return custId;
	}



	public void setCustId(Long custId) {
		this.custId = custId;
	}



	public List<Events> getEvents() {
		return events;
	}



	public void setEvents(List<Events> events) {
		this.events = events;
	}






	public String getUsername() {
		return username;
	}






	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
