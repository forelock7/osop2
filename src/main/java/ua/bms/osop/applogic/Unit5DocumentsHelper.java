package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit5ChargedCard;
import ua.bms.osop.model.Unit5DocumentCard;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 2 - List of Response Documents(Перелік документів реагування);
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit5DocumentsHelper1
 */
public interface Unit5DocumentsHelper {
	
	boolean isOnUnit5DocumentsPage();
	void quitCard();
	void createDocumentAndChargedCard(Unit5DocumentCard unit5DocumentCard, Unit5ChargedCard unit5ChargedCard);
	String getContentLastDocFromGrid();
	String getChargedNameFromGrid();
	

}
