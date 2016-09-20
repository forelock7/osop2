package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit7Card;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit7Helper1
 */
public interface Unit7Helper {
	
	boolean isOnUnit7Page();
	
	void moveToMainTab();
	void moveToRemovedTab();
	
	void openCardToCreate();
	void openCardToReview();
	void openCardToEdit();
		
	void createCardUnit7(Unit7Card massMediaCard);
	void editCardUnit7(Unit7Card unit7Card);
	void removeCardUnit7(Unit7Card unit7Card);
	void restoreCardUnit7(Unit7Card unit7Card);
	
	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	
	String getSubjectOfSpeech();
	String getAuthorOfSpeech();
		
	void saveCard();
	void quitCard();

}
