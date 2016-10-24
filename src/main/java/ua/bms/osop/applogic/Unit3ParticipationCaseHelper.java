package ua.bms.osop.applogic;

public class Unit3ParticipationCaseHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3ParticipationCaseHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit3ParticipationCasesPage() {
		return pages.unit3ParticipationCasePage.waitPageLoaded();
	}
}
