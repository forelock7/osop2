package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit1ProceedingsToPrcHelper;
import ua.bms.osop.model.Unit1ProceedingToPrcCard;

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
	
	public boolean isOnUnit1ProceedingsToPrcPage() {
		return pages.unit1ProceedingsToPrcPage.waitPageLoaded();
	}

	//Opens Card to create
	@Override
	public void openCardToCreate() {
		pages.unit1ProceedingsToPrcPage.clickButtonCreateCard();
	}

	//Opens Card to view
	@Override
	public void openCardToView() {
		pages.unit1ProceedingsToPrcPage.doubleClickOnFirstRecordInGridOnMainTab();
	}

	//Opens Card to edit
	@Override
	public void openCardToEdit() {
		pages.unit1ProceedingsToPrcPage.clickButtonEdit();
	}

	/*--------------------------------Proceeding Card----------------------------------------------------*/



	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCard(Unit1ProceedingToPrcCard unit1ProceedingToPrcCard) {
		pages.unit1ProceedingsToPrcPage.setProceedingToPrcCardUnit1(unit1ProceedingToPrcCard);
	}

	/*Edits card with changing value in field "Defendant"*/
	@Override
	public void editCard(Unit1ProceedingToPrcCard unit1ProceedingToPrcCard) {
		pages.unit1ProceedingsToPrcPage.setInputDefendant(unit1ProceedingToPrcCard.someNewText);
	}

	/*---Basic Statements Tab---*/
	/*Checks if in Inspection Card Unit 5*/
	@Override
	public boolean isOnUnit1ProceedingToPrcCard() {
		return pages.unit1ProceedingsToPrcPage.isTitleOfCardIsPresent();
	}

	@Override
	public void goToStagesTab() {
		pages.unit1ProceedingsToPrcPage.clickOnStagesTab();
	}

	//Gets Plaintiff
	@Override
	public String getPlaintiff() {
		return pages.unit1ProceedingsToPrcPage.getInputPlaintiff();
	}

	/*Returns value in field "Defendant" from later edited card(after its editing)*/
	@Override
	public String getDefendant() {
		return pages.unit1ProceedingsToPrcPage.getInputDefendant();
	}

	/*
 * Gets number of the first record(card) in grid on the main tab
 * Checks existing of later restoring card
 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit1ProceedingsToPrcPage.getRegNumberFromGridOnMainTab();
	}

	//Saves Card(clicking "Save" button)
	@Override
	public void saveCard() {
		pages.unit1ProceedingsToPrcPage.clickButtonSaveCard();
		pages.unit1ProceedingsToPrcPage.clickOnAlertOK();
	}

	//Quit from Card
	@Override
	public void quitCard() {
		pages.unit1ProceedingsToPrcPage.clickButtonExitFromCardForm();
	}

		/*---Instance Tab---*/

	//Checks if on "Stages" Tab in "Review Proceeding" Card
	@Override
	public boolean isOnUnit1StagesTab() {
		return pages.unit1ProceedingsToPrcPage.isTitleOfGridPresent();
	}

	@Override
	public boolean checkIsButtonCreateFirstInstance() {
		return pages.unit1ProceedingsToPrcPage.isButtonCreateFirstInstancePresent();
	}

}
