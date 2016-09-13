package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

/*
 * Implements all tests related to Requests (Unit 8)
 */
public class Unit8RequestsTest extends BasicTestCase {
	
	@Test (groups = {"unit8"})
	public void testJumpToUnit8Page() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationTopHelper().goToNavigationUnit68Page();
		app.getNavigationUnit68Helper().goToUnit8Page();
		assertTrue(app.getUnit8Helper().isOnUnit8Page());
	}

}
