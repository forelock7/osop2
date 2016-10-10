package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit3OtherCriminalCaseHelper;
import ua.bms.osop.model.Unit3OtherCriminalCaseCardModel;

public class Unit3OtherCriminalCaseHelper1 extends DriverBasedHelper implements Unit3OtherCriminalCaseHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit3OtherCriminalCaseHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Other Case Page----------------------------------------------------*/
	
	public boolean isOnUnit3OtherCriminalCasePage() {
		return pages.unit3OtherCriminalCasePage.waitPageLoaded();
	}
	
	//Opens Card to create
	@Override
	public void openCardToCreate() {
		pages.unit3OtherCriminalCasePage.clickButtonCreateCard();
	}

	//Opens Card to view
	@Override
	public void openCardToView() {
		pages.unit3OtherCriminalCasePage.doubleClickOnFirstRecordInGridOnMainTab();
	}

	//Opens Card to edit
	@Override
	public void openCardToEdit() {
		pages.unit3OtherCriminalCasePage.clickButtonEdit();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit3OtherCriminalCasePage.getRegNumberFromGridOnMainTab();
	}

	/*--------------------------------Proceeding Card----------------------------------------------------*/


	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCard(Unit3OtherCriminalCaseCardModel unit3OtherCriminalCaseCardModel) {
		pages.unit3OtherCriminalCaseCard.setOtherCriminalCaseCardUnit3(unit3OtherCriminalCaseCardModel);
	}

	/*Edits card with changing value in field "Defendant"*/
	@Override
	public void editCard(Unit3OtherCriminalCaseCardModel unit3OtherCriminalCaseCardModel) {
		pages.unit3OtherCriminalCaseCard.setInputShortStory(unit3OtherCriminalCaseCardModel.getSomeNewText());
	}

	/*---Basic Statements Tab---*/

	/*Checks if in Criminal Card Unit 3*/
	@Override
	public boolean isOnUnit3OtherCriminalCaseCard() {
		return pages.unit3OtherCriminalCaseCard.isTitleOfCardIsPresent();
	}

	@Override
	public void goToStagesTab() {
		pages.unit3OtherCriminalCaseCard.clickOnStagesTab();
	}

	//Gets Plaintiff
	@Override
	public String getCaseNumber() {
		return pages.unit3OtherCriminalCaseCard.getInputCaseNumber();
	}

	/*Returns value in field "Short Story" from later edited card(after its editing)*/
	@Override
	public String getShortStory() {
		return pages.unit3OtherCriminalCaseCard.getInputShortStory();
	}

	//Saves Card(clicking "Save" button)
	@Override
	public void saveCard() {
		pages.unit3OtherCriminalCaseCard.clickButtonSaveCard();
		pages.unit3OtherCriminalCaseCard.clickOnAlertOK();
	}

	//Quit from Card
	@Override
	public void quitCard() {
		pages.unit3OtherCriminalCaseCard.clickButtonExitFromCardForm();
	}

	/*---Instance Tab---*/

	//Checks if on "Stages" Tab in "Review Proceeding" Card
	@Override
	public boolean isStageCreatingUnable() {
		return pages.unit3OtherCriminalCaseCard.isTitleOfGridStageCreatingIsUnablePresent();
	}

	@Override
	public boolean checkIsButtonCreateFirstInstance() {
		return pages.unit3OtherCriminalCaseCard.isButtonCreateFirstInstancePresent();
	}
	
	
}
