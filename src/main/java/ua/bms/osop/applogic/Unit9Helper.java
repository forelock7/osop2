package ua.bms.osop.applogic;

import ua.bms.osop.model.Unit9Card;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.Unit9Helper1
 */
public interface Unit9Helper {
	
	boolean isOnUnit9Page();
	void createCardUnit9(Unit9Card adminViolCard);
	String getProtNumberLastCreatedCardU9();
	void editCardUnit9(Unit9Card unit9Card);
	String getValueInFieldLastCardU9();
	void removeCardUnit9(Unit9Card unit9Card);
	String getRegNumberAfterRemovingCardU9();
	void restoreCardUnit9(Unit9Card unit9Card);
	String getRegNumberAfterRestoringCardU9();

}
