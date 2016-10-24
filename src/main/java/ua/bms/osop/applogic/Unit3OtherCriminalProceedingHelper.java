package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit3OtherCriminalProceedingCardModel;

public class Unit3OtherCriminalProceedingHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3OtherCriminalProceedingHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Proceeding Page----------------------------------------------------*/
	
	public boolean isOnUnit3OtherCriminalProceedingPage() {
		return pages.unit3OtherCriminalProceedingPage.waitPageLoaded();
	}
	
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit3OtherCriminalProceedingPage.clickButtonCreateCard();
	}

	//Opens Card to view
	public void openCardToView() {
		pages.unit3OtherCriminalProceedingPage.doubleClickOnFirstRecordInGridOnMainTab();
	}

	//Opens Card to edit
	public void openCardToEdit() {
		pages.unit3OtherCriminalProceedingPage.clickButtonEdit();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit3OtherCriminalProceedingPage.getRegNumberFromGridOnMainTab();
	}

	/*--------------------------------Proceeding Card----------------------------------------------------*/


	/*Creates a new Card with filling all fields in and submitting*/
	public void createCard(Unit3OtherCriminalProceedingCardModel unit3OtherCriminalProceedingCardModel) {
		pages.unit3OtherCriminalProceedingCard.setOtherCriminalProceedingCardUnit3(unit3OtherCriminalProceedingCardModel);
	}

	/*Edits card with changing value in field "Defendant"*/
	public void editCard(Unit3OtherCriminalProceedingCardModel unit3OtherCriminalProceedingCardModel) {
		pages.unit3OtherCriminalProceedingCard.setInputShortStory(unit3OtherCriminalProceedingCardModel.getSomeNewText());
	}

	/*---Basic Statements Tab---*/

	/*Checks if in Criminal Card Unit 3*/
	public boolean isOnUnit3OtherCriminalProceedingCard() {
		return pages.unit3OtherCriminalProceedingCard.isTitleOfCardIsPresent();
	}

	public void goToStagesTab() {
		pages.unit3OtherCriminalProceedingCard.clickOnStagesTab();
	}

	//Gets Plaintiff
	public String getProceedingCaseNumber() {
		return pages.unit3OtherCriminalProceedingCard.getInputProceedingCaseNumber();
	}

	/*Returns value in field "Short Story" from later edited card(after its editing)*/
	public String getShortStory() {
		return pages.unit3OtherCriminalProceedingCard.getInputShortStory();
	}

	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit3OtherCriminalProceedingCard.clickButtonSaveCard();
		pages.unit3OtherCriminalProceedingCard.clickOnAlertOK();
	}

	//Quit from Card
	public void quitCard() {
		pages.unit3OtherCriminalProceedingCard.clickButtonExitFromCardForm();
	}

	/*---Instance Tab---*/

	//Checks if on "Stages" Tab in "Review Proceeding" Card
	public boolean isStageCreatingUnable() {
		return pages.unit3OtherCriminalProceedingCard.isTitleOfGridStageCreatingIsUnablePresent();
	}

	public boolean checkIsButtonCreateFirstInstance() {
		return pages.unit3OtherCriminalProceedingCard.isButtonCreateFirstInstancePresent();
	}
	
}
