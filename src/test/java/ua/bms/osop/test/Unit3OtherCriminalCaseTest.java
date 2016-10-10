package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Unit3OtherCriminalCaseTest extends BasicTestCase  {
		
	@Test (groups = {"unit3_otherCases"})
	public void testJumpToUnit3OtherCriminalCasesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3OtherCriminalCasePage();
		assertTrue(app.getUnit3OtherCriminalCaseHelper().isOnUnit3OtherCriminalCasePage());
	}
	
	@Test (groups = {"unit3_otherCases"}, dependsOnMethods = {"testJumpToUnit3OtherCriminalCasesPage"})
	public void testCreateAndReviewOtherCriminalCaseCard() {
		app.getUnit3OtherCriminalCaseHelper().openCardToCreate();
		app.getUnit3OtherCriminalCaseHelper().createCard(otherCriminalCaseCard);
		app.getUnit3OtherCriminalCaseHelper().saveCard();
		app.getUnit3OtherCriminalCaseHelper().openCardToView();
		Assert.assertEquals(otherCriminalCaseCard.getCaseNumber(), app.getUnit3OtherCriminalCaseHelper().getCaseNumber());
		app.getUnit3OtherCriminalCaseHelper().quitCard();
	}

	@Test (groups = {"unit3_otherCases"}, dependsOnMethods = {"testCreateAndReviewOtherCriminalCaseCard"})
	public void testEditOtherCriminalCaseCard(){
		app.getUnit3OtherCriminalCaseHelper().openCardToEdit();
		app.getUnit3OtherCriminalCaseHelper().editCard(otherCriminalCaseCard);
		app.getUnit3OtherCriminalCaseHelper().saveCard();
		app.getUnit3OtherCriminalCaseHelper().openCardToEdit();
		Assert.assertEquals(otherCriminalCaseCard.getSomeNewText(), app.getUnit3OtherCriminalCaseHelper().getShortStory());
		app.getUnit3OtherCriminalCaseHelper().quitCard();		
	}

	@Test (groups = {"unit3_otherCases"}, dependsOnMethods = {"testEditOtherCriminalCaseCard"})
	public void testCheckCreatingInstanceIsUnable() {
		app.getNavigationUnit23Helper().goToUnit3OtherCriminalCasePage();
		app.getUnit3OtherCriminalCaseHelper().openCardToCreate();
		assertTrue(app.getUnit3OtherCriminalCaseHelper().isOnUnit3OtherCriminalCaseCard());
		app.getUnit3OtherCriminalCaseHelper().goToStagesTab();
		assertTrue(app.getUnit3OtherCriminalCaseHelper().isStageCreatingUnable());
		Assert.assertFalse(app.getUnit3OtherCriminalCaseHelper().checkIsButtonCreateFirstInstance());
		app.getUnit3OtherCriminalCaseHelper().quitCard();
		Assert.assertFalse(app.getUnit3OtherCriminalCaseHelper().isOnUnit3OtherCriminalCaseCard());
	}

}
