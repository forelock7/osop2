package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit5ChargedCardModel;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 3 - List of Charged Person(Перелік осіб, притягнутих до відповідальності)
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit5ChargedHelper1
 */
public interface Unit5ChargedHelper {
	
	boolean isOnUnit5ChargedPage();
	
	void sortDownMainGrid();
	
	void openChargedCardToReview();
	
	void createChargedCard(Unit5ChargedCardModel unit5ChargedCardModel);
	void editChargedCard(Unit5ChargedCardModel unit5ChargedCardModel);
	void deleteChargedPersonFromGrid(Unit5ChargedCardModel unit5ChargedCardModel);
	
	String getChargedName();
	String getPost();
	String getChargedNameFromGrid();
	String getRegNumberFirstCardInGrid();
	
	void saveCard();
	void quitCard();



}
