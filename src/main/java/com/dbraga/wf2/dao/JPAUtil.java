package com.dbraga.wf2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManager entityManager;
	
	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("wheelsfortwo");

	public static EntityManager getEntityManager() {
		if(entityManager == null)
			entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
}