package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit2AppealCardModel;

public class Unit2AppealHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2AppealHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}

	
	/*--------------------------------Appeal Page----------------------------------------------------*/
	
	/*Checks if on Unit 2 Page*/
	public boolean isOnUnit2AppealsPage() {
		return pages.unit2AppealPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit2AppealPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit2AppealPage.clickOnRemovedTab();
	}
		
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit2AppealPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	public void openCardToView() {
		pages.unit2AppealPage.doubleClickOnFirstRecordInGridOnMainTab();
		pages.unit2AppealCard.getValueRegistrationNumber();
	}
	
	//Opens Card to edit 
	public void openCardToEdit() {
		pages.unit2AppealPage.clickButtonEditCard();
	}
	
	/*Removes card(record) from main grid*/
	public void removeCard(Unit2AppealCardModel unit2AppealCardModel){
		pages.unit2AppealPage.removeCardFromGrid(unit2AppealCardModel);
	}
	
	/*Restores later removed card*/
	public void restoreCard(Unit2AppealCardModel unit2AppealCardModel){
		pages.unit2AppealPage.restoreCardFromGrid(unit2AppealCardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit2AppealPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit2AppealPage.getRegNumberFromGridOnMainTab();
	}
	
	/*--------------------------------Appeal Card----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	public void createCard(Unit2AppealCardModel unit2AppealCardModel){
		pages.unit2AppealCard.setAppealCardUnit2(unit2AppealCardModel);
	}
	
	/*Edits card with changing value in field "Content"*/
	public void editCard(Unit2AppealCardModel unit2AppealCardModel) {
		pages.unit2AppealCard.setInputGroundsForAppeal(unit2AppealCardModel.getSomeNewText());
	}
	
	//Gets Registration Number
	public String getRegistrationNumber() {
		return pages.unit2AppealCard.getValueRegistrationNumber();
	}
			
	//Gets Proceeding Number
	public String getProceedingNumber() {
		return pages.unit2AppealCard.getInputProceedingNumber();
	}
		
	/*Returns value in field from later edited card(after its editing)*/
	public String getGroundsForAppeal(){
		return pages.unit2AppealCard.getInputGroundsForAppeal();
	}
			
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit2AppealCard.clickButtonSaveCard();
		pages.unit2AppealCard.clickOnAlertOK();
	}
		
	//Quit from Card
	public void quitCard() {
		pages.unit2AppealCard.clickButtonExitFromCardForm();
	}
}
