package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit5InspectionsHelper;
import ua.bms.osop.model.Unit5InspectionCard;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 1 - List Inspections(Перелік перевірок);
 * Implements all methods are used in Unit5SupervisionJugmentTest and related with Unit5InspectionCard model(ua.bms.osop.model.Unit5InspectionCard)
 * Uses methods from Unit5InspectionsPage
 */
public class Unit5InspectionsHelper1 extends DriverBasedHelper implements Unit5InspectionsHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit5InspectionsHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*Checks if on Unit 5 Page*/
	@Override
	public boolean isOnUnit5InspectionPage(){
		return pages.unit5InspectionsPage.waitPageLoaded();
	}
	
	/*Creates a new Card with filling all fields in and submitting*/
	@Override
	public void createInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard) {
		pages.unit5InspectionsPage.clickButtonCreateCard();
		pages.unit5InspectionsPage.setInspectionCardUnit5(unit5InspectionCard).clickButtonSaveCard();
		pages.unit5InspectionsPage.clickOnAlertOK();
	}
	
	/*
	 * Returns value in field "Number of Claim" from created card(after its creating)
	 * The first record(card) in main grid should be the last created.
	 * Checks creating of card.
	 */
	@Override
	public String getClaimNumberLastCreatedInspectionCardU5(){
		pages.unit5InspectionsPage.clickButtonEditInspectionCardUnit5();
		String existingTextInAgencyNameField = pages.unit5InspectionsPage.getInputAgencyNameUnit5();
		pages.unit5InspectionsPage.clickButtonExitFromCardForm();
		return existingTextInAgencyNameField;
	}


}
