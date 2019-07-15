package com.lti.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;

public class CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
	public void addCustomer(Customer c) {
		customerDao.addCustomer(c);
		
	}
	
}
