package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit2ActOACardModel;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * 5 - "Acts of supervision over Operational Activities"("Акти нагляду за ОРД");
 */
public interface Unit2ActOAHelper {

	boolean isOnUnit2ActsOAPage();
	
	void goToMainTab();
	void goToRemovedTab();

	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit2ActOACardModel unit2ActOACardModel);
	void editCard(Unit2ActOACardModel unit2ActOACardModel);
	void removeCard(Unit2ActOACardModel unit2ActOACardModel);
	void restoreCard(Unit2ActOACardModel unit2ActOACardModel);

	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getAmountOfChecked();

	void saveCard();
	void quitCard();
	
}
