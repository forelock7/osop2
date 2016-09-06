package ua.bms.applogic1;

import ua.bms.applogic.Unit9Helper;
import ua.bms.model.Unit9Card;

public class Unit9Helper1 extends DriverBasedHelper implements Unit9Helper  {
	
	public Unit9Helper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	@Override
	public boolean isOnUnit9Page(){
		return pages.unit9MilitaryPage.waitPageLoaded();
	}
	
	@Override
	public void createCardUnit9(Unit9Card adminViolCard){
		pages.unit9MilitaryPage.clickCreatCardButton();
		pages.unit9MilitaryPage.setCardUnit9(adminViolCard).saveCard();
		pages.unit9MilitaryPage.clickOnAlertOK();
	}
		
	@Override
	public String getProtNumberLastCreatedCard(){
		pages.unit9MilitaryPage.openCardToEditU9();
		String existingProtNumberInField = pages.unit9MilitaryPage.getProtocolNumber();
		pages.unit9MilitaryPage.exitFromCard();
		return existingProtNumberInField;
	}
	
	@Override
	public void editCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.openCardToEditU9();
		pages.unit9MilitaryPage.changeValueInTextField(unit9Card.someNewText);
		pages.unit9MilitaryPage.saveCard();
		pages.unit9MilitaryPage.clickOnAlertOK();
	}
		
	@Override
	public String getValueInFieldLastCard(){
		pages.unit9MilitaryPage.openCardToEditU9();
		String existingValueInTheoryField = pages.unit9MilitaryPage.getValueInFieldTheory();
		pages.unit9MilitaryPage.exitFromCard();
		return existingValueInTheoryField;
	}
	
	@Override
	public void removeCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.removeCard(unit9Card);
	}
	
	@Override
	public String getRegNumberAfterRemovingCard(){
		pages.unit9MilitaryPage.goToRemoved();
		return pages.unit9MilitaryPage.getRegNumberFromGridOnDelTab();
	}
	
	@Override
	public void restoreCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.restoreCard(unit9Card);
	}
	
	@Override
	public String getRegNumberAfterRestoringCard(){
		pages.unit9MilitaryPage.goToMainTab();
		return pages.unit9MilitaryPage.getRegNumberFromGridOnMainTab();
	}

}
