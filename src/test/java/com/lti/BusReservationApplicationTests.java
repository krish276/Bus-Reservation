package com.lti;

import java.text.ParseException;
import java.time.LocalTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.dao.DaoInterface;
import com.lti.dao.GenericDao;
import com.lti.dao.TransportCompanyDao;
import com.lti.dao.TripDetailsDao;
import com.lti.entity.BusDetails;
import com.lti.entity.RouteDetails;
import com.lti.entity.TransportCompany;
import com.lti.entity.TripDetails;
import com.lti.entity.WeeklyFrequency;

@RunWith(SpringRunner.class)
@DataJpaTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class BusReservationApplicationTests {

	 @Autowired 
	private TransportCompanyDao tcdao;
	 
	 @Autowired
	 private DaoInterface dao;
	 
	 @Autowired
	 private TripDetailsDao tddao;
	 
	@Test
	public void addTranportCompanyTest() {
	
		TransportCompany company = new TransportCompany();
		company.setCompanyName("SRM");
		tcdao.insertNewTransportCompany(company);
	}
	
	@Test
	public void fetchAllTransportCompanyTest() {
	
		for(TransportCompany tc: tcdao.fetchDetailsOfAllTransport())
			System.out.println(tc);
	}
	
	@Test
	public void fetchbyCompnameTest() {
	
			System.out.println(tcdao.fetchByCompanyName("SRM"));
	}
	
	@Test
	public void testtripdetailsInsert() {
		TripDetails td=new TripDetails();
		LocalTime time = LocalTime.of(23,43);
		td.setArrivalTime(time);
		td.setDepartureTime(LocalTime.of(05, 00));
		
		td.setBus(dao.fetchByIdfromDatabase(BusDetails.class,3));
		td.setWeeklyFrequency(dao.fetchByIdfromDatabase(WeeklyFrequency.class,3));
		td.setRoute(dao.fetchByIdfromDatabase(RouteDetails.class,2));
		
		dao.insertToDatabase(td);
	}
	
	@Test
	public void searchTest() throws ParseException {
		
		tddao.busAvailabilitySearch("MUMBAI", "PUNE","10-JUL-2019");
	}
	
	

}
