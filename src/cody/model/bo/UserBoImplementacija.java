package cody.model.bo;

import cody.model.dto.Account;

public class UserBoImplementacija implements UserBoInterface{

	@Override
	public boolean addUser(Account user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account readUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean userExists(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
