package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Customer;

@Repository
public class CustomerDao extends GenericDao{
	
	@PersistenceContext
	EntityManager em;
	public Customer fetchByCustomerId(int customer_id) {
		return (Customer) em.createQuery("select c from Customer c where c.id = :id").setParameter("id", customer_id).getSingleResult();
	}
	
	public Customer fetchByCustomerEmail(String email) {
		return (Customer) em.createQuery("select c from Customer c where c.email = :email").setParameter("email",email).getSingleResult();
	}
	public void addCustomer(Customer c) {
		GenericDao gd = new GenericDao();
		gd.insert(c);
	}
	
}
