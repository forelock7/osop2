package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Unit2AppealsPretrialInvestigationTest extends BasicTestCase {

	@Test (groups = {"unit3_appealsPreInvest"})
	public void testJumpToUnit2AppealsPreInvestPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2AppealsPage();
		assertTrue(app.getUnit2AppealsHelper().isOnUnit2AppealsPage());
	}
}
