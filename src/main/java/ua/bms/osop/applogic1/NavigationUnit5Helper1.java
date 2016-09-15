package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.NavigationUnit5Helper;

/*
 * Ancillary Class for tests on Side Navigation Page Unit 5
 * Navigates moving in Section "Supervision of the observance of laws in the execution of judgments."
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * of Menu "Sections of Report"("Розділи звіту").
 * 
 * Declares methods for moving between two sub-section:
 * 1 - List Inspections(Перелік перевірок);
 * 2 - List of Response Documents(Перелік документів реагування);
 * 3 - List of Charged Person(Перелік осіб, притягнутих до відповідальності)
 */
public class NavigationUnit5Helper1 extends DriverBasedHelper implements NavigationUnit5Helper {
	
	/*
	 * Constructor of object which is managed by object Application Manager.
	 */
	public NavigationUnit5Helper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*Checks if on Navigation Page Unit 68*/
	@Override
	public boolean isOnUnit5Page(){
		return pages.navigationUnits68Page.waitPageLoaded();
	}
	
	//Moving Unit 5 "List Inspections"("Перелік перевірок");
	@Override
	public void goToUnit5InspectionsPage(){
		if (isOnUnit5Page()) {
			pages.navigationUnit5Page.ensurePageLoaded().moveToUnit5InspectionPage();
		} else {
			pages.navigationTopPage.ensurePageLoaded().moveToNavigationUnit5Page();
			pages.navigationUnit5Page.ensurePageLoaded().moveToUnit5InspectionPage();
		}
	}
	
	//Moving Unit 5 "List of Response Documents"("Перелік документів реагування");
	@Override
	public void goToUnit5DocumentsPage(){
		if (isOnUnit5Page()) {
			pages.navigationUnit5Page.ensurePageLoaded().moveToUnit5DocumentPage();
		} else {
			pages.navigationTopPage.ensurePageLoaded().moveToNavigationUnit5Page();
			pages.navigationUnit5Page.ensurePageLoaded().moveToUnit5DocumentPage();
		}
	}
	
	//Moving Unit 5 "List of Charged Person"("Перелік осіб, притягнутих до відповідальності").
	@Override
	public void goToUnit5ChargedPage(){
		if (isOnUnit5Page()) {
			pages.navigationUnit5Page.ensurePageLoaded().moveToUnit5ChargedPage();
		} else {
			pages.navigationTopPage.ensurePageLoaded().moveToNavigationUnit5Page();
			pages.navigationUnit5Page.ensurePageLoaded().moveToUnit5ChargedPage();
		}
	}

}
