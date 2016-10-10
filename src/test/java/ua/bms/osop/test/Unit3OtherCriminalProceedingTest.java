package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Unit3OtherCriminalProceedingTest extends BasicTestCase  {

	@Test (groups = {"unit3_otherProceedings"})
	public void testJumpToUnit3OtherCriminalProceedingPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3OtherCriminalProceedingPage();
		assertTrue(app.getUnit3OtherCriminalProceedingHelper().isOnUnit3OtherCriminalProceedingPage());
	}
	
	@Test (groups = {"unit3_otherProceedings"}, dependsOnMethods = {"testJumpToUnit3OtherCriminalProceedingPage"})
	public void testCreateAndReviewOtherCriminalProceedingCard() {
		app.getUnit3OtherCriminalProceedingHelper().openCardToCreate();
		app.getUnit3OtherCriminalProceedingHelper().createCard(otherCriminalProceedingCard);
		app.getUnit3OtherCriminalProceedingHelper().saveCard();
		app.getUnit3OtherCriminalProceedingHelper().openCardToView();
		Assert.assertEquals(otherCriminalProceedingCard.getProceedingCaseNumber(), app.getUnit3OtherCriminalProceedingHelper().getProceedingCaseNumber());
		app.getUnit3OtherCriminalProceedingHelper().quitCard();
	}

	@Test (groups = {"unit3_otherProceedings"}, dependsOnMethods = {"testCreateAndReviewOtherCriminalProceedingCard"})
	public void testEditOtherCriminalProceedingCard(){
		app.getUnit3OtherCriminalProceedingHelper().openCardToEdit();
		app.getUnit3OtherCriminalProceedingHelper().editCard(otherCriminalProceedingCard);
		app.getUnit3OtherCriminalProceedingHelper().saveCard();
		app.getUnit3OtherCriminalProceedingHelper().openCardToEdit();
		Assert.assertEquals(otherCriminalProceedingCard.getSomeNewText(), app.getUnit3OtherCriminalProceedingHelper().getShortStory());
		app.getUnit3OtherCriminalProceedingHelper().quitCard();		
	}

	@Test (groups = {"unit3_otherProceedings"}, dependsOnMethods = {"testEditOtherCriminalProceedingCard"})
	public void testCheckCreatingInstanceIsUnable() {
		app.getNavigationUnit23Helper().goToUnit3OtherCriminalProceedingPage();
		app.getUnit3OtherCriminalProceedingHelper().openCardToCreate();
		assertTrue(app.getUnit3OtherCriminalProceedingHelper().isOnUnit3OtherCriminalProceedingCard());
		app.getUnit3OtherCriminalProceedingHelper().goToStagesTab();
		assertTrue(app.getUnit3OtherCriminalProceedingHelper().isStageCreatingUnable());
		Assert.assertFalse(app.getUnit3OtherCriminalProceedingHelper().checkIsButtonCreateFirstInstance());
		app.getUnit3OtherCriminalProceedingHelper().quitCard();
		Assert.assertFalse(app.getUnit3OtherCriminalProceedingHelper().isOnUnit3OtherCriminalProceedingCard());
	}
	
}
