package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ROUTE_DETAILS")
public class RouteDetails {

	@Id
	@GeneratedValue
	@Column(name="ROUTE_ID")
	private int routeId;
	
	@Column(name="SOURCE")
	private String source;
	
	@Column(name="DESTINATION")
	private String destination;
	
	
	@Column(name="DISTANCE")
	private String distance;
	
	
	@Column(name="DURATION")
	private String duration;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "route")
	private List<TripDetails> tripDetails;


	
	@Override
	public String toString() {
		return "RouteDetails [routeId=" + routeId + ", source=" + source + ", destination=" + destination
				+ ", distance=" + distance + ", duration=" + duration + "]";
	}


	public List<TripDetails> getTripDetails() {
		return tripDetails;
	}


	public void setTripDetails(List<TripDetails> tripDetails) {
		this.tripDetails = tripDetails;
	}


	public int getRouteId() {
		return routeId;
	}


	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getDistance() {
		return distance;
	}


	public void setDistance(String distance) {
		this.distance = distance;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}

	
	
}
