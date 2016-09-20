package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.bms.osop.model.Unit5DocumentCard;

/*
 * Declare all Web-elements on Unit 5 "Supervision of the observance of laws in the execution of judgments."
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 2 - "List of Response Documents"("Перелік документів реагування");
 * and the main methods with them
 */
public class Unit5DocumentsPage  extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit5DocumentsPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of "Response Document" Page----------------------------------------------------*/

	//Title "List of Response Documents"("Перелік документів реагування");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Перелік документів реагування')]")
	private WebElement titleUnit5Documents;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-16).
	@FindBy(xpath = "//div[contains(@id, 'unit5-actGridDeleted')]//table[1]//td[16]/div/img")
	private WebElement buttonRestore;
	
	/*------------------The Web-Elements of the "Response Document" Card ------------------------------------------------------*/
	
	//Button "Save" ("Зберегти") for saving card
	@FindBy(xpath = "//div[contains(@id, 'unit5-actCard')]//span[contains(., 'Зберегти')]")
	private WebElement buttonSaveCard;
	
	//Button "Exit" ("Вихід") for exit from card
	@FindBy (xpath = "//div[contains(@id, 'unit5-actCard')]//span[contains(., 'Вихід')]")
	private WebElement buttonExitFromCard;
	
	//Input field "Type of Document" ("Вид документа")
	@FindBy(xpath = "//div[contains(@id, 'unit5-actTabMain')]//span[contains(., 'Вид документа')]")
	private WebElement inputDocumentType;
	//First item of Type of Document
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[1]") 
	private WebElement itemDocumentType;
	
	//Input field "Type of Supervision, Type of Agency" ("Вид нагляду, Тип установи(для звіту)")
	@FindBy(xpath = "//div[contains(@id, 'unit5-actTabMain')]/div[4]//span[contains(., 'Вид нагляду')]")
	private WebElement inputSuperAgencyTypeReport;
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[2]")
	private WebElement itemSuperAgencyTypeReport;
	
	//Input field "Type of Supervision, Type of Agency" ("Вид нагляду, Тип установи(доповнення)")
	@FindBy(xpath = "//div[contains(@id, 'unit5-actTabMain')]/div[5]//span[contains(., 'Вид нагляду')]")
	private WebElement inputSuperAgencyTypeAdd;
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[3]")
	private WebElement itemSuperAgencyTypeAdd;
	
	//Button "Add" for adding Charged Person into Grid
	@FindBy (xpath = "//div[contains(@id, 'unit5-actAsChargedPersonGrid')]//a[contains(@id, 'button')]")
	private WebElement buttonAddChargedPerson;
	
	//First record in Charged Person Grid
	@FindBy (xpath = "//div[contains(@id, 'unit5-actAsChargedPersonGrid')]//table[1]//td[2]/div")
	private WebElement firstRecordInChargedGrid;
	
	//Button "Edit" in Charged Person Grid
	@FindBy (xpath = "//div[contains(@id, 'unit5-actAsChargedPersonGrid')]//table[1]//td[7]//img")
	private WebElement inputButtonEditChargedGrid;
	
	//Column "Name" in Charged Person Grid
	@FindBy (xpath = "//div[contains(@id, 'unit5-actAsChargedPersonGrid')]//table[1]//td[2]/div")
	private WebElement cellNameChargedGrid;
	
	//Input field "Document Content" ("Зміст документа")
	@FindBy(xpath = "(//div[contains(@id, 'unit5-actTabMain')]//textarea)[1]")
	private WebElement inputDocumentContent;
	
	/*-------------------------The Methods of the "Response Document" Page --------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit5DocumentsPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit5Documents));
		return this;
	}
	
	public void restoreCardFromGrid(Unit5DocumentCard unit5DocumentCard) {
		buttonRestore.click();
		unit5DocumentCard.regNumberRestoredCard = confirmRestoring();
	}
	
	/*-------------------------The Methods of the "Response Document" Card --------------------------*/
	
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
	
	//Click button "Add" in "Charged Person" grid
	public void clickButtonAddChargedPerson() {
		buttonAddChargedPerson.click();
	}
	
	//Clicks on the first record in Charged Person Grid
	public void clickOnFirstRecordInChargedGrid() {
		Actions actionCh = new Actions(driver);
		for (int i=0; i<3; ++i) {
			try{
				actionCh.doubleClick(wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id, 'unit5-actAsChargedPersonGrid')]//table[1]//td[2]/div")))).perform();
				break;
			}catch (WebDriverException e) {
				System.out.println("exception - there is no GRID");
			}
		}
	}
	
	//Fills several fields in Document Card
	public Unit5DocumentsPage setDocumentCard(Unit5DocumentCard unit5DocumentCard) {
		inputDocumentType.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@id, 'boundlist')]//li[1])[1]"))).click();
		setSuperAgencyTypeReport();
		setSuperAgencyTypeAdd();
		type(inputDocumentContent, unit5DocumentCard.documentContent);
		return this;
	}
	
	//Sets field "Type of Supervision, Type of Agency(for report)" ("Вид нагляду, Тип установи(для звіту)")
	private void setSuperAgencyTypeReport() {
		inputSuperAgencyTypeReport.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@id, 'boundlist')]//li[1])[2]"))).click();
		inputSuperAgencyTypeReport.sendKeys(Keys.ESCAPE);
	}
	
	//Sets field "Type of Supervision, Type of Agency(additional)" ("Вид нагляду, Тип установи(доповнення)")
	private void setSuperAgencyTypeAdd() {
		inputSuperAgencyTypeAdd.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@id, 'boundlist')]//li[1])[3]"))).click();
		inputSuperAgencyTypeAdd.sendKeys(Keys.ESCAPE);
	}
	
	public void setInputContentDocument(String someNewText) {
		type(inputDocumentContent, someNewText);
	}
	
	public String getInputContentDocument() {
		return wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@id, 'unit5-actTabMain')]//textarea)[1]"))).getAttribute("value");
	}

	public void clickButtonEditChargedGrid() {
		inputButtonEditChargedGrid.click();
		
	}

	public String getNameFromChargedPersonGrid() {
		return  wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id, 'unit5-actAsChargedPersonGrid')]//table[1]//td[2]/div"))).getText();
	}




}
