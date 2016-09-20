package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit9Card;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit9Helper1
 */
public interface Unit9Helper {
	
	boolean isOnUnit9Page();
	
	void moveToMainTab();
	void moveToRemovedTab();
	
	void openCardToCreate();
	void openCardToReview();
	void openCardToEdit();
	
	void createCardUnit9(Unit9Card unit9Card);
	void editCardUnit9(Unit9Card unit9Card);
	void removeCardUnit9(Unit9Card unit9Card);
	void restoreCardUnit9(Unit9Card unit9Card);
		
	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getTheory();
	String getProtNumber();
	
	void saveCard();
	void quitCard();
	
}
