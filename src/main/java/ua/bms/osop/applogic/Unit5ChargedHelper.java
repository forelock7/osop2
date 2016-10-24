package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit5ChargedCardModel;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 3 - List of Charged Person(Перелік осіб, притягнутих до відповідальності)
 * Implements all methods are used in Unit5SupervisionJugmentTest and related with Unit5ChargedCard model(ua.bms.osop.model.Unit5ChargedCard)
 * Uses methods from Unit5ChargedPage
 */
public class Unit5ChargedHelper extends DriverBasedHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit5ChargedHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*-------------------------------Charged Person Page----------------------------------------*/
	
	/*Checks if on Unit 5 Page "List of Charged Person"*/
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

	/*
 	* Gets number of the first record(card) in grid on the main tab
 	* Checks existing of later restoring card
 	*/
    public String getRegNumberFirstCardInGrid() {
        return  pages.unit5ChargedPage.getRegNumberFromGridOnMainTab();
    }
	
	/*-------------------------------Charged Person Card----------------------------------------*/
	
	//Fills all fields in Charged Person Casrd
	public void createChargedCard(Unit5ChargedCardModel unit5ChargedCardModel) {
		pages.unit5ChargedCard.setChargedCard(unit5ChargedCardModel);
	}
	
	public void editChargedCard(Unit5ChargedCardModel unit5ChargedCardModel) {
		pages.unit5ChargedCard.setInputPost(unit5ChargedCardModel.getSomeNewText());
	}
	
	public void deleteChargedPersonFromGrid(Unit5ChargedCardModel unit5ChargedCardModel) {
		pages.unit5DocumentCard.deleteChargedRecordFormGridInDocument(unit5ChargedCardModel);
	}
	
	//Returns value in Charged Person Name Field
	public String getChargedName() {
		return pages.unit5ChargedCard.getInputName();
	}
	
	//Returns value in Post Field
	public String getPost() {
		return pages.unit5ChargedCard.getInputPost();
	}
	
	//Saves Card(clicking "Save" button)
	public void saveCard() {
		pages.unit5ChargedCard.clickButtonSaveCard();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit5ChargedCard.clickButtonExitFromCardForm();
	}

}
