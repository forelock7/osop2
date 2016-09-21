package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit4Card;

/*
 * "International Judicial Cooperation" Page - Unit 4 ("Міжнародно-правове співробітництво")
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit4Helper1
 */
public interface Unit4Helper {
	
	boolean isOnUnit4Page();
	
	void moveToMainTab();
	void moveToRemovedTab();

	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit4Card unit4Card);
	void editCard(Unit4Card unit4Card);
	void removeCardUnit4(Unit4Card unit4Card);
	void restoreCardUnit4(Unit4Card unit4Card);

	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getSummary();
	String getClaimNumber();

	void saveCard();
	void quitCard();

}
