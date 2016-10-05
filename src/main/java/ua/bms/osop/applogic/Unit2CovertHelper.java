package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit2CovertCardModel;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 *  6 - "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії");
 */
public interface Unit2CovertHelper {

	boolean isOnUnit2CovertPage();
	
	void goToMainTab();
	void goToRemovedTab();

	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit2CovertCardModel Uunit2CovertCardModel);
	void editCard(Unit2CovertCardModel unit2CovertCardModel);
	void removeCard(Unit2CovertCardModel unit2CovertCardModel);
	void restoreCard(Unit2CovertCardModel unit2CovertCardModel);

	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getProsecutorDecisionDate();
	String getCourtResultDate();

	void saveCard();
	void quitCard();
	
}
