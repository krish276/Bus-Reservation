package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		Query q= em.createQuery("select o from "+ classname.getName()+" o");
		List <E> list=q.getResultList();
		return list;
	}
}
