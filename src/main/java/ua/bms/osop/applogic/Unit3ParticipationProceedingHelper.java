package ua.bms.osop.applogic;

public class Unit3ParticipationProceedingHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3ParticipationProceedingHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3ParticipationProcPage() {
		return pages.unit3ParticipationProceedingPage.waitPageLoaded();
	}
}
