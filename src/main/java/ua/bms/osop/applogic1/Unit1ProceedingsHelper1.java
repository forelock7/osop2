package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit1ProceedingsHelper;
import ua.bms.osop.model.Unit1ProceedingCard;

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
	
	public boolean isOnUnit1ProceedingsPage() {
		return pages.unit1ProceedingsPage.waitPageLoaded();
	}

	//Opens Card to create
	@Override
	public void openCardToCreate() {
		pages.unit1ProceedingsPage.clickButtonCreateCard();
	}

	//Opens Card to view
	@Override
	public void openCardToView() {
		pages.unit1ProceedingsPage.doubleClickOnFirstRecordInGridOnMainTab();
	}

	//Opens Card to edit
	@Override
	public void openCardToEdit() {
		pages.unit1ProceedingsPage.clickButtonEdit();
	}

	/*--------------------------------Proceeding Card----------------------------------------------------*/


	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCard(Unit1ProceedingCard unit1ProceedingCard) {
		pages.unit1ProceedingsPage.setProceedingCardUnit1(unit1ProceedingCard);
	}

	/*Edits card with changing value in field "Defendant"*/
	@Override
	public void editCard(Unit1ProceedingCard unit1ProceedingCard) {
		pages.unit1ProceedingsPage.setInputDefendant(unit1ProceedingCard.someNewText);
	}

	/*---Basic Statements Tab---*/

	/*Checks if in Inspection Card Unit 5*/
	@Override
	public boolean isOnUnit1ProceedingCard() {
		return pages.unit1ProceedingsPage.isTitleOfCardIsPresent();
	}

	@Override
	public void goToStagesTab() {
		pages.unit1ProceedingsPage.clickOnStagesTab();
	}

	//Gets Plaintiff
	@Override
	public String getPlaintiff() {
		return pages.unit1ProceedingsPage.getInputPlaintiff();
	}

	/*Returns value in field "Defendant" from later edited card(after its editing)*/
	@Override
	public String getDefendant() {
		return pages.unit1ProceedingsPage.getInputDefendant();
	}

	/*
 * Gets number of the first record(card) in grid on the main tab
 * Checks existing of later restoring card
 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit1ProceedingsPage.getRegNumberFromGridOnMainTab();
	}

	//Saves Card(clicking "Save" button)
	@Override
	public void saveCard() {
		pages.unit1ProceedingsPage.clickButtonSaveCard();
		pages.unit1ProceedingsPage.clickOnAlertOK();
	}

	//Quit from Card
	@Override
	public void quitCard() {
		pages.unit1ProceedingsPage.clickButtonExitFromCardForm();
	}

	/*---Instance Tab---*/

	//Checks if on "Stages" Tab in "Review Proceeding" Card
	@Override
	public boolean isOnUnit1StagesTab() {
		return pages.unit1ProceedingsPage.isTitleOfGridPresent();
	}

	@Override
	public boolean checkIsButtonCreateFirstInstance() {
		return pages.unit1ProceedingsPage.isButtonCreateFirstInstancePresent();
	}


}
