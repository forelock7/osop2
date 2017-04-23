package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.bms.osop.model.Unit5ChargedCardModel;
import ua.bms.osop.model.Unit5DocumentCardModel;
import ua.bms.osop.model.Unit5InspectionCardModel;

import java.io.IOException;

/*
 * Implements all tests related to Unit 5 "Supervision of the observance of laws in the execution of judgments."
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 */
public class Unit5SupervisionJudgmentTest extends BasicTestCase {

	private Unit5InspectionCardModel inspectionCard = getUnit5InspectionCardModel(1);
	private Unit5DocumentCardModel documentCard = new Unit5DocumentCardModel ();
	private Unit5ChargedCardModel chargedCard = getUnit5ChargedCardModel(1);

	public Unit5SupervisionJudgmentTest() throws IOException {
	}

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
		Assert.assertEquals(inspectionCard.getAgencyName(), app.getUnit5InspectionsHelper().getAgencyName());
		app.getUnit5InspectionsHelper().quitCard();
	}
	
	@Test (groups = {"unit5"}, dependsOnMethods = {"testCreateAndReviewInspectionCard"})
	public void testEditInspectionCard() {
		app.getUnit5InspectionsHelper().openInspectionCardToEdit();
		app.getUnit5InspectionsHelper().editInspectionCardUnit5(inspectionCard);
		app.getUnit5InspectionsHelper().saveCard();
		app.getUnit5InspectionsHelper().openInspectionCardToEdit();
		Assert.assertEquals(inspectionCard.getSomeNewText(), app.getUnit5InspectionsHelper().getAgencyName());
		app.getUnit5InspectionsHelper().quitCard();
	}
	
	@Test (groups = {"unit5"}, dependsOnMethods = {"testEditInspectionCard"})
	public void testRemoveInspectionCard(){
		app.getUnit5InspectionsHelper().removeInspectionCardUnit5(inspectionCard);
		app.getUnit5InspectionsHelper().goToRemovedTab();
		Assert.assertEquals(inspectionCard.getRegistrationNumber(), app.getUnit5InspectionsHelper().getRegNumberFirstRemovedInspectionCardInGrid());
	}
	
	@Test (groups = {"unit5"}, dependsOnMethods = {"testRemoveInspectionCard"})
	public void testRestoreInspectionCard() {
		app.getUnit5InspectionsHelper().restoreInspectionCardUnit5(inspectionCard);
		app.getUnit5InspectionsHelper().goToMainTab();
		Assert.assertEquals(inspectionCard.getRegistrationNumber(), app.getUnit5InspectionsHelper().getRegNumberFirstCardInGrid());
	}
	
	@Test (groups = {"unit5"}, dependsOnMethods = {"testRestoreInspectionCard"})
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
	
	@Test (groups = {"unit5"}, dependsOnMethods = {"testCheckCreatingDocumentCardIsUnable"})
	public void testCreateAndReview_DocumentAndChargedPersonCards() {
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
		Assert.assertEquals(documentCard.getDocumentContent(), app.getUnit5DocumentsHelper().getContentDocument());
		app.getUnit5DocumentsHelper().openChargedCardToView();
		Assert.assertEquals(chargedCard.getName(), app.getUnit5ChargedHelper().getChargedName());
		app.getUnit5ChargedHelper().quitCard();
		app.getUnit5DocumentsHelper().quitCard();
		app.getUnit5InspectionsHelper().quitCard();
	}
	
	@Test (groups = {"unit5"}, dependsOnMethods = {"testCreateAndReview_DocumentAndChargedPersonCards"})
	public void testCheckCreatingDocumentAndChargedCardsOnResponseDocumetPage() {
		app.getNavigationUnit5Helper().goToUnit5DocumentsPage();
		app.getUnit5DocumentsHelper().sortDownMainGrid();
		app.getUnit5DocumentsHelper().openDocumentCardToReview();
		Assert.assertEquals(documentCard.getDocumentContent(), app.getUnit5DocumentsHelper().getContentDocument());
		app.getUnit5DocumentsHelper().openChargedCardToView();
		Assert.assertEquals(chargedCard.getName(), app.getUnit5ChargedHelper().getChargedName());
		app.getUnit5ChargedHelper().quitCard();
		app.getUnit5DocumentsHelper().quitCard();
	}
	
	@Test (groups = {"unit5"}, dependsOnMethods = {"testCheckCreatingDocumentAndChargedCardsOnResponseDocumetPage"})
	public void testCheckCreatingChargedCardOnChargedPersonPage() {
		app.getNavigationUnit5Helper().goToUnit5ChargedPage();
		app.getUnit5ChargedHelper().sortDownMainGrid();
		app.getUnit5ChargedHelper().openChargedCardToReview();
		Assert.assertEquals(chargedCard.getName(), app.getUnit5ChargedHelper().getChargedName());
		app.getUnit5ChargedHelper().quitCard();
	}
		
	@Test (groups = {"unit5"}, dependsOnMethods = {"testCheckCreatingChargedCardOnChargedPersonPage"})
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
		Assert.assertEquals(documentCard.getSomeNewText(), app.getUnit5DocumentsHelper().getContentDocument());
		app.getUnit5DocumentsHelper().openChargedCardToEdit();
		Assert.assertEquals(chargedCard.getSomeNewText(), app.getUnit5ChargedHelper().getPost());
		app.getUnit5ChargedHelper().quitCard();
		app.getUnit5DocumentsHelper().quitCard();
		app.getUnit5InspectionsHelper().quitCard();
	}
	
	@Test (groups = {"unit5"}, dependsOnMethods = {"editDocumentAndChargedPersonCards"})
	public void testCheckEditingDocumentAndChargedCardsOnResponseDocumetPage() {
		app.getNavigationUnit5Helper().goToUnit5DocumentsPage();
		app.getUnit5DocumentsHelper().sortDownMainGrid();
		app.getUnit5DocumentsHelper().openDocumentCardToReview();
		Assert.assertEquals(documentCard.getSomeNewText(), app.getUnit5DocumentsHelper().getContentDocument());
		app.getUnit5DocumentsHelper().openChargedCardToView();
		Assert.assertEquals(chargedCard.getSomeNewText(), app.getUnit5ChargedHelper().getPost());
		app.getUnit5ChargedHelper().quitCard();
		app.getUnit5DocumentsHelper().quitCard();
	}
	
	@Test (groups = {"unit5"}, dependsOnMethods = {"testCheckEditingDocumentAndChargedCardsOnResponseDocumetPage"})
	public void testCheckEdtingChargedCardOnChargedPersonPage() {
		app.getNavigationUnit5Helper().goToUnit5ChargedPage();
		app.getUnit5ChargedHelper().sortDownMainGrid();
		app.getUnit5ChargedHelper().openChargedCardToReview();
		Assert.assertEquals(chargedCard.getSomeNewText(), app.getUnit5ChargedHelper().getPost());
		app.getUnit5ChargedHelper().quitCard();
	}
	
	@Test (groups = {"unit5"}, dependsOnMethods = {"testCheckEdtingChargedCardOnChargedPersonPage"})
	public void testRemoveResponseDocumentCard() throws InterruptedException {
		app.getNavigationUnit5Helper().goToUnit5InspectionsPage();
		app.getUnit5InspectionsHelper().sortDownMainGrid();
		app.getUnit5InspectionsHelper().openInspectionCardToEdit();
		app.getUnit5InspectionsHelper().goToDocumentTabInInspectionCard();
		app.getUnit5DocumentsHelper().removeDocumentCard(documentCard);
		app.getUnit5InspectionsHelper().quitCard();
		app.getNavigationUnit5Helper().goToUnit5DocumentsPage();
		app.getUnit5DocumentsHelper().goToRemovedTab();
		Assert.assertEquals(documentCard.getRegistrationNumber(), app.getUnit5DocumentsHelper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit5"}, dependsOnMethods = {"testRemoveResponseDocumentCard"})
	public void testRestoreResponseDocumentCardAndCheckChargedCard() {
		app.getUnit5DocumentsHelper().restoreDocumentCard(documentCard);
		app.getUnit5DocumentsHelper().goToMainTab();
		Assert.assertEquals(documentCard.getRegistrationNumber(), app.getUnit5DocumentsHelper().getRegNumberFirstCardInGrid());
		app.getUnit5DocumentsHelper().openDocumentCardToReview();
		Assert.assertEquals(chargedCard.getName(), app.getUnit5DocumentsHelper().getChargedNameFromGrid());
		app.getUnit5DocumentsHelper().quitCard();
	}

	@Test (groups = {"unit5"}, dependsOnMethods = {"testRestoreResponseDocumentCardAndCheckChargedCard"})
	public void testRemoveInspectionCardWithDocAndCgargCards() {
		app.getNavigationUnit5Helper().goToUnit5InspectionsPage();
		app.getUnit5InspectionsHelper().sortDownMainGrid();
		app.getUnit5InspectionsHelper().removeInspectionCardUnit5(inspectionCard);
		app.getUnit5InspectionsHelper().goToRemovedTab();
		Assert.assertEquals(inspectionCard.getRegistrationNumber(), app.getUnit5InspectionsHelper().getRegNumberFirstRemovedInspectionCardInGrid());
		app.getNavigationUnit5Helper().goToUnit5DocumentsPage();
		app.getUnit5DocumentsHelper().goToRemovedTab();
		Assert.assertEquals(inspectionCard.getRegistrationNumber(), app.getUnit5DocumentsHelper().getRegNumberFirstRemovedCardInGrid());
		app.getNavigationUnit5Helper().goToUnit5ChargedPage();
		app.getUnit5ChargedHelper().sortDownMainGrid();
		Assert.assertNotEquals(inspectionCard.getRegistrationNumber(), app.getUnit5ChargedHelper().getRegNumberFirstCardInGrid());
	}

	@Test (groups = {"unit5"}, dependsOnMethods = {"testRemoveInspectionCardWithDocAndCgargCards"})
	public void testRestoreInspectionCardWithDocAndCgargCards() {
		app.getNavigationUnit5Helper().goToUnit5InspectionsPage();
		app.getUnit5InspectionsHelper().goToRemovedTab();
		app.getUnit5InspectionsHelper().restoreInspectionCardUnit5(inspectionCard);
		app.getUnit5InspectionsHelper().goToMainTab();
		Assert.assertEquals(inspectionCard.getRegistrationNumber(), app.getUnit5InspectionsHelper().getRegNumberFirstCardInGrid());
		app.getNavigationUnit5Helper().goToUnit5DocumentsPage();
		app.getUnit5DocumentsHelper().sortDownMainGrid();
		Assert.assertEquals(inspectionCard.getRegistrationNumber(), app.getUnit5DocumentsHelper().getRegNumberFirstCardInGrid());
		app.getNavigationUnit5Helper().goToUnit5ChargedPage();
		app.getUnit5ChargedHelper().sortDownMainGrid();
		Assert.assertEquals(inspectionCard.getRegistrationNumber(), app.getUnit5ChargedHelper().getRegNumberFirstCardInGrid());
	}
	
	@Test (groups = {"unit5"}, dependsOnMethods = {"testRestoreInspectionCardWithDocAndCgargCards"})
	public void testRemoveChargedPersonCard() {
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
		Assert.assertNotEquals(chargedCard.getChargedNameDeletedCard(), app.getUnit5ChargedHelper().getChargedNameFromGrid());
	}
	
	

}
