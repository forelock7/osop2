package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit2PreventiveCardModel;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * 3 - "The Preventive Action"("Запобіжні заходи");
 */
public interface Unit2PreventiveHelper {
	
	boolean isOnUnit2PreventivePage();
	
	void goToMainTab();
	void goToRemovedTab();

	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit2PreventiveCardModel unit2PreventiveCardModel);
	void editCard(Unit2PreventiveCardModel unit2PreventiveCardModel);
	void removeCard(Unit2PreventiveCardModel unit2PreventiveCardModel);
	void restoreCard(Unit2PreventiveCardModel unit2PreventiveCardModel);

	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getOffenseQualification();
	String getProceedingNumber();

	void saveCard();
	void quitCard();

}
