package cody.model.bo;

import cody.model.dto.Snipet;

public interface SnipetBoInterface {
public boolean snipetExists (int snipetId);
public boolean addSnipet (Snipet snipet);
public Snipet readSnipet(int SnipetId);
public boolean updateSnipet (int SnipetId);
public boolean deleteSnipet(int SnipetId);


}
