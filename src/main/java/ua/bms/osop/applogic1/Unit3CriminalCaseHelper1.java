package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3CriminalCaseHelper;

public class Unit3CriminalCaseHelper1 extends DriverBasedHelper implements Unit3CriminalCaseHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3CriminalCaseHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3CriminalCasesPage() {
		return pages.unit3CriminalCasePage.waitPageLoaded();
	}
}
