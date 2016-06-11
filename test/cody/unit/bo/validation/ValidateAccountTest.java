package cody.unit.bo.validation;

import org.junit.Before;
import org.junit.Test;

import cody.model.bo.validate.ValidateAccount;
import cody.model.bo.validate.ValidateException;
import cody.model.dto.Account;
import cody.unit.bo.UnitTestDataHelper;

public class ValidateAccountTest {

	ValidateAccount valid;

	UnitTestDataHelper data;

	@Before
	public void setUp() {
		valid = new ValidateAccount();
		data = new UnitTestDataHelper();
	}

	@Test(expected = ValidateException.class)
	public void isValidTrebaBacitValidateExceptionZaUsername() throws ValidateException {
		Account acc = data.getAccountNotValidUsername();
		valid.isValid(acc);
	
	}

	@Test(expected = ValidateException.class)
	public void isValidTrebaBacitValidateExceptionZaPassword() throws ValidateException {
		Account acc = data.getAccountNotValidPassword();
		
		valid.isValid(acc);
	}

	@Test(expected = ValidateException.class)
	public void isValidTrebaBacitValidateExceptionZaName() throws ValidateException {
		Account acc = data.getAccountNotValidName();
		valid.isValid(acc);
	}

	@Test(expected = ValidateException.class)
	public void isValidTrebaBacitValidateExceptionZaSecondName() throws ValidateException {
		Account acc = data.getAccountNotValidSecondname();
		valid.isValid(acc);
	}

	@Test(expected = ValidateException.class)
	public void isValidTrebaBacitValidateExceptionZaEmail() throws ValidateException {
		Account acc = data.getAccountNotValidEmail();
		valid.isValid(acc);
	}
}
