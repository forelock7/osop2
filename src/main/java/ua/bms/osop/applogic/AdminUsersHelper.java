package ua.bms.osop.applogic;

import ua.bms.osop.model.UserModel;

/**
 * Created by Vova on 30-May-17.
 */
public class AdminUsersHelper extends DriverBasedHelper {
    /*
 * Constructor of object which is managed by object Application Manager.
 */
    public AdminUsersHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
    }

    public boolean isOnAdminUsersPage() {
        return pages.adminUsersPage.waitPageLoaded();
    }

    public void openCardToCreate() {
        pages.adminUsersPage.clickButtonCreateCard();
    }

    /*--------------------------------International Card----------------------------------------------------*/

    public void createCard(UserModel userModel) {
        pages.userProfileCard.setUserProfileCard(userModel);
    }



}
