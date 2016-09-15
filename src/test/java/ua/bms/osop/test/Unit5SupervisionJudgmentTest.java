package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Implements all tests related to Unit 5 "Supervision of the observance of laws in the execution of judgments."
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 */
public class Unit5SupervisionJudgmentTest extends BasicTestCase {
	
	@Test (groups = {"unit5"}, priority = 1)
	public void testJumpToUnit5InspectionsPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit5Helper().goToUnit5InspectionsPage();
		assertTrue(app.getUnit5InspectionsHelper().isOnUnit5InspectionPage());
	}
	
	@Test (groups = {"unit5"}, priority = 1)
	public void testJumpToUnit5DocumentsPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit5Helper().goToUnit5DocumentsPage();
		assertTrue(app.getUnit5DocumentsHelper().isOnUnit5DocumentsPage());
	}
	
	@Test (groups = {"unit5"}, priority = 1)
	public void testJumpToUnit5ChargedPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit5Helper().goToUnit5ChargedPage();
		assertTrue(app.getUnit5ChargedHelper().isOnUnit5ChargedPage());
	}
	
	@Test (groups = {"unit5"}, priority = 2)
	public void testCreateInspectionCard() {
		app.getNavigationUnit5Helper().goToUnit5InspectionsPage();
		assertTrue(app.getUnit5InspectionsHelper().isOnUnit5InspectionPage());
		app.getUnit5InspectionsHelper().createInspectionCardUnit5(inspectionCard);
		Assert.assertEquals(inspectionCard.agencyName, app.getUnit5InspectionsHelper().getClaimNumberLastCreatedInspectionCardU5());
	}

}
