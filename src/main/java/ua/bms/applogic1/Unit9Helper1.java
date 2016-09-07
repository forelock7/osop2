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
		pages.unit9MilitaryPage.clickButtonCreateCard();
		pages.unit9MilitaryPage.setCardUnit9(adminViolCard).clickButtonSaveCard();
		pages.unit9MilitaryPage.clickOnAlertOK();
	}
		
	@Override
	public String getProtNumberLastCreatedCardU9(){
		pages.unit9MilitaryPage.clickButtonEditCardUnit9();
		String existingProtNumberInField = pages.unit9MilitaryPage.getInputProtocolNumberUnit9();
		pages.unit9MilitaryPage.clickButtonExitFromCardForm();
		return existingProtNumberInField;
	}
	
	@Override
	public void editCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.clickButtonEditCardUnit9();
		pages.unit9MilitaryPage.setInputTheoryUnit9(unit9Card.someNewText);
		pages.unit9MilitaryPage.clickButtonSaveCard();
		pages.unit9MilitaryPage.clickOnAlertOK();
	}
		
	@Override
	public String getValueInFieldLastCardU9(){
		pages.unit9MilitaryPage.clickButtonEditCardUnit9();
		String existingValueInTheoryField = pages.unit9MilitaryPage.getInputTheoryUnit9();
		pages.unit9MilitaryPage.clickButtonExitFromCardForm();
		return existingValueInTheoryField;
	}
	
	@Override
	public void removeCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.removeCardUnit9(unit9Card);
	}
	
	@Override
	public String getRegNumberAfterRemovingCardU9(){
		pages.unit9MilitaryPage.goToRemovedTab();
		return pages.unit9MilitaryPage.getRegNumberFromGridOnRemovedTab();
	}
	
	@Override
	public void restoreCardUnit9(Unit9Card unit9Card){
		pages.unit9MilitaryPage.restoreCardUnit9(unit9Card);
	}
	
	@Override
	public String getRegNumberAfterRestoringCardU9(){
		pages.unit9MilitaryPage.goToMainTab();
		return pages.unit9MilitaryPage.getRegNumberFromGridOnMainTab();
	}

}
