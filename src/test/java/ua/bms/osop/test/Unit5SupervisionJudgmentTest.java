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
	public void testCreateAndReviewInspectionCard() {
		app.getNavigationUnit5Helper().goToUnit5InspectionsPage();
		assertTrue(app.getUnit5InspectionsHelper().isOnUnit5InspectionPage());
		app.getUnit5InspectionsHelper().openInspectionCardToCreate();
		app.getUnit5InspectionsHelper().createInspectionCardUnit5(inspectionCard);
		app.getUnit5InspectionsHelper().saveCard();
		app.getUnit5InspectionsHelper().openInspectionCardToView();
		Assert.assertEquals(inspectionCard.agencyName, app.getUnit5InspectionsHelper().getAgencyName());
		app.getUnit5InspectionsHelper().quitCard();
	}
	
	@Test (groups = {"inspection_unit5"}, dependsOnMethods = {"testCreateAndReviewInspectionCard"})
	public void testEditInspectionCard()throws InterruptedException {
		app.getUnit5InspectionsHelper().openInspectionCardToEdit();
		app.getUnit5InspectionsHelper().editInspectionCardUnit5(inspectionCard);
		app.getUnit5InspectionsHelper().saveCard();
		app.getUnit5InspectionsHelper().openInspectionCardToEdit();
		Assert.assertEquals(inspectionCard.someNewText, app.getUnit5InspectionsHelper().getAgencyName());
		app.getUnit5InspectionsHelper().quitCard();
	}
	
	@Test (groups = {"inspection_unit5"}, dependsOnMethods = {"testEditInspectionCard"})
	public void testRemoveInspectionCard(){
		app.getUnit5InspectionsHelper().removeInspectionCardUnit5(inspectionCard);
		app.getUnit5InspectionsHelper().moveToRemovedTab();
		Assert.assertEquals(inspectionCard.regNumberRemovedCard, app.getUnit5InspectionsHelper().getRegNumberFirstRemovedInspectionCardInGrid());
	}
	
	@Test (groups = {"inspection_unit5"}, dependsOnMethods = {"testRemoveInspectionCard"})
	public void testRestoreInspectionCard() {
		app.getUnit5InspectionsHelper().restoreInspectionCardUnit5(inspectionCard);
		app.getUnit5InspectionsHelper().moveToMainTab();
		Assert.assertEquals(inspectionCard.regNumberRestoredCard, app.getUnit5InspectionsHelper().getRegNumberFirstCardInGrid());
	}
	
	@Test (groups = {"document_unit5"}, dependsOnGroups = {"inspection_unit5"})
	public void testCheckCreatingDocumentCardIsUnable() {
		app.getNavigationUnit5Helper().goToUnit5InspectionsPage();
		app.getUnit5InspectionsHelper().openInspectionCardToCreate();
		assertTrue(app.getUnit5InspectionsHelper().isOnUnit5InspectionCard());
		app.getUnit5InspectionsHelper().goToDocumentTabInInspectionCard();
		assertTrue(app.getUnit5InspectionsHelper().isOnUnit5DocumentsTab());
		Assert.assertFalse(app.getUnit5InspectionsHelper().checkIsButtonCreatePresent());
		app.getUnit5InspectionsHelper().quitCard();
		Assert.assertFalse(app.getUnit5InspectionsHelper().isOnUnit5InspectionCard());
	}
	
	@Test (groups = {"document_unit5"}, dependsOnMethods = {"testCheckCreatingDocumentCardIsUnable"})
	public void testCreateAndReview_DocumentAndChargedPersonCards() throws InterruptedException  {
		app.getUnit5InspectionsHelper().sortDownMainGrid();
		app.getUnit5InspectionsHelper().openInspectionCardToEdit();
		app.getUnit5InspectionsHelper().goToDocumentTabInInspectionCard();
		app.getUnit5InspectionsHelper().openDocumentCardToCreate();
		app.getUnit5DocumentsHelper().openChargedCardToCreate();
		app.getUnit5ChargedHelper().createChargedCard(chargedCard);
		app.getUnit5ChargedHelper().saveCard();
		app.getUnit5DocumentsHelper().createDocumentCard(documentCard);
		app.getUnit5DocumentsHelper().saveCard();
		app.getUnit5InspectionsHelper().quitCard();
		app.getUnit5InspectionsHelper().openInspectionCardToView();
		app.getUnit5InspectionsHelper().goToDocumentTabInInspectionCard();
		app.getUnit5InspectionsHelper().openDocumentCardToView();
		Assert.assertEquals(documentCard.documentContent, app.getUnit5DocumentsHelper().getContentDocument());
		app.getUnit5DocumentsHelper().openChargedCardToView();
		Assert.assertEquals(chargedCard.name, app.getUnit5ChargedHelper().getChargedName());
		app.getUnit5ChargedHelper().quitCard();
		app.getUnit5DocumentsHelper().quitCard();
		app.getUnit5InspectionsHelper().quitCard();
	}
	
	@Test (groups = {"document_unit5"}, dependsOnMethods = {"testCreateAndReview_DocumentAndChargedPersonCards"})
	public void testCheckCreatingDocumentAndChargedCardsOnResponseDocumetPage() {
		app.getNavigationUnit5Helper().goToUnit5DocumentsPage();
		app.getUnit5DocumentsHelper().sortDownMainGrid();
		app.getUnit5DocumentsHelper().openDocumentCardToReview();
		Assert.assertEquals(documentCard.documentContent, app.getUnit5DocumentsHelper().getContentDocument());
		app.getUnit5DocumentsHelper().openChargedCardToView();
		Assert.assertEquals(chargedCard.name, app.getUnit5ChargedHelper().getChargedName());
		app.getUnit5ChargedHelper().quitCard();
		app.getUnit5DocumentsHelper().quitCard();
	}
	
	@Test (groups = {"document_unit5"}, dependsOnMethods = {"testCheckCreatingDocumentAndChargedCardsOnResponseDocumetPage"})
	public void testCheckCreatingChargedCardOnChargedPersonPage() {
		app.getNavigationUnit5Helper().goToUnit5ChargedPage();
		app.getUnit5ChargedHelper().sortDownMainGrid();
		app.getUnit5ChargedHelper().openChargedCardToReview();
		Assert.assertEquals(chargedCard.name, app.getUnit5ChargedHelper().getChargedName());
		app.getUnit5ChargedHelper().quitCard();
	}
		
	@Test (groups = {"document_unit5"}, dependsOnMethods = {"testCheckCreatingChargedCardOnChargedPersonPage"})
	public void editDocumentAndChargedPersonCards()throws InterruptedException  {
		app.getNavigationUnit5Helper().goToUnit5InspectionsPage();
		app.getUnit5InspectionsHelper().sortDownMainGrid();
		app.getUnit5InspectionsHelper().openInspectionCardToEdit();
		app.getUnit5InspectionsHelper().goToDocumentTabInInspectionCard();
		app.getUnit5InspectionsHelper().openDocumentCardToEdit();
		app.getUnit5DocumentsHelper().openChargedCardToEdit();
		app.getUnit5ChargedHelper().editChargedCard(chargedCard);
		app.getUnit5ChargedHelper().saveCard();
		app.getUnit5DocumentsHelper().editDocumentCard(documentCard);
		app.getUnit5DocumentsHelper().saveCard();
		app.getUnit5InspectionsHelper().quitCard();
		app.getUnit5InspectionsHelper().openInspectionCardToEdit();
		app.getUnit5InspectionsHelper().goToDocumentTabInInspectionCard();
		app.getUnit5InspectionsHelper().openDocumentCardToEdit();
		Assert.assertEquals(documentCard.someNewText, app.getUnit5DocumentsHelper().getContentDocument());
		app.getUnit5DocumentsHelper().openChargedCardToEdit();
		Assert.assertEquals(chargedCard.someNewText, app.getUnit5ChargedHelper().getPost());
		app.getUnit5ChargedHelper().quitCard();
		app.getUnit5DocumentsHelper().quitCard();
		app.getUnit5InspectionsHelper().quitCard();
	}
	
	@Test (groups = {"document_unit5"}, dependsOnMethods = {"editDocumentAndChargedPersonCards"})
	public void testCheckEditingDocumentAndChargedCardsOnResponseDocumetPage() {
		app.getNavigationUnit5Helper().goToUnit5DocumentsPage();
		app.getUnit5DocumentsHelper().sortDownMainGrid();
		app.getUnit5DocumentsHelper().openDocumentCardToReview();
		Assert.assertEquals(documentCard.someNewText, app.getUnit5DocumentsHelper().getContentDocument());
		app.getUnit5DocumentsHelper().openChargedCardToView();
		Assert.assertEquals(chargedCard.someNewText, app.getUnit5ChargedHelper().getPost());
		app.getUnit5ChargedHelper().quitCard();
		app.getUnit5DocumentsHelper().quitCard();
	}
	
	@Test (groups = {"document_unit5"}, dependsOnMethods = {"testCheckEditingDocumentAndChargedCardsOnResponseDocumetPage"})
	public void testCheckEdtingChargedCardOnChargedPersonPage() {
		app.getNavigationUnit5Helper().goToUnit5ChargedPage();
		app.getUnit5ChargedHelper().sortDownMainGrid();
		app.getUnit5ChargedHelper().openChargedCardToReview();
		Assert.assertEquals(chargedCard.someNewText, app.getUnit5ChargedHelper().getPost());
		app.getUnit5ChargedHelper().quitCard();
	}
	
	@Test (groups = {"document_unit5"}, dependsOnMethods = {"testCheckEdtingChargedCardOnChargedPersonPage"})
	public void testRemovingResponseDocumentCard() throws InterruptedException {
		app.getNavigationUnit5Helper().goToUnit5InspectionsPage();
		app.getUnit5InspectionsHelper().sortDownMainGrid();
		app.getUnit5InspectionsHelper().openInspectionCardToEdit();
		app.getUnit5InspectionsHelper().goToDocumentTabInInspectionCard();
		app.getUnit5DocumentsHelper().removeDocumentCard(documentCard);
		app.getUnit5InspectionsHelper().quitCard();
		app.getNavigationUnit5Helper().goToUnit5DocumentsPage();
		app.getUnit5DocumentsHelper().moveToRemovedTab();
		Assert.assertEquals(documentCard.regNumberRemovedCard, app.getUnit5DocumentsHelper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"document_unit5"}, dependsOnMethods = {"testRemovingResponseDocumentCard"})
	public void testRestoringResponseDocumentCardAndCheckChargedCard() {
		app.getUnit5DocumentsHelper().restoreDocumentCard(documentCard);
		app.getUnit5DocumentsHelper().moveToMainTab();
		Assert.assertEquals(documentCard.regNumberRestoredCard, app.getUnit5DocumentsHelper().getRegNumberFirstCardInGrid());
		app.getUnit5DocumentsHelper().openDocumentCardToReview();
		Assert.assertEquals(chargedCard.name, app.getUnit5DocumentsHelper().getChargedNameFromGrid());
		app.getUnit5DocumentsHelper().quitCard();
	}
	
	@Test (groups = {"charged_unit5"}, dependsOnMethods = {"testRestoringResponseDocumentCardAndCheckChargedCard"})
	public void testRemovingChargedPersonCard()throws InterruptedException  {
		app.getNavigationUnit5Helper().goToUnit5InspectionsPage();
		app.getUnit5InspectionsHelper().sortDownMainGrid();
		app.getUnit5InspectionsHelper().openInspectionCardToEdit();
		app.getUnit5InspectionsHelper().goToDocumentTabInInspectionCard();
		app.getUnit5InspectionsHelper().openDocumentCardToEdit();
		app.getUnit5ChargedHelper().deleteChargedPersonFromGrid(chargedCard);
		app.getUnit5DocumentsHelper().saveCard();
		app.getUnit5InspectionsHelper().openDocumentCardToView();
		Assert.assertFalse(app.getUnit5DocumentsHelper().existRecordInChargedGrid());
		app.getUnit5DocumentsHelper().quitCard();
		app.getUnit5InspectionsHelper().quitCard();
		app.getNavigationUnit5Helper().goToUnit5ChargedPage();
		app.getUnit5ChargedHelper().sortDownMainGrid();
		Assert.assertNotEquals(chargedCard.chargedNameDeletedCard, app.getUnit5ChargedHelper().getChargedNameFromGrid());
	}
	
	

}
