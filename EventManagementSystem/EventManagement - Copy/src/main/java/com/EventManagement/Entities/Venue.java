package com.EventManagement.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Venue")
public class Venue
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long venueId;

	@Column(nullable = false)
    private String name;
    
	@Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private int maxCapacity;

    @Column(nullable = false)
    private String description;
    
    @Column(nullable = false)
    private String category;
    
    @Column(nullable = false)
    private String contactInfo;

    @Column(nullable = false)
    private double venuecost;
    
 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="venueId" , referencedColumnName = "venueId")
    private Events events;
	
	public Venue()
	{
		super();
		
	}

	public Venue(String name, String address, int maxCapacity, String description, String category,
			String contactInfo, double venuecost ) 
	{
		super();
		this.name = name;
		this.address = address;
		this.maxCapacity = maxCapacity;
		this.description = description;
		this.category = category;
		this.contactInfo = contactInfo;
		this.venuecost = venuecost;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public double getVenuecost() {
		return venuecost;
	}

	public void setVenuecost(double venuecost) {
		this.venuecost = venuecost;
	}

    
}
