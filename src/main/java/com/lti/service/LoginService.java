package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lti.dao.CustomerDao;
import com.lti.dao.DaoInterface;
import com.lti.dao.GenericDao;
import com.lti.entity.Customer;

@Service
public class LoginService {

	@Autowired
	private CustomerDao customerDao;
	
	public boolean validateUser(String email,String password) {
		
		Customer customer= customerDao.fetchByCustomerEmail(email);
		if(customer.getPassword().equals(password)) {
			//suceesfull login
			return true;
		}
		return false;
		
	}
}
