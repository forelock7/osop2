package ua.bms.applogic1;

import ua.bms.applogic.Unit7Helper;
import ua.bms.model.Unit7Card;

public class Unit7Helper1 extends DriverBasedHelper implements Unit7Helper{
	
	public Unit7Helper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	@Override
	public boolean isOnUnit7Page(){
		return pages.unit7MassMediaPage.waitPageLoaded();
	}
	
	@Override
	public void createCardUnit7(Unit7Card massMediaCard){
		pages.unit7MassMediaPage.clickButtonCreateCard();
		pages.unit7MassMediaPage.setCardUnit7(massMediaCard).clickButtonSaveCard();
		pages.unit7MassMediaPage.clickOnAlertOK();
	}
	
	@Override
	public String getSubjectOfSpeechLastCreatedCardU7(){
		pages.unit7MassMediaPage.clickButtonEditCardUnit7();
		String existingTextInSpeechSubjectField = pages.unit7MassMediaPage.getInputSubjectOfSpeechUnit7();
		pages.unit7MassMediaPage.clickButtonExitFromCardForm();
		return existingTextInSpeechSubjectField;
	}
	
	@Override
	public void editCardUnit7(Unit7Card unit7Card){
		pages.unit7MassMediaPage.clickButtonEditCardUnit7();
		pages.unit7MassMediaPage.setInputAuthorOfSpeechUnit7(unit7Card.someNewText);
		pages.unit7MassMediaPage.clickButtonSaveCard();
		pages.unit7MassMediaPage.clickOnAlertOK();
	}
	
	@Override
	public String getValueInFieldLastCardU7(){
		pages.unit7MassMediaPage.clickButtonEditCardUnit7();
		String existingValueInTheoryField = pages.unit7MassMediaPage.getInputAuthorOfSpeechUnit7();
		pages.unit7MassMediaPage.clickButtonExitFromCardForm();
		return existingValueInTheoryField;
	}
	
	@Override
	public void removeCardUnit7(Unit7Card unit7Card){
		pages.unit7MassMediaPage.removeCardUnit7(unit7Card);
	}
	
	@Override
	public String getRegNumberAfterRemovingCardU7(){
		pages.unit7MassMediaPage.goToRemovedTab();
		return pages.unit7MassMediaPage.getRegNumberFromGridOnRemovedTab();
	}
	
	@Override
	public void restoreCardUnit7(Unit7Card unit7Card){
		pages.unit7MassMediaPage.restoreCardUnit7(unit7Card);
	}
	
	@Override
	public String getRegNumberAfterRestoringCardU7(){
		pages.unit7MassMediaPage.goToMainTab();
		return pages.unit7MassMediaPage.getRegNumberFromGridOnMainTab();
	}

}
