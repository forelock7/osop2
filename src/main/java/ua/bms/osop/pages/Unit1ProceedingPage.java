package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 1 - "Review proceedings on a claim"("НП за позовом");
 * Unit 1 "Presentetion" ("Представництво")
 * and the main methods with them
 */
public class Unit1ProceedingPage extends AnyPage {

    /*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
    public Unit1ProceedingPage(PageManager pages) {
        super(pages);
    }
	
	/*-------------------The Web-Elements of the Review Proceedings Page---------------------------------------------------*/

    //Title of "Review proceedings on a claim"("НП за позовом")
    @FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'НП за позовом')]")
    private WebElement titleReviewUnit1;

    //Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-9).
    @FindBy(xpath = "//table[1]//td[9]/div/img")
    private WebElement buttonEdit;

	/*------------------Methods of the Review Page-------------------------------------------------------------*/

    /*
	 * Determines loading of Page
	 */
    public Unit1ProceedingPage ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.visibilityOf(titleReviewUnit1));
        return this;
    }

    //Click on "Edit" button for the first record in the main grid
    public void clickButtonEdit() {
        fluientWaitforElement(buttonEdit).click();
    }



}
