package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit5InspectionCardModel;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 1 - List Inspections(Перелік перевірок);
 * Implements all methods are used in Unit5SupervisionJugmentTest and related with Unit5InspectionCard model(ua.bms.osop.model.Unit5InspectionCard)
 * Uses methods from Unit5InspectionsPage
 */
public class Unit5InspectionHelper extends DriverBasedHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit5InspectionHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------Inspection Page----------------------------------------------------*/
	
	/*Checks if on Unit 5 Page*/
	public boolean isOnUnit5InspectionPage(){
		return pages.unit5InspectionPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit5InspectionPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit5InspectionPage.clickOnRemovedTab();
	}
	
	//Sorts records down(in descending order) - double click on header of grid
	public void sortDownMainGrid() {
		pages.unit5InspectionPage.doubleClickOnGridHeader();
	}
	
	/*Opens to create new Card (click button create) */
	public void openInspectionCardToCreate() {
		pages.unit5InspectionPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	public void openInspectionCardToView() {
		pages.unit5InspectionPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	/*Opens Inspection Card to edit (click button create) */
	public void openInspectionCardToEdit() {
		pages.unit5InspectionPage.clickButtonEditInspectionCardUnit5();
	}
	
	/*Removes card(record) from main grid on Inspection Page Unit5*/
	public void removeInspectionCardUnit5(Unit5InspectionCardModel unit5InspectionCardModel){
		pages.unit5InspectionPage.removeInspectionCardFromGridUnit5(unit5InspectionCardModel);
	}
		
	/*Restores later removed card*/
	public void restoreInspectionCardUnit5(Unit5InspectionCardModel unit5InspectionCardModel){
		pages.unit5InspectionPage.restoreCardFromGridUnit5(unit5InspectionCardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumberFirstRemovedInspectionCardInGrid(){
		return pages.unit5InspectionPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit5InspectionPage.getRegNumberFromGridOnMainTab();
	}
	
	/*--------------------------Inspection Card---------------------------------------------------*/
	
	/*---Basic Statements Tab---*/
	
	/*Checks if in Inspection Card Unit 5*/
	public boolean isOnUnit5InspectionCard() {
		return pages.unit5InspectionCard.isTitleOfCardIsPresent();
	}
		
	/*Moves from "Basic Statements" Tab to "Response Documents" Tab */
	public void goToDocumentTabInInspectionCard() {
		pages.unit5InspectionCard.clickOnResponseDocumentsTab();
	}
	
	/*Creates a new Card with filling all fields in and submitting*/
	public void createInspectionCardUnit5(Unit5InspectionCardModel unit5InspectionCardModel) {
		pages.unit5InspectionCard.setInspectionCardUnit5(unit5InspectionCardModel);
	}
	
	/*Edits card with changing value in field "Agency Name" ("Назва відомстваб організації, установи")*/
	public void editInspectionCardUnit5(Unit5InspectionCardModel unit5InspectionCardModel) {
		pages.unit5InspectionCard.setInputAgencyNameUnit5(unit5InspectionCardModel.getSomeNewText());
	}
		
	//Gets Agency Name
	public String getAgencyName() {
		return pages.unit5InspectionCard.getInputAgencyNameUnit5();
	}
		

	
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit5InspectionCard.clickButtonSaveCard();
		pages.unit5InspectionCard.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit5InspectionCard.clickButtonExitFromCardForm();
	}
	
	/*---Response Documents Tab---*/
	
	//Checks if on "Response Documents" Tab in "Inspection" Card
	public boolean isOnUnit5DocumentsTab() {
		return pages.unit5InspectionCard.isRefreshPagingToolbarIsPresent();
	}
	
	//Check if button "Create" is present on "Response Documents" Tab
	public boolean checkIsButtonCreatePresent() {
		return pages.unit5InspectionCard.isCreateButtonPresent();
	}
	
	/*Opens to create new "Response Document" Card (click button create) */
	public void openDocumentCardToCreate() {
		pages.unit5InspectionCard.clickButtonCreateDocumentCard();
	}
	
	//Opens "Response Document" Card to review in Grid on "Response Document" Tab of Inspection Card
	public void openDocumentCardToView() {
		pages.unit5InspectionCard.clickOnFirstRecordInDocumentGrid();
	}
	
	//Opens "Response Document" Card to edit in Grid on "Response Document" Tab of Inspection Card
	public void openDocumentCardToEdit() {
		pages.unit5InspectionCard.clickButtonEditDocInInspectionCardUnit5();
	}
	

		
}


