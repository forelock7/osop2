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
	
	/*Checks if on Unit 4 Page*/
	@Override
	public boolean isOnUnit4Page(){
		return pages.unit4InternationalPage.waitPageLoaded();
	}
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCardUnit4(Unit4Card unit4Card){
		pages.unit4InternationalPage.clickButtonCreateCard();
		pages.unit4InternationalPage.setCardUnit4(unit4Card).clickButtonSaveCard();
		pages.unit4InternationalPage.clickOnAlertOK();
	}
	
	/*
	 * Returns value in field "Number of Claim" from created card(after its creating)
	 * The first record(card) in main grid should be the last created.
	 * Checks creating of card.
	 */
	@Override
	public String getClaimNumberLastCreatedCardU4(){
		pages.unit4InternationalPage.clickButtonEditCardUnit4();
		String existingTextInClaimNumberField = pages.unit4InternationalPage.getInputClaimNumberUnit4();
		pages.unit4InternationalPage.clickButtonExitFromCardForm();
		return existingTextInClaimNumberField;
	}
	
	/*Edits card with changing value in field "Summary"*/
	@Override
	public void editCardUnit4(Unit4Card unit4Card) {
		pages.unit4InternationalPage.clickButtonEditCardUnit4();
		pages.unit4InternationalPage.setInputSummaryUnit4(unit4Card.someNewText);
		pages.unit4InternationalPage.clickButtonSaveCard();
		pages.unit4InternationalPage.clickOnAlertOK();
	}
	
	/*Returns value in field "Summary" from later edited card(after its editing)*/
	@Override
	public String getValueInFieldLastCardU4(){
		pages.unit4InternationalPage.clickButtonEditCardUnit4();
		String existingValueInSummaryField = pages.unit4InternationalPage.getInputSummaryUnit4();
		pages.unit4InternationalPage.clickButtonExitFromCardForm();
		return existingValueInSummaryField;
	}
	
	/*Removes card(record) from main grid on Unit4*/
	@Override
	public void removeCardUnit4(Unit4Card unit4Card){
		pages.unit4InternationalPage.removeCardFromGridUnit4(unit4Card);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberAfterRemovingCardU4(){
		pages.unit4InternationalPage.goToRemovedTab();
		return pages.unit4InternationalPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreCardUnit4(Unit4Card unit4Card){
		pages.unit4InternationalPage.restoreCardFromGridUnit4(unit4Card);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberAfterRestoringCardU4(){
		pages.unit4InternationalPage.goToMainTab();
		return pages.unit4InternationalPage.getRegNumberFromGridOnMainTab();
	}

}
