package cody.model.dao.abstractCrud;

import java.sql.SQLException;

public interface Update<T , K> {

	public void update(T type , K index) throws SQLException;
}
