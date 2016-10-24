package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit3OtherCriminalCaseCardModel;

public class Unit3OtherCriminalCaseHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3OtherCriminalCaseHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Other Case Page----------------------------------------------------*/
	
	public boolean isOnUnit3OtherCriminalCasePage() {
		return pages.unit3OtherCriminalCasePage.waitPageLoaded();
	}
	
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit3OtherCriminalCasePage.clickButtonCreateCard();
	}

	//Opens Card to view
	public void openCardToView() {
		pages.unit3OtherCriminalCasePage.doubleClickOnFirstRecordInGridOnMainTab();
	}

	//Opens Card to edit
	public void openCardToEdit() {
		pages.unit3OtherCriminalCasePage.clickButtonEdit();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit3OtherCriminalCasePage.getRegNumberFromGridOnMainTab();
	}

	/*--------------------------------Proceeding Card----------------------------------------------------*/


	/*Creates a new Card with filling all fields in and submitting*/
	public void createCard(Unit3OtherCriminalCaseCardModel unit3OtherCriminalCaseCardModel) {
		pages.unit3OtherCriminalCaseCard.setOtherCriminalCaseCardUnit3(unit3OtherCriminalCaseCardModel);
	}

	/*Edits card with changing value in field "Defendant"*/
	public void editCard(Unit3OtherCriminalCaseCardModel unit3OtherCriminalCaseCardModel) {
		pages.unit3OtherCriminalCaseCard.setInputShortStory(unit3OtherCriminalCaseCardModel.getSomeNewText());
	}

	/*---Basic Statements Tab---*/

	/*Checks if in Criminal Card Unit 3*/
	public boolean isOnUnit3OtherCriminalCaseCard() {
		return pages.unit3OtherCriminalCaseCard.isTitleOfCardIsPresent();
	}

	public void goToStagesTab() {
		pages.unit3OtherCriminalCaseCard.clickOnStagesTab();
	}

	//Gets Plaintiff
	public String getCaseNumber() {
		return pages.unit3OtherCriminalCaseCard.getInputCaseNumber();
	}

	/*Returns value in field "Short Story" from later edited card(after its editing)*/
	public String getShortStory() {
		return pages.unit3OtherCriminalCaseCard.getInputShortStory();
	}

	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit3OtherCriminalCaseCard.clickButtonSaveCard();
		pages.unit3OtherCriminalCaseCard.clickOnAlertOK();
	}

	//Quit from Card
	public void quitCard() {
		pages.unit3OtherCriminalCaseCard.clickButtonExitFromCardForm();
	}

	/*---Instance Tab---*/

	//Checks if on "Stages" Tab in "Review Proceeding" Card
	public boolean isStageCreatingUnable() {
		return pages.unit3OtherCriminalCaseCard.isTitleOfGridStageCreatingIsUnablePresent();
	}

	public boolean checkIsButtonCreateFirstInstance() {
		return pages.unit3OtherCriminalCaseCard.isButtonCreateFirstInstancePresent();
	}
	
	
}
