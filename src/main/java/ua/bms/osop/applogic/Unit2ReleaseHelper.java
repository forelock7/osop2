package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit2ReleaseCardModel;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * 4 - "The release from custody"("Звільнення з-під варти");
 */
public interface Unit2ReleaseHelper {
	
	boolean isOnUnit2ReleasePage();
	
	void goToMainTab();
	void goToRemovedTab();

	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit2ReleaseCardModel unit2ReleaseCardModel);
	void editCard(Unit2ReleaseCardModel unit2ReleaseCardModel);
	void removeCard(Unit2ReleaseCardModel unit2ReleaseCardModel);
	void restoreCard(Unit2ReleaseCardModel unit2ReleaseCardModel);

	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getCaseNumber();
	String getProceedingNumber();

	void saveCard();
	void quitCard();

}
