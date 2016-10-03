package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
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
		assertTrue(app.getUnit1ProceedingsHelper().isOnUnit1ReviewPage());
	}
	
	@Test (groups = {"unit1_reviewAndClaims"})
	public void testJumpToUnit1ClaimsPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit1Helper().goToUnit1ClaimsPage();
		assertTrue(app.getUnit1ViewClaimsHelper().isOnUnit1ClaimsPage());
	}
	
	@Test (groups = {"unit1_reviewAndClaims"}, dependsOnMethods = {"testJumpToUnit4Page"})
	public void testCreateAndReviewProceedingCard() {
		app.getUnit1ProceedingsHelper().openCardToCreate();
		app.getUnit1ProceedingsHelper().createCard(proceedingCard);
		app.getUnit1ProceedingsHelper().saveCard();
		app.getUnit1ProceedingsHelper().openCardToView();
		Assert.assertEquals(proceedingCard.claimNumber, app.getUnit4Helper().getClaimNumber());
		app.getUnit1ProceedingsHelper().quitCard();
	}
	
	
	
	
	
	@Test (groups = {"unit1_reviewAndClaims"}, dependsOnMethods = {"testCreateAndReviewProceedingCard"})
	public void testEditProceedingCard(){
		app.getUnit1ProceedingsHelper().openCardToEdit();
		app.getUnit1ProceedingsHelper().editCard(proceedingCard);
		app.getUnit1ProceedingsHelper().saveCard();
		app.getUnit1ProceedingsHelper().openCardToEdit();
		Assert.assertEquals(proceedingCard.someNewText, app.getUnit4Helper().getSummary());
		app.getUnit1ProceedingsHelper().quitCard();		
	}
	

	
}
