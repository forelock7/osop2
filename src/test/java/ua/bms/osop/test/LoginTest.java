package ua.bms.osop.test;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

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
	public void testLoginOK() throws IOException {
		//app.getUserHelper().loginAs(userModel);
		app.getUserHelper().loginAs(getUserModel(1));
		assertTrue(app.getUserHelper().isLoggedIn());
	}

	/*@Test(groups = {"login"}, priority = 2)
	public void testLoginFailedPassword(){
		app.getUserHelper().loginAs(user1);
		assertTrue(app.getUserHelper().isNotLoggedIn());
	}
	
	@Test(groups = {"login"}, priority = 1)
	public void testLoginFailedLogin(){
		app.getUserHelper().loginAs(user2);
		assertTrue(app.getUserHelper().isNotLoggedIn());
	}*/

}