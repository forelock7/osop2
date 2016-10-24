package ua.bms.osop.applogic;

/*
 * Ancillary Class for tests on Side Navigation Page Unit 6, 8
 * Navigates moving in Section "Consideration of claims and requests" ("Розгляд звернень та запитів")
 * of Menu "Sections of Report"("Розділи звіту").
 * 
 * Declares methods for moving between two sub-section:
 * 1 - Claims;
 * 2 - Requests.
 */
public class NavigationUnit68Helper extends DriverBasedHelper {

	/*
	 * Constructor of object which is managed by object Application Manager.
	 */
	public NavigationUnit68Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*Checks if on Navigation Page Unit 68*/
	public boolean isOnUnit68Page(){
		return pages.navigationUnits68Page.waitPageLoaded();
	}
	
	//Moving Unit 6 "Claims"("Звернення")
	public void goToUnit6Page(){
		if (isOnUnit68Page()) {
			pages.navigationUnits68Page.ensurePageLoaded().clickUnit6MenuItem();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit68MenuItem();
			pages.navigationUnits68Page.ensurePageLoaded().clickUnit6MenuItem();
		}
	}
	
	//Moving Unit 8 "Requests"("Запити")
	public void goToUnit8Page(){
		if (isOnUnit68Page()) {
			pages.navigationUnits68Page.ensurePageLoaded().clickUnit8MenuItem();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit68MenuItem();
			pages.navigationUnits68Page.ensurePageLoaded().clickUnit8MenuItem();
		}
	}


}
