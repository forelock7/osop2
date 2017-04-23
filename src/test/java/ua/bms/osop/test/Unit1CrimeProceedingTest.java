package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import ua.bms.osop.model.Unit1CriminalCardModel;

import java.io.IOException;

/*
 * Implements all tests related to "Started Crime Proceeding"("Розпочато кримінальних проваджень") - Unit 1 "Representation" ("Представництво")
 */
public class Unit1CrimeProceedingTest extends BasicTestCase {

	private Unit1CriminalCardModel criminalCard = getUnit1CriminalCardModel(1);

	public Unit1CrimeProceedingTest() throws IOException {
	}

	@Test (groups = {"unit1_crime"})
	public void testJumpToUnit1CrimeProceedingPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit1Helper().goToUnit1CrimeProceedingPage();
		assertTrue(app.getUnit1CrimeHelper().isOnUnit1CrimePage());
	}
	
	@Test (groups = {"unit1_crime"}, dependsOnMethods = {"testJumpToUnit1CrimeProceedingPage"})
	public void testCreateAndReviewCrimeProceedingCard() {
		app.getUnit1CrimeHelper().openCardToCreate();
		app.getUnit1CrimeHelper().createCard(criminalCard);
		app.getUnit1CrimeHelper().saveCard();
		app.getUnit1CrimeHelper().openCardToView();
		Assert.assertEquals(criminalCard.getCriminalProceedingNumber(), app.getUnit1CrimeHelper().getCriminalProceedingNumber());
		app.getUnit1CrimeHelper().quitCard();
	}
	
	@Test (groups = {"unit1_crime"}, dependsOnMethods = {"testCreateAndReviewCrimeProceedingCard"})
	public void testEditCrimeProceedingCard(){
		app.getUnit1CrimeHelper().openCardToEdit();
		app.getUnit1CrimeHelper().editCard(criminalCard);
		app.getUnit1CrimeHelper().saveCard();
		app.getUnit1CrimeHelper().openCardToEdit();
		Assert.assertEquals(criminalCard.getSomeNewText(), app.getUnit1CrimeHelper().getTheory());
		app.getUnit1CrimeHelper().quitCard();		
	}
	
	@Test (groups = {"unit1_crime"}, dependsOnMethods = {"testEditCrimeProceedingCard"})
	public void testRemoveCrimeProceedingCard(){
		app.getUnit1CrimeHelper().removeCard(criminalCard);
		app.getUnit1CrimeHelper().goToRemovedTab();
		Assert.assertEquals(criminalCard.getRegistrationNumber(), app.getUnit1CrimeHelper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit1_crime"}, dependsOnMethods = {"testRemoveCrimeProceedingCard"})
	public void testRestoreCrimeProceedingCard() {
		app.getUnit1CrimeHelper().restoreCard(criminalCard);
		app.getUnit1CrimeHelper().goToMainTab();
		Assert.assertEquals(criminalCard.getRegistrationNumber(), app.getUnit1CrimeHelper().getRegNumberFirstCardInGrid());
	}
	
}
