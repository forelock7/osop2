package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit5InspectionCardModel;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 1 - List Inspections(Перелік перевірок);
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit5InspectionsHelper1
 */
public interface Unit5InspectionsHelper {

	boolean isOnUnit5InspectionPage();
	boolean isOnUnit5InspectionCard();
	boolean isOnUnit5DocumentsTab();
	
	void goToMainTab();
	void goToRemovedTab();
	
	void sortDownMainGrid();
	
	void goToDocumentTabInInspectionCard();
	
	void openInspectionCardToCreate();
	void openInspectionCardToView();
	void openInspectionCardToEdit();
	void openDocumentCardToCreate();
	void openDocumentCardToView();
	void openDocumentCardToEdit();
	
	
	
	void createInspectionCardUnit5(Unit5InspectionCardModel unit5InspectionCardModel);
	void editInspectionCardUnit5(Unit5InspectionCardModel unit5InspectionCardModel);
	void removeInspectionCardUnit5(Unit5InspectionCardModel unit5InspectionCardModel);
	void restoreInspectionCardUnit5(Unit5InspectionCardModel unit5InspectionCardModel);

	String getRegNumberFirstRemovedInspectionCardInGrid();
	String getRegNumberFirstCardInGrid();
	String getAgencyName();
	
	boolean checkIsButtonCreatePresent();
		
	void saveCard();
	void quitCard();
	
	
	

}
