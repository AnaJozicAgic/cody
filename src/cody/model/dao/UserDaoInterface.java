package cody.model.dao;

import java.sql.SQLException;
import cody.model.dto.User;

public interface UserDaoInterface {
	public boolean addUser(User user)throws SQLException;
	public User readUser(String username, String password)throws SQLException;
	public boolean deleteUser(String username)throws SQLException;
}
