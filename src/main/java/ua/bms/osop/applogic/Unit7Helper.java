package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit7Card;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit7Helper1
 */
public interface Unit7Helper {
	
	boolean isOnUnit7Page();
	void createCardUnit7(Unit7Card massMediaCard);
	void editCardUnit7(Unit7Card unit7Card);
	String getValueInFieldLastCardU7();
	void removeCardUnit7(Unit7Card unit7Card);
	String getRegNumberAfterRemovingCardU7();
	void restoreCardUnit7(Unit7Card unit7Card);
	String getRegNumberAfterRestoringCardU7();
	void quitCard();
	void openCardToReview();
	String getSubjectOfSpeech();
	void openCardToEdit();

}
