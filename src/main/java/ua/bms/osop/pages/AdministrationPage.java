package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

/**
 * Created by Vova on 30-May-17.
 */
public class AdministrationPage extends AnyPage {

    /*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
    public AdministrationPage(PageManager pages) {
        super(pages);
    }

    /*
     * Ensures if Navigation Page is available using explicit waits
     */
    public AdministrationPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(presenceOfElementLocated(By.xpath("//div[contains(@id, 'administrationMenu')]//.[contains(text(), 'Адміністрування')]")));
        return this;
    }

    /*------------------The Web-Elements of the MAIN TOOLBAR------------------------------------------------------*/

    //Button "Users" ("Користувачі")
    @FindBy(xpath = "//div[contains(@id, 'administrationMenu')]//span[contains(text(), 'Користувачі')]")
    private WebElement buttonUsersItem;

    //Admin - Moving from "Administration" page to "Users" page
    public AdminUsersPage clickButtonUsersItem() {
        buttonUsersItem.click();
        return pages.adminUsersPage;
    }
}
