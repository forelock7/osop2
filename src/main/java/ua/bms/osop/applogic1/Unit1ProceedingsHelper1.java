package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit1ProceedingsHelper;
import ua.bms.osop.model.Unit1ProceedingCardModel;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 1 - "Review proceedings on a claim"("НП за позовом");
 * Related with Unit1ReviewCard model(ua.bms.osop.model.Unit1ReviewCard)
 * Uses methods from Unit1ReviewPage
 */
public class Unit1ProceedingsHelper1 extends DriverBasedHelper implements Unit1ProceedingsHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit1ProceedingsHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Proceeding Page----------------------------------------------------*/
	
	public boolean isOnUnit1ProceedingsPage() {
		return pages.unit1ProceedingPage.waitPageLoaded();
	}

	//Opens Card to create
	@Override
	public void openCardToCreate() {
		pages.unit1ProceedingPage.clickButtonCreateCard();
	}

	//Opens Card to view
	@Override
	public void openCardToView() {
		pages.unit1ProceedingPage.doubleClickOnFirstRecordInGridOnMainTab();
	}

	//Opens Card to edit
	@Override
	public void openCardToEdit() {
		pages.unit1ProceedingPage.clickButtonEdit();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit1ProceedingPage.getRegNumberFromGridOnMainTab();
	}

	/*--------------------------------Proceeding Card----------------------------------------------------*/


	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCard(Unit1ProceedingCardModel unit1ProceedingCardModel) {
		pages.unit1ProceedingCard.setProceedingCardUnit1(unit1ProceedingCardModel);
	}

	/*Edits card with changing value in field "Defendant"*/
	@Override
	public void editCard(Unit1ProceedingCardModel unit1ProceedingCardModel) {
		pages.unit1ProceedingCard.setInputDefendant(unit1ProceedingCardModel.getSomeNewText());
	}

	/*---Basic Statements Tab---*/

	/*Checks if in Inspection Card Unit 5*/
	@Override
	public boolean isOnUnit1ProceedingCard() {
		return pages.unit1ProceedingCard.isTitleOfCardIsPresent();
	}

	@Override
	public void goToStagesTab() {
		pages.unit1ProceedingCard.clickOnStagesTab();
	}

	//Gets Plaintiff
	@Override
	public String getPlaintiff() {
		return pages.unit1ProceedingCard.getInputPlaintiff();
	}

	/*Returns value in field "Defendant" from later edited card(after its editing)*/
	@Override
	public String getDefendant() {
		return pages.unit1ProceedingCard.getInputDefendant();
	}

	//Saves Card(clicking "Save" button)
	@Override
	public void saveCard() {
		pages.unit1ProceedingCard.clickButtonSaveCard();
		pages.unit1ProceedingCard.clickOnAlertOK();
	}

	//Quit from Card
	@Override
	public void quitCard() {
		pages.unit1ProceedingCard.clickButtonExitFromCardForm();
	}

	/*---Instance Tab---*/

	//Checks if on "Stages" Tab in "Review Proceeding" Card
	@Override
	public boolean isOnUnit1StagesTab() {
		return pages.unit1ProceedingCard.isTitleOfGridPresent();
	}

	@Override
	public boolean checkIsButtonCreateFirstInstance() {
		return pages.unit1ProceedingCard.isButtonCreateFirstInstancePresent();
	}


}
