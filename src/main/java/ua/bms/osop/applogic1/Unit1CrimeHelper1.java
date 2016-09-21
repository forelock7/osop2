package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit1CrimeHelper;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 3 - "List of Charged Person"("Розпочато кримінальних проваджень")
 * Related with Unit1CrimeCard model(ua.bms.osop.model.Unit1CrimeCard)
 * Uses methods from Unit1CrimePage
 */
public class Unit1CrimeHelper1 extends DriverBasedHelper implements Unit1CrimeHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit1CrimeHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit1CrimePage() {
		return pages.unit1CrimePage.waitPageLoaded();
	}

}
