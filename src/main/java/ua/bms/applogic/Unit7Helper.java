package ua.bms.applogic;

import ua.bms.model.Unit7Card;

public interface Unit7Helper {
	
	boolean isOnUnit7Page();
	void createCardUnit7(Unit7Card massMediaCard);
	String getSubjectOfSpeechLastCreatedCardU7();
	void editCardUnit7(Unit7Card unit7Card);
	String getValueInFieldLastCardU7();
	void removeCardUnit7(Unit7Card unit7Card);
	String getRegNumberAfterRemovingCardU7();
	void restoreCardUnit7(Unit7Card unit7Card);
	String getRegNumberAfterRestoringCardU7();

}
