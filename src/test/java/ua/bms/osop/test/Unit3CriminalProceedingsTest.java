package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Unit3CriminalProceedingsTest extends BasicTestCase {

	@Test (groups = {"unit3_proceedings"})
	public void testJumpToUnit3CriminalProcPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3CriminalProcPage();
		assertTrue(app.getUnit3CriminalProcHelper().isOnUnit3CriminalProcPage());
	}
	
	@Test (groups = {"unit3_proceedings"})
	public void testJumpToUnit3OtherCriminalProcPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3OtherCriminalProcPage();
		assertTrue(app.getUnit3OtherCriminalProcHelper().isOnUnit3OtherCriminalProcPage());
	}
	
	@Test (groups = {"unit3_proceedings"})
	public void testJumpToUnit3ParticipationProcPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3ParticipationProcPage();
		assertTrue(app.getUnit3ParticipationProcHelper().isOnUnit3ParticipationProcPage());
	}
}
