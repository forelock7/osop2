package ua.bms.osop.applogic;

import ua.bms.osop.model.UserModel;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.UserHelper1
 */
public interface UserHelper {
	
	//void openMainPage();
	void loginAs(UserModel userModel);
	void logout();
	boolean isLoggedIn();
	boolean isNotLoggedIn();

}
