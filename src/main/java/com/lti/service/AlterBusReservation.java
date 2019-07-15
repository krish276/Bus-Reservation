package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lti.BusReservationApplication;
import com.lti.dao.GenericDao;
import com.lti.entity.TransportCompany;

public class AlterBusReservation {

	@Autowired
	private GenericDao genericDao;
	
	@Transactional
	public void addBus(BusReservationApplication bsa) {
		TransportCompany tc = new TransportCompany();
		tc.setCompanyName("MakeMyTrip");
		genericDao.add(tc);
}

	public TransportCompany fetch(int id) {
		TransportCompany tc= new TransportCompany(); 
	
		tc.setCompanyID(tc.getCompanyID());;
	
		return tc;
		
	}
}
