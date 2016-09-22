package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Unit2ActsOperationalActivitiesTest extends BasicTestCase {

	@Test (groups = {"unit2_actsOA"})
	public void testJumpToUnit2ActsOperationalActivitiesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2ActsOAPage();
		assertTrue(app.getUnit2ActsOAHelper().isOnUnit2ActsOAPage());
	}
}
