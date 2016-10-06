package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit4CardModel;

/*
 * "International Judicial Cooperation" Page - Unit 4 ("Міжнародно-правове співробітництво")
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit4Helper1
 */
public interface Unit4Helper {
	
	boolean isOnUnit4Page();
	
	void goToMainTab();
	void goToRemovedTab();

	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit4CardModel unit4CardModel);
	void editCard(Unit4CardModel unit4CardModel);
	void removeCard(Unit4CardModel unit4CardModel);
	void restoreCard(Unit4CardModel unit4CardModel);

	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getSummary();
	String getClaimNumber();

	void saveCard();
	void quitCard();

}
