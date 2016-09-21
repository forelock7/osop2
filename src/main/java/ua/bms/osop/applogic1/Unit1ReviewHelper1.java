package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit1ReviewHelper;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 1 - "Review proceedings on a claim"("НП за позовом");
 * Related with Unit1ReviewCard model(ua.bms.osop.model.Unit1ReviewCard)
 * Uses methods from Unit1ReviewPage
 */
public class Unit1ReviewHelper1 extends DriverBasedHelper implements Unit1ReviewHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit1ReviewHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit1ReviewPage() {
		return pages.unit1ReviewPage.waitPageLoaded();
	}

}
