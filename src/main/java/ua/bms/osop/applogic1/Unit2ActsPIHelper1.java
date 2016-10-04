package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit2ActsPIHelper;

public class Unit2ActsPIHelper1 extends DriverBasedHelper implements Unit2ActsPIHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2ActsPIHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit2ActsPIPage() {
		return pages.unit2ActPIPage.waitPageLoaded();
	}
}
