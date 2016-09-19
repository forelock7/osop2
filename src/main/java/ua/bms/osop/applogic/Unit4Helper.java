package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit4Card;

/*
 * "International Judicial Cooperation" Page - Unit 4 ("Міжнародно-правове співробітництво")
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit4Helper1
 */
public interface Unit4Helper {
	
	boolean isOnUnit4Page();
	void createCardUnit4(Unit4Card unit4Card);
	void editCardUnit4(Unit4Card unit4Card);
	String getValueInFieldLastCardU4();
	void removeCardUnit4(Unit4Card unit4Card);
	String getRegNumberAfterRemovingCardU4();
	void restoreCardUnit4(Unit4Card unit4Card);
	String getRegNumberAfterRestoringCardU4();
	void openCardToReview();
	String getClaimNumber();
	void openCardToEdit();
	void quitCard();

}
