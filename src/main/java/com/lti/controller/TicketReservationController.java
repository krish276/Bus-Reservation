package com.lti.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.DTO.PassengerListDTO;


@RestController
public class TicketReservationController {

	@RequestMapping("/ticketReservation")
	public void recievePassengerDetails(@RequestBody PassengerListDTO passengers) {
	
		
	}
}
