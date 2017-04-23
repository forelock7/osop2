package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.bms.osop.model.Unit2ReleaseCardModel;

import java.io.IOException;

public class Unit2ReleaseFromCustodyTest extends BasicTestCase {

	private Unit2ReleaseCardModel releaseCard = getUnit2ReleaseCardModel(1);

	public Unit2ReleaseFromCustodyTest() throws IOException {
	}

	@Test (groups = {"unit2_releaseFromCustody"})
	public void testJumpToUnit2ReleaseFromCustodyPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2ReleasePage();
		assertTrue(app.getUnit2ReleaseHelper().isOnUnit2ReleasePage());
	}
	
	@Test (groups = {"unit2_releaseFromCustody"}, dependsOnMethods = {"testJumpToUnit2ReleaseFromCustodyPage"})
	public void testCreateAndReviewReleaseCard() {
		app.getUnit2ReleaseHelper().openCardToCreate();
		app.getUnit2ReleaseHelper().createCard(releaseCard);
		app.getUnit2ReleaseHelper().saveCard();
		app.getUnit2ReleaseHelper().openCardToView();
		Assert.assertEquals(releaseCard.getProceedingNumber(), app.getUnit2ReleaseHelper().getProceedingNumber());
		app.getUnit2ReleaseHelper().quitCard();
	}
	
	@Test (groups = {"unit2_releaseFromCustody"}, dependsOnMethods = {"testCreateAndReviewReleaseCard"})
	public void testEditReleaseCard(){
		app.getUnit2ReleaseHelper().openCardToEdit();
		app.getUnit2ReleaseHelper().editCard(releaseCard);
		app.getUnit2ReleaseHelper().saveCard();
		app.getUnit2ReleaseHelper().openCardToEdit();
		Assert.assertEquals(releaseCard.getSomeNewText(), app.getUnit2ReleaseHelper().getCaseNumber());
		app.getUnit2ReleaseHelper().quitCard();		
	}
	
	@Test (groups = {"unit2_releaseFromCustody"}, dependsOnMethods = {"testEditReleaseCard"})
	public void testRemoveReleaseCard(){
		app.getUnit2ReleaseHelper().removeCard(releaseCard);
		app.getUnit2ReleaseHelper().goToRemovedTab();
		Assert.assertEquals(releaseCard.getRegistrationNumber(), app.getUnit2ReleaseHelper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit2_releaseFromCustody"}, dependsOnMethods = {"testRemoveReleaseCard"})
	public void testRestoreReleaseCard() {
		app.getUnit2ReleaseHelper().restoreCard(releaseCard);
		app.getUnit2ReleaseHelper().goToMainTab();
		Assert.assertEquals(releaseCard.getRegistrationNumber(), app.getUnit2ReleaseHelper().getRegNumberFirstCardInGrid());
	}
	
}
