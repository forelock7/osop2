package ua.bms.osop.applogic;

import ua.bms.osop.model.User;

public interface UserHelper {
	
	void openMainPage();
	void loginAs(User user);
	void logout();
	boolean isLoggedIn();
	boolean isNotLoggedIn();

}
