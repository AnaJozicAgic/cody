package cody.integration.model.crudTest;

import cody.model.dto.Account;
import cody.model.dto.Snipet;

public class CrudTestHelper {

	public static final String SNIPET_TEXT = "Snipet simple text . ovo je place holder! ";
	public static final String TEST_USERNAME = "testUsername";
	public static final String NOVI_EMAIL = "noviEmail";
	
	public Account getAccountTest1Object(){
		
		Account acc = new Account();
		acc.setName("testName");
		acc.setSecondName("testSecondName");
		acc.setUsername("testUsername");
		acc.setPassword("testPassword");
		acc.setEmail("testEmail");
		
		return acc;
	}
	
	public Account getAccountTest2Object(){
		
		Account acc2 = new Account();
		acc2.setName("testName2");
		acc2.setSecondName("testSecondName2");
		acc2.setUsername("testUsername2");
		acc2.setPassword("testPassword2");
		acc2.setEmail("testEmail2");
		
		return acc2;
	}
	
	
	public Snipet getSnipetTestObject(){
		Snipet snip = new Snipet();
		snip.setTextSnipet(SNIPET_TEXT);
		snip.setUsernameId(TEST_USERNAME);
		return snip;
	}
	
	
}
