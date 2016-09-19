package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit8Card;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit7Helper1
 */
public interface Unit8Helper {
	
	boolean isOnUnit8Page();
	void createCardUnit8(Unit8Card unit8Card);
	//String getRequestNumberLastCreatedCardU8();
	void editCardUnit8(Unit8Card unit8Card);
	String getValueInFieldLastCardU8();
	void removeCardUnit8(Unit8Card unit8Card);
	String getRegNumberAfterRemovingCardU8();
	void restoreCardUnit8(Unit8Card unit8Card);
	String getRegNumberAfterRestoringCardU8();
	void quitCard();
	void openCardToReview();
	String getRequestNumber();
	void openCardToEdit();
	
}
