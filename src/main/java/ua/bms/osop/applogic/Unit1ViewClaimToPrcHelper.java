package ua.bms.osop.applogic;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 5 - "Viewing of claims, statements to Procuracy authorities"("Перегляд позовів, заяв до органів прокуратури")
 * Related with Unit1ClaimsToPrcCard model(ua.bms.osop.model.Unit1ClaimsToPrcCard)
 * Uses methods from Unit1ClaimsToPrcPage
 */
public class Unit1ViewClaimToPrcHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit1ViewClaimToPrcHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit1ClaimsToPrcPage() {
		return pages.unit1ViewClaimToPrcPage.waitPageLoaded();
	}

}
