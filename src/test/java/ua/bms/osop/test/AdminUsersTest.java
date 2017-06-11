package ua.bms.osop.test;

import ddt.ExcelFileConnector;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ua.bms.osop.model.UserModel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by Vova on 30-May-17.
 */
public class AdminUsersTest extends BasicTestCase {

    public AdminUsersTest() throws Exception {
    }

    private UserModel userModel = getNewUserModel(1);

    @BeforeClass
    public void writeLoginNumber() throws IOException{
        Object [][] mas2 = {
                {"login", "last_number"},
                {userModel.getLoginBasis(), userModel.getLoginNumber()}
        };
        ExcelFileConnector exCon = new ExcelFileConnector();
        exCon.writeExcel("newLogin", mas2);
    }

    @Test (groups = {"admin_user"})
    public void testJumpToAdminUsersPage(){
        assertTrue(app.getUserHelper().isLoggedIn());
        app.getNavigationTopHelper().goToAdministrationPage();
        app.getAdministrationHelper().goToAdminUsersPage();
        assertTrue(app.getAdminUsersHelper().isOnAdminUsersPage());
    }

    @Test (groups = {"admin_user"}, dependsOnMethods = {"testJumpToAdminUsersPage"})
    public void testCreateAndReviewUserProfile() throws InterruptedException {
        app.getAdminUsersHelper().openCardToCreate();
        app.getAdminUsersHelper().enterUserProfileCard(userModel);
        app.getAdminUsersHelper().saveCard();
        app.getAdminUsersHelper().sortDownMainGrid();
        TimeUnit.SECONDS.sleep(7);
        app.getAdminUsersHelper().openCardToView();
        Assert.assertEquals(userModel.getLogin(), app.getAdminUsersHelper().getLogin());
        app.getAdminUsersHelper().quitCard();
    }
}
