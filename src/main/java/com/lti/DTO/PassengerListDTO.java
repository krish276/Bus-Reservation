package com.lti.DTO;

import java.sql.Date;

public class PassengerListDTO {

	private Passengers[] passengers;
	private int tripID;
	private String journeyDate;
	
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public Passengers[] getPassengers() {
		return passengers;
	}
	public void setPassengers(Passengers[] passengers) {
		this.passengers = passengers;
	}
	public int getTripID() {
		return tripID;
	}
	public void setTripID(int tripID) {
		this.tripID = tripID;
	}
	
}
