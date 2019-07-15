package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.lti.entity.Customer;

public class CustomerDao extends GenericDao{
	
	@PersistenceContext
	EntityManager em;
	public Customer fetchByCustomerId(Customer c,int customer_id) {
		return (Customer) em.createQuery("select c from Customer c where c.id = :id").setParameter("id", customer_id).getSingleResult();
	}
	public void addCustomer(Customer c) {
		GenericDao gd = new GenericDao();
		gd.insert(c);
	}
	
}
