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
import jakarta.persistence.Table;

@Entity
@Table(name="Studios")
public class Studios 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studioId;

	@Column(nullable = false)
    private String name;
	
	@Column(nullable = false)
    private String contactInfo;
	
	@Column(nullable = false)
    private double stdioCost;
	
	@JsonIgnore
	 @OneToMany(mappedBy = "studios", cascade = CascadeType.ALL)
     private List<MediaRequirements> mediaList; 
	

	 
	public Studios()
	{
		super();
		
	}

	

	public Studios(String name, String contactInfo, double stdioCost, List<MediaRequirements> mediaList) {
		super();
		this.name = name;
		this.contactInfo = contactInfo;
		this.stdioCost = stdioCost;
		this.mediaList = mediaList;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public double getStdioCost() {
		return stdioCost;
	}

	public void setStdioCost(double stdioCost) {
		this.stdioCost = stdioCost;
	}

	public List<MediaRequirements> getMediaList() {
		return mediaList;
	}

	public void setMediaList(List<MediaRequirements> mediaList) {
		this.mediaList = mediaList;
	}



	public Long getStudioId() {
		return studioId;
	}



	public void setStudioId(Long studioId) {
		this.studioId = studioId;
	}

	
	
}
