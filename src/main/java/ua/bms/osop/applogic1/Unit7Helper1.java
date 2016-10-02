package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit7Helper;
import ua.bms.osop.model.Unit7Card;

/*
 * Ancillary Class for tests on Mass Media Page Unit 7
 * Implements all methods are used in Unit7MassMediaTest and related with Unit7Card model(ua.bms.osop.model.Unit7Card)
 * Uses methods from Unit7MassMediaPage
 */
public class Unit7Helper1 extends DriverBasedHelper implements Unit7Helper{
	
	/*
	 * Constructor of object which is managed by object Application Manager.
	 */
	public Unit7Helper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------Mass Media Page------------------------------------------*/
	
	/*Checks if on Unit 7 Page*/
	@Override
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
	@Override
	public void openCardToCreate() {
		pages.unit7MassMediaPage.clickButtonCreateCard();
	}
	
	//Opens Card to review 
	@Override
	public void openCardToView() {
		pages.unit7MassMediaPage.doubleClickOnFirstRecordInGridOnMainTab();
	}
	
	//Opens Card to edit 
	@Override
	public void openCardToEdit() {
		pages.unit7MassMediaPage.clickButtonEditCardUnit7();
	}
	
	/*Removes card(record) from main grid on Unit7*/
	@Override
	public void removeCardUnit7(Unit7Card unit7Card){
		pages.unit7MassMediaPage.removeCardFromGridUnit7(unit7Card);
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreCardUnit7(Unit7Card unit7Card){
		pages.unit7MassMediaPage.restoreCardFromGridUnit7(unit7Card);
	}
	
	/*--------------------------Mass Media Card------------------------------------------*/
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCardUnit7(Unit7Card massMediaCard){
		pages.unit7MassMediaPage.setCardUnit7(massMediaCard);
	}
	
	/*Edits card with changing value in field "Author Of Speech"*/
	@Override
	public void editCardUnit7(Unit7Card unit7Card){
		pages.unit7MassMediaPage.setInputAuthorOfSpeechUnit7(unit7Card.someNewText);
	}
		
	//Gets Claim Number
	@Override
	public String getSubjectOfSpeech() {
		return pages.unit7MassMediaPage.getInputSubjectOfSpeechUnit7();
	}
		
	/*Returns value in field "Author Of Speech" from later edited card(after its editing)*/
	@Override
	public String getAuthorOfSpeech(){
		return pages.unit7MassMediaPage.getInputAuthorOfSpeechUnit7();
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberFirstRemovedCardInGrid(){
		return pages.unit7MassMediaPage.getRegNumberFromGridOnRemovedTab();
	}
		
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberFirstCardInGrid(){
		return pages.unit7MassMediaPage.getRegNumberFromGridOnMainTab();
	}
	
	//Save Card
	public void saveCard() {
		pages.unit7MassMediaPage.clickButtonSaveCard();
		pages.unit7MassMediaPage.clickOnAlertOK();
	}
	
	//Quit from Card
	public void quitCard() {
		pages.unit7MassMediaPage.clickButtonExitFromCardForm();
	}

}
