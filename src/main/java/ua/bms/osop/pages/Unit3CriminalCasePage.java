package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 4 - "Criminal cases"("Кримінальні справи");
 *Unit 3: "Public prosecution"("Держобвинувачення");
 * and the main methods with them
 */
public class Unit3CriminalCasePage extends AnyPage {


	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit3CriminalCasePage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Criminal cases"("Кримінальні справи");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Кримінальні справи')]")
	private WebElement titleCriminalCasesUnit3;
	
    //Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-13).
    @FindBy(xpath = "//table[1]//td[13]/div/img")
    private WebElement buttonEdit;
    
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit3CriminalCasePage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleCriminalCasesUnit3));
		return this;
	}
	
    //Click on "Edit" button for the first record in the main grid
    public void clickButtonEdit() {
        fluientWaitforElement(buttonEdit).click();
    }
    
}
