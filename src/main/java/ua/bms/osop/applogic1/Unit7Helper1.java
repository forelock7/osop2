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
	
	/*Checks if on Unit 7 Page*/
	@Override
	public boolean isOnUnit7Page(){
		return pages.unit7MassMediaPage.waitPageLoaded();
	}
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCardUnit7(Unit7Card massMediaCard){
		pages.unit7MassMediaPage.clickButtonCreateCard();
		pages.unit7MassMediaPage.setCardUnit7(massMediaCard).clickButtonSaveCard();
		pages.unit7MassMediaPage.clickOnAlertOK();
	}
	
	/*
	 * Returns value in field "Subject of Speech" from created card(after its creating)
	 * The first record(card) in main grid should be the last created.
	 * Checks creating of card.
	 */
	@Override
	public String getSubjectOfSpeechLastCreatedCardU7(){
		pages.unit7MassMediaPage.clickButtonEditCardUnit7();
		String existingTextInSpeechSubjectField = pages.unit7MassMediaPage.getInputSubjectOfSpeechUnit7();
		pages.unit7MassMediaPage.clickButtonExitFromCardForm();
		return existingTextInSpeechSubjectField;
	}
	
	/*Edits card with changing value in field "Author Of Speech"*/
	@Override
	public void editCardUnit7(Unit7Card unit7Card){
		pages.unit7MassMediaPage.clickButtonEditCardUnit7();
		pages.unit7MassMediaPage.setInputAuthorOfSpeechUnit7(unit7Card.someNewText);
		pages.unit7MassMediaPage.clickButtonSaveCard();
		pages.unit7MassMediaPage.clickOnAlertOK();
	}
	
	/*Returns value in field "Author Of Speech" from later edited card(after its editing)*/
	@Override
	public String getValueInFieldLastCardU7(){
		pages.unit7MassMediaPage.clickButtonEditCardUnit7();
		String existingValueInTheoryField = pages.unit7MassMediaPage.getInputAuthorOfSpeechUnit7();
		pages.unit7MassMediaPage.clickButtonExitFromCardForm();
		return existingValueInTheoryField;
	}
	
	/*Removes card(record) from main grid on Unit7*/
	@Override
	public void removeCardUnit7(Unit7Card unit7Card){
		pages.unit7MassMediaPage.removeCardUnit7(unit7Card);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the tab "Removed"
	 * Checks existing of later removing card
	 */
	@Override
	public String getRegNumberAfterRemovingCardU7(){
		pages.unit7MassMediaPage.goToRemovedTab();
		return pages.unit7MassMediaPage.getRegNumberFromGridOnRemovedTab();
	}
	
	/*Restores later removed card*/
	@Override
	public void restoreCardUnit7(Unit7Card unit7Card){
		pages.unit7MassMediaPage.restoreCardUnit7(unit7Card);
	}
	
	/*
	 * Gets number of the first record(card) in grid on the main tab
	 * Checks existing of later restoring card
	 */
	@Override
	public String getRegNumberAfterRestoringCardU7(){
		pages.unit7MassMediaPage.goToMainTab();
		return pages.unit7MassMediaPage.getRegNumberFromGridOnMainTab();
	}

}
