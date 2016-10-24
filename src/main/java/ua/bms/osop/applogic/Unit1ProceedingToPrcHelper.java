package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit1ProceedingToPrcCardModel;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 2 - "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури");
 * Related with Unit1ReviewToPrcCard model(ua.bms.osop.model.Unit1ReviewToPrcCard)
 * Uses methods from Unit1ReviewToPrcPage
 */
public class Unit1ProceedingToPrcHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit1ProceedingToPrcHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Proceeding Page----------------------------------------------------*/
	
	public boolean isOnUnit1ProceedingsToPrcPage() {
		return pages.unit1ProceedingToPrcPage.waitPageLoaded();
	}

	//Opens Card to create
	public void openCardToCreate() {
		pages.unit1ProceedingToPrcPage.clickButtonCreateCard();
	}

	//Opens Card to view
	public void openCardToView() {
		pages.unit1ProceedingToPrcPage.doubleClickOnFirstRecordInGridOnMainTab();
	}

	//Opens Card to edit
	public void openCardToEdit() {
		pages.unit1ProceedingToPrcPage.clickButtonEdit();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit1ProceedingToPrcPage.getRegNumberFromGridOnMainTab();
	}

	/*--------------------------------Proceeding Card----------------------------------------------------*/

	/*Creates a new Card with filling all fields in and submitting*/
	public void createCard(Unit1ProceedingToPrcCardModel unit1ProceedingToPrcCardModel) {
		pages.unit1ProceedingToPrcCard.setProceedingToPrcCardUnit1(unit1ProceedingToPrcCardModel);
	}

	/*Edits card with changing value in field "Defendant"*/
	public void editCard(Unit1ProceedingToPrcCardModel unit1ProceedingToPrcCardModel) {
		pages.unit1ProceedingToPrcCard.setInputDefendant(unit1ProceedingToPrcCardModel.getSomeNewText());
	}

	/*---Basic Statements Tab---*/
	/*Checks if in Inspection Card Unit 5*/
	public boolean isOnUnit1ProceedingToPrcCard() {
		return pages.unit1ProceedingToPrcCard.isTitleOfCardIsPresent();
	}

	public void goToStagesTab() {
		pages.unit1ProceedingToPrcCard.clickOnStagesTab();
	}

	//Gets Plaintiff
	public String getPlaintiff() {
		return pages.unit1ProceedingToPrcCard.getInputPlaintiff();
	}

	/*Returns value in field "Defendant" from later edited card(after its editing)*/
	public String getDefendant() {
		return pages.unit1ProceedingToPrcCard.getInputDefendant();
	}



	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit1ProceedingToPrcCard.clickButtonSaveCard();
		pages.unit1ProceedingToPrcCard.clickOnAlertOK();
	}

	//Quit from Card
	public void quitCard() {
		pages.unit1ProceedingToPrcCard.clickButtonExitFromCardForm();
	}

		/*---Instance Tab---*/

	//Checks if on "Stages" Tab in "Review Proceeding" Card
	public boolean isStageCreatingUnable() {
		return pages.unit1ProceedingToPrcCard.isTitleOfGridStageCreatingIsUnablePresent();
	}

	public boolean checkIsButtonCreateFirstInstance() {
		return pages.unit1ProceedingToPrcCard.isButtonCreateFirstInstancePresent();
	}

}
