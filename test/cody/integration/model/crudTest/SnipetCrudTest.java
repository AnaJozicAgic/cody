package cody.integration.model.crudTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cody.model.dao.AccountDao;
import cody.model.dao.SnipetDao;
import cody.model.dto.Account;
import cody.model.dto.Snipet;
import cody.util.ConnectionManager;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

public class SnipetCrudTest {

	Snipet snip;
	Snipet snip2;
	Account acc;
	
	SnipetDao dao;
	AccountDao accDao;
	
	Connection connection;
	IntegrationTestDataHelper help;
	
	@Before
	public void setUp() throws SQLException {
		dao = new SnipetDao();
		accDao = new AccountDao();
		help = new IntegrationTestDataHelper();
		
		connection = ConnectionManager.getInstance().getConnection();
		connection.setAutoCommit(false);

		snip = help.getSnipetTestObject();
		acc = help.getAccountTest1Object();
		
	}

	@Test
	public void createAndReadSnipetTest() throws SQLException {
		
		accDao.create(acc);
		dao.create(snip);
		
		Snipet snipRead = dao.read(IntegrationTestDataHelper.TEST_USERNAME);
		
		assertEquals(IntegrationTestDataHelper.SNIPET_TEXT, snipRead.getTextSnipet());
		
	}
	
	@Test
	public void updateSnipetTest() throws SQLException {
		
		accDao.create(acc);
		dao.create(snip);
		
		Snipet snipRead = dao.read(IntegrationTestDataHelper.TEST_USERNAME);
		
		String textSnipetUpdate = "updejtani snipet text neki novi snipet";
		snipRead.setTextSnipet(textSnipetUpdate);
		
		dao.update(snipRead, snipRead.getSnipetId());
		
		snipRead = dao.read(IntegrationTestDataHelper.TEST_USERNAME);
		assertEquals(textSnipetUpdate, snipRead.getTextSnipet());
		
	}
	@Test
	public void delateSnipetTest() throws SQLException{
		accDao.create(acc);
		dao.create(snip);
		
		Snipet snip = dao.read(IntegrationTestDataHelper.TEST_USERNAME);
		
		dao.delete(snip.getSnipetId());
		
		assertNull(dao.read(IntegrationTestDataHelper.TEST_USERNAME));
	}

	@After
	public void tareDown() throws SQLException {
		connection.rollback();
		ConnectionManager.getInstance().close();

	}
}
