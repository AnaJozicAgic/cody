package cody.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cody.model.dao.abstractCrud.Create;
import cody.model.dao.abstractCrud.Delete;
import cody.model.dao.abstractCrud.Read;
import cody.model.dao.abstractCrud.Update;
import cody.model.dto.Snipet;
import cody.util.ConnectionManager;

public class SnipetDao implements Create<Snipet>, Read<Snipet, Integer>, Update<Snipet, Integer>, Delete<Integer>{

	Connection connection = ConnectionManager.getInstance().getConnection();
	
	@Override
	public void create(Snipet type) throws SQLException {

		String insertValuesQuery = "insert into snipet (textsnipet, idusername) values (?,?)";

		PreparedStatement statement = connection.prepareStatement(insertValuesQuery);

		statement.setString(1, type.getTextSnipet());
		statement.setString(2, type.getUsernameId());

		statement.executeUpdate();
	}

	@Override
	public Snipet read(Integer index) throws SQLException {
		Snipet snip = null;

		String query = "select * from snipet where snipetid = ?";

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, index);

		ResultSet res = statement.executeQuery();

		if (res.next()) {
			snip = new Snipet();
			snip.setSnipetId(res.getInt("snipetid"));
			snip.setTextSnipet(res.getString("textsnipet"));
			snip.setUsernameId(res.getString("idusername"));
			res.close();
		}

		return snip;
	}
	
	public Snipet read(String userid) throws SQLException {
		Snipet snip = null;
		
		String query = "select * from snipet where idusername = ?";
		
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, userid);
		
		ResultSet res = statement.executeQuery();
		
		if (res.next()) {
			snip = new Snipet();
			snip.setSnipetId(res.getInt("snipetid"));
			snip.setTextSnipet(res.getString("textsnipet"));
			snip.setUsernameId(res.getString("idusername"));
			res.close();
		}
		
		return snip;
	}

	public List<Snipet> readListOfUsersSnipets(String userID) throws SQLException{
		List<Snipet> listaSnipeta = new ArrayList<>();
		
		String selectAllQuery = "select * from snipet where userid = ?";
		PreparedStatement statement = connection.prepareStatement(selectAllQuery);
		statement.setString(1, userID);
		
		ResultSet res = statement.executeQuery(selectAllQuery);
		
		while (res.next()) {
			Snipet snip = new Snipet();
			snip.setSnipetId(res.getInt("snipetid"));
			snip.setTextSnipet(res.getString("textsnipet"));
			snip.setUsernameId(res.getString("idusername"));
			
			listaSnipeta.add(snip);
		}
		
		
		return listaSnipeta;
	}
	
	@Override
	public void update(Snipet type, Integer index) throws SQLException {
		String updateQuery = "update snipet set textsnipet = ?, idusername = ? where snipetid = ?";
		PreparedStatement statement = connection.prepareStatement(updateQuery);

		statement.setString(1, type.getTextSnipet());
		statement.setString(2, type.getUsernameId());
		
		statement.setInt(3, index);


		statement.executeUpdate();
	}
	

	@Override
	public void delete(Integer index) throws SQLException {
		String deleteQuery = "delete from snipet where snipetid = ? ";
		PreparedStatement statement = connection.prepareStatement(deleteQuery);

		statement.setInt(1, index);

		statement.executeUpdate();
		
	}



}
