
package com.weplay.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManageFactory {

	private ManageFactory() {

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
