package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Implements all tests related to Mass Media (Unit 7)
 */
public class Unit7MassMediaTest extends BasicTestCase {
	
	@Test (groups = {"unit7"})
	public void testJumpToUnit7Page() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationTopHelper().goToUnit7Page();
		assertTrue(app.getUnit7Helper().isOnUnit7Page());
	}
	
	@Test (groups = {"unit7"}, dependsOnMethods = {"testJumpToUnit7Page"})
	public void testCreateAndReviewMassMediaCard() {
		app.getUnit7Helper().createCardUnit7(mMCard);
		app.getUnit7Helper().openCardToReview();
		Assert.assertEquals(mMCard.subjectOfSpeech, app.getUnit7Helper().getSubjectOfSpeech());
		app.getUnit7Helper().quitCard();
	}
	
	@Test (groups = {"unit7"}, dependsOnMethods = {"testCreateAndReviewMassMediaCard"})
	public void testEditMassMediaCard(){
		app.getUnit7Helper().editCardUnit7(mMCard);
		Assert.assertEquals(mMCard.someNewText, app.getUnit7Helper().getValueInFieldLastCardU7());
	}
	
	@Test (groups = {"unit7"}, dependsOnMethods = {"testEditMassMediaCard"})
	public void testRemoveMassMediaCard(){
		app.getUnit7Helper().removeCardUnit7(mMCard);
		Assert.assertEquals(mMCard.regNumberRemovedCard, app.getUnit7Helper().getRegNumberAfterRemovingCardU7());
	}
	
	@Test (groups = {"unit7"}, dependsOnMethods = {"testRemoveMassMediaCard"})
	public void testRestoreMassMediaCard() {
		app.getUnit7Helper().restoreCardUnit7(mMCard);
		Assert.assertEquals(mMCard.regNumberRestoredCard, app.getUnit7Helper().getRegNumberAfterRestoringCardU7());
	}

}
