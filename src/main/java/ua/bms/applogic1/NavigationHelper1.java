package ua.bms.applogic1;

import ua.bms.applogic.NavigationHelper;

public class NavigationHelper1 extends DriverBasedHelper implements NavigationHelper {
	
	private String baseUrl;

	public NavigationHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
		this.baseUrl = manager.getBaseUrl();
	}
	
	@Override
	public void openMainPage() {
		driver.get(baseUrl);
	}
	
	@Override
	public void goToUnit7Page(){
		pages.topNavigationPage.ensurePageLoaded().clickUnit7Page();
	}	
	
	@Override
	public void goToUnit9Page(){
		pages.topNavigationPage.ensurePageLoaded().clickUnit9Page();
	}
	


}
