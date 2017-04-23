package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.bms.osop.model.Unit1ProceedingToPrcCardModel;

import java.io.IOException;

/*
 * Implements all tests related to "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури")
 * and "Viewing of claims, statements to Procuracy authorities"("Перегляд позовів, заяв до органів прокуратури") - Unit 1 "Representation" ("Представництво")
 */
public class Unit1ReviewProceedingToProcuracyTest extends BasicTestCase {

	private Unit1ProceedingToPrcCardModel proceedingToPrcCard = getUnit1ProceedingToPrcCardModel(1);

	public Unit1ReviewProceedingToProcuracyTest() throws IOException {
	}


	@Test (groups = {"unit1_proceedingsAndClaimsToProcuracy"})
	public void testJumpToUnit1ClaimsToPrcPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit1Helper().goToUnit1ClaimsToPrcPage();
		assertTrue(app.getUnit1ViewClaimsToPrcHelper().isOnUnit1ClaimsToPrcPage());
	}

	@Test (groups = {"unit1_proceedingsAndClaimsToProcuracy"}, dependsOnMethods = {"testJumpToUnit1ClaimsToPrcPage"})
	public void testJumpToUnit1ProceedingsToPrcPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit1Helper().goToUnit1ProceedingsToPrcPage();
		assertTrue(app.getUnit1ProceedingsToPrcHelper().isOnUnit1ProceedingsToPrcPage());
	}

	@Test (groups = {"unit1_proceedingsAndClaimsToProcuracy"}, dependsOnMethods = {"testJumpToUnit1ProceedingsToPrcPage"})
	public void testCreateAndReviewProceedingToPrcCard() {
		app.getUnit1ProceedingsToPrcHelper().openCardToCreate();
		app.getUnit1ProceedingsToPrcHelper().createCard(proceedingToPrcCard);
		app.getUnit1ProceedingsToPrcHelper().saveCard();
		app.getUnit1ProceedingsToPrcHelper().openCardToView();
		Assert.assertEquals(proceedingToPrcCard.getPlaintiff(), app.getUnit1ProceedingsToPrcHelper().getPlaintiff());
		app.getUnit1ProceedingsToPrcHelper().quitCard();
	}

	@Test (groups = {"unit1_proceedingsAndClaimsToProcuracy"}, dependsOnMethods = {"testCreateAndReviewProceedingToPrcCard"})
	public void testEditProceedingToPrcCard(){
		app.getUnit1ProceedingsToPrcHelper().openCardToEdit();
		app.getUnit1ProceedingsToPrcHelper().editCard(proceedingToPrcCard);
		app.getUnit1ProceedingsToPrcHelper().saveCard();
		app.getUnit1ProceedingsToPrcHelper().openCardToEdit();
		Assert.assertEquals(proceedingToPrcCard.getSomeNewText(), app.getUnit1ProceedingsToPrcHelper().getDefendant());
		app.getUnit1ProceedingsToPrcHelper().quitCard();
	}

	@Test (groups = {"unit1_proceedingsAndClaimsToProcuracy"})
	public void testCheckCreatingInstanceIsUnable() {
		app.getNavigationUnit1Helper().goToUnit1ProceedingsToPrcPage();
		app.getUnit1ProceedingsToPrcHelper().openCardToCreate();
		assertTrue(app.getUnit1ProceedingsToPrcHelper().isOnUnit1ProceedingToPrcCard());
		app.getUnit1ProceedingsToPrcHelper().goToStagesTab();
		assertTrue(app.getUnit1ProceedingsToPrcHelper().isStageCreatingUnable());
		Assert.assertFalse(app.getUnit1ProceedingsToPrcHelper().checkIsButtonCreateFirstInstance());
		app.getUnit1ProceedingsToPrcHelper().quitCard();
		Assert.assertFalse(app.getUnit1ProceedingsToPrcHelper().isOnUnit1ProceedingToPrcCard());
	}


}
