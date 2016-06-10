package cody.model.dao.abstractCrud;

import java.sql.SQLException;

public interface Create<T> {

	public void create(T type) throws SQLException;
}
