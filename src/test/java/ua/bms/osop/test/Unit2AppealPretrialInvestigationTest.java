package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Unit2AppealPretrialInvestigationTest extends BasicTestCase {

	@Test (groups = {"unit2_appealsPreInvest"})
	public void testJumpToUnit2AppealsPreInvestPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2AppealsPage();
		assertTrue(app.getUnit2AppealHelper().isOnUnit2AppealsPage());
	}
	
	@Test (groups = {"unit2_appealsPreInvest"}, dependsOnMethods = {"testJumpToUnit2AppealsPreInvestPage"})
	public void testCreateAndReviewAppealCard() {
		app.getUnit2AppealHelper().openCardToCreate();
		app.getUnit2AppealHelper().createCard(appealCard);
		app.getUnit2AppealHelper().saveCard();
		app.getUnit2AppealHelper().openCardToView();
		Assert.assertEquals(appealCard.getProceedingNumber(), app.getUnit2AppealHelper().getProceedingNumber());
		app.getUnit2AppealHelper().quitCard();
	}
	
	@Test (groups = {"unit2_appealsPreInvest"}, dependsOnMethods = {"testCreateAndReviewAppealCard"})
	public void testEditAppealCard(){
		app.getUnit2AppealHelper().openCardToEdit();
		app.getUnit2AppealHelper().editCard(appealCard);
		app.getUnit2AppealHelper().saveCard();
		app.getUnit2AppealHelper().openCardToEdit();
		Assert.assertEquals(appealCard.getSomeNewText(), app.getUnit2AppealHelper().getGroundsForAppeal());
		app.getUnit2AppealHelper().quitCard();		
	}
	
	@Test (groups = {"unit2_appealsPreInvest"}, dependsOnMethods = {"testEditAppealCard"})
	public void testRemoveAppealCard(){
		app.getUnit2AppealHelper().removeCard(appealCard);
		app.getUnit2AppealHelper().goToRemovedTab();
		Assert.assertEquals(appealCard.getRegistrationNumber(), app.getUnit2AppealHelper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit2_appealsPreInvest"}, dependsOnMethods = {"testRemoveAppealCard"})
	public void testRestoreAppealCard() {
		app.getUnit2AppealHelper().restoreCard(appealCard);
		app.getUnit2AppealHelper().goToMainTab();
		Assert.assertEquals(appealCard.getRegistrationNumber(), app.getUnit2AppealHelper().getRegNumberFirstCardInGrid());
	}
}
