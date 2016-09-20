package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit8Card;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit7Helper1
 */
public interface Unit8Helper {
	
	boolean isOnUnit8Page();
	
	void moveToMainTab();
	void moveToRemovedTab();
	
	void openCardToCreate();
	void openCardToReview();
	void openCardToEdit();
	
	void createCardUnit8(Unit8Card unit8Card);
	void editCardUnit8(Unit8Card unit8Card);
	void removeCardUnit8(Unit8Card unit8Card);
	void restoreCardUnit8(Unit8Card unit8Card);
	
	String getSummary();
	String getRegNumbreFirstRemovedCardInGrid();
	String getRegNumberFirstCardInGrid();
	String getRequestNumber();
		
	void saveCard();
	void quitCard();
		
}
