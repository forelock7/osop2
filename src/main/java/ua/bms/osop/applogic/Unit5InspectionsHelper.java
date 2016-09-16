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
	void createInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard);
	String getAgencyNameLastCreatedInspectionCardU5();
	void editInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard);
	void removeInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard);
	String getRegNumberAfterRemovingInspectionCardU5();
	void restoreInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard);
	String getRegNumberAfterRestoringCardU5();
	void openToCreateInspectionCard();
	void goToDocumentTabInInspectionCard();
	boolean isOnUnit5InspectionCard();
	void openToEditInspectionCardUnit5();
	boolean checkIsButtonCreatePresent();
	boolean isOnUnit5DocumentsTab();
	void quitCard();
	void loadDownMainGrid();
	void openToCreateDocumentCard();
	

	

}
