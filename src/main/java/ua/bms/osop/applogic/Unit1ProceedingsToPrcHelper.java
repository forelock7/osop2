package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit1ProceedingToPrcCard;

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

	void createCard(Unit1ProceedingToPrcCard unit1ProceedingToPrcCard);
	void editCard(Unit1ProceedingToPrcCard unit1ProceedingToPrcCard);

	String getRegNumberFirstCardInGrid();
	String getPlaintiff();
	String getDefendant();

	void goToStagesTab();

	void saveCard();
	void quitCard();
	
}
