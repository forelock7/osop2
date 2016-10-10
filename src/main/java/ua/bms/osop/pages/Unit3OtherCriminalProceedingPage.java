package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 2 - "Other criminal proceedings"("Інші кримінальні провадження");
 * Unit 3: "Public prosecution"("Держобвинувачення");
 * and the main methods with them
 */
public class Unit3OtherCriminalProceedingPage extends AnyPage {


	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit3OtherCriminalProceedingPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Other criminal proceedings"("Інші кримінальні провадження");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Інші питання кримінального провадження')]")
	private WebElement titleOtherCriminalProcUnit3;
	
    //Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-10).
    @FindBy(xpath = "//table[1]//td[10]/div/img")
    private WebElement buttonEdit;
    
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit3OtherCriminalProceedingPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleOtherCriminalProcUnit3));
		return this;
	}
	
    //Click on "Edit" button for the first record in the main grid
    public void clickButtonEdit() {
        fluientWaitforElement(buttonEdit).click();
    }
}
