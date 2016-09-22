package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on Side Navigation Page on Side Navigation Page Unit 2-3
 * Navigates moving in Section "Supervision over the status of pre-trial investigation and public prosecution"
 * ("Нагляд за станом досудового розслідування та держобвинувачення")
 * of Menu "Sections of Report"("Розділи звіту").
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
public class NavigationUnit23Page extends AnyPage {
	
	/*Constructor of this Page object which is managed by object Page Manager.*/
	public NavigationUnit23Page(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Main Page----------------------------------------------------*/
	
	//Title "Supervision over the status of pre-trial investigation and public prosecution" ("Нагляд за станом досудового розслідування та держобвинувачення")
	@FindBy(xpath = "//div[contains(@id, 'unit23Menu')]//div[contains(., 'досудового розслідування та держобвинувачення')]")
	private WebElement titleUnit23;
	
	/*----------Unit 2----------*/
	//Section of menu - 1 - "Acts of supervision over pre-trial investigation"("Акти нагляду за ДР");
	@FindBy (xpath = "//div[contains(@id, 'unit23Menu')]/div[4]//span")
	private WebElement itemActsPIMenuU23;
	
	//Section of menu - 2 - "The appeals on the pre-trial investigation"("Апеляційні скарги з питань ДР");
	@FindBy (xpath = "//div[contains(@id, 'unit23Menu')]/div[6]//span")
	private WebElement itemAppealsMenuU23;
	
	//Section of menu - 3 - "The Preventive Action"("Запобіжні заходи");
	@FindBy (xpath = "//div[contains(@id, 'unit23Menu')]/div[8]//span")
	private WebElement itemPreventiveMenuU23;
	
	//Section of menu - 4 - "The release from custody"("Звільнення з-під варти");
	@FindBy (xpath = "//div[contains(@id, 'unit23Menu')]/div[10]//span")
	private WebElement itemReleaseMenuU23;
	
	//Section of menu - 5 - "Acts of supervision over Operational Activities"("Акти нагляду за ОРД");
	@FindBy (xpath = "//div[contains(@id, 'unit23Menu')]/div[12]//span")
	private WebElement itemActsOAMenuU23;
	
	//Section of menu - 6 - "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії");
	@FindBy (xpath = "//div[contains(@id, 'unit23Menu')]/div[14]//span")
	private WebElement itemCovertMenuU23;
	
	/*----------Unit 3----------*/
	//Section of menu - 1 - "Criminal proceedings"("Кримінальні провадження");
	@FindBy (xpath = "//div[contains(@id, 'unit23Menu')]/div[18]//span")
	private WebElement itemCriminalProcMenuU23;
	
	//Section of menu -  2 - "Other criminal proceedings"("Інші кримінальні провадження");
	@FindBy (xpath = "//div[contains(@id, 'unit23Menu')]/div[20]//span")
	private WebElement itemOtherCriminalProcMenuU23;
	
	//Section of menu - 3 - "Participation in the trial proceedings and other CP"("Участь у судовому розгляді проваджень та інших КП");
	@FindBy (xpath = "//div[contains(@id, 'unit23Menu')]/div[22]//span")
	private WebElement itemParticipationProcMenuU23;
	
	//Section of menu - 4 - "Criminal cases"("Кримінальні справи");
	@FindBy (xpath = "//div[contains(@id, 'unit23Menu')]/div[24]//span")
	private WebElement itemCriminalCasesMenuU23;
	
	//Section of menu - 5 - "Other criminal cases"("Інші кримінальні справи");
	@FindBy (xpath = "//div[contains(@id, 'unit23Menu')]/div[26]//span")
	private WebElement itemOtherCriminalCasesMenuU23;
	
	//Section of menu - 6 - "Participation in the trial cases and other CC"("Участь у судовому розгляді справ та інших КС");
	@FindBy (xpath = "//div[contains(@id, 'unit23Menu')]/div[28]//span")
	private WebElement itemParticipationCasesMenuU23;
	
	/*------------------Methods---------------------------------------------------------------------------*/

	/*Ensures page loading according to existence of Heading*/
	public NavigationUnit23Page ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit23));
		return this;
	}
	
	//U2 - Moving from "Navigation Page in Unit 23" to Unit 2 "Acts of supervision over pre-trial investigation" page ("Акти нагляду за ДР");
	public Unit2ActsPIPage clickActsPIMenuU23(){
		itemActsPIMenuU23.click();
		return pages.unit2ActsPIPage;
	}
	
	//U2 - Moving from "Navigation Page in Unit 23" to Unit 2 "The appeals on the pre-trial investigation"("Апеляційні скарги з питань ДР");
	public Unit2AppealsPage clickAppealsMenuU23(){
		itemAppealsMenuU23.click();
		return pages.unit2AppealsPage;
	}
	
	//U2 - Moving from "Navigation Page in Unit 23" to Unit 2 "The Preventive Action"("Запобіжні заходи");
	public Unit2PreventivePage clickPreventiveMenuU23(){
		itemPreventiveMenuU23.click();
		return pages.unit2PreventivePage;
	}
	
	//U2 - Moving from "Navigation Page in Unit 23" to Unit 2 "The release from custody"("Звільнення з-під варти");
	public Unit2ReleasePage clickReleaseMenuU23(){
		itemReleaseMenuU23.click();
		return pages.unit2ReleasePage;
	}
	
	//U2 - Moving from "Navigation Page in Unit 23" to Unit 2 "Acts of supervision over Operational Activities"("Акти нагляду за ОРД");
	public Unit2ActsOAPage clickActsOAMenuU23(){
		itemActsOAMenuU23.click();
		return pages.unit2ActsOAPage;
	}
	
	//U2 - Moving from "Navigation Page in Unit 23" to Unit 2 "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії");
	public Unit2CovertPage clickCovertMenuU23(){
		itemCovertMenuU23.click();
		return pages.unit2CovertPage;
	}
	
	//U3 - Moving from "Navigation Page in Unit 23" to Unit 3 "Criminal proceedings"("Кримінальні провадження");
	public Unit3CriminalProcPage clickCriminalProcMenuU23(){
		itemCriminalProcMenuU23.click();
		return pages.unit3CriminalProcPage;
	}
	
	//U3 - Moving from "Navigation Page in Unit 23" to Unit 3 "Other criminal proceedings"("Інші кримінальні провадження");
	public Unit3OtherCriminalProcPage clickOtherCriminalProcMenuU23(){
		itemOtherCriminalProcMenuU23.click();
		return pages.unit3OtherCriminalProcPage;
	}
	
	//U3 - Moving from "Navigation Page in Unit 23" to Unit 3 "Participation in the trial proceedings and other CP"("Участь у судовому розгляді проваджень та інших КП");
	public Unit3ParticipationProcPage clickParticipationProcMenuU23(){
		itemParticipationProcMenuU23.click();
		return pages.unit3ParticipationProcPage;
	}
	
	//U3 - Moving from "Navigation Page in Unit 23" to Unit 3 "Criminal cases"("Кримінальні справи");
	public Unit3CriminalCasesPage clickCriminalCasesMenuU23(){
		itemCriminalCasesMenuU23.click();
		return pages.unit3CriminalCasesPage;
	}
	
	//U3 - Moving from "Navigation Page in Unit 23" to Unit 3 "Other criminal cases"("Інші кримінальні справи");
	public Unit3OtherCriminalCasesPage clickOtherCriminalCasesMenuU23(){
		itemOtherCriminalCasesMenuU23.click();
		return pages.unit3OtherCriminalCasesPage;
	}
	
	//U3 - Moving from "Navigation Page in Unit 23" to Unit 3 "Participation in the trial cases and other CC"("Участь у судовому розгляді справ та інших КС");
	public Unit3ParticipationCasesPage clickParticipationCasesMenuU23(){
		itemParticipationCasesMenuU23.click();
		return pages.unit3ParticipationCasesPage;
	}
	
}
