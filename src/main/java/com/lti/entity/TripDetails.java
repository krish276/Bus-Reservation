package com.lti.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TRIP_DETAILS")
public class TripDetails {

	@Id
	@Column(name="TRIP_ID")
	@GeneratedValue
	private int tripId;
	
	@OneToOne
	@JoinColumn(name="BUS_ID")
	private BusDetails bus;
	
	@ManyToOne
	@JoinColumn(name="ROUTE_ID")
	private RouteDetails route;
	
	@ManyToOne
	@JoinColumn(name="FREQ_ID")
	private WeeklyFrequency weeklyFrequency;
	
	@Column(name="DEPARTURE_TIME")
	private  LocalTime departureTime;
	
	@Column(name="ARRIVAL_TIME")
	private  LocalTime arrivalTime;
	
	@Column(name="SEATS_FREE")
	private int seatsFree;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "tripID")
	private List<SeatDetails> seatDetails;

	public List<SeatDetails> getSeatDetails() {
		return seatDetails;
	}

	public void setSeatDetails(List<SeatDetails> seatDetails) {
		this.seatDetails = seatDetails;
	}

	public int getTripId() {
		return tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}



	@Override
	public String toString() {
		return "TripDetails [tripId=" + tripId + ", bus=" + bus + ", route=" + route + ", weeklyFrequency="
				+ weeklyFrequency + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", seatsFree="
				+ seatsFree + "]";
	}

	public BusDetails getBus() {
		return bus;
	}

	public void setBus(BusDetails bus) {
		this.bus = bus;
	}

	public RouteDetails getRoute() {
		return route;
	}

	public void setRoute(RouteDetails route) {
		this.route = route;
	}

	public WeeklyFrequency getWeeklyFrequency() {
		return weeklyFrequency;
	}

	public void setWeeklyFrequency(WeeklyFrequency weeklyFrequency) {
		this.weeklyFrequency = weeklyFrequency;
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
	
	
	
}
