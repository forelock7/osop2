package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit5InspectionCard;

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
	
	void moveToMainTab();
	void moveToRemovedTab();
	
	void sortDownMainGrid();
	
	void goToDocumentTabInInspectionCard();
	
	void openInspectionCardToCreate();
	void openInspectionCardToReview();
	void openInspectionCardToEdit();
	void openDocumentCardToCreate();
	void openDocumentCardToReview();
	void openDocumentCardToEdit();
	
	
	
	void createInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard);
	void editInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard);
	void removeInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard);
	void restoreInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard);

	String getRegNumberFirstRemovedInspectionCardInGrid();
	String getRegNumberFirstCardInGrid();
	String getAgencyName();
	
	boolean checkIsButtonCreatePresent();
		
	void saveCard();
	void quitCard();
	
	
	

}
