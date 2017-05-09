package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.bms.osop.model.Unit2ActPICardModel;

import java.io.IOException;

public class Unit2ActsPretrialInvestigationTest extends BasicTestCase {

	private Unit2ActPICardModel actPICard = getUnit2ActPICardModel(1);

	public Unit2ActsPretrialInvestigationTest() throws Exception {
	}

	@Test (groups = {"unit2_actsPreInv"})
	public void testJumpToUnit2ActsPretrialInvestPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2ActsPIPage();
		assertTrue(app.getUnit2ActsPIHelper().isOnUnit2ActsPIPage());
	}
	
	@Test (groups = {"unit2_actsPreInv"}, dependsOnMethods = {"testJumpToUnit2ActsPretrialInvestPage"})
	public void testCreateAndReviewActPretrialInvest() {
		app.getUnit2ActsPIHelper().openCardToCreate();
		app.getUnit2ActsPIHelper().createCard(actPICard);
		app.getUnit2ActsPIHelper().saveCard();
		app.getUnit2ActsPIHelper().openCardToView();
		Assert.assertEquals(actPICard.getProceedingNumber(), app.getUnit2ActsPIHelper().getProceedingNumber());
		app.getUnit2ActsPIHelper().quitCard();
	}
	
	@Test (groups = {"unit2_actsPreInv"}, dependsOnMethods = {"testCreateAndReviewActPretrialInvest"})
	public void testEditActOfPretrialInvest(){
		app.getUnit2ActsPIHelper().openCardToEdit();
		app.getUnit2ActsPIHelper().editCard(actPICard);
		app.getUnit2ActsPIHelper().saveCard();
		app.getUnit2ActsPIHelper().openCardToEdit();
		Assert.assertEquals(actPICard.getSomeNewText(), app.getUnit2ActsPIHelper().getContent());
		app.getUnit2ActsPIHelper().quitCard();		
	}
	
	@Test (groups = {"unit2_actsPreInv"}, dependsOnMethods = {"testEditActOfPretrialInvest"})
	public void testRemoveActOfPretrialInvest(){
		app.getUnit2ActsPIHelper().removeCard(actPICard);
		app.getUnit2ActsPIHelper().goToRemovedTab();
		Assert.assertEquals(actPICard.getRegistrationNumber(), app.getUnit2ActsPIHelper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit2_actsPreInv"}, dependsOnMethods = {"testRemoveActOfPretrialInvest"})
	public void testRestoreActOfPretrialInvest() {
		app.getUnit2ActsPIHelper().restoreCard(actPICard);
		app.getUnit2ActsPIHelper().goToMainTab();
		Assert.assertEquals(actPICard.getRegistrationNumber(), app.getUnit2ActsPIHelper().getRegNumberFirstCardInGrid());
	}
}
