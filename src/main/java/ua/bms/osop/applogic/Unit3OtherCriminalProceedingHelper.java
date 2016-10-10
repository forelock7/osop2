package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit3OtherCriminalProceedingCardModel;

/*
 * Unit 3: "Public prosecution"("Держобвинувачення");
 * 2 - "Other criminal proceedings"("Інші кримінальні провадження");
 */
public interface Unit3OtherCriminalProceedingHelper {

	boolean isOnUnit3OtherCriminalProceedingPage();
	boolean isOnUnit3OtherCriminalProceedingCard();
	boolean isStageCreatingUnable();
	boolean checkIsButtonCreateFirstInstance();
	
	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit3OtherCriminalProceedingCardModel unit3OtherCriminalProceedingCardModel);
	void editCard(Unit3OtherCriminalProceedingCardModel unit3OtherCriminalProceedingCardModel);
	
	String getRegNumberFirstCardInGrid();
	String getProceedingCaseNumber();
	String getShortStory();

	void goToStagesTab();

	void saveCard();
	void quitCard();
	
}
