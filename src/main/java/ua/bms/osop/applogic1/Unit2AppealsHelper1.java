package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit2AppealsHelper;

public class Unit2AppealsHelper1 extends DriverBasedHelper implements Unit2AppealsHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2AppealsHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit2AppealsPage() {
		return pages.unit2AppealPage.waitPageLoaded();
	}
}
