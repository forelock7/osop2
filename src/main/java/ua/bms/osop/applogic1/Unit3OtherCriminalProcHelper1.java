package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3OtherCriminalProcHelper;

public class Unit3OtherCriminalProcHelper1 extends DriverBasedHelper implements Unit3OtherCriminalProcHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3OtherCriminalProcHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3OtherCriminalProcPage() {
		return pages.unit3OtherCriminalProcPage.waitPageLoaded();
	}
}
