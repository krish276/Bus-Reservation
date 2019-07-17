package com.lti.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.TripDetailsDao;
import com.lti.entity.TripDetails;

@Service
public class BusSearchService {

	@Autowired
	private TripDetailsDao tripDao;
	
	public void busSearch(String source, String destination,String travelDate) {
		try {
			List<TripDetails> busSearchResult= tripDao.busAvailabilitySearch(source, destination, travelDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
