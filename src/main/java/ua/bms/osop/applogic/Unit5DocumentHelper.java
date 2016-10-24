package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit5DocumentCardModel;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 2 - List of Response Documents(Перелік документів реагування);
 * Implements all methods are used in Unit5SupervisionJugmentTest and related with Unit5DocumentCard model(ua.bms.osop.model.Unit5DocumentCard)
 * Uses methods from Unit5DocumentsPage
 */
public class Unit5DocumentHelper extends DriverBasedHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit5DocumentHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*---------------------------Response Document Page--------------------------------------*/
	
	/*Checks if on Unit 5 Page "List of Response Documents"*/
	public boolean isOnUnit5DocumentsPage(){
		return pages.unit5DocumentPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit5DocumentPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit5DocumentPage.clickOnRemovedTab();
	}
	
	//Sorts records down(in descending order) - double click on header of grid
	public void sortDownMainGrid() {
		pages.unit5DocumentPage.doubleClickOnGridHeader();
	}
	
	//Opens Response Card to review on Response Document Page  in onse Document Card
	public void openDocumentCardToReview() {
		pages.unit5DocumentPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	/*Restores later removed card*/
	public void restoreDocumentCard(Unit5DocumentCardModel unit5DocumentCardModel) {
		pages.unit5DocumentPage.restoreCardFromGrid(unit5DocumentCardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit5DocumentPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit5DocumentPage.getRegNumberFromGridOnMainTab();
	}
	
	/*---------------------------Inspection Card--------------------------------------*/
	
	/*Removes Response Document card(record) from main grid in Inspection Card Unit5*/
	public void removeDocumentCard(Unit5DocumentCardModel unit5DocumentCardModel) {
		pages.unit5InspectionCard. removeDocumentCardFormInspectionCard(unit5DocumentCardModel);
	}
	
	//Creates new "Response Document" Card
	public void createDocumentCard(Unit5DocumentCardModel unit5DocumentCardModel) {
			pages.unit5DocumentCard.setDocumentCard(unit5DocumentCardModel);
	}
	
	/*Edits card with changing value in field "Agency Name" ("Назва відомстваб організації, установи")*/
	public void editDocumentCard(Unit5DocumentCardModel unit5DocumentCardModel) {
		pages.unit5DocumentCard.setInputContentDocument(unit5DocumentCardModel.getSomeNewText());
	}
	
	/*---------------------------Response Document Card--------------------------------------*/
	
	//Opens Charged Person Card to create in Response Document Card
	public void openChargedCardToCreate() {
		pages.unit5DocumentCard.clickButtonAddChargedPerson();
	}
	
	//Opens Charged Person Card to edit  in Response Document Card
	public void openChargedCardToEdit() {
		pages.unit5DocumentCard.clickButtonEditChargedGrid();
	}
	
	//Opens Charged Person Card to review  in Response Document Card
	public void openChargedCardToView() {
		pages.unit5DocumentCard.clickOnFirstRecordInChargedGrid();
	}
		
	//Gets existing value from from Content Document Field in Response Document Card
	public String getContentDocument() {
		return pages.unit5DocumentCard.getInputContentDocument();
		
	}
		
	public String getChargedNameFromGrid() {
		return pages.unit5DocumentCard.getNameFromChargedPersonGrid();
	}
	
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit5DocumentCard.clickButtonSaveCard();
		pages.unit5DocumentCard.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit5DocumentCard.clickButtonExitFromCardForm();
	}

	//Checks if any records exists in Charged Person Grid
	public boolean existRecordInChargedGrid() {
		return pages.unit5DocumentCard.isPresentRecordInChargedGrid();
	}

}
