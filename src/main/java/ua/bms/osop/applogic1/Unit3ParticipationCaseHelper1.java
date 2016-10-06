package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3ParticipationCaseHelper;

public class Unit3ParticipationCaseHelper1 extends DriverBasedHelper implements Unit3ParticipationCaseHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3ParticipationCaseHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3ParticipationCasesPage() {
		return pages.unit3ParticipationCasePage.waitPageLoaded();
	}
}
