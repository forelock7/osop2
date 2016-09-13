package ua.bms.osop.applogic1;

import org.openqa.selenium.TimeoutException;
import ua.bms.osop.applogic.UserHelper;
import ua.bms.osop.model.User;

/*
 * Ancillary Class for tests with User Model(User's data)
 * Is used on Login Page
 * Implements all methods are used in LoginTest and related with Login Form and User model(ua.bms.osop.model.User)
 */
public class UserHelper1 extends DriverBasedHelper implements UserHelper {
	
	private String baseUrl;
	
	/*
	 * Constructor of object which is managed by object Application Manager.
	 * Assigns URL from Application Manager constructor.
	 */
	public UserHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
		this.baseUrl = manager.getBaseUrl();
	}
	
	/*
	 * Opens the main page. Set URL.
	 * Checks if is logged in than doesn't need to set URL of start(main) page
	 */
	@Override
	public void openMainPage() {
		if (isLoggedIn()){
			return;
		}else{
		driver.get(baseUrl);
		}
	}
	
	/*Performs LogiIn. Catch case with wrong Login or Password*/
	@Override
	public void loginAs(User user) {
		pages.loginPage.ensurePageLoaded()
		.setLoginForm(user)
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
