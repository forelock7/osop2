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
	
	@Test (groups = {"inspection_unit5"}, priority = 2)
	public void testCreateInspectionCard() {
		app.getNavigationUnit5Helper().goToUnit5InspectionsPage();
		assertTrue(app.getUnit5InspectionsHelper().isOnUnit5InspectionPage());
		app.getUnit5InspectionsHelper().createInspectionCardUnit5(inspectionCard);
		Assert.assertEquals(inspectionCard.agencyName, app.getUnit5InspectionsHelper().getAgencyNameLastCreatedInspectionCardU5());
	}
	
	@Test (groups = {"inspection_unit5"}, dependsOnMethods = {"testCreateInspectionCard"})
	public void testEditInspectionCard(){
		app.getUnit5InspectionsHelper().editInspectionCardUnit5(inspectionCard);
		Assert.assertEquals(inspectionCard.someNewText, app.getUnit5InspectionsHelper().getAgencyNameLastCreatedInspectionCardU5());
	}
	
	@Test (groups = {"inspection_unit5"}, dependsOnMethods = {"testEditInspectionCard"})
	public void testRemoveInspectionCard(){
		app.getUnit5InspectionsHelper().removeInspectionCardUnit5(inspectionCard);
		Assert.assertEquals(inspectionCard.regNumberRemovedCard, app.getUnit5InspectionsHelper().getRegNumberAfterRemovingInspectionCardU5());
	}
	
	@Test (groups = {"inspection_unit5"}, dependsOnMethods = {"testRemoveInspectionCard"})
	public void testRestoreInspectionCard() {
		app.getUnit5InspectionsHelper().restoreInspectionCardUnit5(inspectionCard);
		Assert.assertEquals(inspectionCard.regNumberRestoredCard, app.getUnit5InspectionsHelper().getRegNumberAfterRestoringCardU5());
	}
	
	@Test (groups = {"document_unit5"}, dependsOnGroups = {"inspection_unit5"})
	public void testCheckCreatingDocumentCardIsUnable() {
		app.getNavigationUnit5Helper().goToUnit5InspectionsPage();
		assertTrue(app.getUnit5InspectionsHelper().isOnUnit5InspectionPage());
		app.getUnit5InspectionsHelper().openToCreateInspectionCard();
		assertTrue(app.getUnit5InspectionsHelper().isOnUnit5InspectionCard());
		app.getUnit5InspectionsHelper().goToDocumentTabInInspectionCard();
		assertTrue(app.getUnit5InspectionsHelper().isOnUnit5DocumentsTab());
		Assert.assertFalse(app.getUnit5InspectionsHelper().checkIsButtonCreatePresent());
		app.getUnit5DocumentsHelper().quitCard();
		Assert.assertFalse(app.getUnit5InspectionsHelper().isOnUnit5InspectionCard());
	}
	
	@Test (groups = {"document_unit5"}, dependsOnMethods = {"testCheckCreatingDocumentCardIsUnable"})
	public void testCreateDocumentCard() {
		app.getUnit5InspectionsHelper().loadDownMainGrid();
		app.getUnit5InspectionsHelper().openToEditInspectionCardUnit5();
		app.getUnit5InspectionsHelper().goToDocumentTabInInspectionCard();
		assertTrue(app.getUnit5InspectionsHelper().isOnUnit5DocumentsTab());
		app.getUnit5DocumentsHelper().createDocumentCard(documentCard);
		
		
	}

}
