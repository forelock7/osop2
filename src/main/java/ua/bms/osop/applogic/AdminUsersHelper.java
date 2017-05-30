package ua.bms.osop.applogic;

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



}
