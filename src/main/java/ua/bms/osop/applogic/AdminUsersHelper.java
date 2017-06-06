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

    /*--------------------------------User Profile Card----------------------------------------------------*/

    public void enterUserProfileCard(UserModel userModel) {
        pages.userProfileCard.enterLogin(userModel)
                .enterLastName(userModel)
                .enterFirstName(userModel)
                .enterMiddleName(userModel)
                .enterProsecutionOffice(userModel)
                .enterSubdivision(userModel)
                .enterPost(userModel)
                .enterRole(userModel)
                .enterEmail(userModel);
    }

    //Opens Card to review
    public void openCardToView() throws InterruptedException {
        pages.adminUsersPage.doubleClickOnFirstRecordInGridOnMainTab();
    }

    //Sorts records down(in descending order) - double click on header of grid
    public void sortDownMainGrid() {
        pages.adminUsersPage.doubleClickOnGridHeader();
    }






    /*---------------------------User Profile Card-----------------------------------------*/

    //Gets Login from an opened profile
    public String getLogin() {
        return pages.userProfileCard.getInputLogin();
    }

    public void saveCard() {
        pages.userProfileCard.clickButtonSaveCard();
        pages.userProfileCard.clickOnAlertOK();
    }

    //Quit from Card
    public void quitCard() {
        pages.userProfileCard.clickButtonExitFromCardForm();
    }
}
