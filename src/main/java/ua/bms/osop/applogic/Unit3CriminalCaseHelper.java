package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit3CriminalCaseCardModel;

public class Unit3CriminalCaseHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3CriminalCaseHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Case Page----------------------------------------------------*/
	
	public boolean isOnUnit3CriminalCasePage() {
		return pages.unit3CriminalCasePage.waitPageLoaded();
	}
	
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit3CriminalCasePage.clickButtonCreateCard();
	}

	//Opens Card to view
	public void openCardToView() {
		pages.unit3CriminalCasePage.doubleClickOnFirstRecordInGridOnMainTab();
	}

	//Opens Card to edit
	public void openCardToEdit() {
		pages.unit3CriminalCasePage.clickButtonEdit();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit3CriminalCasePage.getRegNumberFromGridOnMainTab();
	}

	/*--------------------------------Proceeding Card----------------------------------------------------*/


	/*Creates a new Card with filling all fields in and submitting*/
	public void createCard(Unit3CriminalCaseCardModel unit3CriminalCaseCardModel) {
		pages.unit3CriminalCaseCard.setCriminalCaseCardUnit3(unit3CriminalCaseCardModel);
	}

	/*Edits card with changing value in field "Defendant"*/
	public void editCard(Unit3CriminalCaseCardModel unit3CriminalCaseCardModel) {
		pages.unit3CriminalCaseCard.setInputOffenseQualification(unit3CriminalCaseCardModel.getSomeNewText());
	}

	/*---Basic Statements Tab---*/

	/*Checks if in Criminal Card Unit 3*/
	public boolean isOnUnit3CriminalCaseCard() {
		return pages.unit3CriminalCaseCard.isTitleOfCardIsPresent();
	}

	public void goToStagesTab() {
		pages.unit3CriminalCaseCard.clickOnStagesTab();
	}

	//Gets Plaintiff
	public String getCriminalCaseNumber() {
		return pages.unit3CriminalCaseCard.getInputCriminalCaseNumber();
	}

	/*Returns value in field "Defendant" from later edited card(after its editing)*/
	public String getOffenseQualification() {
		return pages.unit3CriminalCaseCard.getInputOffenseQualification();
	}

	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit3CriminalCaseCard.clickButtonSaveCard();
		pages.unit3CriminalCaseCard.clickOnAlertOK();
	}

	//Quit from Card
	public void quitCard() {
		pages.unit3CriminalCaseCard.clickButtonExitFromCardForm();
	}

	/*---Instance Tab---*/

	//Checks if on "Stages" Tab in "Review Proceeding" Card
	public boolean isStageCreatingUnable() {
		return pages.unit3CriminalCaseCard.isTitleOfGridStageCreatingIsUnablePresent();
	}

	public boolean checkIsButtonCreateFirstInstance() {
		return pages.unit3CriminalCaseCard.isButtonCreateFirstInstancePresent();
	}
}
