package com.weplay.utils;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

@SuppressWarnings("unchecked")
public abstract class GenericDao<T, PK> {

	private final EntityManager entityManager;
	private final EntityManagerFactory factory;
	private Class<?> classe;

	public GenericDao(){
		this(ManageFactory.entityManagerFactorInstance());
	}

	public GenericDao(EntityManagerFactory factory){
		this.factory = factory; 
		this.entityManager = this.factory.createEntityManager();
		this.classe = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// CRUD METHODS                                                                                                                                   //
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Object executeQuery(String query, Objects... params){
		Query createQuery = this.entityManager.createQuery(query);
		
		for(int i = 0; i < params.length; i++){
			createQuery.setParameter(i, params[i]);
		}
		return createQuery.getResultList();
	}
	
	public List<T> findAll(){
		return this.entityManager.createQuery(("FROM " + this.classe.getName())).getResultList();
	}
	
	public T findById(PK pk){
		return (T) this.entityManager.find(this.classe, pk);
	}
	
	public void save(T entity){
		try{
			this.beginTransaction();
			this.entityManager.persist(entity);
			this.commit();
		}
		catch(Exception ex){
			this.rollBack();
			throw ex;
		}
	}
	
	public void update(T entity){
		try{
			this.beginTransaction();
			this.entityManager.merge(entity);
			this.commit();
		}
		catch(Exception ex){
			this.rollBack();
			throw ex;
		}
	}

	public void delete(T entity) {
		try {
			this.beginTransaction();
			this.entityManager.remove(entity);
			this.commit();
		} catch (Exception ex) {
			this.rollBack();
			throw ex;
		}
	}
	
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// TRANSACTION METHODS                                                                                                                    //
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private void beginTransaction() {
		this.entityManager.getTransaction().begin();
		
	}
	
	private void commit() {
		this.entityManager.getTransaction().commit();
		
	}
	
	private void rollBack() {
		this.entityManager.getTransaction().rollback();
		
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
