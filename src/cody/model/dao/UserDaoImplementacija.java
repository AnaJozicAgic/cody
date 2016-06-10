package cody.model.dao;

import java.sql.SQLException;

import cody.model.dto.User;

public class UserDaoImplementacija implements UserDaoInterface{

	@Override
	public boolean addUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User readUser(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(String username) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
