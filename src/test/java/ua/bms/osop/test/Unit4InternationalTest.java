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
	public void testCreateInternationalCard() {
		app.getUnit4Helper().createCardUnit4(intCard);
		Assert.assertEquals(intCard.claimNumber, app.getUnit4Helper().getClaimNumberLastCreatedCardU4());
	}
	
	@Test (groups = {"unit4"}, dependsOnMethods = {"testCreateInternationalCard"})
	public void testEditInternationalCard(){
		app.getUnit4Helper().editCardUnit4(intCard);
		Assert.assertEquals(intCard.someNewText, app.getUnit4Helper().getValueInFieldLastCardU4());
	}
	
	@Test (groups = {"unit4"}, dependsOnMethods = {"testEditInternationalCard"})
	public void testRemoveInternationalCard(){
		app.getUnit4Helper().removeCardUnit4(intCard);
		Assert.assertEquals(intCard.regNumberRemovedCard, app.getUnit4Helper().getRegNumberAfterRemovingCardU4());
	}
	
	@Test (groups = {"unit4"}, dependsOnMethods = {"testRemoveInternationalCard"})
	public void testRestoreInternationalCard() {
		app.getUnit4Helper().restoreCardUnit4(intCard);
		Assert.assertEquals(intCard.regNumberRestoredCard, app.getUnit4Helper().getRegNumberAfterRestoringCardU4());
	}

}
