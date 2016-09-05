package ua.bms.applogic1;

import org.openqa.selenium.TimeoutException;
import ua.bms.applogic.UserHelper;
import ua.bms.model.User;

public class UserHelper1 extends DriverBasedHelper implements UserHelper {
	
	public UserHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	
	@Override
	public void loginAs(User user) {
		pages.loginPage.ensurePageLoaded()
		.setLoginForm(user)
		.clickSubmitButton();
		try{
			pages.loginPage.acceptFailedLoginAlert();
			} catch (TimeoutException e){
				return;
		}
	}
	
	//logout from OSOP
	@Override
	public void logout() {
		pages.topNavigationPage.ensurePageLoaded()
	    .clickLogoutLink();
	}
  
	@Override
	public boolean isLoggedIn(){
		return pages.topNavigationPage.waitPageLoaded();		  
	}
	
	@Override
	public boolean isNotLoggedIn(){
		return pages.loginPage.waitPageLoaded();
	}

}
