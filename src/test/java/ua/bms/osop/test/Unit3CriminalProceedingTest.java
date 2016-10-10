package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Unit3CriminalProceedingTest extends BasicTestCase {

	
	@Test (groups = {"unit3_proceedings"})
	public void testJumpToUnit3ParticipationProcPage() {
	assertTrue(app.getUserHelper().isLoggedIn());
	app.getNavigationUnit23Helper().goToUnit3ParticipationProceedingPage();
	assertTrue(app.getUnit3ParticipationProceedingHelper().isOnUnit3ParticipationProcPage());
}
	
	@Test (groups = {"unit3_proceedings"}, dependsOnMethods = {"testJumpToUnit3ParticipationProcPage"})
	public void testJumpToUnit3CriminalProceedingPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3CriminalProceedingPage();
		assertTrue(app.getUnit3CriminalProceedingHelper().isOnUnit3CriminalProceedingPage());
	}

	
	@Test (groups = {"unit3_proceedings"}, dependsOnMethods = {"testJumpToUnit3CriminalProceedingPage"})
	public void testCreateAndReviewCriminalProceedingCard() {
		app.getUnit3CriminalProceedingHelper().openCardToCreate();
		app.getUnit3CriminalProceedingHelper().createCard(criminalProceedingCard);
		app.getUnit3CriminalProceedingHelper().saveCard();
		app.getUnit3CriminalProceedingHelper().openCardToView();
		Assert.assertEquals(criminalProceedingCard.getCriminalProceedingNumber(), app.getUnit3CriminalProceedingHelper().getCriminalProceedingNumber());
		app.getUnit3CriminalProceedingHelper().quitCard();
	}

	@Test (groups = {"unit3_proceedings"}, dependsOnMethods = {"testCreateAndReviewCriminalProceedingCard"})
	public void testEditCriminalProceedingCard(){
		app.getUnit3CriminalProceedingHelper().openCardToEdit();
		app.getUnit3CriminalProceedingHelper().editCard(criminalProceedingCard);
		app.getUnit3CriminalProceedingHelper().saveCard();
		app.getUnit3CriminalProceedingHelper().openCardToEdit();
		Assert.assertEquals(criminalProceedingCard.getSomeNewText(), app.getUnit3CriminalProceedingHelper().getOffenseQualification());
		app.getUnit3CriminalProceedingHelper().quitCard();		
	}

	@Test (groups = {"unit3_proceedings"}, dependsOnMethods = {"testEditCriminalProceedingCard"})
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
