package br.com.internet.test.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.weplay.dao.UserDao;
import br.com.weplay.entity.User;
import br.com.weplay.util.ManagerFactory;

public class UserTest {
	private static final Logger LOGGER = Logger.getLogger(UserTest.class);

	private UserDao userDao = ManagerFactory.userInstance();

	@Test
	public void testFindAll() {
		List<User> users =   this.userDao.findAll();

		LOGGER.info(users);
	}
}
