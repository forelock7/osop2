package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit3CriminalProceedingCardModel;

public class Unit3CriminalProceedingHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3CriminalProceedingHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Proceeding Page----------------------------------------------------*/
	
	public boolean isOnUnit3CriminalProceedingPage() {
		return pages.unit3CriminalProceedingPage.waitPageLoaded();
	}
	
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit3CriminalProceedingPage.clickButtonCreateCard();
	}

	//Opens Card to view
	public void openCardToView() {
		pages.unit3CriminalProceedingPage.doubleClickOnFirstRecordInGridOnMainTab();
	}

	//Opens Card to edit
	public void openCardToEdit() {
		pages.unit3CriminalProceedingPage.clickButtonEdit();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit3CriminalProceedingPage.getRegNumberFromGridOnMainTab();
	}

	/*--------------------------------Proceeding Card----------------------------------------------------*/


	/*Creates a new Card with filling all fields in and submitting*/
	public void createCard(Unit3CriminalProceedingCardModel unit3CriminalProceedingCardModel) {
		pages.unit3CriminalProceedingCard.setCriminalProceedingCardUnit3(unit3CriminalProceedingCardModel);
	}

	/*Edits card with changing value in field "Defendant"*/
	public void editCard(Unit3CriminalProceedingCardModel unit3CriminalProceedingCardModel) {
		pages.unit3CriminalProceedingCard.setInputOffenseQualification(unit3CriminalProceedingCardModel.getSomeNewText());
	}

	/*---Basic Statements Tab---*/

	/*Checks if in Criminal Card Unit 3*/
	public boolean isOnUnit3CriminalProceedingCard() {
		return pages.unit3CriminalProceedingCard.isTitleOfCardIsPresent();
	}

	public void goToStagesTab() {
		pages.unit3CriminalProceedingCard.clickOnStagesTab();
	}

	//Gets Plaintiff
	public String getCriminalProceedingNumber() {
		return pages.unit3CriminalProceedingCard.getInputCriminalProceedingNumber();
	}

	/*Returns value in field "Offense Qualification" from later edited card(after its editing)*/
	public String getOffenseQualification() {
		return pages.unit3CriminalProceedingCard.getInputOffenseQualification();
	}

	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit3CriminalProceedingCard.clickButtonSaveCard();
		pages.unit3CriminalProceedingCard.clickOnAlertOK();
	}

	//Quit from Card
	public void quitCard() {
		pages.unit3CriminalProceedingCard.clickButtonExitFromCardForm();
	}

	/*---Instance Tab---*/

	//Checks if on "Stages" Tab in "Review Proceeding" Card
	public boolean isStageCreatingUnable() {
		return pages.unit3CriminalProceedingCard.isTitleOfGridStageCreatingIsUnablePresent();
	}

	public boolean checkIsButtonCreateFirstInstance() {
		return pages.unit3CriminalProceedingCard.isButtonCreateFirstInstancePresent();
	}
}
