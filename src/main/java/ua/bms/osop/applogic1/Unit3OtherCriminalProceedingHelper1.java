package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3OtherCriminalProceedingHelper;

public class Unit3OtherCriminalProceedingHelper1 extends DriverBasedHelper implements Unit3OtherCriminalProceedingHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3OtherCriminalProceedingHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3OtherCriminalProcPage() {
		return pages.unit3OtherCriminalProceedingPage.waitPageLoaded();
	}
}
