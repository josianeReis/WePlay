
package br.com.weplay.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.weplay.dao.UserDao;

public class ManagerFactory {

	private static UserDao	userDaoInstance;
	
	private ManagerFactory() {

	}

	private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnit";

	private static EntityManagerFactory entityManagerFactoryInstance;

	public static EntityManagerFactory entityManagerFactorInstance() {

		if (entityManagerFactoryInstance == null) {
			entityManagerFactoryInstance = Persistence
			.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}

		return entityManagerFactoryInstance;
	}
	
	/*************************************************************************************
	 * User
	 *************************************************************************************/

	public static UserDao  userInstance() {

		if (userDaoInstance == null) {
			userDaoInstance = new UserDao();
		}

		return userDaoInstance;
	}
}
