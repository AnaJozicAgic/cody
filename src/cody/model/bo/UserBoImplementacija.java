package cody.model.bo;

import java.sql.SQLException;

import cody.model.bo.validate.ValidateAccount;
import cody.model.bo.validate.ValidateException;
import cody.model.dao.AccountDao;
import cody.model.dto.Account;

public class UserBoImplementacija implements UserBoInterface{

	private AccountDao accDao = new AccountDao();
	private ValidateAccount valid = new ValidateAccount();
	
	@Override
	public boolean addUser(Account user) throws ValidateException {
		if(valid.isValid(user)){
			
			if(userExists(user.getUsername())){
				throw new ValidateException("Taj username vec postoji");
			}
			
			try {
				accDao.create(user);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return true;
	}

	@Override
	public Account readUser(String username, String password) {
		Account readAccount = null;
		try {
			readAccount = accDao.read(username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return readAccount;
	}

	@Override
	public boolean userExists(String username) {
		try {
			if(accDao.read(username) == null)
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteUser(String username) {
		try {
			accDao.delete(username);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
