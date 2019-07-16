package com.lti.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;

@Service
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
	public void addCustomer(Customer c) {
		boolean em=fetchCustomerByEmail(c.getEmail());
		boolean ph=fetchCustomerByPhone_No(c.getPhone_no());
		System.out.println(c.getEmail());
		if((em==true)&&(ph==true))
			customerDao.addCustomer(c);
	}

	public boolean fetchCustomerByEmail(String email) {
		
		 if(customerDao.fetchByCustomerEmail(email)==null){
			 return true;// true means email doesnt exist in db
		 }
		 return false;
	}
	public boolean fetchCustomerByPhone_No(double phone_No) {
		
		if( customerDao.fetchByCustomerPhone_No(phone_No)==null) {
			return true;
		}
		return false;
	}
	
}
