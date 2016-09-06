package ua.bms.applogic;

import ua.bms.model.Unit7Card;

public interface Unit7Helper {
	
	boolean isOnUnit7Page();
	void createCardUnit7(Unit7Card massMediaCard);
	String getSubjectOfSpeechLastCreatedCard();
	void editCardUnit7(Unit7Card unit7Card);
	String getValueInFieldLastCard();

	
	/*
	
	
	
	void removeCardUnit7(Unit9Card unit7Card);
	String getRegNumberAfterRemovingCard();
	void restoreCardUnit7(Unit9Card unit7Card);
	String getRegNumberAfterRestoringCard();*/

}
