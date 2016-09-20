package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit6Card;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit6Helper1
 */
public interface Unit6Helper {

	boolean isOnUnit6Page();
	
	void moveToMainTab();
	void moveToRemovedTab();
	
	void openCardToCreate();
	void openCardToReview();
	void openCardToEdit();
	
	void createCardUnit6(Unit6Card unit6Card);
	void editCardUnit6(Unit6Card unit6Card);
	void removeCardUnit6(Unit6Card unit6Card);
	void restoreCardUnit6(Unit6Card unit6Card);
		
	String getRegNumberRemovedCardInGrid();
	String getRegNumberFirstCardInGrid();
	String getSummary();
	String getClaimNumber();
	
	void saveCard();
	void quitCard();
	
}
