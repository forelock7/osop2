package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit1ProceedingCard;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 1 - "Review proceedings on a claim"("НП за позовом");
 * Related with Unit1ReviewCard model(ua.bms.osop.model.Unit1ReviewCard)
 * Uses methods from Unit1ReviewPage
 */
public interface Unit1ProceedingsHelper {

	boolean isOnUnit1ReviewPage();
	
	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit1ProceedingCard unit1ProceedingCard);
	void editCard(Unit1ProceedingCard unit1ProceedingCard);
	
	String getRegNumberFirstCardInGrid();
	String getPlaintiff();
	String getDefendant();

	void saveCard();
	void quitCard();
}
