package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
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

    //Registration Number in the first record of grid on Main tab
    @FindBy(xpath = "//div[1]//table[1]//td[2]/div")
    private WebElement cellLoginInGridOnMainTab;

    //Title of "Users"("Користувачі")
    @FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Користувачі')]")
    private WebElement titleAdminUsers;

    //Header of "Registration Number" column(2) in Main Grid
    @FindBy (xpath = "//div[contains(@id, 'headercontainer')]/div[13]")
    private WebElement headerMainGrid;

    //Opens to review Card


    @Override
    public void doubleClickOnFirstRecordInGridOnMainTab() {
        /*wait1.until(elementToBeClickable(cellLoginInGridOnMainTab)).click();
        wait1.until(elementToBeClickable(cellLoginInGridOnMainTab)).click();*/
		Actions action = new Actions(driver);
		action.doubleClick(fluientWaitforElement(cellLoginInGridOnMainTab)).build().perform();
    }

    @Override
    public void doubleClickOnGridHeader() {
        Actions action = new Actions(driver);
        action.click(fluientWaitforElement(headerMainGrid)).click(fluientWaitforElement(headerMainGrid)).perform();
    }


}
