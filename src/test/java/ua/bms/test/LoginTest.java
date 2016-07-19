// Logining test

package ua.bms.test;

import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import ua.bms.pages.HomePage;
import ua.bms.pages.LoginPage;

public class LoginTest extends BasicTestCase {
	
	//Initialization of page instance according to PageFactory
	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	
	private HomePage homePage;
	
	@Test(groups = {"login"})
	public void testLoginForm() throws Exception {
		loginPage.open();
		homePage = loginPage.loginAs(user);
		assertTrue(homePage.isLoggedIn());
		homePage.logOut();
		assertTrue(homePage.isLoggedOut());
	}


	
	


}