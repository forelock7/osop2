package ua.bms.osop.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Vova on 30-May-17.
 */
public class AdminUsersTest extends BasicTestCase {

    @Test (groups = {"admin_user"})
    public void testJumpToAdminUsersPage() {
        assertTrue(app.getUserHelper().isLoggedIn());
        app.getNavigationTopHelper().goToAdministrationPage();
        app.getAdministrationHelper().goToAdminUsersPage();
        assertTrue(app.getAdminUsersHelper().isOnAdminUsersPage());
    }

    /*@Test (groups = {"admin_user"})
    public void testCreateAndReviewUserProfile() {


    }*/
}
