package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.bms.osop.model.Unit7CardModel;

import java.io.IOException;

/*
 * Implements all tests related to Mass Media (Unit 7)
 */
public class Unit7MassMediaTest extends BasicTestCase {

	private Unit7CardModel mMCard = getUnit7CardModel(1);

	public Unit7MassMediaTest() throws Exception {
	}

	@Test (groups = {"unit7"})
	public void testJumpToUnit7Page() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationTopHelper().goToUnit7Page();
		assertTrue(app.getUnit7Helper().isOnUnit7Page());
	}
	
	@Test (groups = {"unit7"}, dependsOnMethods = {"testJumpToUnit7Page"})
	public void testCreateAndReviewMassMediaCard() {
		app.getUnit7Helper().openCardToCreate();
		app.getUnit7Helper().createCardUnit7(mMCard);
		app.getUnit7Helper().saveCard();
		app.getUnit7Helper().openCardToView();
		Assert.assertEquals(mMCard.getSubjectOfSpeech(), app.getUnit7Helper().getSubjectOfSpeech());
		app.getUnit7Helper().quitCard();
	}
	
	@Test (groups = {"unit7"}, dependsOnMethods = {"testCreateAndReviewMassMediaCard"})
	public void testEditMassMediaCard(){
		app.getUnit7Helper().openCardToEdit();
		app.getUnit7Helper().editCardUnit7(mMCard);
		app.getUnit7Helper().saveCard();
		app.getUnit7Helper().openCardToEdit();
		Assert.assertEquals(mMCard.getSomeNewText(), app.getUnit7Helper().getAuthorOfSpeech());
		app.getUnit7Helper().quitCard();
	}
	
	@Test (groups = {"unit7"}, dependsOnMethods = {"testEditMassMediaCard"})
	public void testRemoveMassMediaCard(){
		app.getUnit7Helper().removeCardUnit7(mMCard);
		app.getUnit7Helper().goToRemovedTab();
		Assert.assertEquals(mMCard.getRegistrationNumber(), app.getUnit7Helper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit7"}, dependsOnMethods = {"testRemoveMassMediaCard"})
	public void testRestoreMassMediaCard() {
		app.getUnit7Helper().restoreCardUnit7(mMCard);
		app.getUnit7Helper().goToMainTab();
		Assert.assertEquals(mMCard.getRegistrationNumber(), app.getUnit7Helper().getRegNumberFirstCardInGrid());
	}

}
