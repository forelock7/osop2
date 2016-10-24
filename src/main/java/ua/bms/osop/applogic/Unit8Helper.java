package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit8CardModel;

/*
 * Ancillary Class for tests on Requests Page Unit 8
 * Implements all methods are used in Unit8RequestsTest and related with Unit8Card model(ua.bms.osop.model.Unit8Card)
 * Uses methods from Unit8RequestsPage
 */
public class Unit8Helper extends DriverBasedHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit8Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*----------------------------Request Page-----------------------------------------------------*/
	
	/*Checks if on Unit 8 Page*/
	public boolean isOnUnit8Page(){
		return pages.unit8RequestPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit8RequestPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit8RequestPage.clickOnRemovedTab();
	}
	
	//Opens Card to create 
	public void openCardToCreate() {
		pages.unit8RequestPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	public void openCardToView() {
		pages.unit8RequestPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	public void openCardToEdit() {
		pages.unit8RequestPage.clickButtonEditCardUnit8();
	}
	
	/*Removes card(record) from main grid on Unit8*/
	public void removeCardUnit8(Unit8CardModel unit8CardModel){
		pages.unit8RequestPage.removeCardFromGridUnit8(unit8CardModel);
	}
	
	/*Restores later removed card*/
	public void restoreCardUnit8(Unit8CardModel unit8CardModel){
		pages.unit8RequestPage.restoreCardFromGridUnit8(unit8CardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit8RequestPage.getRegNumberFromGridOnMainTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumbreFirstRemovedCardInGrid(){
		return pages.unit8RequestPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*----------------------------Request Card-----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	public void createCardUnit8(Unit8CardModel unit8CardModel){
		pages.unit8RequestCard.setCardUnit8(unit8CardModel);
	}
	
	/*Edits card with changing value in field "Summary"*/
	public void editCardUnit8(Unit8CardModel unit8CardModel) {
		pages.unit8RequestCard.setInputSummaryUnit8(unit8CardModel.getSomeNewText());

	}
	
	//Gets Claim Number
	public String getRequestNumber() {
		return pages.unit8RequestCard.getInputRequestNumberUnit8();
	}
	

		
	/*Returns value in field "Summary" from later edited card(after its editing)*/
	public String getSummary(){
		return pages.unit8RequestCard.getInputSummaryUnit8();
	}
		
	//Save Card
	public void saveCard() {
		pages.unit8RequestCard.clickButtonSaveCard();
		pages.unit8RequestCard.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit8RequestCard.clickButtonExitFromCardForm();
	}

}
