package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Implements all tests related to "Review proceedings on a claim"("НП за позовом")
 * and "Viewing of claims, statements"("Перегляд позовів, заяв") - Unit 1 "Representation" ("Представництво")
 */
public class Unit1ReviewProceedingTest extends BasicTestCase  {


	
	@Test (groups = {"unit1_proceedingsAndClaims"})
	public void testJumpToUnit1ClaimsPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit1Helper().goToUnit1ClaimsPage();
		assertTrue(app.getUnit1ViewClaimsHelper().isOnUnit1ClaimsPage());
	}
	
	@Test (groups = {"unit1_proceedingsAndClaims"})
	public void testJumpToUnit1ProceedingsPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit1Helper().goToUnit1ProceedingsPage();
		assertTrue(app.getUnit1ProceedingsHelper().isOnUnit1ProceedingsPage());
	}
	
	@Test (groups = {"unit1_proceedingsAndClaims"}, dependsOnMethods = {"testJumpToUnit1ProceedingsPage"})
	public void testCreateAndReviewProceedingCard() {
		app.getUnit1ProceedingsHelper().openCardToCreate();
		app.getUnit1ProceedingsHelper().createCard(proceedingCard);
		app.getUnit1ProceedingsHelper().saveCard();
		app.getUnit1ProceedingsHelper().openCardToView();
		Assert.assertEquals(proceedingCard.getPlaintiff(), app.getUnit1ProceedingsHelper().getPlaintiff());
		app.getUnit1ProceedingsHelper().quitCard();
	}

	@Test (groups = {"unit1_proceedingsAndClaims"}, dependsOnMethods = {"testCreateAndReviewProceedingCard"})
	public void testEditProceedingCard(){
		app.getUnit1ProceedingsHelper().openCardToEdit();
		app.getUnit1ProceedingsHelper().editCard(proceedingCard);
		app.getUnit1ProceedingsHelper().saveCard();
		app.getUnit1ProceedingsHelper().openCardToEdit();
		Assert.assertEquals(proceedingCard.getSomeNewText(), app.getUnit1ProceedingsHelper().getDefendant());
		app.getUnit1ProceedingsHelper().quitCard();		
	}

	@Test (groups = {"unit1_proceedingsAndClaims"})
	public void testCheckCreatingInstanceIsUnable() {
		app.getNavigationUnit1Helper().goToUnit1ProceedingsPage();
		app.getUnit1ProceedingsHelper().openCardToCreate();
		assertTrue(app.getUnit1ProceedingsHelper().isOnUnit1ProceedingCard());
		app.getUnit1ProceedingsHelper().goToStagesTab();
		assertTrue(app.getUnit1ProceedingsHelper().isOnUnit1StagesTab());
		Assert.assertFalse(app.getUnit1ProceedingsHelper().checkIsButtonCreateFirstInstance());
		app.getUnit1ProceedingsHelper().quitCard();
		Assert.assertFalse(app.getUnit1ProceedingsHelper().isOnUnit1ProceedingCard());
	}

	
}
