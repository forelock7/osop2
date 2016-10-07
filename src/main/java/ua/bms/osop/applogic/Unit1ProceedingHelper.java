package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit1ProceedingCardModel;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 1 - "Review proceedings on a claim"("НП за позовом");
 * Related with Unit1ReviewCard model(ua.bms.osop.model.Unit1ReviewCard)
 * Uses methods from Unit1ReviewPage
 */
public interface Unit1ProceedingHelper {

	boolean isOnUnit1ProceedingsPage();
	boolean isOnUnit1ProceedingCard();
	boolean isStageCreatingUnable();
	boolean checkIsButtonCreateFirstInstance();
	
	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit1ProceedingCardModel unit1ProceedingCardModel);
	void editCard(Unit1ProceedingCardModel unit1ProceedingCardModel);
	
	String getRegNumberFirstCardInGrid();
	String getPlaintiff();
	String getDefendant();

	void goToStagesTab();

	void saveCard();
	void quitCard();



}
