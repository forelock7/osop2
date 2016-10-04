package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit1ProceedingToPrcCardModel;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 2 - "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури");
 * Related with Unit1ReviewToPrcCard model(ua.bms.osop.model.Unit1ReviewToPrcCard)
 * Uses methods from Unit1ReviewToPrcPage
 */
public interface Unit1ProceedingsToPrcHelper {

	boolean isOnUnit1ProceedingsToPrcPage();
	boolean isOnUnit1ProceedingToPrcCard();
	boolean isOnUnit1StagesTab();
	boolean checkIsButtonCreateFirstInstance();

	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();

	void createCard(Unit1ProceedingToPrcCardModel unit1ProceedingToPrcCardModel);
	void editCard(Unit1ProceedingToPrcCardModel unit1ProceedingToPrcCardModel);

	String getRegNumberFirstCardInGrid();
	String getPlaintiff();
	String getDefendant();

	void goToStagesTab();

	void saveCard();
	void quitCard();
	
}
