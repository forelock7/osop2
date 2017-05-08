package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

/*
 * Implements all tests related to Login Form
 */
public class LoginTest extends BasicTestCase {
	

	/*Key-word "return" is in order to take out from the method "mayBeLogout" if condition of "if" = true.*/
	@BeforeMethod
	public void mayBeLogout() {
		if (app.getUserHelper().isNotLoggedIn()) {
			return;
		}
		app.getUserHelper().logout();
	}

/*-------------------------Tests-----------------------------------------------------*/	
	
	@Test(groups = {"login"}, priority = 3)
	public void testLoginOK() throws Exception {
		app.getUserHelper().loginAs(super.getUserModel(1));
		assertTrue(app.getUserHelper().isLoggedIn());
	}

	@Test(groups = {"login"}, priority = 2)
	public void testLoginFailedPassword() throws Exception {
		app.getUserHelper().loginAs(super.getUserModel(2));
		assertTrue(app.getUserHelper().isNotLoggedIn());
	}
	
	@Test(groups = {"login"}, priority = 1)
	public void testLoginFailedLogin() throws Exception {
		app.getUserHelper().loginAs(super.getUserModel(3));
		assertTrue(app.getUserHelper().isNotLoggedIn());
	}

}