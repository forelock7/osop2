package ua.bms.osop.applogic1;

import org.openqa.selenium.TimeoutException;
import ua.bms.osop.applogic.UserHelper;
import ua.bms.osop.model.UserModel;

/*
 * Ancillary Class for tests with User Model(User's data)
 * Is used on Login Page
 * Implements all methods are used in LoginTest and related with Login Form and User model(ua.bms.osop.model.User)
 */
public class UserHelper1 extends DriverBasedHelper implements UserHelper {
	
	/*
	 * Constructor of object which is managed by object Application Manager.
	 * Assigns URL from Application Manager constructor.
	 */
	public UserHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*Performs LogiIn. Catch case with wrong Login or Password*/
	@Override
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
	@Override
	public void logout() {
		pages.navigationTopPage.ensurePageLoaded()
	    .clickLinkLogOut();
	}
  
	/*Checks if login in system*/
	@Override
	public boolean isLoggedIn(){
		return pages.navigationTopPage.waitPageLoaded();		  
	}
	
	/*Checks if not login in system*/
	@Override
	public boolean isNotLoggedIn(){
		return pages.loginPage.waitPageLoaded();
	}

}
