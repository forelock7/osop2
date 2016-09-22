package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Unit2ActsPretrialInvestigationTest extends BasicTestCase {

	@Test (groups = {"unit3_actsPreInv"})
	public void testJumpToUnit2ActsPretrialInvestPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2ActsPIPage();
		assertTrue(app.getUnit2ActsPIHelper().isOnUnit2ActsPIPage());
	}
}
