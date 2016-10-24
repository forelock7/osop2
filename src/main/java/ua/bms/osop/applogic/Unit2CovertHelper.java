package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit2CovertCardModel;

public class Unit2CovertHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2CovertHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Covert Page----------------------------------------------------*/
	
	public boolean isOnUnit2CovertPage() {
		return pages.unit2CovertPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit2CovertPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit2CovertPage.clickOnRemovedTab();
	}
		
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit2CovertPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	public void openCardToView() {
		pages.unit2CovertPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	public void openCardToEdit() {
		pages.unit2CovertPage.clickButtonEditCard();
	}
	
	/*Removes card(record) from main grid*/
	public void removeCard(Unit2CovertCardModel unit2CovertCardModel){
		pages.unit2CovertPage.removeCardFromGrid(unit2CovertCardModel);
	}
	
	/*Restores later removed card*/
	public void restoreCard(Unit2CovertCardModel unit2CovertCardModel){
		pages.unit2CovertPage.restoreCardFromGrid(unit2CovertCardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit2CovertPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit2CovertPage.getRegNumberFromGridOnMainTab();
	}
	
	/*--------------------------------Covert Card----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	public void createCard(Unit2CovertCardModel unit2CovertCardModel){
		pages.unit2CovertCard.setCovertCardUnit2(unit2CovertCardModel);
	}
	
	/*Edits card with changing value in field "Content"*/
	public void editCard(Unit2CovertCardModel unit2CovertCardModel) {
		pages.unit2CovertCard.setInputCourtResultDate(unit2CovertCardModel.getNewCourtResultDate());
	}
			
	//Gets Prosecutor Decision Date
	public String getProsecutorDecisionDate() {
		return pages.unit2CovertCard.getInputProsecutorDecisionDate();
	}
		
	/*Returns value in field "Content" from later edited card(after its editing)*/
	public String getCourtResultDate(){
		return pages.unit2CovertCard.getInputCourtResultDate();
	}
			
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit2CovertCard.clickButtonSaveCard();
		pages.unit2CovertCard.clickOnAlertOK();
	}
		
	//Quit from Card
	public void quitCard() {
		pages.unit2CovertCard.clickButtonExitFromCardForm();
	}
	
}
