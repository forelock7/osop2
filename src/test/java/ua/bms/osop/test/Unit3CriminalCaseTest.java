package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Unit3CriminalCaseTest extends BasicTestCase {

	@Test (groups = {"unit3_cases"})
	public void testJumpToUnit3CriminalCasesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3CriminalCasePage();
		assertTrue(app.getUnit3CriminalCasesHelper().isOnUnit3CriminalCasesPage());
	}
	
	@Test (groups = {"unit3_cases"})
	public void testJumpToUnit3ParticipationCasesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3ParticipationCasePage();
		assertTrue(app.getUnit3ParticipationCasesHelper().isOnUnit3ParticipationCasesPage());
	}
	
	@Test (groups = {"unit3_cases"}, dependsOnMethods = {"testJumpToUnit3CriminalProceedingPage"})
	public void testCreateAndReviewCriminalProceedingCard() {
		app.getUnit3CriminalProceedingHelper().openCardToCreate();
		app.getUnit3CriminalProceedingHelper().createCard(criminalProceedingCard);
		app.getUnit3CriminalProceedingHelper().saveCard();
		app.getUnit3CriminalProceedingHelper().openCardToView();
		Assert.assertEquals(criminalProceedingCard.getCriminalProceedingNumber(), app.getUnit3CriminalProceedingHelper().getCriminalProceedingNumber());
		app.getUnit3CriminalProceedingHelper().quitCard();
	}

	@Test (groups = {"unit3_cases"}, dependsOnMethods = {"testCreateAndReviewCriminalProceedingCard"})
	public void testEditCriminalProceedingCard(){
		app.getUnit3CriminalProceedingHelper().openCardToEdit();
		app.getUnit3CriminalProceedingHelper().editCard(criminalProceedingCard);
		app.getUnit3CriminalProceedingHelper().saveCard();
		app.getUnit3CriminalProceedingHelper().openCardToEdit();
		Assert.assertEquals(criminalProceedingCard.getSomeNewText(), app.getUnit3CriminalProceedingHelper().getOffenseQualification());
		app.getUnit3CriminalProceedingHelper().quitCard();		
	}

	@Test (groups = {"unit3_cases"})
	public void testCheckCreatingInstanceIsUnable() {
		app.getNavigationUnit23Helper().goToUnit3CriminalProceedingPage();
		app.getUnit3CriminalProceedingHelper().openCardToCreate();
		assertTrue(app.getUnit3CriminalProceedingHelper().isOnUnit3CriminalProceedingCard());
		app.getUnit3CriminalProceedingHelper().goToStagesTab();
		assertTrue(app.getUnit3CriminalProceedingHelper().isStageCreatingUnable());
		Assert.assertFalse(app.getUnit3CriminalProceedingHelper().checkIsButtonCreateFirstInstance());
		app.getUnit3CriminalProceedingHelper().quitCard();
		Assert.assertFalse(app.getUnit3CriminalProceedingHelper().isOnUnit3CriminalProceedingCard());
	}
	
}
