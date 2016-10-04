package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit8CardModel;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit7Helper1
 */
public interface Unit8Helper {
	
	boolean isOnUnit8Page();
	
	void goToMainTab();
	void goToRemovedTab();
	
	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCardUnit8(Unit8CardModel unit8CardModel);
	void editCardUnit8(Unit8CardModel unit8CardModel);
	void removeCardUnit8(Unit8CardModel unit8CardModel);
	void restoreCardUnit8(Unit8CardModel unit8CardModel);
	
	String getSummary();
	String getRegNumbreFirstRemovedCardInGrid();
	String getRegNumberFirstCardInGrid();
	String getRequestNumber();
		
	void saveCard();
	void quitCard();
		
}
