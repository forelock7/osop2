package ua.bms.osop.applogic;

/*
 * Ancillary Class for tests on Side Navigation Page Unit 1
 * Navigates moving in Section "Presentetion"
 * ("Представництво")
 * of Menu "Sections of Report"("Розділи звіту").
 * 
 * Declares methods for moving between two sub-section:
 * 1 - "Review proceedings on a claim"("НП за позовом");
 * 2 - "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури");
 * 3 - "Started Crime Proceedings"("Розпочато кримінальних проваджень")
 * 4 - "Viewing of claims, statements"("Перегляд позовів, заяв")
 * 5 - "Viewing of claims to Procuracy authorities"("Перегляд позовів до органів прокуратури")
 */
public class NavigationUnit1Helper extends DriverBasedHelper {
	
	/*
	 * Constructor of object which is managed by object Application Manager.
	 */
	public NavigationUnit1Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*Checks if on Navigation Page Unit 1*/
	public boolean isOnUnit1Page(){
		return pages.navigationUnit1Page.waitPageLoaded();
	}
	
	//Goes to Unit 1 - section "Review proceedings on a claim"
	public void goToUnit1ProceedingsPage() {
		if (isOnUnit1Page()) {
			pages.navigationUnit1Page.ensurePageLoaded().clickReviewMenuItem();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit1MenuItem();
			pages.navigationUnit1Page.ensurePageLoaded().clickReviewMenuItem();
		}
	}
	
	//Goes to Unit 1 - section "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури")
	public void goToUnit1ProceedingsToPrcPage() {
		if (isOnUnit1Page()) {
			pages.navigationUnit1Page.ensurePageLoaded().clickReviewToPrcMenuItem();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit1MenuItem();
			pages.navigationUnit1Page.ensurePageLoaded().clickReviewToPrcMenuItem();
		}
	}
	
	//Goes to Unit 1 - section "Started Crime Proceedings"("Розпочато кримінальних проваджень")
	public void goToUnit1CrimeProceedingPage() {
		if (isOnUnit1Page()) {
			pages.navigationUnit1Page.ensurePageLoaded().clickCrimeMenuItem();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit1MenuItem();
			pages.navigationUnit1Page.ensurePageLoaded().clickCrimeMenuItem();
		}
	}
	
	//Goes to Unit 1 - section "Viewing of claims, statements"("Перегляд позовів, заяв")
	public void goToUnit1ClaimsPage() {
		if (isOnUnit1Page()) {
			pages.navigationUnit1Page.ensurePageLoaded().clickClaimsMenuItem();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit1MenuItem();
			pages.navigationUnit1Page.ensurePageLoaded().clickClaimsMenuItem();
		}
	}
	
	//Goes to Unit 1 - section "Viewing of claims to Procuracy authorities"("Перегляд позовів до органів прокуратури")
	public void goToUnit1ClaimsToPrcPage() {
		if (isOnUnit1Page()) {
			pages.navigationUnit1Page.ensurePageLoaded().clickClaimsToPrcMenuItem();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit1MenuItem();
			pages.navigationUnit1Page.ensurePageLoaded().clickClaimsToPrcMenuItem();
		}
	}

}


