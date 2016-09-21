package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Implements all tests related to Requests (Unit 8)
 */
public class Unit8RequestsTest extends BasicTestCase {
	
	@Test (groups = {"unit8"})
	public void testJumpToUnit8Page() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit68Helper().goToUnit8Page();
		assertTrue(app.getUnit8Helper().isOnUnit8Page());
	}
		
	@Test (groups = {"unit8"}, dependsOnMethods = {"testJumpToUnit8Page"})
	public void testCreateAndReviewRequestCard() {
		app.getUnit8Helper().openCardToCreate();
		app.getUnit8Helper().createCardUnit8(reqCard);
		app.getUnit8Helper().saveCard();
		app.getUnit8Helper().openCardToView();
		Assert.assertEquals(reqCard.requestNumber, app.getUnit8Helper().getRequestNumber());
		app.getUnit8Helper().quitCard();
	}
	
	@Test (groups = {"unit8"}, dependsOnMethods = {"testCreateAndReviewRequestCard"})
	public void testEditRequestCard(){
		app.getUnit8Helper().openCardToEdit();
		app.getUnit8Helper().editCardUnit8(reqCard);
		app.getUnit8Helper().saveCard();
		app.getUnit8Helper().openCardToEdit();
		Assert.assertEquals(reqCard.someNewText, app.getUnit8Helper().getSummary());
		app.getUnit8Helper().quitCard();
	}
	
	@Test (groups = {"unit8"}, dependsOnMethods = {"testEditRequestCard"})
	public void testRemoveRequestCard(){
		app.getUnit8Helper().removeCardUnit8(reqCard);
		app.getUnit8Helper().moveToRemovedTab();
		Assert.assertEquals(reqCard.regNumberRemovedCard, app.getUnit8Helper().getRegNumbreFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit8"}, dependsOnMethods = {"testRemoveRequestCard"})
	public void testRestoreRequestCard() {
		app.getUnit8Helper().restoreCardUnit8(reqCard);
		app.getUnit8Helper().moveToMainTab();
		Assert.assertEquals(reqCard.regNumberRestoredCard, app.getUnit8Helper().getRegNumberFirstCardInGrid());
	}

}
