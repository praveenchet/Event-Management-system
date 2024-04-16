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
@Table(name="Events")
public class Events 
{
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long eventId;

	 	@Column(nullable = false)
	    private String name;
	    
	    @Column(length = 30,nullable = false)
	    private String type;

	   // @jakarta.persistence.Temporal(value = TemporalType.DATE)
	   // @Temporal(TemporalType.DATE="yyyy/mm/dd")
	    @Column(nullable = false)
	    private String eventDate;

	    @Column(nullable = false)
	    private int guests;

//	    @Column(nullable = false)
//	    private double totalCost;

	
	    @Column(nullable = false)
	    private String startingTime;

	
	    @Column(nullable = false)
	    private String endingTime;
	    
	  /*  @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name="custId" , referencedColumnName = "custId")
	     private Customer customer;   */
	    
	
	    @ManyToOne
	    @JoinColumn(name = "custId",referencedColumnName = "custId")
	    private Customer customer;
	    
//	    @OneToOne(cascade = CascadeType.ALL)
//	    @JoinColumn(name="mediaId" , referencedColumnName = "mediaId")
//	     private MediaRequirements mediaRequirements; 

	    @JsonIgnore
	    @OneToOne
	    @JoinColumn(name="eventId",referencedColumnName = "eventId")
	    private MediaRequirements mediaRequirements;
	    
	    @JsonIgnore
	    @OneToOne(mappedBy = "events",cascade = CascadeType.ALL)
	     private Venue venue;


	    @OneToOne(mappedBy = "events",cascade = CascadeType.ALL)
	     private Catering catering;
	   
	   @JsonIgnoreProperties
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "managerId" , referencedColumnName = "managerId")
	    private Manager manager;

	    
		public Events()
		{
			super();
			
		}

		

		public Events(String name, String type, String eventDate, int guests, String startingTime, String endingTime,
				Customer customer, MediaRequirements mediaRequirements, Venue venue, Catering catering,
				Manager manager) {
			super();
			this.name = name;
			this.type = type;
			this.eventDate = eventDate;
			this.guests = guests;
			this.startingTime = startingTime;
			this.endingTime = endingTime;
			this.customer = customer;
			this.mediaRequirements = mediaRequirements;
			this.venue = venue;
			this.catering = catering;
			this.manager = manager;
		}



		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getEventDate() {
			return eventDate;
		}

		public void setEventDate(String eventDate) {
			this.eventDate = eventDate;
		}

		public int getGuests() {
			return guests;
		}

		public void setGuests(int guests) {
			this.guests = guests;
		}

//		public double getTotalCost() {
//			return totalCost;
//		}
//
//		public void setTotalCost(double totalCost) {
//			this.totalCost = totalCost;
//		}

		public String getStartingTime() {
			return startingTime;
		}

		public void setStartingTime(String startingTime) {
			this.startingTime = startingTime;
		}

		public String getEndingTime() {
			return endingTime;
		}

		public void setEndingTime(String endingTime) {
			this.endingTime = endingTime;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public MediaRequirements getMediaRequirements() {
			return mediaRequirements;
		}

		public void setMediaRequirements(MediaRequirements mediaRequirements) {
			this.mediaRequirements = mediaRequirements;
		}

		public Venue getVenue() {
			return venue;
		}

		public void setVenue(Venue venue) {
			this.venue = venue;
		}

		public Catering getCatering() {
			return catering;
		}

		public void setCatering(Catering catering) {
			this.catering = catering;
		}

		public Manager getManager() {
			return manager;
		}

		public void setManager(Manager manager) {
			this.manager = manager;
		}



		public Long getEventId() {
			return eventId;
		}



		public void setEventId(Long eventId) {
			this.eventId = eventId;
		}

		
		
}

