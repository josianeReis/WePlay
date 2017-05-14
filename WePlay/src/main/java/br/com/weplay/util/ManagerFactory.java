
package br.com.weplay.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManagerFactory {

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

}
