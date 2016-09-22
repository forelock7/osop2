package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Unit2ReleaseFromCustodyTest extends BasicTestCase {

	@Test (groups = {"unit2_releaseFromCustody"})
	public void testJumpToUnit2ReleaseFromCustodyPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2ReleasePage();
		assertTrue(app.getUnit2ReleaseHelper().isOnUnit2ReleasePage());
	}
}
