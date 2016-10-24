package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit2ActOACardModel;

public class Unit2ActOAHelper extends DriverBasedHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2ActOAHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*-------------------------------- Page ----------------------------------------------------*/
	
	public boolean isOnUnit2ActsOAPage() {
		return pages.unit2ActOAPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit2ActOAPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit2ActOAPage.clickOnRemovedTab();
	}
		
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit2ActOAPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	public void openCardToView() {
		pages.unit2ActOAPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	public void openCardToEdit() {
		pages.unit2ActOAPage.clickButtonEditCard();
	}
	
	/*Removes card(record) from main grid on Unit4*/
	public void removeCard(Unit2ActOACardModel unit2ActOACardModel){
		pages.unit2ActOAPage.removeCardFromGrid(unit2ActOACardModel);
	}
	
	/*Restores later removed card*/
	public void restoreCard(Unit2ActOACardModel unit2ActOACardModel){
		pages.unit2ActOAPage.restoreCardFromGrid(unit2ActOACardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit2ActOAPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit2ActOAPage.getRegNumberFromGridOnMainTab();
	}
	
	/*--------------------------------Pre-Investigation Act Card----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	public void createCard(Unit2ActOACardModel unit2ActOACardModel){
		pages.unit2ActOACard.setActOACardUnit2(unit2ActOACardModel);
	}
	
	/*Edits card with changing value in field "Amount Of Checked"*/
	public void editCard(Unit2ActOACardModel unit2ActOACardModel) {
		pages.unit2ActOACard.setInputAmountOfChecked(unit2ActOACardModel.getSomeNewText());
	}
			
	//Gets Amount Of Checked
	public String getAmountOfChecked() {
		return pages.unit2ActOACard.getInputAmountOfChecked();
	}
	
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit2ActOACard.clickButtonSaveCard();
		pages.unit2ActOACard.clickOnAlertOK();
	}
		
	//Quit from Card
	public void quitCard() {
		pages.unit2ActOACard.clickButtonExitFromCardForm();
	}

}
