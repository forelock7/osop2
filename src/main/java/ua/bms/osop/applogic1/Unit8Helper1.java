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
	
	/*Checks if on Unit 8 Page*/
	@Override
	public boolean isOnUnit8Page(){
		return pages.unit8RequestsPage.waitPageLoaded();
	}
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCardUnit8(Unit8Card unit8Card){
		pages.unit8RequestsPage.clickButtonCreateCard();
		pages.unit8RequestsPage.setCardUnit8(unit8Card).clickButtonSaveCard();
		pages.unit8RequestsPage.clickOnAlertOK();
	}
	
	/*
	 * Returns value in field "Number of Request" from created card(after its creating)
	 * The first record(card) in main grid should be the last created.
	 * Checks creating of card.
	 */
	@Override
	public String getRequestNumberLastCreatedCardU8(){
		pages.unit8RequestsPage.clickButtonEditCardUnit8();
		String existingTextInRequestNumberField = pages.unit8RequestsPage.getInputRequestNumberUnit8();
		pages.unit8RequestsPage.clickButtonExitFromCardForm();
		return existingTextInRequestNumberField;
	}
	
	/*Edits card with changing value in field "Summary"*/
	@Override
	public void editCardUnit8(Unit8Card unit8Card) {
		pages.unit8RequestsPage.clickButtonEditCardUnit8();
		pages.unit8RequestsPage.setInputSummaryUnit8(unit8Card.someNewText);
		pages.unit8RequestsPage.clickButtonSaveCard();
		pages.unit8RequestsPage.clickOnAlertOK();
	}
	
	/*Returns value in field "Summary" from later edited card(after its editing)*/
	@Override
	public String getValueInFieldLastCardU8(){
		pages.unit8RequestsPage.clickButtonEditCardUnit8();
		String existingValueInSummaryField = pages.unit8RequestsPage.getInputSummaryUnit8();
		pages.unit8RequestsPage.clickButtonExitFromCardForm();
		return existingValueInSummaryField;
	}
	
	/*Removes card(record) from main grid on Unit8*/
	@Override
	public void removeCardUnit8(Unit8Card unit8Card){
		pages.unit8RequestsPage.removeCardFromGridUnit8(unit8Card);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberAfterRemovingCardU8(){
		pages.unit8RequestsPage.goToRemovedTab();
		return pages.unit8RequestsPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreCardUnit8(Unit8Card unit8Card){
		pages.unit8RequestsPage.restoreCardFromGridUnit8(unit8Card);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberAfterRestoringCardU8(){
		pages.unit8RequestsPage.goToMainTab();
		return pages.unit8RequestsPage.getRegNumberFromGridOnMainTab();
	}

}
