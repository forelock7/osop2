package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.NavigationUnit68Helper;

/*
 * Ancillary Class for tests on Side Navigation Page Unit 6, 8
 * Navigates moving in Section "Consideration of claims and requests" ("Розгляд звернень та запитів")
 * of Menu "Sections of Report"("Розділи звіту").
 * 
 * Declares methods for moving between two sub-section:
 * 1 - Claims;
 * 2 - Requests.
 */
public class NavigationUnit68Helper1 extends DriverBasedHelper implements NavigationUnit68Helper{

	/*
	 * Constructor of object which is managed by object Application Manager.
	 */
	public NavigationUnit68Helper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	//Moving Unit 6 "Claims"("Звернення")
	@Override
	public void goToUnit6Page(){
		pages.navigationUnits68Page.ensurePageLoaded().moveToUnit6Page();
	}
	
	//Moving Unit 8 "Requests"("Запити")
	@Override
	public void goToUnit8Page(){
		pages.navigationUnits68Page.ensurePageLoaded().moveToUnit8Page();
	}

}
