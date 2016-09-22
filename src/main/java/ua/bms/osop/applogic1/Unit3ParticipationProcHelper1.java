package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3ParticipationProcHelper;

public class Unit3ParticipationProcHelper1 extends DriverBasedHelper implements Unit3ParticipationProcHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3ParticipationProcHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3ParticipationProcPage() {
		return pages.unit3ParticipationProcPage.waitPageLoaded();
	}
}
