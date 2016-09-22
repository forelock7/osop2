package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3CriminalProcHelper;

public class Unit3CriminalProcHelper1 extends DriverBasedHelper implements Unit3CriminalProcHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3CriminalProcHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3CriminalProcPage() {
		return pages.unit3CriminalProcPage.waitPageLoaded();
	}
}
