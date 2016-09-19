package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit6Card;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit6Helper1
 */
public interface Unit6Helper {

	boolean isOnUnit6Page();
	void createCardUnit6(Unit6Card unit6Card);
	void editCardUnit6(Unit6Card unit6Card);
	String getValueInFieldLastCardU6();
	void removeCardUnit6(Unit6Card unit6Card);
	String getRegNumberAfterRemovingCardU6();
	void restoreCardUnit6(Unit6Card unit6Card);
	String getRegNumberAfterRestoringCardU6();
	void openCardToReview();
	void openCardToEdit();
	String getClaimNumber();
	void quitCard();


}
