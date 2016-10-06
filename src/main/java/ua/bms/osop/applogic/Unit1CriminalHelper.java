package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit1CriminalCardModel;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 3 - "List of Charged Person"("Розпочато кримінальних проваджень")
 * Related with Unit1CrimeCard model(ua.bms.osop.model.Unit1CrimeCard)
 * Uses methods from Unit1CrimePage
 */
public interface Unit1CriminalHelper {

	boolean isOnUnit1CrimePage();
	
	void goToMainTab();
	void goToRemovedTab();

	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit1CriminalCardModel unit1CriminalCardModel);
	void editCard(Unit1CriminalCardModel unit1CriminalCardModel);
	void removeCard(Unit1CriminalCardModel unit1CriminalCardModel);
	void restoreCard(Unit1CriminalCardModel unit1CriminalCardModel);

	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getTheory();
	String getCriminalProceedingNumber();

	void saveCard();
	void quitCard();
	
}
