package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit9CardModel;

/*
 * Ancillary Class for tests on Military Administrative Offenses Page
 * Implements all methods are used in Unit9MilitaryTest and related with Unit9Card model(ua.bms.osop.model.Unit9Card)
 * Uses methods from Unit9MilitaryPage
 */
public class Unit9Helper extends DriverBasedHelper {
	
	/*
	 * Constructor of object which is managed by object Application Manager.
	 */
	public Unit9Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*----------------------------Military Page-----------------------------------------------------*/
	
	/*Checks if on Unit 9 Page*/
	public boolean isOnUnit9Page(){
		return pages.unit9MilitaryPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit9MilitaryPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit9MilitaryPage.clickOnRemovedTab();
	}
	
	//Opens Card to create 
	public void openCardToCreate() {
		pages.unit9MilitaryPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	public void openCardToView() {
		pages.unit9MilitaryPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	public void openCardToEdit() {
		pages.unit9MilitaryPage.clickButtonEditCardUnit9();
	}
	
	/*Removes card(record) from main grid on Unit9*/
	public void removeCardUnit9(Unit9CardModel unit9CardModel){
		pages.unit9MilitaryPage.removeCardUnit9(unit9CardModel);
	}
	
	/*Restores later removed card*/
	public void restoreCardUnit9(Unit9CardModel unit9CardModel){
		pages.unit9MilitaryPage.restoreCardUnit9(unit9CardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit9MilitaryPage.getRegNumberFromGridOnRemovedTab();
	}
		
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit9MilitaryPage.getRegNumberFromGridOnMainTab();
	}
	
	/*----------------------------Military Card-----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	public void createCardUnit9(Unit9CardModel unit9CardModel){
		pages.unit9MilitaryCard.setCardUnit9(unit9CardModel);
	}
	
	/*Edits card with changing value in field "Theory"*/
	public void editCardUnit9(Unit9CardModel unit9CardModel){
		pages.unit9MilitaryCard.setInputTheoryUnit9(unit9CardModel.getSomeNewText());
	}
		
	//Gets Claim Number
	public String getProtNumber() {
		return pages.unit9MilitaryCard.getInputProtocolNumberUnit9();
	}
		
	/*
	 * Returns value in field "Author Of Speech" from later edited card(after its editing)
	 * The first record(card) in main grid should be the last created.
	 * Checks editing of card.
	 */
	public String getTheory(){
		return pages.unit9MilitaryCard.getInputTheoryUnit9();
	}
	
	//Save Card
	public void saveCard() {
		pages.unit9MilitaryCard.clickButtonSaveCard();
		pages.unit9MilitaryCard.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit9MilitaryCard.clickButtonExitFromCardForm();
	}

}
