package cody.model.bo;

import cody.model.bo.validate.ValidateException;
import cody.model.dto.Account;

public interface UserBoInterface {

	public boolean addUser(Account user) throws ValidateException;

	public Account readUser(String username, String password) throws ValidateException;

	public boolean userExists(String username) throws ValidateException;

	public boolean deleteUser(String username) throws ValidateException;

}
