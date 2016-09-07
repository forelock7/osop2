package ua.bms.applogic;

import ua.bms.model.User;

public interface UserHelper {
	
	void openMainPage();
	void loginAs(User user);
	void logout();
	boolean isLoggedIn();
	boolean isNotLoggedIn();

}
