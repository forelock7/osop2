package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Implements all tests related to "International Judicial Cooperation" Page - Unit 4 ("Міжнародно-правове співробітництво")
 */
public class Unit4InternationalTest extends BasicTestCase {
	
	@Test (groups = {"unit4"})
	public void testJumpToUnit4Page() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationTopHelper().goToUnit4Page();
		assertTrue(app.getUnit4Helper().isOnUnit4Page());
	}
	
	@Test (groups = {"unit4"}, dependsOnMethods = {"testJumpToUnit4Page"})
	public void testCreateAndReviewInternationalCard() {
		app.getUnit4Helper().openCardToCreate();
		app.getUnit4Helper().createCard(intCard);
		app.getUnit4Helper().saveCard();
		app.getUnit4Helper().openCardToReview();
		Assert.assertEquals(intCard.claimNumber, app.getUnit4Helper().getClaimNumber());
		app.getUnit4Helper().quitCard();
	}
	
	@Test (groups = {"unit4"}, dependsOnMethods = {"testCreateAndReviewInternationalCard"})
	public void testEditInternationalCard(){
		app.getUnit4Helper().openCardToEdit();
		app.getUnit4Helper().editCard(intCard);
		app.getUnit4Helper().saveCard();
		app.getUnit4Helper().openCardToEdit();
		Assert.assertEquals(intCard.someNewText, app.getUnit4Helper().getSummary());
		app.getUnit4Helper().quitCard();		
	}
	
	@Test (groups = {"unit4"}, dependsOnMethods = {"testEditInternationalCard"})
	public void testRemoveInternationalCard(){
		app.getUnit4Helper().removeCardUnit4(intCard);
		app.getUnit4Helper().moveToRemovedTab();
		Assert.assertEquals(intCard.regNumberRemovedCard, app.getUnit4Helper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit4"}, dependsOnMethods = {"testRemoveInternationalCard"})
	public void testRestoreInternationalCard() {
		app.getUnit4Helper().restoreCardUnit4(intCard);
		app.getUnit4Helper().moveToMainTab();
		Assert.assertEquals(intCard.regNumberRestoredCard, app.getUnit4Helper().getRegNumberFirstCardInGrid());
	}

}
