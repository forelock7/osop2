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
		pages.unit7MassMediaPage.clickCreatCardButton();
		pages.unit7MassMediaPage.setCardUnit7(massMediaCard).saveCard();
		pages.unit7MassMediaPage.clickOnAlertOK();
	}
	
	@Override
	public String getSubjectOfSpeechLastCreatedCard(){
		pages.unit7MassMediaPage.openCardToEditU7();
		String existingTextInSpeechSubjectField = pages.unit7MassMediaPage.getInputSubjectOfSpeech();
		pages.unit7MassMediaPage.exitFromCard();
		return existingTextInSpeechSubjectField;
	}
	
	@Override
	public void editCardUnit7(Unit7Card unit7Card){
		pages.unit7MassMediaPage.openCardToEditU7();
		pages.unit7MassMediaPage.setInputAuthorOfSpeech(unit7Card.someNewText);
		pages.unit7MassMediaPage.saveCard();
		pages.unit7MassMediaPage.clickOnAlertOK();
	}
	
	@Override
	public String getValueInFieldLastCard(){
		pages.unit7MassMediaPage.openCardToEditU7();
		String existingValueInTheoryField = pages.unit7MassMediaPage.getInputAuthorOfSpeech();
		pages.unit7MassMediaPage.exitFromCard();
		return existingValueInTheoryField;
	}

}
