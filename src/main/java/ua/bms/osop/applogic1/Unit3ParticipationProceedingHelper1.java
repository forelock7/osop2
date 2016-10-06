package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3ParticipationProceedingHelper;

public class Unit3ParticipationProceedingHelper1 extends DriverBasedHelper implements Unit3ParticipationProceedingHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3ParticipationProceedingHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3ParticipationProcPage() {
		return pages.unit3ParticipationProceedingPage.waitPageLoaded();
	}
}
