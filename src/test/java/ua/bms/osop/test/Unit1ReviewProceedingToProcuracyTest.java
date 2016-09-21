package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

/*
 * Implements all tests related to "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури")
 * and "Viewing of claims, statements to Procuracy authorities"("Перегляд позовів, заяв до органів прокуратури") - Unit 1 "Representation" ("Представництво")
 */
public class Unit1ReviewProceedingToProcuracyTest extends BasicTestCase {

	@Test (groups = {"unit1_reviewAndClaimsToProcuracy"})
	public void testJumpToUnit1ReviewPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit1Helper().goToUnit1ReviewToPrcPage();
		assertTrue(app.getUnit1ReviewToPrcHelper().isOnUnit1ReviewToPrcPage());
	}
	
	@Test (groups = {"unit1_reviewAndClaimsToProcuracy"})
	public void testJumpToUnit1ClaimsToPrcPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit1Helper().goToUnit1ClaimsToPrcPage();
		assertTrue(app.getUnit1ClaimsToPrcHelper().isOnUnit1ClaimsToPrcPage());
	}
	
}
