package cody.model.dao.abstractCrud;

import java.sql.SQLException;

public interface Read<T , K> {
	public T read(K index) throws SQLException;
}
