package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Unit3OtherCriminalCaseTest extends BasicTestCase  {
		
	@Test (groups = {"unit3_cases"})
	public void testJumpToUnit3OtherCriminalCasesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3OtherCriminalCasePage();
		assertTrue(app.getUnit3OtherCriminalCasesHelper().isOnUnit3OtherCriminalCasesPage());
	}

}
