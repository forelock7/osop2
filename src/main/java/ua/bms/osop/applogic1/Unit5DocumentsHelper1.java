package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit5DocumentsHelper;
import ua.bms.osop.model.Unit5ChargedCard;
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
	
	/*Checks if on Unit 5 Page "List of Response Documents"*/
	@Override
	public boolean isOnUnit5DocumentsPage(){
		return pages.unit5DocumentsPage.waitPageLoaded();
	}
	
	//Creates new "Response Document"
	public void createDocumentAndChargedCard(Unit5DocumentCard unit5DocumentCard, Unit5ChargedCard unit5ChargedCard) {
		pages.unit5InspectionsPage.clickButtonCreateDocumentCard();
		pages.unit5DocumentsPage.setDocumentCard(unit5DocumentCard).clickButtonAddChargedPerson();;
		pages.unit5ChargedPage.setChargedCard(unit5ChargedCard).clickButtonSaveCard();
		pages.unit5DocumentsPage.clickButtonSaveCard();
		pages.unit5InspectionsPage.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit5DocumentsPage.clickButtonExitFromCardForm();
	}
	
	public String getContentLastDocFromGrid() {
		pages.unit5DocumentsPage.doubleClickOnGridHeader();
		pages.unit5DocumentsPage.doubleClickOnFirstRecordInGridOnMainTab();
		return pages.unit5DocumentsPage.getInputContentDocument();
	}
	
	public String getChargedNameFromGrid() {
		return pages.unit5DocumentsPage.getNameFromChargedPersonGrid();
	}


}
