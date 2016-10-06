package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit3CriminalProceedingCardModel;

/*
 * Unit 3: "Public prosecution"("Держобвинувачення");
 * 1 - "Criminal proceedings"("Кримінальні провадження");
 */
public interface Unit3CriminalProceedingHelper {

	boolean isOnUnit3CriminalProceedingPage();
	boolean isOnUnit3CriminalProceedingCard();
	boolean isOnUnit1StagesTab();
	boolean checkIsButtonCreateFirstInstance();
	
	void openCardToCreate();
	void openCardToView();
	void openCardToEdit();
	
	void createCard(Unit3CriminalProceedingCardModel unit3CriminalProceedingCardModel);
	void editCard(Unit3CriminalProceedingCardModel unit3CriminalProceedingCardModel);
	
	String getRegNumberFirstCardInGrid();
	String getCriminalProceedingNumber();
	String getOffenseQualification();

	void goToStagesTab();

	void saveCard();
	void quitCard();

}
