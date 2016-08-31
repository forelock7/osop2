package ua.bms.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import ua.bms.pages.Unit9MilitaryPage;
import ua.bms.pages.TopNavigationPage;
import ua.bms.pages.LoginPage;



public class Unit9MilitaryTest extends BasicTestCase {

	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	private TopNavigationPage topNavigationPage;
	private Unit9MilitaryPage unit9MilitaryPage;
	
/*-----------------------------Tests---------------------------------------------------------*/	
	
	@Test (groups = {"unit9"})
	public void testJumpToUnit9Page() throws Exception {
		System.out.println("Tests - Unit9");
		loginPage.open();
		topNavigationPage = loginPage.loginAs(user);
		assertTrue(topNavigationPage.isLoggedIn());
		unit9MilitaryPage = topNavigationPage.goToU9();
		assertTrue(unit9MilitaryPage.isOnUnit9Page());
	}
	
	
	@Test (groups = {"unit9"}, dependsOnMethods = {"testJumpToUnit9Page"})
	public void testCreateMilitaryCard() throws Exception {
		unit9MilitaryPage.createCardU9(aVCard);
		unit9MilitaryPage.openCardToEdit();
		String protNumInField = unit9MilitaryPage.getProtocolNumber();
		//Protocol number, that was used upon creating the card
		String currentProtNum = aVCard.protocolNumber;
		//Checking in console
		System.out.println("Created Card (protNum) = " + protNumInField + " = " + currentProtNum);
		Assert.assertEquals(protNumInField, currentProtNum);
		unit9MilitaryPage.exitFromCard();
	}
	
	
	@Test (groups = {"unit9"}, dependsOnMethods = {"testCreateMilitaryCard"})
	public void testEditMilitaryCard() throws Exception {
		unit9MilitaryPage.openCardToEdit();
		unit9MilitaryPage.changeValueInTheoryField(someText);
		unit9MilitaryPage.saveCard();
		assertTrue(unit9MilitaryPage.isAlertPresent());
		unit9MilitaryPage.clickOnAlertOK();
		unit9MilitaryPage.openCardToEdit();				
		String currentTheory = unit9MilitaryPage.getTheory();		
		Assert.assertEquals(currentTheory, someText);		
		unit9MilitaryPage.exitFromCard();
		
	}

	@Test (groups = {"unit9"}, dependsOnMethods = {"testEditMilitaryCard"})
	public void testRemoveMilitaryCard() throws InterruptedException {
		String regNumRemovedCard = unit9MilitaryPage.removeCardUnit9();
		String regNumCardInGrid = unit9MilitaryPage.getRegNumberFromGridOnDelTab();	
		//Checking in console
		System.out.println("Removed Card = " + regNumRemovedCard + " = " + regNumCardInGrid);
		Assert.assertEquals(regNumRemovedCard, regNumCardInGrid);
	}
	
	@Test (groups = {"unit9"}, dependsOnMethods = {"testRemoveMilitaryCard"})
	public void testRecoverMilitaryCard() throws InterruptedException {
		String regNumRecoveredCard = unit9MilitaryPage.recoverCardUnit9();
		String regNumInGrid = unit9MilitaryPage.getRegNumberFromGridMainTab();
		//Checking in console
		System.out.println("Recovered Card = " + regNumRecoveredCard + " = " + regNumInGrid);
		Assert.assertEquals(regNumRecoveredCard, regNumInGrid);
	}

	

}
