package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.bms.osop.model.Unit2CovertCardModel;

import java.io.IOException;

public class Unit2CovertSurveillanceTest extends BasicTestCase {

	private Unit2CovertCardModel covertCard = getUnit2CovertCardModel(1);

	public Unit2CovertSurveillanceTest() throws IOException {
	}

	@Test (groups = {"unit2_covertSurveillances"})
	public void testJumpToUnit2CovertSurveillancesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2CovertPage();
		assertTrue(app.getUnit2CovertHelper().isOnUnit2CovertPage());
	}
	
	@Test (groups = {"unit2_covertSurveillances"}, dependsOnMethods = {"testJumpToUnit2CovertSurveillancesPage"})
	public void testCreateAndReviewCovertSurveillanceCard() {
		app.getUnit2CovertHelper().openCardToCreate();
		app.getUnit2CovertHelper().createCard(covertCard);
		app.getUnit2CovertHelper().saveCard();
		app.getUnit2CovertHelper().openCardToView();
		Assert.assertEquals(covertCard.getProsecutorDecisionDate(), app.getUnit2CovertHelper().getProsecutorDecisionDate());
		app.getUnit2CovertHelper().quitCard();
	}
	
	@Test (groups = {"unit2_covertSurveillances"}, dependsOnMethods = {"testCreateAndReviewCovertSurveillanceCard"})
	public void testEditCovertSurveillanceCard(){
		app.getUnit2CovertHelper().openCardToEdit();
		app.getUnit2CovertHelper().editCard(covertCard);
		app.getUnit2CovertHelper().saveCard();
		app.getUnit2CovertHelper().openCardToEdit();
		Assert.assertEquals(covertCard.getNewCourtResultDate(), app.getUnit2CovertHelper().getCourtResultDate());
		app.getUnit2CovertHelper().quitCard();		
	}
	
	@Test (groups = {"unit2_covertSurveillances"}, dependsOnMethods = {"testEditCovertSurveillanceCard"})
	public void testRemoveCovertSurveillanceCard(){
		app.getUnit2CovertHelper().removeCard(covertCard);
		app.getUnit2CovertHelper().goToRemovedTab();
		Assert.assertEquals(covertCard.getRegistrationNumber(), app.getUnit2CovertHelper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit2_covertSurveillances"}, dependsOnMethods = {"testRemoveCovertSurveillanceCard"})
	public void testRestoreCovertSurveillanceCard() {
		app.getUnit2CovertHelper().restoreCard(covertCard);
		app.getUnit2CovertHelper().goToMainTab();
		Assert.assertEquals(covertCard.getRegistrationNumber(), app.getUnit2CovertHelper().getRegNumberFirstCardInGrid());
	}
	
}
