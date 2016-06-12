package cody.integration.model.crudTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cody.model.dao.AccountDao;
import cody.model.dao.SnipetDao;
import cody.model.dto.Account;
import cody.model.dto.Snipet;
import cody.util.ConnectionManager;

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
		snip2 = help.getSnipetTestObject();
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
	public void readAllSnipetsFromUserSnipetTest() throws SQLException {
		
		accDao.create(acc);
		dao.create(snip);
		dao.create(snip2);
		
		List<Snipet> snipList;
		
		
		snipList = dao.readListOfUsersSnipets(IntegrationTestDataHelper.TEST_USERNAME);
		Snipet snipA = snipList.get(0);
		
		assertEquals(snipA.getName(), snip.getName());
		
	}
	@Test
	public void searchForSnipetsTestSnipetTest() throws SQLException {
		
		accDao.create(acc);
		dao.create(snip);
		dao.create(snip2);
		
		List<Snipet> snipList;
		
		
		snipList = dao.searchForSnipets("Snip");
		Snipet snipA = snipList.get(0);
		
		assertEquals(snipA.getName(), snip.getName());
		
	}
	
	@Test
	public void readLatestSnipetTest() throws SQLException {
		
		accDao.create(acc);
		dao.create(snip);
		dao.create(snip2);
		
		List<Snipet> snipList;
		
		
		snipList = dao.readListOfLastSnipets();
		Snipet snipA = snipList.get(0);
		
		assertEquals(snipA.getName(), snip.getName());
		
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
