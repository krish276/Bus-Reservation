package com.lti.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BUS_DAILY_TIME_TABLE")
public class BusTimeTable {

	@Id
	@GeneratedValue
	private int timeID;
	
	@ManyToOne
	@JoinColumn(name="TRIP_ID")
	private TripDetails trip;
	@Column(name="JOURNEY_DATES")
	private Date date;
	@Column(name="SEATS_FREE")
	private int seatsFree;
	
	
	public int getTimeID() {
		return timeID;
	}
	public void setTimeID(int timeID) {
		this.timeID = timeID;
	}
	public TripDetails getTrip() {
		return trip;
	}
	public void setTrip(TripDetails trip) {
		this.trip = trip;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	
	
}
