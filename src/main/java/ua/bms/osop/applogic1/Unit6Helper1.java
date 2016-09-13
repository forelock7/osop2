package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit6Helper;
import ua.bms.osop.model.Unit6Card;

/*
 * Ancillary Class for tests on Claims Page Unit 6
 * Implements all methods are used in Unit6ClaimsTest and related with Unit6Card model(ua.bms.osop.model.Unit6Card)
 * Uses methods from Unit6ClaimsPage
 */
public class Unit6Helper1 extends DriverBasedHelper implements Unit6Helper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit6Helper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*Checks if on Unit 6 Page*/
	@Override
	public boolean isOnUnit6Page(){
		return pages.unit6ClaimsPage.waitPageLoaded();
	}
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createCardUnit6(Unit6Card claimCard){
		pages.unit6ClaimsPage.clickButtonCreateCard();
		pages.unit6ClaimsPage.setCardUnit6(claimCard).clickButtonSaveCard();
		pages.unit6ClaimsPage.clickOnAlertOK();
	}
	
	/*
	 * Returns value in field "Number of Claim" from created card(after its creating)
	 * The first record(card) in main grid should be the last created.
	 * Checks creating of card.
	 */
	@Override
	public String getClaimNumberLastCreatedCardU6(){
		pages.unit6ClaimsPage.clickButtonEditCardUnit6();
		String existingTextInSpeechSubjectField = pages.unit6ClaimsPage.getInputClaimNumberUnit6();
		pages.unit6ClaimsPage.clickButtonExitFromCardForm();
		return existingTextInSpeechSubjectField;
	}

}
