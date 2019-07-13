package com.lti;

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
import com.lti.entity.TransportCompany;

@RunWith(SpringRunner.class)
@DataJpaTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class BusReservationApplicationTests {

	 @Autowired 
	 DaoInterface dao;
	 
	@Test
	public void addTranportCompanyTest() {
	
		TransportCompany company = new TransportCompany();
		company.setCompanyName("SRM");
		dao.insert(company);
	}
	
	@Test
	public void fetchAllTransportCompanyTest() {
	
		for(TransportCompany tc: dao.fetchAll(TransportCompany.class))
			System.out.println(tc);
	}

}
