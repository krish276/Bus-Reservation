package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class GenericDao {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public <E> void add(E obj) {
		em.merge(obj);
	}
}
