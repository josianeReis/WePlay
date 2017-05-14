package br.com.internet.test.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.internet.dao.ProdutoDao;
import br.com.internet.util.ManagerFactory;
import entity.Produto;

public class ProdutoTest {
	private static final Logger LOGGER = Logger.getLogger(ProdutoTest.class);

	private ProdutoDao produtoDao = ManagerFactory.produtoInstance();

	@Test
	public void testFindAll() {
		List<Produto> produtos =   this.produtoDao.findAll();

		LOGGER.info(produtos);
	}
}
