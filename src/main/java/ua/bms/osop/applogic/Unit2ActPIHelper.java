package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit2ActPICardModel;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * 1 - "Acts of supervision over pre-trial investigation"("Акти нагляду за ДР");
 */

public class Unit2ActPIHelper extends DriverBasedHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2ActPIHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
		
	/*--------------------------------Pre-Investigation Act Page----------------------------------------------------*/
	
	/*Checks if on Unit 2 Page*/
	public boolean isOnUnit2ActsPIPage() {
		return pages.unit2ActPIPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit2ActPIPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit2ActPIPage.clickOnRemovedTab();
	}
		
	//Opens Card to create
	public void openCardToCreate() {
		pages.unit2ActPIPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	public void openCardToView() {
		pages.unit2ActPIPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	public void openCardToEdit() {
		pages.unit2ActPIPage.clickButtonEditCard();
	}
	
	/*Removes card(record) from main grid on Unit4*/
	public void removeCard(Unit2ActPICardModel unit2ActPICardModel){
		pages.unit2ActPIPage.removeCardFromGrid(unit2ActPICardModel);
	}
	
	/*Restores later removed card*/
	public void restoreCard(Unit2ActPICardModel unit2ActPICardModel){
		pages.unit2ActPIPage.restoreCardFromGrid(unit2ActPICardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit2ActPIPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit2ActPIPage.getRegNumberFromGridOnMainTab();
	}
	
	/*--------------------------------Pre-Investigation Act Card----------------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	public void createCard(Unit2ActPICardModel unit2ActPICardModel){
		pages.unit2ActPICard.setActPICardUnit2(unit2ActPICardModel);
	}
	
	/*Edits card with changing value in field "Content"*/
	public void editCard(Unit2ActPICardModel unit2ActPICardModel) {
		pages.unit2ActPICard.setInputContent(unit2ActPICardModel.getSomeNewText());
	}
			
	//Gets Proceeding Number
	public String getProceedingNumber() {
		return pages.unit2ActPICard.getInputProceedingNumber();
	}
		
	/*Returns value in field "Content" from later edited card(after its editing)*/
	public String getContent(){
		return pages.unit2ActPICard.getInputContent();
	}
		

	
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit2ActPICard.clickButtonSaveCard();
		pages.unit2ActPICard.clickOnAlertOK();
	}
		
	//Quit from Card
	public void quitCard() {
		pages.unit2ActPICard.clickButtonExitFromCardForm();
	}
}
