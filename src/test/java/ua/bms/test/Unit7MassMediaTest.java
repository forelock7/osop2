package ua.bms.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Unit7MassMediaTest extends BasicTestCase {
	
	@Test (groups = {"unit7"})
	public void testJumpToUnit7Page(){
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationHelper().goToUnit7Page();
		assertTrue(app.getUnit7Helper().isOnUnit7Page());
	}
	
	@Test (groups = {"unit7"}, dependsOnMethods = {"testJumpToUnit7Page"})
	public void testCreateMassMediaCard(){
		app.getUnit7Helper().createCardUnit7(mMCard);
		Assert.assertEquals(app.getUnit7Helper().getSubjectOfSpeechLastCreatedCard(), mMCard.subjectOfSpeech);
	}
	
	@Test (groups = {"unit7"}, dependsOnMethods = {"testCreateMassMediaCard"})
	public void testEditMassMediaCard(){
		app.getUnit7Helper().editCardUnit7(mMCard);
		Assert.assertEquals(app.getUnit7Helper().getValueInFieldLastCard(), mMCard.someNewText);
	}
	
	

}
