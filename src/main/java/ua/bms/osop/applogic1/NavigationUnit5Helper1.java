package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.NavigationUnit5Helper;

/*
 * Ancillary Class for tests on Side Navigation Page Unit 5
 * Navigates moving in Section "Supervision of the observance of laws in the execution of judgments."
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * of Menu "Sections of Report"("Розділи звіту").
 * 
 * Declares methods for moving between three sub-section:
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
	
	/*Checks if on Navigation Page Unit 5*/
	@Override
	public boolean isOnUnit5Page(){
		return pages.navigationUnits68Page.waitPageLoaded();
	}
	
	//Moving Unit 5 "List Inspections"("Перелік перевірок");
	@Override
	public void goToUnit5InspectionsPage(){
		if (isOnUnit5Page()) {
			pages.navigationUnit5Page.ensurePageLoaded().clickInspectionsMenuItem();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit5MenuItem();
			pages.navigationUnit5Page.ensurePageLoaded().clickInspectionsMenuItem();
		}
	}
	
	//Moving Unit 5 "List of Response Documents"("Перелік документів реагування");
	@Override
	public void goToUnit5DocumentsPage(){
		if (isOnUnit5Page()) {
			pages.navigationUnit5Page.ensurePageLoaded().clickResponseDocumentsMenuItem();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit5MenuItem();
			pages.navigationUnit5Page.ensurePageLoaded().clickResponseDocumentsMenuItem();
		}
	}
	
	//Moving Unit 5 "List of Charged Person"("Перелік осіб, притягнутих до відповідальності").
	@Override
	public void goToUnit5ChargedPage(){
		if (isOnUnit5Page()) {
			pages.navigationUnit5Page.ensurePageLoaded().clickChargedPersonsMenuItem();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit5MenuItem();
			pages.navigationUnit5Page.ensurePageLoaded().clickChargedPersonsMenuItem();
		}
	}

}
