package ua.bms.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ua.bms.pages.AdministrativeViolationsPage;
import ua.bms.pages.HomePage;
import ua.bms.pages.LoginPage;



public class AdministrativeViolationTest extends BasicTestCase {

	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	
	private HomePage homePage;
	
	private AdministrativeViolationsPage administrativeViolationsPage;
	
	@Test
	public void testLoginForm() throws Exception {
		loginPage.open();
		homePage = loginPage.loginAs(user);
		assertTrue(homePage.isLoggedIn());
		administrativeViolationsPage = homePage.goToAV();
		administrativeViolationsPage.createCard(aVCard);
		
		administrativeViolationsPage.openCardToEdit();
		
		assertEquals(administrativeViolationsPage.getTextProtocolNumber(), protNum);
		administrativeViolationsPage.exitFromCard();
		//homePage.logOut();
		//assertTrue(homePage.isLoggedOut());
	}

	private void assertEquals(String textProtocolNumber, String protNum) {
		// TODO Auto-generated method stub
		
	}


}
