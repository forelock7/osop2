package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit5InspectionsHelper;
import ua.bms.osop.model.Unit5InspectionCard;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 1 - List Inspections(Перелік перевірок);
 * Implements all methods are used in Unit5SupervisionJugmentTest and related with Unit5InspectionCard model(ua.bms.osop.model.Unit5InspectionCard)
 * Uses methods from Unit5InspectionsPage
 */
public class Unit5InspectionsHelper1 extends DriverBasedHelper implements Unit5InspectionsHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit5InspectionsHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------Inspection Page----------------------------------------------------*/
	
	/*Checks if on Unit 5 Page*/
	@Override
	public boolean isOnUnit5InspectionPage(){
		return pages.unit5InspectionsPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void moveToMainTab() {
		pages.unit5InspectionsPage.goToMainTab();
	}
	
	//Moves to Removed Tab
	public void moveToRemovedTab() {
		pages.unit5InspectionsPage.goToRemovedTab();
	}
	
	//Sorts records down(in descending order) - double click on header of grid
	public void sortDownMainGrid() {
		pages.unit5InspectionsPage.doubleClickOnGridHeader();
	}
	
	/*Opens to create new Card (click button create) */
	@Override
	public void openInspectionCardToCreate() {
		pages.unit5InspectionsPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	@Override
	public void openInspectionCardToReview() {
		pages.unit5InspectionsPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	/*Opens Inspection Card to edit (click button create) */
	@Override
	public void openInspectionCardToEdit() {
		pages.unit5InspectionsPage.clickButtonEditInspectionCardUnit5();
	}
	
	/*--------------------------Inspection Card---------------------------------------------------*/
	
	/*---Basic Statements Tab---*/
	
	/*Checks if in Inspection Card Unit 5*/
	@Override
	public boolean isOnUnit5InspectionCard() {
		return pages.unit5InspectionsPage.isTitleOfCardIsPresent();
	}
		
	/*Moves from "Basic Statements" Tab to "Response Documents" Tab */
	@Override
	public void goToDocumentTabInInspectionCard() {
		pages.unit5InspectionsPage.clickOnResponseDocumentsTab();
	}
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard) {
		pages.unit5InspectionsPage.setInspectionCardUnit5(unit5InspectionCard);
	}
	
	/*Edits card with changing value in field "Agency Name" ("Назва відомстваб організації, установи")*/
	@Override
	public void editInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard) {
		pages.unit5InspectionsPage.setInputAgencyNameUnit5(unit5InspectionCard.someNewText);
	}
	
	/*Removes card(record) from main grid on Inspection Page Unit5*/
	@Override
	public void removeInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard){
		pages.unit5InspectionsPage.removeInspectionCardFromGridUnit5(unit5InspectionCard);
	}
		
	/*Restores later removed card*/
	@Override
	public void restoreInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard){
		pages.unit5InspectionsPage.restoreCardFromGridUnit5(unit5InspectionCard);
	}
	
	//Gets Agency Name
	@Override
	public String getAgencyName() {
		return pages.unit5InspectionsPage.getInputAgencyNameUnit5();
	}
		
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberFirstRemovedInspectionCardInGrid(){
		return pages.unit5InspectionsPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit5InspectionsPage.getRegNumberFromGridOnMainTab();
	}
	
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit5InspectionsPage.clickButtonSaveCard();
		pages.unit5InspectionsPage.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit5InspectionsPage.clickButtonExitFromCardForm();
	}
	
	/*---Response Documents Tab---*/
	
	//Checks if on "Response Documents" Tab in "Inspection" Card
	public boolean isOnUnit5DocumentsTab() {
		return pages.unit5InspectionsPage.isRefreshPagingToolbarIsPresent();
	}
	
	//Check if button "Create" is present on "Response Documents" Tab
	@Override
	public boolean checkIsButtonCreatePresent() {
		return pages.unit5InspectionsPage.isCreateButtonPresent();
	}
	
	/*Opens to create new "Response Document" Card (click button create) */
	@Override
	public void openDocumentCardToCreate() {
		pages.unit5InspectionsPage.clickButtonCreateDocumentCard();
	}
	
	//Opens "Response Document" Card to review in Grid on "Response Document" Tab of Inspection Card
	public void openDocumentCardToReview() {
		pages.unit5InspectionsPage.clickOnFirstRecordInDocumentGrid();
	}
	
	//Opens "Response Document" Card to edit in Grid on "Response Document" Tab of Inspection Card
	public void openDocumentCardToEdit() {
		pages.unit5InspectionsPage.clickButtonEditDocInInspectionCardUnit5();
	}
	

		
}


