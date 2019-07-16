package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Customer;

@Repository
public class CustomerDao {
	
	@PersistenceContext
	EntityManager em;
	public Customer fetchByCustomerId(int customer_id) {
		return (Customer) em.createQuery("select c from Customer c where c.id = :id").setParameter("id", customer_id).getSingleResult();
	}
	
	public Customer fetchByCustomerEmail(String email) {
		return (Customer) em.createQuery("select c from Customer c where c.email = :email").setParameter("email",email).getSingleResult();
	}
	public Customer fetchByCustomerPhone_No(double phone_No) {
		return (Customer) em.createQuery("select c from Customer c where c.phone_No = :phone_No").setParameter("phone_No",phone_No).getSingleResult();
	} 
	public void addCustomer(Customer c) {
		System.out.println(c.getEmail());
		em.merge(c);
		
	}
	
}
