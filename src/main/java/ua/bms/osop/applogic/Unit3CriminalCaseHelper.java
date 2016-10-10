package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit3CriminalCaseCardModel;

/*
 * Unit 3: "Public prosecution"("Держобвинувачення");
 * 4 - "Criminal cases"("Кримінальні справи");
 */
public interface Unit3CriminalCaseHelper {

	boolean isOnUnit3CriminalCasePage();
	boolean isOnUnit3CriminalCaseCard();
	boolean isStageCreatingUnable();
	boolean checkIsButtonCreateFirstInstance();
	
	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit3CriminalCaseCardModel unit3CriminalCaseCardModel);
	void editCard(Unit3CriminalCaseCardModel unit3CriminalCaseCardModel);
	
	String getRegNumberFirstCardInGrid();
	String getCriminalCaseNumber();
	String getOffenseQualification();

	void goToStagesTab();

	void saveCard();
	void quitCard();
}
