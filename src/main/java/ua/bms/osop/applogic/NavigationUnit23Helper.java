package ua.bms.osop.applogic;

/*
 * Ancillary Class for tests on Side Navigation Page Unit 2-3
 * Navigates moving in Section "Supervision over the status of pre-trial investigation and public prosecution"
 * ("Нагляд за станом досудового розслідування та держобвинувачення")
 * of Menu "Sections of Report"("Розділи звіту").
 * 
 * Declares methods for moving between two units sub-section:
 * 
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * 1 - "Acts of supervision over pre-trial investigation"("Акти нагляду за ДР");
 * 2 - "The appeals on the pre-trial investigation"("Апеляційні скарги з питань ДР");
 * 3 - "The Preventive Action"("Запобіжні заходи");
 * 4 - "The release from custody"("Звільнення з-під варти");
 * 5 - "Acts of supervision over Operational Activities"("Акти нагляду за ОРД");
 * 6 - "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії");
 * 
 * Unit 3: "Public prosecution"("Держобвинувачення");
 * 1 - "Criminal proceedings"("Кримінальні провадження");
 * 2 - "Other criminal proceedings"("Інші кримінальні провадження");
 * 3 - "Participation in the trial proceedings and other CP"("Участь у судовому розгляді проваджень та інших КП");
 * 4 - "Criminal cases"("Кримінальні справи");
 * 5 - "Other criminal cases"("Інші кримінальні справи");
 * 6 - "Participation in the trial cases and other CC"("Участь у судовому розгляді справ та інших КС");
 */
public class NavigationUnit23Helper extends DriverBasedHelper {
	
	/*
	 * Constructor of object which is managed by object Application Manager.
	 */
	public NavigationUnit23Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*Checks if on Navigation Page Unit 1*/
	public boolean isOnUnit23Page() {
		return pages.navigationUnit23Page.waitPageLoaded();
	}
	
	//Goes to Unit 2 - "Acts of supervision over pre-trial investigation"("Акти нагляду за ДР");
	public void goToUnit2ActsPIPage(){
		if (isOnUnit23Page()) {
			pages.navigationUnit23Page.ensurePageLoaded().clickActsPIMenuU23();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
			pages.navigationUnit23Page.ensurePageLoaded().clickActsPIMenuU23();
		}
	}
	
	//Goes to Unit 2 - "The appeals on the pre-trial investigation"("Апеляційні скарги з питань ДР")
	public void goToUnit2AppealsPage() {
		if (isOnUnit23Page()) {
			pages.navigationUnit23Page.ensurePageLoaded().clickAppealsMenuU23();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
			pages.navigationUnit23Page.ensurePageLoaded().clickAppealsMenuU23();
		}
	}
	
	//Goes to Unit 2 - "The Preventive Action"("Запобіжні заходи")
	public void goToUnit2PreventivePage() {
		if (isOnUnit23Page()) {
			pages.navigationUnit23Page.ensurePageLoaded().clickPreventiveMenuU23();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
			pages.navigationUnit23Page.ensurePageLoaded().clickPreventiveMenuU23();
		}
	}
	
	//Goes to Unit 2 - "The release from custody"("Звільнення з-під варти")
	public void goToUnit2ReleasePage() {
		if (isOnUnit23Page()) {
			pages.navigationUnit23Page.ensurePageLoaded().clickReleaseMenuU23();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
			pages.navigationUnit23Page.ensurePageLoaded().clickReleaseMenuU23();
		}
	}
	
	//Goes to Unit 2 - "Acts of supervision over Operational Activities"("Акти нагляду за ОРД")
	public void goToUnit2ActsOAPage() {
		if (isOnUnit23Page()) {
			pages.navigationUnit23Page.ensurePageLoaded().clickActsOAMenuU23();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
			pages.navigationUnit23Page.ensurePageLoaded().clickActsOAMenuU23();
		}
	}
	
	//Goes to Unit 2 - "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії");
	public void goToUnit2CovertPage() {
		if (isOnUnit23Page()) {
			pages.navigationUnit23Page.ensurePageLoaded().clickCovertMenuU23();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
			pages.navigationUnit23Page.ensurePageLoaded().clickCovertMenuU23();
		}
	}
	
	/*-------------------------------------------------------------------------*/
	
	//Goes to Unit 3 - "Criminal proceedings"("Кримінальні провадження")
	public void goToUnit3CriminalProceedingPage() {
		if (isOnUnit23Page()) {
			pages.navigationUnit23Page.ensurePageLoaded().clickCriminalProcMenuU23();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
			pages.navigationUnit23Page.ensurePageLoaded().clickCriminalProcMenuU23();
		}
	}
	
	//Goes to Unit 3 - "Other criminal proceedings"("Інші кримінальні провадження")
	public void goToUnit3OtherCriminalProceedingPage() {
		if (isOnUnit23Page()) {
			pages.navigationUnit23Page.ensurePageLoaded().clickOtherCriminalProcMenuU23();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
			pages.navigationUnit23Page.ensurePageLoaded().clickOtherCriminalProcMenuU23();
		}
	}
	
	//Goes to Unit 3 - "Participation in the trial proceedings and other CP"("Участь у судовому розгляді проваджень та інших КП")
	public void goToUnit3ParticipationProceedingPage() {
		if (isOnUnit23Page()) {
			pages.navigationUnit23Page.ensurePageLoaded().clickParticipationProcMenuU23();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
			pages.navigationUnit23Page.ensurePageLoaded().clickParticipationProcMenuU23();
		}
	}
	
	//Goes to Unit 3 - "Criminal cases"("Кримінальні справи")
	public void goToUnit3CriminalCasePage() {
		if (isOnUnit23Page()) {
			pages.navigationUnit23Page.ensurePageLoaded().clickCriminalCasesMenuU23();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
			pages.navigationUnit23Page.ensurePageLoaded().clickCriminalCasesMenuU23();
		}
	}
	
	//Goes to Unit 3 - "Other criminal cases"("Інші кримінальні справи")
	public void goToUnit3OtherCriminalCasePage() {
		if (isOnUnit23Page()) {
			pages.navigationUnit23Page.ensurePageLoaded().clickOtherCriminalCasesMenuU23();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
			pages.navigationUnit23Page.ensurePageLoaded().clickOtherCriminalCasesMenuU23();
		}
	}
	
	//Goes to Unit 3 - "Participation in the trial cases and other CC"("Участь у судовому розгляді справ та інших КС")
	public void goToUnit3ParticipationCasePage() {
		if (isOnUnit23Page()) {
			pages.navigationUnit23Page.ensurePageLoaded().clickParticipationCasesMenuU23();
		} else {
			pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
			pages.navigationUnit23Page.ensurePageLoaded().clickParticipationCasesMenuU23();
		}
	}

}
