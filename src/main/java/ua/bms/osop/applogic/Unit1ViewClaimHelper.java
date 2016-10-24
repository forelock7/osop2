package ua.bms.osop.applogic;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 4 - "Viewing of claims, statements"("Перегляд позовів, заяв")
 * Related with Unit1ClaimsCard model(ua.bms.osop.model.Unit1ClaimsCard)
 * Uses methods from Unit1ClaimsPage
 */
public class Unit1ViewClaimHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit1ViewClaimHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit1ClaimsPage() {
		return pages.unit1ViewClaimPage.waitPageLoaded();
	}
}
