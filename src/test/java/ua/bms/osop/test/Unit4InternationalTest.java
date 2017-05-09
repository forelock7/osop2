package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.bms.osop.model.Unit4CardModel;

import java.io.IOException;

/*
 * Implements all tests related to "International Judicial Cooperation" Page - Unit 4 ("Міжнародно-правове співробітництво")
 */
public class Unit4InternationalTest extends BasicTestCase {

	private Unit4CardModel intCard = getUnit4CardModel(1);

	public Unit4InternationalTest() throws Exception {
	}

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
		app.getUnit4Helper().openCardToView();
		Assert.assertEquals(intCard.getClaimNumber(), app.getUnit4Helper().getClaimNumber());
		app.getUnit4Helper().quitCard();
	}
	
	@Test (groups = {"unit4"}, dependsOnMethods = {"testCreateAndReviewInternationalCard"})
	public void testEditInternationalCard(){
		app.getUnit4Helper().openCardToEdit();
		app.getUnit4Helper().editCard(intCard);
		app.getUnit4Helper().saveCard();
		app.getUnit4Helper().openCardToEdit();
		Assert.assertEquals(intCard.getSomeNewText(), app.getUnit4Helper().getSummary());
		app.getUnit4Helper().quitCard();		
	}
	
	@Test (groups = {"unit4"}, dependsOnMethods = {"testEditInternationalCard"})
	public void testRemoveInternationalCard(){
		app.getUnit4Helper().removeCard(intCard);
		app.getUnit4Helper().goToRemovedTab();
		Assert.assertEquals(intCard.getRegistrationNumber(), app.getUnit4Helper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit4"}, dependsOnMethods = {"testRemoveInternationalCard"})
	public void testRestoreInternationalCard() {
		app.getUnit4Helper().restoreCard(intCard);
		app.getUnit4Helper().goToMainTab();
		Assert.assertEquals(intCard.getRegistrationNumber(), app.getUnit4Helper().getRegNumberFirstCardInGrid());
	}

}
