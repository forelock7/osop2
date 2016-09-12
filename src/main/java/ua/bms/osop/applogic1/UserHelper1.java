package ua.bms.osop.applogic1;

import org.openqa.selenium.TimeoutException;

import ua.bms.osop.applogic.UserHelper;
import ua.bms.osop.model.User;

/*
 * Implements all methods are used in LoginTest and related with Login Form and User model(ua.bms.osop.model.User)
 */
public class UserHelper1 extends DriverBasedHelper implements UserHelper {
	
	private String baseUrl;
	
	/*
	 * Constructor of object which manage by object Applicationmanager.
	 * Assigns URL from Applicationmanager constructor.
	 */
	public UserHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
		this.baseUrl = manager.getBaseUrl();
	}
	
	//Opens the main page. Set URL.
	@Override
	public void openMainPage() {
		driver.get(baseUrl);
	}
	
	//Performs LogiIn. Catch case with wrong Login or Password
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
	
	//Performs LogOut from system
	@Override
	public void logout() {
		pages.navigationTopPage.ensurePageLoaded()
	    .clickLinkLogOut();
	}
  
	//Checks if login in system
	@Override
	public boolean isLoggedIn(){
		return pages.navigationTopPage.waitPageLoaded();		  
	}
	
	//Checks if not login in system
	@Override
	public boolean isNotLoggedIn(){
		return pages.loginPage.waitPageLoaded();
	}

}
