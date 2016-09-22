package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit2ReleaseHelper;

public class Unit2ReleaseHelper1 extends DriverBasedHelper implements Unit2ReleaseHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2ReleaseHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit2ReleasePage() {
		return pages.unit2ReleasePage.waitPageLoaded();
	}

}
