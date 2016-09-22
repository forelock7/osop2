package ua.bms.osop.applogic;

import ua.bms.osop.model.User;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.UserHelper1
 */
public interface UserHelper {
	
	//void openMainPage();
	void loginAs(User user);
	void logout();
	boolean isLoggedIn();
	boolean isNotLoggedIn();

}
