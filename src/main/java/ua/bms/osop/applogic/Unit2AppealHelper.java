package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit2AppealCardModel;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * 2 - "The appeals on the pre-trial investigation"("Апеляційні скарги з питань ДР");
 */
public interface Unit2AppealHelper {
	
	boolean isOnUnit2AppealsPage();
	
	void goToMainTab();
	void goToRemovedTab();

	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit2AppealCardModel unit2AppealCardModel);
	void editCard(Unit2AppealCardModel unit2AppealCardModel);
	void removeCard(Unit2AppealCardModel unit2AppealCardModel);
	void restoreCard(Unit2AppealCardModel unit2AppealCardModel);

	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getGroundsForAppeal();
	String getProceedingNumber();

	void saveCard();
	void quitCard();

}
