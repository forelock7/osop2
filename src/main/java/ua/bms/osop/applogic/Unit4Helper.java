package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit4CardModel;

/*
 * Ancillary Class for tests on International Judicial Cooperation Page - Unit 4 ("Міжнародно-правове співробітництво")
 * Implements all methods are used in Unit4InternationalTest and related with Unit4Card model(ua.bms.osop.model.Unit4Card)
 * Uses methods from Unit4InternationalPage
 */
public class Unit4Helper extends DriverBasedHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit4Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------International Page----------------------------------------------------*/
	
	/*Checks if on Unit 4 Page*/
	public boolean isOnUnit4Page(){
		return pages.unit4InternationalPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit4InternationalPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit4InternationalPage.clickOnRemovedTab();
	}
		
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit4InternationalPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	public void openCardToView() {
		pages.unit4InternationalPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	public void openCardToEdit() {
		pages.unit4InternationalPage.clickButtonEditCard();
	}
	
	/*Removes card(record) from main grid on Unit4*/
	public void removeCard(Unit4CardModel unit4CardModel){
		pages.unit4InternationalPage.removeCardFromGrid(unit4CardModel);
	}
	
	/*Restores later removed card*/
	public void restoreCard(Unit4CardModel unit4CardModel){
		pages.unit4InternationalPage.restoreCardFromGrid(unit4CardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit4InternationalPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit4InternationalPage.getRegNumberFromGridOnMainTab();
	}
	
	/*--------------------------------International Card----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	public void createCard(Unit4CardModel unit4CardModel){
		pages.unit4InternationalCard.setCardUnit4(unit4CardModel);
	}
	
	/*Edits card with changing value in field "Summary"*/
	public void editCard(Unit4CardModel unit4CardModel) {
		pages.unit4InternationalCard.setInputSummaryUnit4(unit4CardModel.getSomeNewText());
	}
			
	//Gets Claim Number
	public String getClaimNumber() {
		return pages.unit4InternationalCard.getInputClaimNumberUnit4();
	}
		
	/*Returns value in field "Summary" from later edited card(after its editing)*/
	public String getSummary(){
		return pages.unit4InternationalCard.getInputSummaryUnit4();
	}
		
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit4InternationalCard.clickButtonSaveCard();
		pages.unit4InternationalCard.clickOnAlertOK();
	}
		
	//Quit from Card
	public void quitCard() {
		pages.unit4InternationalCard.clickButtonExitFromCardForm();
	}

}
