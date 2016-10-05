package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit2ReleaseHelper;
import ua.bms.osop.model.Unit2ReleaseCardModel;

public class Unit2ReleaseHelper1 extends DriverBasedHelper implements Unit2ReleaseHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2ReleaseHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Release Page----------------------------------------------------*/
	
	public boolean isOnUnit2ReleasePage() {
		return pages.unit2ReleasePage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	@Override
	public void goToMainTab() {
		pages.unit2ReleasePage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	@Override
	public void goToRemovedTab() {
		pages.unit2ReleasePage.clickOnRemovedTab();
	}
		
	//Opens Card to create
	@Override
	public void openCardToCreate() {
		pages.unit2ReleasePage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	@Override
	public void openCardToView() {
		pages.unit2ReleasePage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	@Override
	public void openCardToEdit() {
		pages.unit2ReleasePage.clickButtonEditCard();
	}
	
	/*Removes card(record) from main grid on Unit4*/
	@Override
	public void removeCard(Unit2ReleaseCardModel unit2ReleaseCardModel){
		pages.unit2ReleasePage.removeCardFromGrid(unit2ReleaseCardModel);
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreCard(Unit2ReleaseCardModel unit2ReleaseCardModel){
		pages.unit2ReleasePage.restoreCardFromGrid(unit2ReleaseCardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit2ReleasePage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit2ReleasePage.getRegNumberFromGridOnMainTab();
	}
	
	/*--------------------------------Release Card----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCard(Unit2ReleaseCardModel unit2ReleaseCardModel){
		pages.unit2ReleaseCard.setReleaseCardUnit2(unit2ReleaseCardModel);
	}
	
	/*Edits card with changing value in field "Content"*/
	@Override
	public void editCard(Unit2ReleaseCardModel unit2ReleaseCardModel) {
		pages.unit2ReleaseCard.setInputCaseNumber(unit2ReleaseCardModel.getSomeNewText());
	}
			
	//Gets Proceeding Number
	@Override
	public String getProceedingNumber() {
		return pages.unit2ReleaseCard.getInputProceedingNumber();
	}
		
	/*Returns value in field "Content" from later edited card(after its editing)*/
	@Override
	public String getCaseNumber(){
		return pages.unit2ReleaseCard.getInputCaseNumber();
	}
		
	//Saves Card(clicking "Save" button)
	@Override
	public void saveCard() {
		pages.unit2ReleaseCard.clickButtonSaveCard();
		pages.unit2ReleaseCard.clickOnAlertOK();
	}
		
	//Quit from Card
	@Override
	public void quitCard() {
		pages.unit2ReleaseCard.clickButtonExitFromCardForm();
	}

}
