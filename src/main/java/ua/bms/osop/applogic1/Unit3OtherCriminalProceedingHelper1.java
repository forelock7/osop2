package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3OtherCriminalProceedingHelper;
import ua.bms.osop.model.Unit3OtherCriminalProceedingCardModel;

public class Unit3OtherCriminalProceedingHelper1 extends DriverBasedHelper implements Unit3OtherCriminalProceedingHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3OtherCriminalProceedingHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Proceeding Page----------------------------------------------------*/
	
	public boolean isOnUnit3OtherCriminalProceedingPage() {
		return pages.unit3OtherCriminalProceedingPage.waitPageLoaded();
	}
	
	//Opens Card to create
	@Override
	public void openCardToCreate() {
		pages.unit3OtherCriminalProceedingPage.clickButtonCreateCard();
	}

	//Opens Card to view
	@Override
	public void openCardToView() {
		pages.unit3OtherCriminalProceedingPage.doubleClickOnFirstRecordInGridOnMainTab();
	}

	//Opens Card to edit
	@Override
	public void openCardToEdit() {
		pages.unit3OtherCriminalProceedingPage.clickButtonEdit();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit3OtherCriminalProceedingPage.getRegNumberFromGridOnMainTab();
	}

	/*--------------------------------Proceeding Card----------------------------------------------------*/


	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCard(Unit3OtherCriminalProceedingCardModel unit3OtherCriminalProceedingCardModel) {
		pages.unit3OtherCriminalProceedingCard.setOtherCriminalProceedingCardUnit3(unit3OtherCriminalProceedingCardModel);
	}

	/*Edits card with changing value in field "Defendant"*/
	@Override
	public void editCard(Unit3OtherCriminalProceedingCardModel unit3OtherCriminalProceedingCardModel) {
		pages.unit3OtherCriminalProceedingCard.setInputShortStory(unit3OtherCriminalProceedingCardModel.getSomeNewText());
	}

	/*---Basic Statements Tab---*/

	/*Checks if in Criminal Card Unit 3*/
	@Override
	public boolean isOnUnit3OtherCriminalProceedingCard() {
		return pages.unit3OtherCriminalProceedingCard.isTitleOfCardIsPresent();
	}

	@Override
	public void goToStagesTab() {
		pages.unit3OtherCriminalProceedingCard.clickOnStagesTab();
	}

	//Gets Plaintiff
	@Override
	public String getProceedingCaseNumber() {
		return pages.unit3OtherCriminalProceedingCard.getInputProceedingCaseNumber();
	}

	/*Returns value in field "Short Story" from later edited card(after its editing)*/
	@Override
	public String getShortStory() {
		return pages.unit3OtherCriminalProceedingCard.getInputShortStory();
	}

	//Saves Card(clicking "Save" button)
	@Override
	public void saveCard() {
		pages.unit3OtherCriminalProceedingCard.clickButtonSaveCard();
		pages.unit3OtherCriminalProceedingCard.clickOnAlertOK();
	}

	//Quit from Card
	@Override
	public void quitCard() {
		pages.unit3OtherCriminalProceedingCard.clickButtonExitFromCardForm();
	}

	/*---Instance Tab---*/

	//Checks if on "Stages" Tab in "Review Proceeding" Card
	@Override
	public boolean isStageCreatingUnable() {
		return pages.unit3OtherCriminalProceedingCard.isTitleOfGridStageCreatingIsUnablePresent();
	}

	@Override
	public boolean checkIsButtonCreateFirstInstance() {
		return pages.unit3OtherCriminalProceedingCard.isButtonCreateFirstInstancePresent();
	}
	
}
