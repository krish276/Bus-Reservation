package com.lti.dao;

import java.util.List;

public interface DaoInterface {

	public <E> void insert(E obj);
	public <E> List<E> fetchAll(Class<E> classname);
}
