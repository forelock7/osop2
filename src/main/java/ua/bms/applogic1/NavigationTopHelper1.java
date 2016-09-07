package ua.bms.applogic1;

import ua.bms.applogic.NavigationTopHelper;

public class NavigationTopHelper1 extends DriverBasedHelper implements NavigationTopHelper {

	public NavigationTopHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	@Override
	public void goToUnit7Page(){
		pages.navigationTopPage.ensurePageLoaded().moveToUnit7Page();
	}	
	
	@Override
	public void goToUnit9Page(){
		pages.navigationTopPage.ensurePageLoaded().moveToUnit9Page();
	}
	


}
