package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit5DocumentsHelper;
import ua.bms.osop.model.Unit5DocumentCard;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 2 - List of Response Documents(Перелік документів реагування);
 * Implements all methods are used in Unit5SupervisionJugmentTest and related with Unit5DocumentCard model(ua.bms.osop.model.Unit5DocumentCard)
 * Uses methods from Unit5DocumentsPage
 */
public class Unit5DocumentsHelper1 extends DriverBasedHelper implements Unit5DocumentsHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit5DocumentsHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*---------------------------Response Document Page--------------------------------------*/
	
	/*Checks if on Unit 5 Page "List of Response Documents"*/
	@Override
	public boolean isOnUnit5DocumentsPage(){
		return pages.unit5DocumentsPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void moveToMainTab() {
		pages.unit5DocumentsPage.goToMainTab();
	}
	
	//Moves to Removed Tab
	public void moveToRemovedTab() {
		pages.unit5DocumentsPage.goToRemovedTab();
	}
	
	//Sorts records down(in descending order) - double click on header of grid
	public void sortDownMainGrid() {
		pages.unit5DocumentsPage.doubleClickOnGridHeader();
	}
	
	//Opens Response Card to review on Response Document Page  in onse Document Card
	public void openDocumentCardToReview() {
		pages.unit5DocumentsPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	/*---------------------------Response Document Card--------------------------------------*/
	
	//Opens Charged Person Card to create in Response Document Card
	public void openChargedCardToCreate() {
		pages.unit5DocumentsPage.clickButtonAddChargedPerson();
	}
	
	//Opens Charged Person Card to edit  in Response Document Card
	public void openChargedCardToEdit() {
		pages.unit5DocumentsPage.clickButtonEditChargedGrid();
	}
	
	//Opens Charged Person Card to review  in Response Document Card
	public void openChargedCardToReview() {
		pages.unit5DocumentsPage.clickOnFirstRecordInChargedGrid();
	}
		
	//Creates new "Response Document" Card
	public void createDocumentCard(Unit5DocumentCard unit5DocumentCard) {
			pages.unit5DocumentsPage.setDocumentCard(unit5DocumentCard);
	}
	
	/*Edits card with changing value in field "Agency Name" ("Назва відомстваб організації, установи")*/
	@Override
	public void editDocumentCard(Unit5DocumentCard unit5DocumentCard) {
		pages.unit5DocumentsPage.setInputContentDocument(unit5DocumentCard.someNewText);
	}
	
	/*Removes Response Document card(record) from main grid in Inspection Card Unit5*/
	@Override
	public void removeDocumentCard(Unit5DocumentCard unit5DocumentCard) {
		pages.unit5InspectionsPage. removeDocumentCardFormInspectionCard(unit5DocumentCard);
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreDocumentCard(Unit5DocumentCard unit5DocumentCard) {
		pages.unit5DocumentsPage.restoreCardFromGrid(unit5DocumentCard);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit5DocumentsPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit5DocumentsPage.getRegNumberFromGridOnMainTab();
	}
	
	//Gets existing value from from Content Document Field in Response Document Card
	public String getContentDocument() {
		return pages.unit5DocumentsPage.getInputContentDocument();
		
	}
		
	public String getChargedNameFromGrid() {
		return pages.unit5DocumentsPage.getNameFromChargedPersonGrid();
	}
	
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit5DocumentsPage.clickButtonSaveCard();
		pages.unit5DocumentsPage.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit5DocumentsPage.clickButtonExitFromCardForm();
	}


}
