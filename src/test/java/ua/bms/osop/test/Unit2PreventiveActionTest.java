package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Unit2PreventiveActionTest extends BasicTestCase {

	@Test (groups = {"unit2_preventiveAction"})
	public void testJumpToUnit2PreventiveActionPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2PreventivePage();
		assertTrue(app.getUnit2PreventiveHelper().isOnUnit2PreventivePage());
	}
}
