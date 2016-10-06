package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Unit3OtherCriminalProceedingTest extends BasicTestCase  {

	@Test (groups = {"unit3_otherProceedings"})
	public void testJumpToUnit3OtherCriminalProcPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3OtherCriminalProceedingPage();
		assertTrue(app.getUnit3OtherCriminalProcHelper().isOnUnit3OtherCriminalProcPage());
	}
	
}
