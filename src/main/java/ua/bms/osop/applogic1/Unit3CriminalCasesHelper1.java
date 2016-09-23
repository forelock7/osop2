package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3CriminalCasesHelper;

public class Unit3CriminalCasesHelper1 extends DriverBasedHelper implements Unit3CriminalCasesHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3CriminalCasesHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3CriminalCasesPage() {
		return pages.unit3CriminalCasesPage.waitPageLoaded();
	}
}