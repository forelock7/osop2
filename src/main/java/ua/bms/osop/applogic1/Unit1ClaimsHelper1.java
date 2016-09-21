package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit1ClaimsHelper;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 4 - "Viewing of claims, statements"("Перегляд позовів, заяв")
 * Related with Unit1ClaimsCard model(ua.bms.osop.model.Unit1ClaimsCard)
 * Uses methods from Unit1ClaimsPage
 */
public class Unit1ClaimsHelper1 extends DriverBasedHelper implements Unit1ClaimsHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit1ClaimsHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	public boolean isOnUnit1ClaimsPage() {
		return pages.unit1ClaimsPage.waitPageLoaded();
	}
}
