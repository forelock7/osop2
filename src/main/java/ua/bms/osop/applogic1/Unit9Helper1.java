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
	
	/*Checks if on Unit 9 Page*/
	@Override
	public boolean isOnUnit9Page(){
		return pages.unit9MilitaryPage.waitPageLoaded();
	}
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCardUnit9(Unit9Card adminViolCard){
		pages.unit9MilitaryPage.clickButtonCreateCard();
		pages.unit9MilitaryPage.setCardUnit9(adminViolCard).clickButtonSaveCard();
		pages.unit9MilitaryPage.clickOnAlertOK();
	}
	
	//Opens Card to review 
	@Override
	public void openCardToReview() {
		pages.unit9MilitaryPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	@Override
	public void openCardToEdit() {
		pages.unit9MilitaryPage.clickButtonEditCardUnit9();
	}
	
	//Gets Claim Number
	@Override
	public String getProtNumber() {
		return pages.unit9MilitaryPage.getInputProtocolNumberUnit9();
	}
		
	/*Edits card with changing value in field "Theory"*/
	@Override
	public void editCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.clickButtonEditCardUnit9();
		pages.unit9MilitaryPage.setInputTheoryUnit9(unit9Card.someNewText);
		pages.unit9MilitaryPage.clickButtonSaveCard();
		pages.unit9MilitaryPage.clickOnAlertOK();
	}
	
	/*
	 * Returns value in field "Author Of Speech" from later edited card(after its editing)
	 * The first record(card) in main grid should be the last created.
	 * Checks editing of card.
	 */
	@Override
	public String getValueInFieldLastCardU9(){
		pages.unit9MilitaryPage.clickButtonEditCardUnit9();
		String existingValueInTheoryField = pages.unit9MilitaryPage.getInputTheoryUnit9();
		pages.unit9MilitaryPage.clickButtonExitFromCardForm();
		return existingValueInTheoryField;
	}
	
	/*Removes card(record) from main grid on Unit9*/
	@Override
	public void removeCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.removeCardUnit9(unit9Card);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberAfterRemovingCardU9(){
		pages.unit9MilitaryPage.goToRemovedTab();
		return pages.unit9MilitaryPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.restoreCardUnit9(unit9Card);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberAfterRestoringCardU9(){
		pages.unit9MilitaryPage.goToMainTab();
		return pages.unit9MilitaryPage.getRegNumberFromGridOnMainTab();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit9MilitaryPage.clickButtonExitFromCardForm();
	}

}
