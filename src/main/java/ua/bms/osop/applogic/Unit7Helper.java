package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit7CardModel;

/*
 * Ancillary Class for tests on Mass Media Page Unit 7
 * Implements all methods are used in Unit7MassMediaTest and related with Unit7Card model(ua.bms.osop.model.Unit7Card)
 * Uses methods from Unit7MassMediaPage
 */
public class Unit7Helper extends DriverBasedHelper{
	
	/*
	 * Constructor of object which is managed by object Application Manager.
	 */
	public Unit7Helper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------Mass Media Page------------------------------------------*/
	
	/*Checks if on Unit 7 Page*/
	public boolean isOnUnit7Page(){
		return pages.unit7MassMediaPage.waitPageLoaded();
	}
	
	//Moves to Main Tab
	public void goToMainTab() {
		pages.unit7MassMediaPage.clickOnMainTab();
	}
	
	//Moves to Removed Tab
	public void goToRemovedTab() {
		pages.unit7MassMediaPage.clickOnRemovedTab();
	}
	
	//Opens Card to create 
	public void openCardToCreate() {
		pages.unit7MassMediaPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	public void openCardToView() {
		pages.unit7MassMediaPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	public void openCardToEdit() {
		pages.unit7MassMediaPage.clickButtonEditCardUnit7();
	}
	
	/*Removes card(record) from main grid on Unit7*/
	public void removeCardUnit7(Unit7CardModel unit7CardModel){
		pages.unit7MassMediaPage.removeCardFromGridUnit7(unit7CardModel);
	}
	
	/*Restores later removed card*/
	public void restoreCardUnit7(Unit7CardModel unit7CardModel){
		pages.unit7MassMediaPage.restoreCardFromGridUnit7(unit7CardModel);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit7MassMediaPage.getRegNumberFromGridOnRemovedTab();
	}
		
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	public String getRegNumberFirstCardInGrid(){
		return pages.unit7MassMediaPage.getRegNumberFromGridOnMainTab();
	}
	
	/*--------------------------Mass Media Card------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	public void createCardUnit7(Unit7CardModel massMediaCard){
		pages.unit7MassMediaCard.setCardUnit7(massMediaCard);
	}
	
	/*Edits card with changing value in field "Author Of Speech"*/
	public void editCardUnit7(Unit7CardModel unit7CardModel){
		pages.unit7MassMediaCard.setInputAuthorOfSpeechUnit7(unit7CardModel.getSomeNewText());
	}
		
	//Gets Claim Number
	public String getSubjectOfSpeech() {
		return pages.unit7MassMediaCard.getInputSubjectOfSpeechUnit7();
	}
		
	/*Returns value in field "Author Of Speech" from later edited card(after its editing)*/
	public String getAuthorOfSpeech(){
		return pages.unit7MassMediaCard.getInputAuthorOfSpeechUnit7();
	}
	
	//Save Card
	public void saveCard() {
		pages.unit7MassMediaCard.clickButtonSaveCard();
		pages.unit7MassMediaCard.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit7MassMediaCard.clickButtonExitFromCardForm();
	}

}
