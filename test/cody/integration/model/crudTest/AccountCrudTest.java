package cody.integration.model.crudTest;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import cody.model.dao.AccountDao;
import cody.model.dto.Account;
import cody.util.ConnectionManager;

public class AccountCrudTest {

	Connection connection;
	AccountDao dao;
	Account acc;
	Account acc2;
	
	@Before
	public void setUp() throws SQLException{
		dao = new AccountDao();
		
		connection = ConnectionManager.getInstance().getConnection();
		//zabrani autocmit
		connection.setAutoCommit(false);
		
		acc = new CrudTestHelper().getAccountTest1Object();
		acc2 = new CrudTestHelper().getAccountTest2Object();
		
	}
	
	@Test
	public void createReadAccountTest() throws SQLException{
		dao.create(acc);
		Account acctest = dao.read(CrudTestHelper.TEST_USERNAME);
		
		dao.create(acc2);
		String testUsern = "testUsername2";
		
		Account acctest2 = dao.read(testUsern);
		
		assertEquals("testName", acctest.getName());
		assertEquals("testName2", acctest2.getName());

	}

	@Test
	public void updateAccountTest() throws SQLException{
		dao.create(acc);
		Account acctest = dao.read(CrudTestHelper.TEST_USERNAME);
	
		String testEmail = "testEmail";
		String testNoviPassword = "noviPassword";
		
		assertEquals(testEmail, acctest.getEmail() );
		//updejt 
		acctest.setPassword(testNoviPassword);
		acctest.setEmail(CrudTestHelper.NOVI_EMAIL);
		
		dao.update(acctest, CrudTestHelper.TEST_USERNAME);
		
		acctest = dao.read(CrudTestHelper.TEST_USERNAME);
		
		assertEquals(CrudTestHelper.NOVI_EMAIL, acctest.getEmail());
		assertEquals(testNoviPassword, acctest.getPassword());
		
		
		
	}
	@Test
	public void delateAccountTest() throws SQLException{
		dao.create(acc);
		assertEquals(CrudTestHelper.TEST_USERNAME, dao.read(CrudTestHelper.TEST_USERNAME).getUsername());
		
		//obrisi
		dao.delete(CrudTestHelper.TEST_USERNAME);
		
		assertNull(dao.read(CrudTestHelper.TEST_USERNAME));
	}
	@After
	public void tareDown() throws SQLException{
		
		connection.rollback();
		ConnectionManager.getInstance().close();
		
		//nepotrebno
		acc = null;
		acc2 = null;
		dao = null;
		
	}
}
