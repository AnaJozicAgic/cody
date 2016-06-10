package cody.model.bo;

import cody.model.dto.Account;

public interface UserBoInterface {

	public boolean addUser(Account user);

	public Account readUser(String username, String password);

	public boolean userExists(String username);

	public boolean deleteUser(String username);

}
