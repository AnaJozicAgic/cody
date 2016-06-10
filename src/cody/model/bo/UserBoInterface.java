package cody.model.bo;

import cody.model.dto.User;

public interface UserBoInterface {

	public boolean addUser(User user);

	public User readUser(String username, String password);

	public boolean userExists(String username);

	public boolean deleteUser(String username);

}
