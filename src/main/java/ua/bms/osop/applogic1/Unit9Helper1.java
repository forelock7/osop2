package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit9Helper;
import ua.bms.osop.model.Unit9Card;

/*
 * Ancillary Class for tests on Military Administrative Offenses Page
 * Implements all methods are used in Unit9MilitaryTest and related with Unit9Card model(ua.bms.osop.model.Unit9Card)
 * Uses methods from Unit9MilitaryPage
 */
public class Unit9Helper1 extends DriverBasedHelper implements Unit9Helper  {
	
	/*
	 * Constructor of object which is managed by object Application Manager.
	 */
	public Unit9Helper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*----------------------------Military Page-----------------------------------------------------*/
	
	/*Checks if on Unit 9 Page*/
	@Override
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
	@Override
	public void openCardToCreate() {
		pages.unit9MilitaryPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	@Override
	public void openCardToView() {
		pages.unit9MilitaryPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	@Override
	public void openCardToEdit() {
		pages.unit9MilitaryPage.clickButtonEditCardUnit9();
	}
	
	/*Removes card(record) from main grid on Unit9*/
	@Override
	public void removeCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.removeCardUnit9(unit9Card);
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.restoreCardUnit9(unit9Card);
	}
	
	/*----------------------------Military Card-----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.setCardUnit9(unit9Card);
	}
	
	/*Edits card with changing value in field "Theory"*/
	@Override
	public void editCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.setInputTheoryUnit9(unit9Card.someNewText);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit9MilitaryPage.getRegNumberFromGridOnRemovedTab();
	}
		
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit9MilitaryPage.getRegNumberFromGridOnMainTab();
	}

	
	//Gets Claim Number
	@Override
	public String getProtNumber() {
		return pages.unit9MilitaryPage.getInputProtocolNumberUnit9();
	}
		
	/*
	 * Returns value in field "Author Of Speech" from later edited card(after its editing)
	 * The first record(card) in main grid should be the last created.
	 * Checks editing of card.
	 */
	@Override
	public String getTheory(){
		return pages.unit9MilitaryPage.getInputTheoryUnit9();
	}
	
	//Save Card
	public void saveCard() {
		pages.unit9MilitaryPage.clickButtonSaveCard();
		pages.unit9MilitaryPage.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit9MilitaryPage.clickButtonExitFromCardForm();
	}

}
