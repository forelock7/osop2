package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.bms.osop.model.Unit6CardModel;

import java.io.IOException;

/*
 * Implements all tests related to "International Judicial Cooperation" Page - Unit 4 ("Міжнародно-правове співробітництво")
 */
public class Unit6ClaimTest extends BasicTestCase {

	private Unit6CardModel clCard = getUnit6CardModel(1);

	public Unit6ClaimTest() throws IOException {
	}

	@Test (groups = {"unit6"})
	public void testJumpToUnit6Page() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit68Helper().goToUnit6Page();
		assertTrue(app.getUnit6Helper().isOnUnit6Page());
	}
	
	@Test (groups = {"unit6"}, dependsOnMethods = {"testJumpToUnit6Page"})
	public void testCreateAndReviewClaimCard() {
		app.getUnit6Helper().openCardToCreate();
		app.getUnit6Helper().createCardUnit6(clCard);
		app.getUnit6Helper().saveCard();
		app.getUnit6Helper().openCardToView();
		Assert.assertEquals(clCard.getClaimNumber(), app.getUnit6Helper().getClaimNumber());
		app.getUnit6Helper().quitCard();
	}
	
	@Test (groups = {"unit6"}, dependsOnMethods = {"testCreateAndReviewClaimCard"})
	public void testEditClaimCard(){
		app.getUnit6Helper().openCardToEdit();
		app.getUnit6Helper().editCardUnit6(clCard);
		app.getUnit6Helper().saveCard();
		app.getUnit6Helper().openCardToEdit();
		Assert.assertEquals(clCard.getSomeNewText(), app.getUnit6Helper().getSummary());
		app.getUnit6Helper().quitCard();
	}
	
	@Test (groups = {"unit6"}, dependsOnMethods = {"testEditClaimCard"})
	public void testRemoveClaimCard(){
		app.getUnit6Helper().removeCardUnit6(clCard);
		app.getUnit6Helper().goToRemovedTab();
		Assert.assertEquals(clCard.getRegistrationNumber(), app.getUnit6Helper().getRegNumberRemovedCardInGrid());
	}
	
	@Test (groups = {"unit6"}, dependsOnMethods = {"testRemoveClaimCard"})
	public void testRestoreClaimCard() {
		app.getUnit6Helper().restoreCardUnit6(clCard);
		app.getUnit6Helper().goToMainTab();
		Assert.assertEquals(clCard.getRegistrationNumber(), app.getUnit6Helper().getRegNumberFirstCardInGrid());
	}

}
