package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit1ViewClaimsToPrcHelper;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 5 - "Viewing of claims, statements to Procuracy authorities"("Перегляд позовів, заяв до органів прокуратури")
 * Related with Unit1ClaimsToPrcCard model(ua.bms.osop.model.Unit1ClaimsToPrcCard)
 * Uses methods from Unit1ClaimsToPrcPage
 */
public class Unit1ViewClaimsToPrcHelper1 extends DriverBasedHelper implements Unit1ViewClaimsToPrcHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit1ViewClaimsToPrcHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit1ClaimsToPrcPage() {
		return pages.unit1ViewClaimsToPrcPage.waitPageLoaded();
	}

}
