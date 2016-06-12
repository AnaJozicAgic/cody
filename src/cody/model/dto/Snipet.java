package cody.model.dto;

import java.io.Serializable;

public class Snipet implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int snipetId;
	private String name;
	private String textSnipet;
	private String usernameId;
	

	public int getSnipetId() {
		return snipetId;
	}

	public void setSnipetId(int snipetId) {
		this.snipetId = snipetId;
	}

	public String getTextSnipet() {
		return textSnipet;
	}

	public void setTextSnipet(String textSnipet) {
		this.textSnipet = textSnipet;
	}

	public String getUsernameId() {
		return usernameId;
	}

	public void setUsernameId(String usernameId) {
		this.usernameId = usernameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + snipetId;
		result = prime * result + ((textSnipet == null) ? 0 : textSnipet.hashCode());
		result = prime * result + ((usernameId == null) ? 0 : usernameId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snipet other = (Snipet) obj;
		if (snipetId != other.snipetId)
			return false;
		if (textSnipet == null) {
			if (other.textSnipet != null)
				return false;
		} else if (!textSnipet.equals(other.textSnipet))
			return false;
		if (usernameId == null) {
			if (other.usernameId != null)
				return false;
		} else if (!usernameId.equals(other.usernameId))
			return false;
		return true;
	}

	

	
}
