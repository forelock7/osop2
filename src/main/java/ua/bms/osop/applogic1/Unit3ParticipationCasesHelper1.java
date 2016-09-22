package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3ParticipationCasesHelper;

public class Unit3ParticipationCasesHelper1 extends DriverBasedHelper implements Unit3ParticipationCasesHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3ParticipationCasesHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3ParticipationCasesPage() {
		return pages.unit3ParticipationCasesPage.waitPageLoaded();
	}
}
