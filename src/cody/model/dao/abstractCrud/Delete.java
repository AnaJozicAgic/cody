package cody.model.dao.abstractCrud;

import java.sql.SQLException;

public interface Delete<T> {
	public void delete(T index) throws SQLException;

}
