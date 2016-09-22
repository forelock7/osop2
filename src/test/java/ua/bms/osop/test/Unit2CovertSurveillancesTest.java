package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Unit2CovertSurveillancesTest extends BasicTestCase {

	@Test (groups = {"unit2_covertSurveillances"})
	public void testJumpToUnit2CovertSurveillancesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2CovertPage();
		assertTrue(app.getUnit2CovertHelper().isOnUnit2CovertPage());
	}
}
