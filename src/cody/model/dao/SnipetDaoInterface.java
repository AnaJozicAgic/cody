package cody.model.dao;

import java.sql.SQLException;
import cody.model.dto.Snipet;

public interface SnipetDaoInterface {
	
	public boolean addSnipet(Snipet snipet) throws SQLException;

	public Snipet readSnipet(String username, int snipetId) throws SQLException;

	public boolean updateSnipet(Snipet snipet) throws SQLException;

	public boolean deleteSnipet(int snipetId) throws SQLException;

}
