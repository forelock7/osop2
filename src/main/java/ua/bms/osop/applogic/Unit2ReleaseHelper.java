package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit2ReleaseCardModel;

public class Unit2ReleaseHelper extends DriverBasedHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2ReleaseHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Release Page----------------------------------------------------*/
	
	public boolean isOnUnit2ReleasePage() {
		return pages.unit2ReleasePage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit2ReleasePage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit2ReleasePage.clickOnRemovedTab();
	}
		
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit2ReleasePage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	public void openCardToView() {
		pages.unit2ReleasePage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	public void openCardToEdit() {
		pages.unit2ReleasePage.clickButtonEditCard();
	}
	
	/*Removes card(record) from main grid on Unit4*/
	public void removeCard(Unit2ReleaseCardModel unit2ReleaseCardModel){
		pages.unit2ReleasePage.removeCardFromGrid(unit2ReleaseCardModel);
	}
	
	/*Restores later removed card*/
	public void restoreCard(Unit2ReleaseCardModel unit2ReleaseCardModel){
		pages.unit2ReleasePage.restoreCardFromGrid(unit2ReleaseCardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit2ReleasePage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit2ReleasePage.getRegNumberFromGridOnMainTab();
	}
	
	/*--------------------------------Release Card----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	public void createCard(Unit2ReleaseCardModel unit2ReleaseCardModel){
		pages.unit2ReleaseCard.setReleaseCardUnit2(unit2ReleaseCardModel);
	}
	
	/*Edits card with changing value in field "Content"*/
	public void editCard(Unit2ReleaseCardModel unit2ReleaseCardModel) {
		pages.unit2ReleaseCard.setInputCaseNumber(unit2ReleaseCardModel.getSomeNewText());
	}
			
	//Gets Proceeding Number
	public String getProceedingNumber() {
		return pages.unit2ReleaseCard.getInputProceedingNumber();
	}
		
	/*Returns value in field "Content" from later edited card(after its editing)*/
	public String getCaseNumber(){
		return pages.unit2ReleaseCard.getInputCaseNumber();
	}
		
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit2ReleaseCard.clickButtonSaveCard();
		pages.unit2ReleaseCard.clickOnAlertOK();
	}
		
	//Quit from Card
	public void quitCard() {
		pages.unit2ReleaseCard.clickButtonExitFromCardForm();
	}

}
