package ua.bms.osop.applogic;

import org.openqa.selenium.TimeoutException;
import ua.bms.osop.model.UserModel;

/*
 * Ancillary Class for tests with User Model(User's data)
 * Is used on Login Page
 * Implements all methods are used in LoginTest and related with Login Form and User model(ua.bms.osop.model.User)
 */
public class UserHelper extends DriverBasedHelper {
	
	/*
	 * Constructor of object which is managed by object Application Manager.
	 * Assigns URL from Application Manager constructor.
	 */
	public UserHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*Performs LogiIn. Catch case with wrong Login or Password*/
	public void loginAs(UserModel userModel) {
		pages.loginPage.ensurePageLoaded()
		.setLoginForm(userModel)
		.clickButtonSubmit();
		try{
			pages.loginPage.acceptFailedLoginAlert();
			} catch (TimeoutException e){
				return;
		}
	}
	
	/*Performs LogOut from system*/
	public void logout() {
		pages.navigationTopPage.ensurePageLoaded()
	    .clickLinkLogOut();
	}
  
	/*Checks if login in system*/
	public boolean isLoggedIn(){
		return pages.navigationTopPage.waitPageLoaded();		  
	}
	
	/*Checks if not login in system*/
	public boolean isNotLoggedIn(){
		return pages.loginPage.waitPageLoaded();
	}

}
