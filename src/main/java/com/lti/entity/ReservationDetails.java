package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="RESERVATION_DETAILS")
public class ReservationDetails {

	@Id
	@GeneratedValue
	@Column(name="RESRV_ID")
	private int resrvID;
	
	@OneToOne
	@JoinColumn(name="TRIP_ID")
	private TripDetails trip;
	
	@Column(name="SEATS_RESERVED")
	private int seats;
	
	
	
}
