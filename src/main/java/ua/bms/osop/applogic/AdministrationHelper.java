package ua.bms.osop.applogic;

/**
 * Created by Vova on 30-May-17.
 */
public class AdministrationHelper extends DriverBasedHelper {

    /*
	 * Constructor of object which is managed by object Application Manager.
	 */
    public AdministrationHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
    }

    //Moving to page Admin Users  page
    public void goToAdminUsersPage(){
        pages.administrationPage.ensurePageLoaded().clickButtonUsersItem();
    }
}
