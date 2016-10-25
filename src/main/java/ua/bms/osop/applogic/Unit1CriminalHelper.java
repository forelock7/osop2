package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit1CriminalCardModel;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 3 - "List of Charged Person"("Розпочато кримінальних проваджень")
 * Related with Unit1CrimeCard model(ua.bms.osop.model.Unit1CrimeCard)
 * Uses methods from Unit1CrimePage
 */
public class Unit1CriminalHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit1CriminalHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Criminal Page----------------------------------------------------*/
	
	public boolean isOnUnit1CrimePage() {
		return pages.unit1CriminalPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit1CriminalPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit1CriminalPage.clickOnRemovedTab();
	}
		
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit1CriminalPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	public void openCardToView() {
		pages.unit1CriminalPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	public void openCardToEdit() {
		pages.unit1CriminalPage.clickButtonEditCard();
	}
	
	/*Removes card(record) from main grid on Unit4*/
	public void removeCard(Unit1CriminalCardModel unit1CriminalCardModel){
		pages.unit1CriminalPage.removeCardFromGrid(unit1CriminalCardModel);
	}
	
	/*Restores later removed card*/
	public void restoreCard(Unit1CriminalCardModel unit1CriminalCardModel){
		pages.unit1CriminalPage.restoreCardFromGrid(unit1CriminalCardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit1CriminalPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit1CriminalPage.getRegNumberFromGridOnMainTab();
	}
	
	/*--------------------------------Criminal Card----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	public void createCard(Unit1CriminalCardModel unit1CriminalCardModel){
		pages.unit1CriminalCard.setCriminalCardUnit1(unit1CriminalCardModel);
	}
	
	/*Edits card with changing value in field "Summary"*/
	public void editCard(Unit1CriminalCardModel unit1CriminalCardModel) {
		pages.unit1CriminalCard.setInputTheory(unit1CriminalCardModel.getSomeNewText());
	}
			
	//Gets Criminal Proceeding Number
	public String getCriminalProceedingNumber() {
		return pages.unit1CriminalCard.getInputCriminalProceedingNumber();
	}
		
	/*Returns value in field "Theory" from later edited card(after its editing)*/
	public String getTheory(){
		return pages.unit1CriminalCard.getInputTheory();
	}
		
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit1CriminalCard.clickButtonSaveCard();
		pages.unit1CriminalCard.clickOnAlertOK();
	}

	//Quit from Card
	public void quitCard() {
		pages.unit1CriminalCard.clickButtonExitFromCardForm();
	}

}
