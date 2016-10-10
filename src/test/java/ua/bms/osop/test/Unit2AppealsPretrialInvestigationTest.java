package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Unit2AppealsPretrialInvestigationTest extends BasicTestCase {

	@Test (groups = {"unit2_appealsPreInvest"})
	public void testJumpToUnit2AppealsPreInvestPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2AppealsPage();
		assertTrue(app.getUnit2AppealsHelper().isOnUnit2AppealsPage());
	}
	
	@Test (groups = {"unit2_appealsPreInvest"}, dependsOnMethods = {"testJumpToUnit2AppealsPreInvestPage"})
	public void testCreateAndReviewAppealCard() {
		app.getUnit2AppealsHelper().openCardToCreate();
		app.getUnit2AppealsHelper().createCard(appealCard);
		app.getUnit2AppealsHelper().saveCard();
		app.getUnit2AppealsHelper().openCardToView();
		Assert.assertEquals(appealCard.getProceedingNumber(), app.getUnit2AppealsHelper().getProceedingNumber());
		app.getUnit2AppealsHelper().quitCard();
	}
	
	@Test (groups = {"unit2_appealsPreInvest"}, dependsOnMethods = {"testCreateAndReviewAppealCard"})
	public void testEditAppealCard(){
		app.getUnit2AppealsHelper().openCardToEdit();
		app.getUnit2AppealsHelper().editCard(appealCard);
		app.getUnit2AppealsHelper().saveCard();
		app.getUnit2AppealsHelper().openCardToEdit();
		Assert.assertEquals(appealCard.getSomeNewText(), app.getUnit2AppealsHelper().getGroundsForAppeal());
		app.getUnit2AppealsHelper().quitCard();		
	}
	
	@Test (groups = {"unit2_appealsPreInvest"}, dependsOnMethods = {"testEditAppealCard"})
	public void testRemoveAppealCard(){
		app.getUnit2AppealsHelper().removeCard(appealCard);
		app.getUnit2AppealsHelper().goToRemovedTab();
		Assert.assertEquals(appealCard.getRegistrationNumber(), app.getUnit2AppealsHelper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit2_appealsPreInvest"}, dependsOnMethods = {"testRemoveAppealCard"})
	public void testRestoreAppealCard() {
		app.getUnit2AppealsHelper().restoreCard(appealCard);
		app.getUnit2AppealsHelper().goToMainTab();
		Assert.assertEquals(appealCard.getRegistrationNumber(), app.getUnit2AppealsHelper().getRegNumberFirstCardInGrid());
	}
}
