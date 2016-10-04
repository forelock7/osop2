package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit6CardModel;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit6Helper1
 */
public interface Unit6Helper {

	boolean isOnUnit6Page();
	
	void goToMainTab();
	void goToRemovedTab();
	
	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCardUnit6(Unit6CardModel unit6CardModel);
	void editCardUnit6(Unit6CardModel unit6CardModel);
	void removeCardUnit6(Unit6CardModel unit6CardModel);
	void restoreCardUnit6(Unit6CardModel unit6CardModel);
		
	String getRegNumberRemovedCardInGrid();
	String getRegNumberFirstCardInGrid();
	String getSummary();
	String getClaimNumber();
	
	void saveCard();
	void quitCard();
	
}
