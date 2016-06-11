package cody.model.bo;

import cody.model.dto.Snipet;
import cody.model.dto.Account;

public class CheckHelper {

	public static boolean isUserNotNull(Account user) {
		if (user == null) {
			return false;
		}
		return true;
	}

	public static boolean isValidPassword(String password) {
		if ((password.length() < 6) || (password.trim() == "")) {
			return false;
		}
		return true;

	}

	public static boolean isValidUsername(String username) {
		if ((username.length() < 2) || (username.trim() == "") || (username.contains(";"))) {
			return false;
		}
		return true;

	}

	public static boolean isValidUser(Account user) {
		if (isUserNotNull(user) && isValidPassword(user.getPassword()) && isValidUsername(user.getUsername())) {
			return true;
		}
		return false;

	}

	public static boolean isSnipetNotNull(Snipet snipet) {
		if (snipet == null) {
			return false;
		}
		return true;

	}

	public static boolean isValidId(int userId) {

		if (userId > 0) {
			return true;
		}
		return false;

	}
}
