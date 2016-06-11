package cody.model.bo;

import java.sql.SQLException;

import cody.model.dao.SnipetDao;
import cody.model.dto.Snipet;

public class SnipetBoImplementacija implements SnipetBoInterface {

	SnipetDao dao = new SnipetDao();

	@Override
	public boolean snipetExists(int snipetId) {
		try {
			if (dao.read(snipetId) == null) {
				return false;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean addSnipet(Snipet snipet) {
		try {
			dao.create(snipet);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Snipet readSnipet(int snipetId) {
		Snipet snip = null;
		try {
			snip = dao.read(snipetId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return snip;
	}

	@Override
	public boolean updateSnipet(Snipet snipet,int snipetId) {
		try {
			dao.update(snipet, snipetId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteSnipet(int snipetId) {
		try {
			dao.delete(snipetId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
