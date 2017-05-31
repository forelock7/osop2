package ua.bms.osop.test;

import org.testng.annotations.Test;
import ua.bms.osop.model.UserModel;

import static org.testng.Assert.assertTrue;

/**
 * Created by Vova on 30-May-17.
 */
public class AdminUsersTest extends BasicTestCase {

    public AdminUsersTest() throws Exception {

    }

    private UserModel userModel = getUserModel(4);

    @Test (groups = {"admin_user"})
    public void testJumpToAdminUsersPage() {
        assertTrue(app.getUserHelper().isLoggedIn());
        app.getNavigationTopHelper().goToAdministrationPage();
        app.getAdministrationHelper().goToAdminUsersPage();
        assertTrue(app.getAdminUsersHelper().isOnAdminUsersPage());
    }

    @Test (groups = {"admin_user"}, dependsOnMethods = {"testJumpToAdminUsersPage"})
    public void testCreateAndReviewUserProfile() {
        app.getAdminUsersHelper().openCardToCreate();
        app.getAdminUsersHelper().createCard(userModel);
    }
}
