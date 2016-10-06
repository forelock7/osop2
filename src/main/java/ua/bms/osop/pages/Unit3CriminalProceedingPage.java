package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 1 - "Criminal proceedings"("Кримінальні провадження");
 * Unit 3: "Public prosecution"("Держобвинувачення");
 * and the main methods with them
 */
public class Unit3CriminalProceedingPage extends AnyPage {


	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit3CriminalProceedingPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Criminal proceedings"("Кримінальні провадження");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Кримінальні провадження')]")
	private WebElement titleCriminalProcUnit3;
	
    //Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-13).
    @FindBy(xpath = "//table[1]//td[13]/div/img")
    private WebElement buttonEdit;

	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit3CriminalProceedingPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleCriminalProcUnit3));
		return this;
	}
	
    //Click on "Edit" button for the first record in the main grid
    public void clickButtonEdit() {
        fluientWaitforElement(buttonEdit).click();
    }
}
