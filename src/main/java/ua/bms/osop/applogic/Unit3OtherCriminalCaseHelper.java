package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit3OtherCriminalCaseCardModel;

/*
 * Unit 3: "Public prosecution"("Держобвинувачення");
 * 5 - "Other criminal cases"("Інші кримінальні справи");
 */
public interface Unit3OtherCriminalCaseHelper {

	boolean isOnUnit3OtherCriminalCasePage();
	boolean isOnUnit3OtherCriminalCaseCard();
	boolean isStageCreatingUnable();
	boolean checkIsButtonCreateFirstInstance();
	
	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit3OtherCriminalCaseCardModel unit3OtherCriminalCaseCardModel);
	void editCard(Unit3OtherCriminalCaseCardModel unit3OtherCriminalCaseCardModel);
	
	String getRegNumberFirstCardInGrid();
	String getCaseNumber();
	String getShortStory();

	void goToStagesTab();

	void saveCard();
	void quitCard();
}
