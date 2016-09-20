package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.bms.osop.model.Unit5ChargedCard;


/*
 * Declare all Web-elements on Unit 5 "Supervision of the observance of laws in the execution of judgments."
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 3 - "List of Charged Person"("Перелік осіб, притягнутих до відповідальності").
 * and the main methods with them
 */
public class Unit5ChargedPage  extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit5ChargedPage(PageManager pages) {
		super(pages);
	}
		
	/*-------------------The Web-Elements of Charged Person Page----------------------------------------------------*/

	//Title "List of Charged Person"("Перелік осіб, притягнутих до відповідальності")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Перелік осіб, притягнутих до відповідальності')]")
	private WebElement titleUnit5Charged;
	
	//Registration Number in the first record of grid on Main tab
	@FindBy(xpath = "//div[contains(@id, 'tableview')]/div[1]//table[1]//td[2]/div")
	private WebElement cellRegNumberInGridOnMainTab;
	
	/*------------------The Web-Elements of the Charged Person Card------------------------------------------------------*/
	
	//Button "Save" ("Зберегти") for saving card
	@FindBy(xpath = "//div[contains(@id, 'actAsChargedPersonCard')]/div[4]//a[1]")
	private WebElement buttonSaveCard;
	
	//Button "Exit" ("Вихід") for exit from card
	@FindBy (xpath = "//div[contains(@id, 'actAsChargedPersonCard')]/div[4]//span[contains(., 'Вихід')]")
	private WebElement buttonExitFromCard;
	
	//Name of charged person
	@FindBy(xpath = "(//div[contains(@id, 'unit5-actAsChargedPersonCard')]//input)[1]")
	private WebElement inputName;
	
	//Input field "Post" ("Посада")
	@FindBy(xpath = "(//div[contains(@id, 'unit5-actAsChargedPersonCard')]//input)[3]")
	private WebElement inputPost;
	
	//Input field "Type of Supervision, Type of Agency" ("Вид нагляду, Тип установи(доповнення)")
	@FindBy(xpath = "(//div[contains(@id, 'unit5-actAsChargedPersonCard')]//input)[5]")
	private WebElement inputSuperAgencyTypeAdd;
	@FindBy (xpath = "//div[contains(@id, 'unit5-actAsChargedPersonCard')]/following-sibling::div//li[1]")
	private WebElement itemSuperAgencyTypeAdd;
	
	/*------------------Methods of Charged Person Page------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit5ChargedPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit5Charged));
		return this;
	}
	
	//Opens to review Card
	@Override
	public void doubleClickOnFirstRecordInGridOnMainTab() {
		Actions action = new Actions(driver);
		for (int i=0; i<3; ++i) {
			try{
				action.doubleClick(wait2.until(ExpectedConditions.visibilityOf(cellRegNumberInGridOnMainTab))).perform();
				break;
			}catch (WebDriverException e) {
				System.out.println("exception - there is no GRID");
			}
		}		
	}
	
	/*------------------Methods of Charged Person Card------------------------------------------------*/
		
	//Clicking on "Save"("Зберегти") button in Card
	@Override
	public void clickButtonSaveCard() {
		buttonSaveCard.click();
	}
	
	//Clicking on "Exit"("Вихід") button in Card
	@Override
	public void clickButtonExitFromCardForm() {
		buttonExitFromCard.click();
	}
	
	//Fills several fields in Document Card
	public Unit5ChargedPage setChargedCard(Unit5ChargedCard unit5ChargedCard) {
		type(inputName, unit5ChargedCard.name);
		type(inputPost, unit5ChargedCard.post);
		inputSuperAgencyTypeAdd.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'unit5-actAsChargedPersonCard')]/following-sibling::div//li[1]"))).click();
		return this;
	}
	
	//Fills Post field
	public void setInputPost(String someNewText) {
		type(inputPost, someNewText);
	}

	//Gets value from Name field in Charged Person Card
	public String getInputName() {
		return inputName.getAttribute("value");
	}
	
	//Gets value from Post field in Charged Person Card
	public String getInputPost() {
		return inputPost.getAttribute("value");
	}




}
