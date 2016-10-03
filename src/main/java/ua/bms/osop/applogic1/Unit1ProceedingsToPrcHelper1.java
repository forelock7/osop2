package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit1ProceedingsToPrcHelper;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 2 - "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури");
 * Related with Unit1ReviewToPrcCard model(ua.bms.osop.model.Unit1ReviewToPrcCard)
 * Uses methods from Unit1ReviewToPrcPage
 */
public class Unit1ProceedingsToPrcHelper1 extends DriverBasedHelper implements Unit1ProceedingsToPrcHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit1ProceedingsToPrcHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit1ReviewToPrcPage() {
		return pages.unit1ProceedingsToPrcPage.waitPageLoaded();
	}

}
