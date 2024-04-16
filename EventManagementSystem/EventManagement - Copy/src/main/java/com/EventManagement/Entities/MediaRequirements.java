package com.EventManagement.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="MediaRequirements")
public class MediaRequirements 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mediaId;
	
	@Column(nullable = false)
	private boolean photography;
	
	@Column(nullable = false)
	private boolean videography ;
	
	@Column(nullable = false)
	private boolean album;
	
	@Column(nullable = false)
	private boolean drone;
	
	@Column(nullable = false)
	private boolean crane ;
	
	@JsonIgnoreProperties
	@ManyToOne( cascade = CascadeType.ALL)
	@JoinColumn(name = "studioId", referencedColumnName = "studioId")
    private Studios studios ;

	@JsonIgnore
	@OneToOne(mappedBy = "mediaRequirements" , cascade = CascadeType.ALL)
	private Events Events;
	
	
	public MediaRequirements() 
	{
		super();
		
	}

	

	public MediaRequirements(boolean photography, boolean videography, boolean album, boolean drone, boolean crane,
			Studios studios, com.EventManagement.Entities.Events events) {
		super();
		this.photography = photography;
		this.videography = videography;
		this.album = album;
		this.drone = drone;
		this.crane = crane;
		this.studios = studios;
		Events = events;
	}



	public boolean isPhotography() 
	{
		return photography;
	}

	public void setPhotography(boolean photography)
	{
		this.photography = photography;
	}

	public boolean isVideography()
	{
		return videography;
	}

	public void setVideography(boolean videography) 
	{
		this.videography = videography;
	}

	public boolean isAlbum() 
	{
		return album;
	}

	public void setAlbum(boolean album)
	{
		this.album = album;
	}

	public boolean isDrone() 
	{
		return drone;
	}

	public void setDrone(boolean drone)
	{
		this.drone = drone;
	}

	public boolean isCrane()
	{
		return crane;
	}

	public void setCrane(boolean crane)
	{
		this.crane = crane;
	}

	public Studios getStudios() {
		return studios;
	}

	public void setStudios(Studios studios) {
		this.studios = studios;
	}



	public Long getMediaId() {
		return mediaId;
	}



	public void setMediaId(Long mediaId) {
		this.mediaId = mediaId;
	}



	public Events getEvents() {
		return Events;
	}



	public void setEvents(Events events) {
		Events = events;
	}

	
}

 