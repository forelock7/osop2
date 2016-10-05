package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Unit2ActsOperationalActivitiesTest extends BasicTestCase {

	@Test (groups = {"unit2_actsOA"})
	public void testJumpToUnit2ActsOperationalActivitiesPage() {
		assertTrue(app.getUserHelper().isLoggedIn());
		app.getNavigationUnit23Helper().goToUnit2ActsOAPage();
		assertTrue(app.getUnit2ActsOAHelper().isOnUnit2ActsOAPage());
	}
	
	@Test (groups = {"unit2_actsOA"}, dependsOnMethods = {"testJumpToUnit2ActsOperationalActivitiesPage"})
	public void testCreateAndReviewActsOperationalActivitiesCard() {
		app.getUnit2ActsOAHelper().openCardToCreate();
		app.getUnit2ActsOAHelper().createCard(actOACard);
		app.getUnit2ActsOAHelper().saveCard();
		app.getUnit2ActsOAHelper().openCardToView();
		Assert.assertEquals(actOACard.getAmountOfChecked(), app.getUnit2ActsOAHelper().getAmountOfChecked());
		app.getUnit2ActsOAHelper().quitCard();
	}
	
	@Test (groups = {"unit2_actsOA"}, dependsOnMethods = {"testCreateAndReviewActsOperationalActivitiesCard"})
	public void testEditActsOperationalActivitiesCard(){
		app.getUnit2ActsOAHelper().openCardToEdit();
		app.getUnit2ActsOAHelper().editCard(actOACard);
		app.getUnit2ActsOAHelper().saveCard();
		app.getUnit2ActsOAHelper().openCardToEdit();
		Assert.assertEquals(actOACard.getSomeNewText(), app.getUnit2ActsOAHelper().getAmountOfChecked());
		app.getUnit2ActsOAHelper().quitCard();		
	}
	
	@Test (groups = {"unit2_actsOA"}, dependsOnMethods = {"testEditActsOperationalActivitiesCard"})
	public void testRemoveActsOperationalActivitiesCard(){
		app.getUnit2ActsOAHelper().removeCard(actOACard);
		app.getUnit2ActsOAHelper().goToRemovedTab();
		Assert.assertEquals(actOACard.getRegNumberRemovedCard(), app.getUnit2ActsOAHelper().getRegNumberFirstRemovedCardInGrid());
	}
	
	@Test (groups = {"unit2_actsOA"}, dependsOnMethods = {"testRemoveActsOperationalActivitiesCard"})
	public void testRestoreActsOperationalActivitiesCard() {
		app.getUnit2ActsOAHelper().restoreCard(actOACard);
		app.getUnit2ActsOAHelper().goToMainTab();
		Assert.assertEquals(actOACard.getRegNumberRestoredCard(), app.getUnit2ActsOAHelper().getRegNumberFirstCardInGrid());
	}
}
