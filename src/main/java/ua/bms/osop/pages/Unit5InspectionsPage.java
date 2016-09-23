package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit5DocumentCard;
import ua.bms.osop.model.Unit5InspectionCard;

/*
 * Declare all Web-elements on Unit 5 "Supervision of the observance of laws in the execution of judgments."
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 1 - "List Inspections"("Перелік перевірок");
 * and the main methods with them
 */
public class Unit5InspectionsPage extends AnyPage {
		
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit5InspectionsPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Inspection Page----------------------------------------------------*/

	//Title "List Inspections"("Перелік перевірок")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Перелік перевірок')]")
	private WebElement titleUnit5InspectionPage;

	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//table[1]//td[13]/div/img")
	WebElement buttonEdit;
	
	//Button "Remove"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-14).
	@FindBy(xpath = "//table[1]//td[14]/div/img")
	WebElement buttonRemove;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//div[contains(@id, 'unit5-inspectionGridDeleted')]//table[1]//td[13]/div/img")
	private WebElement buttonRestore;
	
	/*------------------The Web-Elements of the Inspection Card on "Basic Statements" Tab------------------------------------------------------*/
	
	//Title Card "Inspection"("Перевірка")
	@FindBy(xpath = "//div[contains(@id, 'unit5-inspectionCard')]//div[contains(., 'Перевірка')]")
	private WebElement titleUnit5InspectionCard;
	
	//Tab "Response Documents"("Документи реагування")
	@FindBy(xpath = "//div[contains(@id, 'unit5-inspectionCard')]//div[contains(@id, 'tabbar')]/a[2]")
	private WebElement tabResponseDocuments;
	
	//Input field "InspectionDate" ("Дата проведення перевірки")
	@FindBy(xpath = "//div[contains(@id, 'unit5-inspectionTabMain')]//label[contains(., 'Дата проведення перевірки:')]/following-sibling::div//input")
	private WebElement inputInspectionDate;
	
	//Input field "Type of Supervision, Type of Agency" ("Вид нагляду, Тип установи")
	@FindBy(xpath = "//div[contains(@id, 'unit5-inspectionTabMain')]//span[contains(., 'Вид нагляду')]")
	private WebElement inputSuperAgencyType;
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[1]")
	private WebElement itemSuperAgencyType;
	
	//Input field "Agency Name" ("Назва відомстваб організації, установи")
	@FindBy(xpath = "//div[contains(@id, 'unit5-inspectionTabMain')]//label[contains(., 'Назва відомства')]/following-sibling::div//input")
	private WebElement inputAgencyName;
	
	/*-----------------The Web-Elements of the "Inspection" Card on "Response Documents" Tab-------------*/
	
	//Tab "Basic Statements"("Основні відомості")
	@FindBy(xpath = "//div[contains(@id, 'unit5-inspectionCard')]//div[contains(@id, 'tabbar')]/a[1]")
	private WebElement tabBasicStatements;
	
	//Button "Create" for creating a new response document
	@FindBy(xpath = "//div[contains(@id, 'unit5-actGrid')]//span[contains(text(), 'Створити')]")
	private WebElement buttonCreateResponseDocument;
	
	//Button "Refresh" on paging toolbar
	@FindBy(xpath = "//div[contains(@id, 'unit5-actGrid')]//div[contains(@id, 'pagingtoolbar')]/a[5]")
	private WebElement buttonRefreshToolbarCard;
	
	//Record of Response Document Grid (row-1; column-2).
	@FindBy(xpath = "//div[contains(@id, 'unit5-actGrid')]//tr[1]/td[2]/div")
	private WebElement firstRecordInGrid;
	
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the "Response Documents" Tab in "Inspection" Card(row-1; column-13).
	@FindBy(xpath = "//div[contains(@id, 'unit5-actGrid')]//table[1]//td[13]/div/img")
	WebElement buttonEditDocTab;
	
	//Button "Remove"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-14).
	@FindBy(xpath = "//div[contains(@id, 'unit5-actGrid')]//table[1]//td[14]/div/img")
	WebElement buttonRemoveDocTab;
	
