package ua.bms.test;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Unit9MilitaryTest extends BasicTestCase {
	
/*-----------------------------Tests---------------------------------------------------------*/	
	
	@Test (groups = {"unit9"})
	public void testJumpToUnit9Page(){
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationHelper().goToUnit9Page();
		assertTrue(app.getUnit9Helper().isOnUnit9Page());
	}	

	@Test (groups = {"unit9"}, dependsOnMethods = {"testJumpToUnit9Page"})
	public void testCreateMilitaryCard(){
		app.getUnit9Helper().createCardUnit9(mAVCard);
		Assert.assertEquals(app.getUnit9Helper().getProtNumberLastCreatedCard(), mAVCard.protocolNumber);
	}
	
	@Test (groups = {"unit9"}, dependsOnMethods = {"testCreateMilitaryCard"})
	public void testEditMilitaryCard(){
		app.getUnit9Helper().editCardUnit9(mAVCard);
		Assert.assertEquals(app.getUnit9Helper().getValueInFieldLastCard(), mAVCard.someNewText);
	}
		
	@Test (groups = {"unit9"}, dependsOnMethods = {"testEditMilitaryCard"})
	public void testRemoveMilitaryCard(){
		app.getUnit9Helper().removeCardUnit9(mAVCard);
		Assert.assertEquals(mAVCard.regNumberRemovedCard, app.getUnit9Helper().getRegNumberAfterRemovingCard());
	}
	
	@Test (groups = {"unit9"}, dependsOnMethods = {"testRemoveMilitaryCard"})
	public void testRestoreMilitaryCard() {
		app.getUnit9Helper().restoreCardUnit9(mAVCard);
		Assert.assertEquals(mAVCard.regNumberRestoredCard, app.getUnit9Helper().getRegNumberAfterRestoringCard());
	}

	

}
