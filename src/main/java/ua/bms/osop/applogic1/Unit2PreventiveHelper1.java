package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit2PreventiveHelper;
import ua.bms.osop.model.Unit2PreventiveCardModel;

public class Unit2PreventiveHelper1 extends DriverBasedHelper implements Unit2PreventiveHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2PreventiveHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Preventive Page----------------------------------------------------*/
	
	public boolean isOnUnit2PreventivePage() {
		return pages.unit2PreventivePage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit2PreventivePage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit2PreventivePage.clickOnRemovedTab();
	}
		
	//Opens Card to create
	@Override
	public void openCardToCreate() {
		pages.unit2PreventivePage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	@Override
	public void openCardToView() {
		pages.unit2PreventivePage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	@Override
	public void openCardToEdit() {
		pages.unit2PreventivePage.clickButtonEditCard();
	}
	
	/*Removes card(record) from main grid on Unit4*/
	@Override
	public void removeCard(Unit2PreventiveCardModel unit2PreventiveCardModel){
		pages.unit2PreventivePage.removeCardFromGrid(unit2PreventiveCardModel);
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreCard(Unit2PreventiveCardModel unit2PreventiveCardModel){
		pages.unit2PreventivePage.restoreCardFromGrid(unit2PreventiveCardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit2PreventivePage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit2PreventivePage.getRegNumberFromGridOnMainTab();
	}
	
	/*--------------------------------Preventive Card----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCard(Unit2PreventiveCardModel unit2PreventiveCardModel){
		pages.unit2PreventiveCard.setPreventiveCardUnit2(unit2PreventiveCardModel);
	}
	
	/*Edits card with changing value in field "Content"*/
	@Override
	public void editCard(Unit2PreventiveCardModel unit2PreventiveCardModel) {
		pages.unit2PreventiveCard.setInputOffenseQualification(unit2PreventiveCardModel.getSomeNewText());
	}
			
	//Gets Proceeding Number
	@Override
	public String getProceedingNumber() {
		return pages.unit2PreventiveCard.getInputProceedingNumber();
	}
		
	/*Returns value in field "Content" from later edited card(after its editing)*/
	@Override
	public String getOffenseQualification(){
		return pages.unit2PreventiveCard.getInputOffenseQualification();
	}
		

	
	//Saves Card(clicking "Save" button)
	@Override
	public void saveCard() {
		pages.unit2PreventiveCard.clickButtonSaveCard();
		pages.unit2PreventiveCard.clickOnAlertOK();
	}
		
	//Quit from Card
	@Override
	public void quitCard() {
		pages.unit2PreventiveCard.clickButtonExitFromCardForm();
	}

}
