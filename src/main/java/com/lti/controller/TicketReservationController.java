package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.DTO.PassengerListDTO;
import com.lti.entity.ReservationDetails;
import com.lti.service.TicketReservationService;


@RestController
public class TicketReservationController {

	@Autowired
	private TicketReservationService reserv;
	@RequestMapping("/ticketReservation")
	public ReservationDetails recievePassengerDetails(@RequestBody PassengerListDTO passengers) {
		
		return reserv.makeReservation(passengers);
		
		
	}
}
