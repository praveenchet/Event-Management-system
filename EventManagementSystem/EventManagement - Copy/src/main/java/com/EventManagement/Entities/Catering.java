package com.EventManagement.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Catering")
public class Catering 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cateringId;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String contact;
	
	@Column(nullable = false)
	private String specialty;
	
//	@Column(nullable = false)
//	private int days;
//	
	@Column(nullable = false)
	private Long charges;
	
	@JsonIgnore
	@OneToMany(mappedBy = "catering", cascade = CascadeType.ALL)
    private List<Menu> menus;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cateringId" , referencedColumnName = "cateringId")
	private Events events;
	
	public Catering()
	{
		super();
		
	}

	public Catering(String name, String contact, String specialty, Long charges, List<Menu> menus, Events events) {
		super();
		this.name = name;
		this.contact = contact;
		this.specialty = specialty;
		this.charges = charges;
		this.menus = menus;
		this.events = events;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

//	public int getDays() {
//		return days;
//	}
//
//	public void setDays(int days) {
//		this.days = days;
//	}

	public Long getCharges() {
		return charges;
	}

	public void setCharges(Long charges) {
		this.charges = charges;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Long getCateringId() {
		return cateringId;
	}

	public void setCateringId(Long cateringId) {
		this.cateringId = cateringId;
	}

	public Events getEvents() {
		return events;
	}

	public void setEvents(Events events) {
		this.events = events;
	}

	
}
