package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit7CardModel;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit7Helper1
 */
public interface Unit7Helper {
	
	boolean isOnUnit7Page();
	
	void goToMainTab();
	void goToRemovedTab();
	
	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
		
	void createCardUnit7(Unit7CardModel massMediaCard);
	void editCardUnit7(Unit7CardModel unit7CardModel);
	void removeCardUnit7(Unit7CardModel unit7CardModel);
	void restoreCardUnit7(Unit7CardModel unit7CardModel);
	
	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	
	String getSubjectOfSpeech();
	String getAuthorOfSpeech();
		
	void saveCard();
	void quitCard();

}
