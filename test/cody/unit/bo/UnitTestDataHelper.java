package cody.unit.bo;

import cody.model.dto.Account;

public class UnitTestDataHelper {

	public Account getValidAccount() {
		Account acc = new Account();
		
		acc.setUsername("testUsername");
		acc.setPassword("testPassword");
		acc.setName("testName");
		acc.setSecondName("testSecondName");
		acc.setEmail("testEmail");

		return acc;
	}
	
	public Account getAccountNotValidUsername() {
		Account acc = new Account();
		
		acc.setUsername("vr");
		acc.setPassword("testPassword");
		acc.setName("testName");
		acc.setSecondName("testSecondName");
		acc.setEmail("testEmail");

		return acc;
	}
	public Account getAccountNotValidPassword() {
		Account acc = new Account();
		
		acc.setUsername("testUsername");
		acc.setPassword("sa");
		acc.setName("testName");
		acc.setSecondName("testSecondName");
		acc.setEmail("testEmail");
		
		return acc;
	}
	public Account getAccountNotValidName() {
		Account acc = new Account();
		
		acc.setUsername("testUsername");
		acc.setPassword("testPassword");
		acc.setName("sa");
		acc.setSecondName("testSecondName");
		acc.setEmail("testEmail");
		
		return acc;
	}
	public Account getAccountNotValidSecondname() {
		Account acc = new Account();
		
		acc.setUsername("testUsername");
		acc.setPassword("testPassword");
		acc.setName("testName");
		acc.setSecondName("as");
		acc.setEmail("testEmail");
		
		return acc;
	}
	public Account getAccountNotValidEmail() {
		Account acc = new Account();
		
		acc.setUsername("testUsername");
		acc.setPassword("testPassword");
		acc.setName("testName");
		acc.setSecondName("testSecondName");
		acc.setEmail("");
		
		return acc;
	}
}
