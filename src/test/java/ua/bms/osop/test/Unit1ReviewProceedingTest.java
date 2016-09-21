package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

/*
 * Implements all tests related to "Review proceedings on a claim"("НП за позовом")
 * and "Viewing of claims, statements"("Перегляд позовів, заяв") - Unit 1 "Representation" ("Представництво")
 */
public class Unit1ReviewProceedingTest extends BasicTestCase  {

	@Test (groups = {"unit1_reviewAndClaims"})
	public void testJumpToUnit1ReviewPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit1Helper().goToUnit1ReviewPage();
		assertTrue(app.getUnit1ReviewHelper().isOnUnit1ReviewPage());
	}
	
	@Test (groups = {"unit1_reviewAndClaims"})
	public void testJumpToUnit1ClaimsPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit1Helper().goToUnit1ClaimsPage();
		assertTrue(app.getUnit1ClaimsHelper().isOnUnit1ClaimsPage());
	}
	
}
