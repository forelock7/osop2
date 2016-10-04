package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit9CardModel;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit9Helper1
 */
public interface Unit9Helper {
	
	boolean isOnUnit9Page();
	
	void goToMainTab();
	void goToRemovedTab();
	
	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCardUnit9(Unit9CardModel unit9CardModel);
	void editCardUnit9(Unit9CardModel unit9CardModel);
	void removeCardUnit9(Unit9CardModel unit9CardModel);
	void restoreCardUnit9(Unit9CardModel unit9CardModel);
		
	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getTheory();
	String getProtNumber();
	
	void saveCard();
	void quitCard();
	
}
