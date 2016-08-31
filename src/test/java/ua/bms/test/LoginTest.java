// Login test

package ua.bms.test;

import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import ua.bms.pages.TopNavigationPage;
import ua.bms.pages.LoginPage;
import ua.bms.pages.Page;

public class LoginTest extends BasicTestCase {
	
	
	
	/*-------
	
	//Initialization of page instance according to PageFactory
	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	private TopNavigationPage topNavigationPage;
	
		----------*/
	
	@Test(groups = {"login1"})
	public void testLogin() throws Exception {
		System.out.println("Tests - Login");
		Page.login.open();
		topNavigationPage = loginPage.loginAs(user);
		assertTrue(topNavigationPage.isLoggedIn());
		topNavigationPage.logOut();
		assertTrue(loginPage.isLoggedOut());
	}
	
	
	
	/*----
	@Test(groups = {"login1"})
	public void testLogin() throws Exception {
		System.out.println("Tests - Login");
		loginPage.open();
		topNavigationPage = loginPage.loginAs(user);
		assertTrue(topNavigationPage.isLoggedIn());
		topNavigationPage.logOut();
		assertTrue(loginPage.isLoggedOut());
	}

	

	@Test(groups = {"login2"})
	public void testFailedPassword() throws Exception {
		loginPage.open();
		loginPage.loginAs(user1);
		loginPage.acceptFailedLoginAlert();
		assertTrue(loginPage.isLoggedOut());
	}
	
	@Test(groups = {"login3"})
	public void testFailedLogin() throws Exception {
		loginPage.open();
		loginPage.loginAs(user2);
		loginPage.acceptFailedLoginAlert();
		assertTrue(loginPage.isLoggedOut());
	}

-----*/
}