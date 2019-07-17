package com.lti.dao;

	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;
	import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.lti.entity.Customer;

	@Repository
	public class CustomerDao {
		
		@PersistenceContext
		EntityManager em;
		public Customer fetchByCustomerId(String email,double phone_No) {
			return (Customer) em.createQuery("select c from Customer c where c.email = :em and c.phone_No = :ph").setParameter("em", email).setParameter("ph", phone_No).getResultList();
		}
		public Customer fetchByCustomerEmail(String email) {
			return (Customer) em.createQuery("select c from Customer c where c.email = :email").setParameter("email",email).getSingleResult();
		}
		public Customer fetchByCustomerPhone_No(double phone_No) {
			return (Customer) em.createQuery("select c from Customer c where c.phone_No = :phone_No").setParameter("phone_No",phone_No).getSingleResult();
		}
		public void addCustomer(Customer c) {
			GenericDao gd = new GenericDao();
			gd.insertToDatabase(c);
		}
		
}
