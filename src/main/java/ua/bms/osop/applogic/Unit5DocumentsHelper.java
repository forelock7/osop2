package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit5DocumentCard;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 2 - List of Response Documents(Перелік документів реагування);
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit5DocumentsHelper1
 */
public interface Unit5DocumentsHelper {
	
	boolean isOnUnit5DocumentsPage();
	boolean existRecordInChargedGrid();
	
	void sortDownMainGrid();
	
	void goToMainTab();
	void goToRemovedTab();
	
	void openChargedCardToCreate();
	void openChargedCardToView();
	void openChargedCardToEdit();
	void openDocumentCardToReview();
	
	void createDocumentCard(Unit5DocumentCard unit5DocumentCard);
	void editDocumentCard(Unit5DocumentCard unit5DocumentCard);
	void removeDocumentCard(Unit5DocumentCard unit5DocumentCard);
	void restoreDocumentCard(Unit5DocumentCard documentCard);
	
	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getChargedNameFromGrid();
	String getContentDocument();
	
	void saveCard();
	void quitCard();

	

	
	
}
