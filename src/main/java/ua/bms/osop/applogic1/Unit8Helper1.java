package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit8Helper;
import ua.bms.osop.model.Unit8Card;

/*
 * Ancillary Class for tests on Requests Page Unit 8
 * Implements all methods are used in Unit8RequestsTest and related with Unit8Card model(ua.bms.osop.model.Unit8Card)
 * Uses methods from Unit8RequestsPage
 */
public class Unit8Helper1 extends DriverBasedHelper implements Unit8Helper  {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit8Helper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*----------------------------Request Page-----------------------------------------------------*/
	
	/*Checks if on Unit 8 Page*/
	@Override
	public boolean isOnUnit8Page(){
		return pages.unit8RequestsPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void moveToMainTab() {
		pages.unit8RequestsPage.goToMainTab();
	}
	
	//Moves to Removed Tab
	public void moveToRemovedTab() {
		pages.unit8RequestsPage.goToRemovedTab();
	}
	
	//Opens Card to create 
	@Override
	public void openCardToCreate() {
		pages.unit8RequestsPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	@Override
	public void openCardToView() {
		pages.unit8RequestsPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	@Override
	public void openCardToEdit() {
		pages.unit8RequestsPage.clickButtonEditCardUnit8();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit8RequestsPage.getRegNumberFromGridOnMainTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumbreFirstRemovedCardInGrid(){
		return pages.unit8RequestsPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*----------------------------Request Card-----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCardUnit8(Unit8Card unit8Card){
		pages.unit8RequestsPage.setCardUnit8(unit8Card);
	}
	
	/*Edits card with changing value in field "Summary"*/
	@Override
	public void editCardUnit8(Unit8Card unit8Card) {
		pages.unit8RequestsPage.setInputSummaryUnit8(unit8Card.someNewText);

	}
	
	//Gets Claim Number
	@Override
	public String getRequestNumber() {
		return pages.unit8RequestsPage.getInputRequestNumberUnit8();
	}
	
	/*Removes card(record) from main grid on Unit8*/
	@Override
	public void removeCardUnit8(Unit8Card unit8Card){
		pages.unit8RequestsPage.removeCardFromGridUnit8(unit8Card);
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreCardUnit8(Unit8Card unit8Card){
		pages.unit8RequestsPage.restoreCardFromGridUnit8(unit8Card);
	}
		
	/*Returns value in field "Summary" from later edited card(after its editing)*/
	@Override
	public String getSummary(){
		return pages.unit8RequestsPage.getInputSummaryUnit8();
	}
		
	//Save Card
	public void saveCard() {
		pages.unit8RequestsPage.clickButtonSaveCard();
		pages.unit8RequestsPage.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit8RequestsPage.clickButtonExitFromCardForm();
	}

}
