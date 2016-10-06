package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit2ActPICardModel;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * 1 - "Acts of supervision over pre-trial investigation"("Акти нагляду за ДР");
 */
public interface Unit2ActPIHelper {
	
	boolean isOnUnit2ActsPIPage();
	
	void goToMainTab();
	void goToRemovedTab();

	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit2ActPICardModel unit2ActPICardModel);
	void editCard(Unit2ActPICardModel unit2ActPICardModel);
	void removeCard(Unit2ActPICardModel unit2ActPICardModel);
	void restoreCard(Unit2ActPICardModel unit2ActPICardModel);

	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getContent();
	String getProceedingNumber();

	void saveCard();
	void quitCard();

}
