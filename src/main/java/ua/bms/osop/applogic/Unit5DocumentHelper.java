package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit5DocumentCardModel;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 2 - List of Response Documents(Перелік документів реагування);
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit5DocumentsHelper1
 */
public interface Unit5DocumentHelper {
	
	boolean isOnUnit5DocumentsPage();
	boolean existRecordInChargedGrid();
	
	void sortDownMainGrid();
	
	void goToMainTab();
	void goToRemovedTab();
	
	void openChargedCardToCreate();
	void openChargedCardToView();
	void openChargedCardToEdit();
	void openDocumentCardToReview();
	
	void createDocumentCard(Unit5DocumentCardModel unit5DocumentCardModel);
	void editDocumentCard(Unit5DocumentCardModel unit5DocumentCardModel);
	void removeDocumentCard(Unit5DocumentCardModel unit5DocumentCardModel);
	void restoreDocumentCard(Unit5DocumentCardModel documentCard);
	
	String getRegNumberFirstCardInGrid();
	String getRegNumberFirstRemovedCardInGrid();
	String getChargedNameFromGrid();
	String getContentDocument();
	
	void saveCard();
	void quitCard();

	

	
	
}
