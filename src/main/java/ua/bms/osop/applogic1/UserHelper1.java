package ua.bms.osop.applogic1;

import org.openqa.selenium.TimeoutException;

import ua.bms.osop.applogic.UserHelper;
import ua.bms.osop.model.User;

public class UserHelper1 extends DriverBasedHelper implements UserHelper {
	
	private String baseUrl;
	
	public UserHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
		this.baseUrl = manager.getBaseUrl();
	}
	
	@Override
	public void openMainPage() {
		driver.get(baseUrl);
	}
	
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
	
	//logout from OSOP
	@Override
	public void logout() {
		pages.navigationTopPage.ensurePageLoaded()
	    .clickLinkLogOut();
	}
  
	@Override
	public boolean isLoggedIn(){
		return pages.navigationTopPage.waitPageLoaded();		  
	}
	
	@Override
	public boolean isNotLoggedIn(){
		return pages.loginPage.waitPageLoaded();
	}

}
