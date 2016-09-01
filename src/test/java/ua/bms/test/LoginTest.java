// Login test

package ua.bms.test;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest extends BasicTestCase {
	
	@BeforeMethod
	public void mayBeLogout() {
		if (app.getUserHelper().isNotLoggedIn()) {
			return;
		}
		app.getUserHelper().logout();
	}

	@Test(groups = {"login1"})
	public void testLoginOK() throws Exception {
		app.getUserHelper().loginAs(user);
		assertTrue(app.getUserHelper().isLoggedIn());
	}

	@Test(groups = {"login2"})
	public void testFailedPassword() throws Exception {
		app.getUserHelper().loginAs(user1);
		assertTrue(app.getUserHelper().isNotLoggedIn());
	}
	
/*
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