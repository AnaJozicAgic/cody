package cody.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cody.model.dao.abstractCrud.Create;
import cody.model.dao.abstractCrud.Delete;
import cody.model.dao.abstractCrud.Read;
import cody.model.dao.abstractCrud.Update;
import cody.model.dto.Account;
import cody.util.ConnectionManager;

public class AccountDao implements Create<Account>, Read<Account, String>, Update<Account, String>, Delete<String> {

	Connection connection = ConnectionManager.getInstance().getConnection();

	@Override
	public void create(Account type) throws SQLException {

		String insertValuesQuery = "insert into account (name, secondName,username,password,email) values (?,?,?,?,?)";

		PreparedStatement statement = connection.prepareStatement(insertValuesQuery);

		statement.setString(1, type.getName());
		statement.setString(2, type.getSecondName());
		statement.setString(3, type.getUsername());
		statement.setString(4, type.getPassword());
		statement.setString(5, type.getEmail());

		statement.executeUpdate();
	}

	@Override
	public Account read(String index) throws SQLException {
		Account acc = null;

		String query = "select * from account where username = ?";

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, index);

		ResultSet res = statement.executeQuery();

		if (res.next()) {
			acc = new Account();
			acc.setName(res.getString("name"));
			acc.setSecondName(res.getString("secondName"));
			acc.setUsername(res.getString("username"));
			acc.setPassword(res.getString("password"));
			acc.setEmail(res.getString("email"));
			res.close();
		}

		return acc;
	}
	
	public Account read(String username, String password) throws SQLException {
		Account acc = null;
		
		String query = "select * from account where username = ? and password = ?";
		
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, username);
		statement.setString(2, password);
		
		ResultSet res = statement.executeQuery();
		
		if (res.next()) {
			acc = new Account();
			acc.setName(res.getString("name"));
			acc.setSecondName(res.getString("secondName"));
			acc.setUsername(res.getString("username"));
			acc.setPassword(res.getString("password"));
			acc.setEmail(res.getString("email"));
			res.close();
		}
		
		return acc;
	}

	@Override
	public void update(Account type, String index) throws SQLException {

		String updateQuery = "update account set username = ? , password = ?, name = ?, secondName = ?, email = ? where username = ?";
		PreparedStatement statement = connection.prepareStatement(updateQuery);

		statement.setString(1, type.getUsername());
		statement.setString(2, type.getPassword());
		statement.setString(3, type.getName());
		statement.setString(4, type.getSecondName());
		statement.setString(5, type.getEmail());
		statement.setString(6, index);

		statement.executeUpdate();

	}

	@Override
	public void delete(String index) throws SQLException {

		String deleteQuery = "delete from account where username = ? ";
		PreparedStatement statement = connection.prepareStatement(deleteQuery);

		statement.setString(1, index);

		statement.executeUpdate();
	}

}
