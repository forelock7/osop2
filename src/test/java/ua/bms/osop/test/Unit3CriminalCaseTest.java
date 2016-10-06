package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Unit3CriminalCaseTest extends BasicTestCase {

	@Test (groups = {"unit3_cases"})
	public void testJumpToUnit3CriminalCasesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3CriminalCasePage();
		assertTrue(app.getUnit3CriminalCasesHelper().isOnUnit3CriminalCasesPage());
	}
	
	@Test (groups = {"unit3_cases"})
	public void testJumpToUnit3ParticipationCasesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3ParticipationCasePage();
		assertTrue(app.getUnit3ParticipationCasesHelper().isOnUnit3ParticipationCasesPage());
	}
	
}
