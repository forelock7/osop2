package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class U2AppealAndPreventiveCollaboration  extends BasicTestCase {

	@Test (groups = {"unit2_collaboration"})
	public void testJumpToAppealPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2AppealsPage();
		assertTrue(app.getUnit2AppealHelper().isOnUnit2AppealsPage());
	}
	
	@Test (groups = {"unit2_collaboration"}, dependsOnMethods = {"testCreateAppealCardAddingPreventAction"})
	public void testCreateAppealCardAddingPreventAction() {
		app.getUnit2AppealHelper().openCardToCreate();
		app.getUnit2AppealHelper().createCard(appealCard2);
		app.getUnit2AppealHelper().saveCard();
		app.getUnit2AppealHelper().openCardToView();
		Assert.assertEquals(appealCard.getProceedingNumber(), app.getUnit2AppealHelper().getProceedingNumber());
		app.getUnit2AppealHelper().quitCard();
	}
}
