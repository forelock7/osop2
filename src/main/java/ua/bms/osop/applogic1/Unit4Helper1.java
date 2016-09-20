package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit4Helper;
import ua.bms.osop.model.Unit4Card;

/*
 * Ancillary Class for tests on International Judicial Cooperation Page - Unit 4 ("Міжнародно-правове співробітництво")
 * Implements all methods are used in Unit4InternationalTest and related with Unit4Card model(ua.bms.osop.model.Unit4Card)
 * Uses methods from Unit4InternationalPage
 */
public class Unit4Helper1 extends DriverBasedHelper implements Unit4Helper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit4Helper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------International Page----------------------------------------------------*/
	
	/*Checks if on Unit 4 Page*/
	@Override
	public boolean isOnUnit4Page(){
		return pages.unit4InternationalPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void moveToMainTab() {
		pages.unit4InternationalPage.goToMainTab();
	}
	
	//Moves to Removed Tab
	public void moveToRemovedTab() {
		pages.unit4InternationalPage.goToRemovedTab();
	}
		
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit4InternationalPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	@Override
	public void openCardToReview() {
		pages.unit4InternationalPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	@Override
	public void openCardToEdit() {
		pages.unit4InternationalPage.clickButtonEditCardUnit4();
	}
	
	/*Removes card(record) from main grid on Unit4*/
	@Override
	public void removeCardUnit4(Unit4Card unit4Card){
		pages.unit4InternationalPage.removeCardFromGridUnit4(unit4Card);
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreCardUnit4(Unit4Card unit4Card){
		pages.unit4InternationalPage.restoreCardFromGridUnit4(unit4Card);
	}
	
	/*--------------------------------International Card----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCard(Unit4Card unit4Card){
		pages.unit4InternationalPage.setCardUnit4(unit4Card);
	}
	
	/*Edits card with changing value in field "Summary"*/
	@Override
	public void editCard(Unit4Card unit4Card) {
		pages.unit4InternationalPage.setInputSummaryUnit4(unit4Card.someNewText);
	}
			
	//Gets Claim Number
	@Override
	public String getClaimNumber() {
		return pages.unit4InternationalPage.getInputClaimNumberUnit4();
	}
		
	/*Returns value in field "Summary" from later edited card(after its editing)*/
	@Override
	public String getSummary(){
		return pages.unit4InternationalPage.getInputSummaryUnit4();
	}
		
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberFirstRemovedCardInGrid(){
		
		return pages.unit4InternationalPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit4InternationalPage.getRegNumberFromGridOnMainTab();
	}
	
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit4InternationalPage.clickButtonSaveCard();
		pages.unit4InternationalPage.clickOnAlertOK();
	}
		
	//Quit from Card
	public void quitCard() {
		pages.unit4InternationalPage.clickButtonExitFromCardForm();
	}

}