package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class U2AppealAndPreventiveRelation  extends BasicTestCase {

	@Test (groups = {"unit2_relation"})
	public void testJumpToUnit2PreventiveActionPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2PreventivePage();
		assertTrue(app.getUnit2PreventiveHelper().isOnUnit2PreventivePage());
	}
	
	@Test (groups = {"unit2_relation"}, dependsOnMethods = {"testJumpToUnit2PreventiveActionPage"})
	public void testCreateAndReviewPreventiveActionCard() {
		app.getUnit2PreventiveHelper().openCardToCreate();
		app.getUnit2PreventiveHelper().setRequiredFields(preventCard2);
		app.getUnit2PreventiveHelper().saveCard();
		app.getUnit2PreventiveHelper().openCardToView();
		Assert.assertEquals(preventCard2.getProceedingNumber(), app.getUnit2PreventiveHelper().getProceedingNumber());
		app.getUnit2PreventiveHelper().storeRegistrationNumber(preventCard2);
		app.getUnit2PreventiveHelper().quitCard();
	}
	
	@Test (groups = {"unit2_relation"}, dependsOnMethods = {"testCreateAndReviewPreventiveActionCard"})
	public void testJumpToAppealPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2AppealsPage();
		assertTrue(app.getUnit2AppealHelper().isOnUnit2AppealsPage());
	}
	
	@Test (groups = {"unit2_relation"}, dependsOnMethods = {"testJumpToAppealPage"})
	public void testCreateAppealWithAddingPreventAction() {
		app.getUnit2AppealHelper().openCardToCreate();
		app.getUnit2AppealHelper().setRequiredFields(appealCard2);
		app.getUnit2AppealHelper().addRelativePreventiveCard(appealCard2);
		Assert.assertEquals(appealCard2.getRegistrationNumberAddedPreventiveCard(), preventCard2.getRegistrationNumber());
		Assert.assertEquals(appealCard2.getRegistrationNumberAddedPreventiveCard(), app.getUnit2AppealHelper().getRegistrationNumberRelatedPreventiveCard());
		app.getUnit2AppealHelper().saveCard();
		app.getUnit2AppealHelper().openCardToView();
		Assert.assertEquals(appealCard2.getProceedingNumber(), app.getUnit2AppealHelper().getProceedingNumber());
		app.getUnit2AppealHelper().storeRegistrationNumber(appealCard2);
		Assert.assertEquals(appealCard2.getRegistrationNumberAddedPreventiveCard(), app.getUnit2AppealHelper().getRegistrationNumberRelatedPreventiveCard());
		app.getUnit2AppealHelper().quitCard();
	}
	
	@Test (groups = {"unit2_relation"}, dependsOnMethods = {"testCreateAppealWithAddingPreventAction"})
	public void testJumpToPreventPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2PreventivePage();
		assertTrue(app.getUnit2PreventiveHelper().isOnUnit2PreventivePage());
	}
	
	@Test (groups = {"unit2_relation"}, dependsOnMethods = {"testJumpToPreventPage"})
	public void testCheckAddingAppealReference() {
		app.getUnit2PreventiveHelper().sortDownMainGrid();
		Assert.assertEquals(preventCard2.getRegistrationNumber(), app.getUnit2PreventiveHelper().getRegNumberFirstCardInGrid());
		app.getUnit2PreventiveHelper().openCardToEdit();
		Assert.assertEquals(app.getUnit2PreventiveHelper().getRegistrationNumberRelatedAppealCard(), appealCard2.getRegistrationNumber());
	}
	
}
