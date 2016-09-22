package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit2PreventiveHelper;

public class Unit2PreventiveHelper1 extends DriverBasedHelper implements Unit2PreventiveHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2PreventiveHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit2PreventivePage() {
		return pages.unit2PreventivePage.waitPageLoaded();
	}

}
