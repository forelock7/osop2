package ua.bms.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import ua.bms.pages.Unit9MilitaryPage;
import ua.bms.pages.HomePage;
import ua.bms.pages.LoginPage;



public class Unit9MilitaryTest extends BasicTestCase {

	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	
	private HomePage homePage;
	
	private Unit9MilitaryPage unit9MilitaryPage;
	
/*-----------------------------Tests---------------------------------------------------------*/	
	
	@Test (groups = {"unit9"})
	public void testJumpToUnit9Page() throws Exception {
		loginPage.open();
		homePage = loginPage.loginAs(user);
		assertTrue(homePage.isLoggedIn());
		unit9MilitaryPage = homePage.goToU9();
		assertTrue(unit9MilitaryPage.isOnUnit9Page());
	}
	
	
	@Test (groups = {"unit9"}, dependsOnMethods = {"testJumpToUnit9Page"})
	public void testCreateMilitaryCard() throws Exception {
		
		unit9MilitaryPage.createCardU9(aVCard);
		unit9MilitaryPage.openCardToEdit();
		
		String protNumInField = unit9MilitaryPage.getProtocolNumber();
		
		//protocol number, that was used upon creating the card
		String currentProtNum = aVCard.protocolNumber;
		
		System.out.println("protNumInField = " + protNumInField);
		System.out.println("currentProtNumber = " + currentProtNum);
		
		Assert.assertEquals(protNumInField, currentProtNum);
		unit9MilitaryPage.exitFromCard();
		
		//unit9MilitaryPage.exitFromCard();
		//homePage.logOut();
		//assertTrue(homePage.isLoggedOut());
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
		System.out.println("currentTheory = " + currentTheory);
		Assert.assertEquals(currentTheory, someText);
		
		unit9MilitaryPage.exitFromCard();
	}

	


}
