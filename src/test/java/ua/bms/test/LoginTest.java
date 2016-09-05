// Login test

package ua.bms.test;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BasicTestCase {
	
	//key-word "return" is in order to take out from the method "mayBeLogout" if condition of "if" = true.
	@BeforeMethod
	public void mayBeLogout() {
		if (app.getUserHelper().isNotLoggedIn()) {
			return;
		}
		app.getUserHelper().logout();
	}

	@Test(groups = {"login1"}, priority = 3)
	public void testLoginOK() {
		app.getUserHelper().loginAs(user);
		assertTrue(app.getUserHelper().isLoggedIn());
	}

	@Test(groups = {"login2"}, priority = 2)
	public void testLoginFailedPassword(){
		app.getUserHelper().loginAs(user1);
		assertTrue(app.getUserHelper().isNotLoggedIn());
	}
	
	@Test(groups = {"login3"}, priority = 1)
	public void testLoginFailedLogin(){
		app.getUserHelper().loginAs(user2);
		assertTrue(app.getUserHelper().isNotLoggedIn());
	}

}