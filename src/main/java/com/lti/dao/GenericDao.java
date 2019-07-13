package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class GenericDao implements DaoInterface{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public <E> void insert(E obj) {
		em.merge(obj);
	}

	@Override
	public <E> List<E> fetchAll(Class<E> classname) {
		
		return (List<E>) em.createQuery("select E from TransportCompany E");
	}
}
