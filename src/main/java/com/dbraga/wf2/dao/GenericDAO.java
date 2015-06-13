package com.dbraga.wf2.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
 

import javax.persistence.EntityManager;
 
 
//@SuppressWarnings("unchecked")
public abstract class GenericDAO<PK, T> {
    
	protected EntityManager manager;
 
    public GenericDAO() {
        this.manager = JPAUtil.getEntityManager();
    }
 
    public T getById(PK pk) {
        return (T) manager.find(getTypeClass(), pk);
    }
 
    public void save(T entity) {
        manager.persist(entity);
    }
 
    public void update(T entity) {
        manager.merge(entity);
    }
 
    public void delete(T entity) {
        manager.remove(entity);
    }
 
    public List<T> findAll() {
        return manager.createQuery(("FROM " + getTypeClass().getName()))
                .getResultList();
    }
 
    private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
        return clazz;
    }
}