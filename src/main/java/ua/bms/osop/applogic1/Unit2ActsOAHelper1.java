package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit2ActsOAHelper;

public class Unit2ActsOAHelper1 extends DriverBasedHelper implements Unit2ActsOAHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2ActsOAHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit2ActsOAPage() {
		return pages.unit2ActOAPage.waitPageLoaded();
	}

}
