package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3OtherCriminalCasesHelper;

public class Unit3OtherCriminalCasesHelper1 extends DriverBasedHelper implements Unit3OtherCriminalCasesHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3OtherCriminalCasesHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3OtherCriminalCasesPage() {
		return pages.unit3OtherCriminalCasePage.waitPageLoaded();
	}
}
