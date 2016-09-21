package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

/*
 * Implements all tests related to "Started Crime Proceeding"("Розпочато кримінальних проваджень") - Unit 1 "Representation" ("Представництво")
 */
public class Unit1CrimeProceedingTest extends BasicTestCase {

	@Test (groups = {"unit1_crime"})
	public void testJumpToUnit1CrimePage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit1Helper().goToUnit1CrimeProceedingPage();
		assertTrue(app.getUnit1CrimeHelper().isOnUnit1CrimePage());
	}
	
}
