package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

/**
 * Created by Vova on 30-May-17.
 */
public class AdminUsersPage extends AnyPage {

    /*
    * Constructor of this Page object which is managed by object Page Manager.
    */
    public AdminUsersPage(PageManager pages) {
        super(pages);
    }

    /*
     * Ensures if Navigation Page is available using explicit waits
     */
    public AdminUsersPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(presenceOfElementLocated(By.xpath("//div[contains(@id, 'header-title-text')]//div[contains(., 'Користувачі')]")));
        return this;
    }

    /*------------------The Web-Elements of the MAIN TOOLBAR------------------------------------------------------*/

    //Title of "Users"("Користувачі")
    @FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Користувачі')]")
    private WebElement titleAdminUsers;



}
