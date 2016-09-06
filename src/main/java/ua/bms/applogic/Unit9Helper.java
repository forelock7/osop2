package ua.bms.applogic;

import ua.bms.model.Unit9Card;

public interface Unit9Helper {
	
	boolean isOnUnit9Page();
	void createCardUnit9(Unit9Card adminViolCard);
	String getProtNumberLastCreatedCard();
	void editCardUnit9(Unit9Card unit9Card);
	String getValueInFieldLastCard();
	void removeCardUnit9(Unit9Card unit9Card);
	String getRegNumberAfterRemovingCard();
	void restoreCardUnit9(Unit9Card unit9Card);
	String getRegNumberAfterRestoringCard();

}
