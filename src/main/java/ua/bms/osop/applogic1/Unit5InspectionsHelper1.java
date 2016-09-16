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
	
	/*Checks if on Unit 5 Page*/
	@Override
	public boolean isOnUnit5InspectionPage(){
		return pages.unit5InspectionsPage.waitPageLoaded();
	}
	
	/*Checks if in Inspection Card Unit 5*/
	@Override
	public boolean isOnUnit5InspectionCard() {
		return pages.unit5InspectionsPage.isTitleOfCardIsPresent();
	}
	
	/*Initializes to create new Card (click button create) */
	@Override
	public void openToCreateInspectionCard() {
		pages.unit5InspectionsPage.clickButtonCreateCard();
	}
	
	public void loadDownMainGrid() {
		pages.unit5InspectionsPage.doubleClickOnGridHeader();
	}
	
	public void openToEditInspectionCardUnit5() {
		pages.unit5InspectionsPage.clickButtonEditInspectionCardUnit5();
	}
	
	/*Moves from "Basic Statements" Tab to "Response Documents" Tab */
	@Override
	public void goToDocumentTabInInspectionCard() {
		pages.unit5InspectionsPage.clickOnResponseDocumentsTab();
	}
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard) {
		openToCreateInspectionCard();
		pages.unit5InspectionsPage.setInspectionCardUnit5(unit5InspectionCard).clickButtonSaveCard();
		pages.unit5InspectionsPage.clickOnAlertOK();
	}
	
	/*
	 * Returns value in field "Agency Name" ("Назва відомстваб організації, установи") from created card(after its creating)
	 * The first record(card) in main grid should be the last created.
	 * Checks creating of card.
	 */
	@Override
	public String getAgencyNameLastCreatedInspectionCardU5(){
		pages.unit5InspectionsPage.clickButtonEditInspectionCardUnit5();
		String existingTextInAgencyNameField = pages.unit5InspectionsPage.getInputAgencyNameUnit5();
		pages.unit5InspectionsPage.clickButtonExitFromCardForm();
		return existingTextInAgencyNameField;
	}
	
	/*Edits card with changing value in field "Agency Name" ("Назва відомстваб організації, установи")*/
	@Override
	public void editInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard) {
		openToEditInspectionCardUnit5();
		pages.unit5InspectionsPage.setInputAgencyNameUnit5(unit5InspectionCard.someNewText);
		pages.unit5InspectionsPage.clickButtonSaveCard();
		pages.unit5InspectionsPage.clickOnAlertOK();
	}
	
	/*Removes card(record) from main grid on Inspection Page Unit5*/
	@Override
	public void removeInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard){
		pages.unit5InspectionsPage.removeInspectionCardFromGridUnit5(unit5InspectionCard);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberAfterRemovingInspectionCardU5(){
		pages.unit5InspectionsPage.goToRemovedTab();
		return pages.unit5InspectionsPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard){
		pages.unit5InspectionsPage.restoreCardFromGridUnit5(unit5InspectionCard);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberAfterRestoringCardU5(){
		pages.unit5InspectionsPage.goToMainTab();
		return pages.unit5InspectionsPage.getRegNumberFromGridOnMainTab();
	}
	
	/*--------------------Related to "Response Documents"--------------------------------------*/
	
	//Checks if on "Response Documents" Tab in "Inspection" Card
	public boolean isOnUnit5DocumentsTab() {
		return pages.unit5InspectionsPage.isRefreshPagingToolbarIsPresent();
	}
	
	//Check if button "Create" is present on "Response Documents" Tab
	@Override
	public boolean checkIsButtonCreatePresent() {
		return pages.unit5InspectionsPage.isCreateButtonPresent();
	}
	
	/*Initializes to create new "Response Document" Card (click button create) */
	@Override
	public void openToCreateDocumentCard() {
		pages.unit5InspectionsPage.clickButtonCreateDocumentCard();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit5InspectionsPage.clickButtonExitFromCardForm();
	}
	




}