	/*------------------Methods of Inspection Page---------------------------------------------------------------------------*/
	
	
	/* Determines loading of Page */
	public Unit5InspectionsPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit5InspectionPage));
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditInspectionCardUnit5() throws InterruptedException {
		for (int i=0; i<10; ++i) {
			try{
				Thread.sleep(1000);
				wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[1]//td[13]/div/img"))).click();
				//buttonEdit.click();
				break;
			}catch (WebDriverException e) {
				System.out.println("exception - Button EDIT is unable");
			}
		}
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeInspectionCardFromGridUnit5(Unit5InspectionCard unit5InspectionCard) {
		buttonRemove.click();
		unit5InspectionCard.regNumberRemovedCard = super.confirmationOfRemoving();
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGridUnit5(Unit5InspectionCard unit5InspectionCard) {
		buttonRestore.click();
		unit5InspectionCard.regNumberRestoredCard = confirmRestoring();
	}
	
	/*-----------------Methods of Inspection Card on Basic Statements---------------------------------------------------------*/
	
	//Click on "Response Documents" Tab in "Inspection" Card
	public void clickOnResponseDocumentsTab() {
		/*Actions actionDoc = new Actions(driver);
		for (int i=0; i<3; ++i) {
			try{
				actionDoc.doubleClick(wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id, 'unit5-actGrid')]//tr[1]/td[2]/div")))).perform();
				break;
			}catch (WebDriverException e) {
				System.out.println("exception - there is no GRID");
			}
		}*/
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'unit5-inspectionCard')]//div[contains(@id, 'tabbar')]/a[2]"))).click();
	}
	
	//Sets the new card with filling all fields in
	public Unit5InspectionsPage setInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard) {
		type(inputInspectionDate, unit5InspectionCard.inspectionDate);
		setSuperAgencyType();
		setInputAgencyNameUnit5(unit5InspectionCard.agencyName);
		return this;
	}
	
	//Sets field "Type of Supervision, Type of Agency" ("Вид нагляду, Тип установи")
	private void setSuperAgencyType() {
		inputSuperAgencyType.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'boundlist')]//li[1]"))).click();
		inputSuperAgencyType.sendKeys(Keys.ESCAPE);
	}
		
	//Getting value from input-field "Agency Name" in formerly created card
	public String getInputAgencyNameUnit5() {
		return inputAgencyName.getAttribute("value");
	}

	//Editing SOME - Input field "Agency Name" ("Назва відомстваб організації, установи")
	public void setInputAgencyNameUnit5(String someNewText) {
		type(inputAgencyName, someNewText);
	}
	
	//Checks if Title of Inspection Card exists
	public boolean isTitleOfCardIsPresent() {
		return isElementPresent(titleUnit5InspectionCard);
	}
	
/*------------------Methods of Inspection Card on "Response Documents"----------------------------------*/
	
	//Click on "Basic Statements"("Основні відомості") Tab in "Inspection" Card
	public void clickOnBasicStatementsTab() {
		tabBasicStatements.click();
	}
	
	//Clicks on "Create" for initialize creating Response Document Card
	public void clickButtonCreateDocumentCard() {
		buttonCreateResponseDocument.click();
	}
	
	//Clicks button "Edit" in Response Document's Grid
	public void clickButtonEditDocInInspectionCardUnit5() {
		buttonEditDocTab.click();
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeDocumentCardFormInspectionCard(Unit5DocumentCard unit5DocumentCard) {
		buttonRemoveDocTab.click();
		unit5DocumentCard.regNumberRemovedCard = super.confirmationOfRemoving();
	}
	
	//Checks if button "Create" is present on "Response Documents" tab in "Inspection" Card
	public boolean isCreateButtonPresent() {
		return isElementPresent(buttonCreateResponseDocument);
	}

	//Checks if button "Refresh" is present on "Response Documents" tab in "Inspection" Card
	public boolean isRefreshPagingToolbarIsPresent() {
		return isElementPresent(buttonRefreshToolbarCard);
	}

	public void clickOnFirstRecordInDocumentGrid() {
		Actions actionDoc = new Actions(driver);
		for (int i=0; i<3; ++i) {
			try{
				actionDoc.doubleClick(wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id, 'unit5-actGrid')]//tr[1]/td[2]/div")))).perform();
				break;
			}catch (WebDriverException e) {
				System.out.println("exception - there is no GRID");
			}
		}		
	}

}
