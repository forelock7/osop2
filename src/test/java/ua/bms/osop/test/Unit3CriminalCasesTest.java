package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Unit3CriminalCasesTest extends BasicTestCase {

	@Test (groups = {"unit3_cases"})
	public void testJumpToUnit3CriminalCasesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3CriminalCasesPage();
		assertTrue(app.getUnit3CriminalCasesHelper().isOnUnit3CriminalCasesPage());
	}
	
	@Test (groups = {"unit3_cases"})
	public void testJumpToUnit3OtherCriminalCasesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3OtherCriminalCasesPage();
		assertTrue(app.getUnit3OtherCriminalCasesHelper().isOnUnit3OtherCriminalCasesPage());
	}
	
	@Test (groups = {"unit3_cases"})
	public void testJumpToUnit3ParticipationCasesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3ParticipationCasesPage();
		assertTrue(app.getUnit3ParticipationCasesHelper().isOnUnit3ParticipationCasesPage());
	}
	
}
