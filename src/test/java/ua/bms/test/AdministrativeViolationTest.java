package ua.bms.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import ua.bms.pages.AdministrativeViolationsPage;
import ua.bms.pages.HomePage;
import ua.bms.pages.LoginPage;



public class AdministrativeViolationTest extends BasicTestCase {

	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	
	private HomePage homePage;
	
	private AdministrativeViolationsPage administrativeViolationsPage;
	
	@Test (groups = {"unit9"})
	public void testJumpToUnit9Page() throws Exception {
		loginPage.open();
		homePage = loginPage.loginAs(user);
		assertTrue(homePage.isLoggedIn());
		administrativeViolationsPage = homePage.goToAV();
		assertTrue(administrativeViolationsPage.isOnUnit9Page());
	}
	
	@Test (groups = {"unit9"}, dependsOnMethods = { "testJumpToUnit9Page" })
	public void testCreateMilitaryCard() throws Exception {
		
		administrativeViolationsPage.createCard(aVCard);
		administrativeViolationsPage.openCardToEdit();
		
		String protNumInField = administrativeViolationsPage.getProtocolNumber();
		
		//protocol number, that was used upon creating the card
		String currentProtNum = aVCard.protocolNumber;
		
		System.out.println("protNumInField = " + protNumInField);
		System.out.println("currentProtNumber = " + currentProtNum);
		
		Assert.assertEquals(protNumInField, currentProtNum);
		
		administrativeViolationsPage.exitFromCard();
		//homePage.logOut();
		//assertTrue(homePage.isLoggedOut());
	}

	


}
