package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3OtherCriminalCaseHelper;

public class Unit3OtherCriminalCaseHelper1 extends DriverBasedHelper implements Unit3OtherCriminalCaseHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3OtherCriminalCaseHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3OtherCriminalCasesPage() {
		return pages.unit3OtherCriminalCasePage.waitPageLoaded();
	}
}
