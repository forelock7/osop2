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
		//app.getNavigationTopHelper().goToNavigationUnit68Page();
		app.getNavigationUnit68Helper().goToUnit8Page();
		assertTrue(app.getUnit8Helper().isOnUnit8Page());
	}
	
	@Test (groups = {"unit8"}, dependsOnMethods = {"testJumpToUnit8Page"})
	public void testCreateRequestCard() {
		app.getUnit8Helper().createCardUnit8(reqCard);
		Assert.assertEquals(reqCard.requestNumber, app.getUnit8Helper().getRequestNumberLastCreatedCardU8());
	}
	
	@Test (groups = {"unit8"}, dependsOnMethods = {"testCreateRequestCard"})
	public void testEditRequestCard(){
		app.getUnit8Helper().editCardUnit8(reqCard);
		Assert.assertEquals(reqCard.someNewText, app.getUnit8Helper().getValueInFieldLastCardU8());
	}
	
	@Test (groups = {"unit8"}, dependsOnMethods = {"testEditRequestCard"})
	public void testRemoveRequestCard(){
		app.getUnit8Helper().removeCardUnit8(reqCard);
		Assert.assertEquals(reqCard.regNumberRemovedCard, app.getUnit8Helper().getRegNumberAfterRemovingCardU8());
	}
	
	@Test (groups = {"unit8"}, dependsOnMethods = {"testRemoveRequestCard"})
	public void testRestoreRequestCard() {
		app.getUnit8Helper().restoreCardUnit8(reqCard);
		Assert.assertEquals(reqCard.regNumberRestoredCard, app.getUnit8Helper().getRegNumberAfterRestoringCardU8());
	}

}
