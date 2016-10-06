package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit1ProceedingToPrcHelper;
import ua.bms.osop.model.Unit1ProceedingToPrcCardModel;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 2 - "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури");
 * Related with Unit1ReviewToPrcCard model(ua.bms.osop.model.Unit1ReviewToPrcCard)
 * Uses methods from Unit1ReviewToPrcPage
 */
public class Unit1ProceedingToPrcHelper1 extends DriverBasedHelper implements Unit1ProceedingToPrcHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit1ProceedingToPrcHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Proceeding Page----------------------------------------------------*/
	
	public boolean isOnUnit1ProceedingsToPrcPage() {
		return pages.unit1ProceedingToPrcPage.waitPageLoaded();
	}

	//Opens Card to create
	@Override
	public void openCardToCreate() {
		pages.unit1ProceedingToPrcPage.clickButtonCreateCard();
	}

	//Opens Card to view
	@Override
	public void openCardToView() {
		pages.unit1ProceedingToPrcPage.doubleClickOnFirstRecordInGridOnMainTab();
	}

	//Opens Card to edit
	@Override
	public void openCardToEdit() {
		pages.unit1ProceedingToPrcPage.clickButtonEdit();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit1ProceedingToPrcPage.getRegNumberFromGridOnMainTab();
	}

	/*--------------------------------Proceeding Card----------------------------------------------------*/

	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCard(Unit1ProceedingToPrcCardModel unit1ProceedingToPrcCardModel) {
		pages.unit1ProceedingToPrcCard.setProceedingToPrcCardUnit1(unit1ProceedingToPrcCardModel);
	}

	/*Edits card with changing value in field "Defendant"*/
	@Override
	public void editCard(Unit1ProceedingToPrcCardModel unit1ProceedingToPrcCardModel) {
		pages.unit1ProceedingToPrcCard.setInputDefendant(unit1ProceedingToPrcCardModel.getSomeNewText());
	}

	/*---Basic Statements Tab---*/
	/*Checks if in Inspection Card Unit 5*/
	@Override
	public boolean isOnUnit1ProceedingToPrcCard() {
		return pages.unit1ProceedingToPrcCard.isTitleOfCardIsPresent();
	}

	@Override
	public void goToStagesTab() {
		pages.unit1ProceedingToPrcCard.clickOnStagesTab();
	}

	//Gets Plaintiff
	@Override
	public String getPlaintiff() {
		return pages.unit1ProceedingToPrcCard.getInputPlaintiff();
	}

	/*Returns value in field "Defendant" from later edited card(after its editing)*/
	@Override
	public String getDefendant() {
		return pages.unit1ProceedingToPrcCard.getInputDefendant();
	}



	//Saves Card(clicking "Save" button)
	@Override
	public void saveCard() {
		pages.unit1ProceedingToPrcCard.clickButtonSaveCard();
		pages.unit1ProceedingToPrcCard.clickOnAlertOK();
	}

	//Quit from Card
	@Override
	public void quitCard() {
		pages.unit1ProceedingToPrcCard.clickButtonExitFromCardForm();
	}

		/*---Instance Tab---*/

	//Checks if on "Stages" Tab in "Review Proceeding" Card
	@Override
	public boolean isOnUnit1StagesTab() {
		return pages.unit1ProceedingToPrcCard.isTitleOfGridPresent();
	}

	@Override
	public boolean checkIsButtonCreateFirstInstance() {
		return pages.unit1ProceedingToPrcCard.isButtonCreateFirstInstancePresent();
	}

}
