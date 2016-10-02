package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit6Helper;
import ua.bms.osop.model.Unit6Card;

/*
 * Ancillary Class for tests on Claims Page Unit 6
 * Implements all methods are used in Unit6ClaimsTest and related with Unit6Card model(ua.bms.osop.model.Unit6Card)
 * Uses methods from Unit6ClaimsPage
 */
public class Unit6Helper1 extends DriverBasedHelper implements Unit6Helper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit6Helper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------Claim Page------------------------------------------*/
	
	/*Checks if on Unit 6 Page*/
	@Override
	public boolean isOnUnit6Page(){
		return pages.unit6ClaimsPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit6ClaimsPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit6ClaimsPage.clickOnRemovedTab();
	}
	
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit6ClaimsPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	@Override
	public void openCardToView() {
		pages.unit6ClaimsPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	@Override
	public void openCardToEdit() {
		pages.unit6ClaimsPage.clickButtonEditCardUnit6();
	}
	
	/*Removes card(record) from main grid on Unit6*/
	@Override
	public void removeCardUnit6(Unit6Card unit6Card){
		pages.unit6ClaimsPage.removeCardFromGridUnit6(unit6Card);
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreCardUnit6(Unit6Card unit6Card){
		pages.unit6ClaimsPage.restoreCardFromGridUnit6(unit6Card);
	}
	
	/*---------------------------Claim Card-----------------------------------------*/
		
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCardUnit6(Unit6Card unit6Card){
		pages.unit6ClaimsPage.setCardUnit6(unit6Card);
	}
	
	/*Edits card with changing value in field "Summary"*/
	@Override
	public void editCardUnit6(Unit6Card unit6Card) {
		pages.unit6ClaimsPage.setInputSummaryUnit6(unit6Card.someNewText);
	}
		
	//Gets Claim Number
	@Override
	public String getClaimNumber() {
		return pages.unit6ClaimsPage.getInputClaimNumberUnit6();
	}
		
	/*Returns value in field "Summary" from later edited card(after its editing)*/
	@Override
	public String getSummary(){
		return pages.unit6ClaimsPage.getInputSummaryUnit6();
	}
		
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberRemovedCardInGrid(){
		return pages.unit6ClaimsPage.getRegNumberFromGridOnRemovedTab();
	}
		
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit6ClaimsPage.getRegNumberFromGridOnMainTab();
	}
	
	//Quit from Card
	public void saveCard() {
		pages.unit6ClaimsPage.clickButtonSaveCard();
		pages.unit6ClaimsPage.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit6ClaimsPage.clickButtonExitFromCardForm();
	}

}
