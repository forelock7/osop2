package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit6CardModel;

/*
 * Ancillary Class for tests on Claims Page Unit 6
 * Implements all methods are used in Unit6ClaimsTest and related with Unit6Card model(ua.bms.osop.model.Unit6Card)
 * Uses methods from Unit6ClaimsPage
 */
public class Unit6Helper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit6Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------Claim Page------------------------------------------*/
	
	/*Checks if on Unit 6 Page*/
	public boolean isOnUnit6Page(){
		return pages.unit6ClaimPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit6ClaimPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit6ClaimPage.clickOnRemovedTab();
	}
	
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit6ClaimPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	public void openCardToView() {
		pages.unit6ClaimPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	public void openCardToEdit() {
		pages.unit6ClaimPage.clickButtonEditCardUnit6();
	}
	
	/*Removes card(record) from main grid on Unit6*/
	public void removeCardUnit6(Unit6CardModel unit6CardModel){
		pages.unit6ClaimPage.removeCardFromGridUnit6(unit6CardModel);
	}
	
	/*Restores later removed card*/
	public void restoreCardUnit6(Unit6CardModel unit6CardModel){
		pages.unit6ClaimPage.restoreCardFromGridUnit6(unit6CardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumberRemovedCardInGrid(){
		return pages.unit6ClaimPage.getRegNumberFromGridOnRemovedTab();
	}
		
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit6ClaimPage.getRegNumberFromGridOnMainTab();
	}
	
	/*---------------------------Claim Card-----------------------------------------*/
		
	/*Creates a new Card with filling all fields in and submitting*/
	public void createCardUnit6(Unit6CardModel unit6CardModel){
		pages.unit6ClaimCard.setCardUnit6(unit6CardModel);
	}
	
	/*Edits card with changing value in field "Summary"*/
	public void editCardUnit6(Unit6CardModel unit6CardModel) {
		pages.unit6ClaimCard.setInputSummaryUnit6(unit6CardModel.getSomeNewText());
	}
		
	//Gets Claim Number
	public String getClaimNumber() {
		return pages.unit6ClaimCard.getInputClaimNumberUnit6();
	}
		
	/*Returns value in field "Summary" from later edited card(after its editing)*/
	public String getSummary(){
		return pages.unit6ClaimCard.getInputSummaryUnit6();
	}
	
	//Quit from Card
	public void saveCard() {
		pages.unit6ClaimCard.clickButtonSaveCard();
		pages.unit6ClaimCard.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit6ClaimCard.clickButtonExitFromCardForm();
	}

}
