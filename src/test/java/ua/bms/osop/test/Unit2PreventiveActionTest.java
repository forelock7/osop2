package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.bms.osop.model.Unit2PreventiveCardModel;

import java.io.IOException;

public class Unit2PreventiveActionTest extends BasicTestCase {

	private Unit2PreventiveCardModel preventCard = getUnit2PreventiveCardModel(1);

	public Unit2PreventiveActionTest() throws Exception {
	}

	@Test (groups = {"unit2_preventiveAction"})
	public void testJumpToUnit2PreventiveActionPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2PreventivePage();
		assertTrue(app.getUnit2PreventiveHelper().isOnUnit2PreventivePage());
	}
	
	@Test (groups = {"unit2_preventiveAction"}, dependsOnMethods = {"testJumpToUnit2PreventiveActionPage"})
	public void testCreateAndReviewPreventiveActionCard() {
		app.getUnit2PreventiveHelper().openCardToCreate();
		app.getUnit2PreventiveHelper().setRequiredFields(preventCard);
		app.getUnit2PreventiveHelper().saveCard();
		app.getUnit2PreventiveHelper().openCardToView();
		Assert.assertEquals(preventCard.getProceedingNumber(), app.getUnit2PreventiveHelper().getProceedingNumber());
		app.getUnit2PreventiveHelper().quitCard();
	}
	
	@Test (groups = {"unit2_preventiveAction"}, dependsOnMethods = {"testCreateAndReviewPreventiveActionCard"})
	public void testEditPreventiveActionCard(){
		app.getUnit2PreventiveHelper().openCardToEdit();
		app.getUnit2PreventiveHelper().editCard(preventCard);
		app.getUnit2PreventiveHelper().saveCard();
		app.getUnit2PreventiveHelper().openCardToEdit();
		Assert.assertEquals(preventCard.getSomeNewText(), app.getUnit2PreventiveHelper().getOffenseQualification());
		app.getUnit2PreventiveHelper().quitCard();		
	}
	
	@Test (groups = {"unit2_preventiveAction"}, dependsOnMethods = {"testEditPreventiveActionCard"})
	public void testRemovePreventiveActionCard(){
		app.getUnit2PreventiveHelper().removeCard(preventCard);
		app.getUnit2PreventiveHelper().goToRemovedTab();
		Assert.assertEquals(preventCard.getRegistrationNumber(), app.getUnit2PreventiveHelper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit2_preventiveAction"}, dependsOnMethods = {"testRemovePreventiveActionCard"})
	public void testRestorePreventiveActionCard() {
		app.getUnit2PreventiveHelper().restoreCard(preventCard);
		app.getUnit2PreventiveHelper().goToMainTab();
		Assert.assertEquals(preventCard.getRegistrationNumber(), app.getUnit2PreventiveHelper().getRegNumberFirstCardInGrid());
	}
	
	
}
