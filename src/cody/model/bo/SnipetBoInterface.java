package cody.model.bo;

import cody.model.dto.Snipet;

public interface SnipetBoInterface {

	public boolean snipetExists(int snipetId);

	public boolean addSnipet(Snipet snipet);

	public Snipet readSnipet(int snipetId);

	public boolean updateSnipet(Snipet snipet, int snipetId);

	public boolean deleteSnipet(int snipetId);

}
