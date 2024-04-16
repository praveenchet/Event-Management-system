package com.EventManagement.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String dob;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String contactDetails;
	
	@Column(nullable = false)
	private String wageType;
	
	@Column(nullable = false)
	private double wageRate;
	
	@Column(nullable = false)
	private String department;
	
	@Column(nullable = false)
	private String address;

	@JsonIgnoreProperties
	@ManyToOne( cascade = CascadeType.ALL)
	@JoinColumn(name = "managerId", referencedColumnName = "managerId")
	private Manager manager;
	
	
	public Employee() 
	{
		super();
		
	}

	

	public Employee(String name, String dob, String email, String contactDetails, String wageType, double wageRate,
			String department, String address, Manager manager) {
		super();
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.contactDetails = contactDetails;
		this.wageType = wageType;
		this.wageRate = wageRate;
		this.department = department;
		this.address = address;
		this.manager = manager;
	}



	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDob()
	{
		return dob;
	}

	public void setDob(String dob) 
	{
		this.dob = dob;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactDetails()
	{
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) 
	{
		this.contactDetails = contactDetails;
	}


	public String getWageType() 
	{
		return wageType;
	}

	public void setWageType(String wageType) 
	{
		this.wageType = wageType;
	}

	public double getWageRate() 
	{
		return wageRate;
	}

	public void setWageRate(double wageRate) 
	{
		this.wageRate = wageRate;
	}


	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public Long getEmpId() {
		return empId;
	}



	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	
}
