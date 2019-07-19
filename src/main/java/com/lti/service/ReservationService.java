package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.DTO.PassengerListDTO;
import com.lti.dao.DaoInterface;
import com.lti.entity.TripDetails;

@Service
public class ReservationService {

	@Autowired
	private DaoInterface dao;
	public void makeReservation(PassengerListDTO passengers) {
		 int noOfPassengers=passengers.getPassengers().length;
		 TripDetails td=dao.fetchByIdfromDatabase(TripDetails.class,passengers.getTripID());
		 
		 if(noOfPassengers<td.getSeatsFree()) {
			 
		 }
	}
	
}
