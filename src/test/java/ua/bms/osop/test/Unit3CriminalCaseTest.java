package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.bms.osop.model.Unit3CriminalCaseCardModel;

import java.io.IOException;

public class Unit3CriminalCaseTest extends BasicTestCase {

	private Unit3CriminalCaseCardModel criminalCaseCard = getUnit3CriminalCaseCardModel(1);

	public Unit3CriminalCaseTest() throws IOException {
	}

	@Test (groups = {"unit3_cases"}, priority = 1)
	public void testJumpToUnit3ParticipationCasesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3ParticipationCasePage();
		assertTrue(app.getUnit3ParticipationCasesHelper().isOnUnit3ParticipationCasesPage());
	}

	@Test (groups = {"unit3_cases"}, dependsOnMethods = {"testJumpToUnit3ParticipationCasesPage"})
	public void testJumpToUnit3CriminalCasesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit3CriminalCasePage();
		assertTrue(app.getUnit3CriminalCaseHelper().isOnUnit3CriminalCasePage());
	}

	
	@Test (groups = {"unit3_cases"}, dependsOnMethods = {"testJumpToUnit3CriminalCasesPage"})
	public void testCreateAndReviewCriminalCasesCard() {
		app.getUnit3CriminalCaseHelper().openCardToCreate();
		app.getUnit3CriminalCaseHelper().createCard(criminalCaseCard);
		app.getUnit3CriminalCaseHelper().saveCard();
		app.getUnit3CriminalCaseHelper().openCardToView();
		Assert.assertEquals(criminalCaseCard.getCriminalCaseNumber(), app.getUnit3CriminalCaseHelper().getCriminalCaseNumber());
		app.getUnit3CriminalCaseHelper().quitCard();
	}

	@Test (groups = {"unit3_cases"}, dependsOnMethods = {"testCreateAndReviewCriminalCasesCard"})
	public void testEditCriminalCasesCard(){
		app.getUnit3CriminalCaseHelper().openCardToEdit();
		app.getUnit3CriminalCaseHelper().editCard(criminalCaseCard);
		app.getUnit3CriminalCaseHelper().saveCard();
		app.getUnit3CriminalCaseHelper().openCardToEdit();
		Assert.assertEquals(criminalCaseCard.getSomeNewText(), app.getUnit3CriminalCaseHelper().getOffenseQualification());
		app.getUnit3CriminalCaseHelper().quitCard();		
	}

	@Test (groups = {"unit3_cases"}, dependsOnMethods = {"testEditCriminalCasesCard"})
	public void testCheckCreatingInstanceIsUnable() {
		app.getNavigationUnit23Helper().goToUnit3CriminalCasePage();
		app.getUnit3CriminalCaseHelper().openCardToCreate();
		assertTrue(app.getUnit3CriminalCaseHelper().isOnUnit3CriminalCaseCard());
		app.getUnit3CriminalCaseHelper().goToStagesTab();
		assertTrue(app.getUnit3CriminalCaseHelper().isStageCreatingUnable());
		Assert.assertFalse(app.getUnit3CriminalCaseHelper().checkIsButtonCreateFirstInstance());
		app.getUnit3CriminalCaseHelper().quitCard();
		Assert.assertFalse(app.getUnit3CriminalCaseHelper().isOnUnit3CriminalCaseCard());
	}
	
}
