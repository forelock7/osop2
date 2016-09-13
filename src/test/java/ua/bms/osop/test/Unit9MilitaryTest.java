package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Implements all tests related to Military Administrative Violations (Unit 9)
 */
public class Unit9MilitaryTest extends BasicTestCase {
	
	@Test (groups = {"unit9"})
	public void testJumpToUnit9Page(){
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationTopHelper().goToUnit9Page();
		assertTrue(app.getUnit9Helper().isOnUnit9Page());
	}	

	@Test (groups = {"unit9"}, dependsOnMethods = {"testJumpToUnit9Page"})
	public void testCreateMilitaryCard(){
		app.getUnit9Helper().createCardUnit9(mAOCard);
		Assert.assertEquals(mAOCard.protocolNumber, app.getUnit9Helper().getProtNumberLastCreatedCardU9());
	}
	
	@Test (groups = {"unit9"}, dependsOnMethods = {"testCreateMilitaryCard"})
	public void testEditMilitaryCard(){
		app.getUnit9Helper().editCardUnit9(mAOCard);
		Assert.assertEquals(mAOCard.someNewText, app.getUnit9Helper().getValueInFieldLastCardU9());
	}
		
	@Test (groups = {"unit9"}, dependsOnMethods = {"testEditMilitaryCard"})
	public void testRemoveMilitaryCard(){
		app.getUnit9Helper().removeCardUnit9(mAOCard);
		Assert.assertEquals(mAOCard.regNumberRemovedCard, app.getUnit9Helper().getRegNumberAfterRemovingCardU9());
	}
	
	@Test (groups = {"unit9"}, dependsOnMethods = {"testRemoveMilitaryCard"})
	public void testRestoreMilitaryCard() {
		app.getUnit9Helper().restoreCardUnit9(mAOCard);
		Assert.assertEquals(mAOCard.regNumberRestoredCard, app.getUnit9Helper().getRegNumberAfterRestoringCardU9());
	}

}
