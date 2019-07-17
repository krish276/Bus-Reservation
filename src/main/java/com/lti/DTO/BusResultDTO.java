package com.lti.DTO;

import java.time.LocalTime;

import com.lti.entity.TransportCompany;

public class BusResultDTO {

	private int tripId;
	private  LocalTime departureTime;
	private  LocalTime arrivalTime;
	private int seatsFree;
	private String busType;
	private String transportCompanyName;
	
	@Override
	public String toString() {
		return "BusResultDTO [tripId=" + tripId + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", seatsFree=" + seatsFree + ", busType=" + busType + ", transportCompanyName=" + transportCompanyName
				+ "]";
	}
	public int getTripId() {
		return tripId;
	}
	public void setTripId(int tripId) {
		this.tripId = tripId;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	public LocalTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getSeatsFree() {
		return seatsFree;
	}
	public void setSeatsFree(int seatsFree) {
		this.seatsFree = seatsFree;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getTransportCompanyName() {
		return transportCompanyName;
	}
	public void setTransportCompanyName(String transportCompanyName) {
		this.transportCompanyName = transportCompanyName;
	}
}
