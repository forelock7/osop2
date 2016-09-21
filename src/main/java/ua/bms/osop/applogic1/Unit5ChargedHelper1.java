package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit5ChargedHelper;
import ua.bms.osop.model.Unit5ChargedCard;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 3 - List of Charged Person(Перелік осіб, притягнутих до відповідальності)
 * Implements all methods are used in Unit5SupervisionJugmentTest and related with Unit5ChargedCard model(ua.bms.osop.model.Unit5ChargedCard)
 * Uses methods from Unit5ChargedPage
 */
public class Unit5ChargedHelper1 extends DriverBasedHelper implements Unit5ChargedHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit5ChargedHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*-------------------------------Charged Person Page----------------------------------------*/
	
	/*Checks if on Unit 5 Page "List of Charged Person"*/
	@Override
	public boolean isOnUnit5ChargedPage(){
		return pages.unit5ChargedPage.waitPageLoaded();
	}	
	
	//Sorts records down(in descending order) - double click on header of grid
	public void sortDownMainGrid() {
		pages.unit5ChargedPage.doubleClickOnGridHeader();
	}
	
	//Opens Charged Person Card to review  in Charged Person Page
	public void openChargedCardToReview() {
		pages.unit5ChargedPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Gets name of Charged Person from first record in the main grid
	public String getChargedNameFromGrid() {
		return pages.unit5ChargedPage.getChargedNameFirstCardInGrid();
	}
	
	/*-------------------------------Charged Person Card----------------------------------------*/
	
	//Fills all fields in Charged Person Casrd
	public void createChargedCard(Unit5ChargedCard unit5ChargedCard) {
		pages.unit5ChargedPage.setChargedCard(unit5ChargedCard);
	}
	
	public void editChargedCard(Unit5ChargedCard unit5ChargedCard) {
		pages.unit5ChargedPage.setInputPost(unit5ChargedCard.someNewText);
	}
	
	public void deleteChargedPersonFromGrid(Unit5ChargedCard unit5ChargedCard) {
		pages.unit5DocumentsPage.deleteChargedRecordFormGridInDocument(unit5ChargedCard);
	}
	
	//Returns value in Charged Person Name Field
	public String getChargedName() {
		return pages.unit5ChargedPage.getInputName();
	}
	
	//Returns value in Post Field
	public String getPost() {
		return pages.unit5ChargedPage.getInputPost();
	}
	
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit5ChargedPage.clickButtonSaveCard();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit5ChargedPage.clickButtonExitFromCardForm();
	}

}
