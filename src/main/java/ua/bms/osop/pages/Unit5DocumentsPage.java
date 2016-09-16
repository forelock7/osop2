package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
	
	/*
	 * Determines loading of Page
	 */
	public Unit5DocumentsPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit5Documents));
		return this;
	}
	
	/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

	//Title "List of Response Documents"("Перелік документів реагування");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Перелік документів реагування')]")
	private WebElement titleUnit5Documents;


	
	/*------------------The Web-Elements of the "Response Document" Card ------------------------------------------------------*/
	
	//Button "Save" ("Зберегти") for saving card
	@FindBy(xpath = "//div[contains(@id, 'unit5-actCard')]//span[contains(., 'Зберегти')]")
	private WebElement buttonSaveCard;
	
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
	
	//Input field "Document Content" ("Зміст документа")
	@FindBy(xpath = "(//div[contains(@id, 'unit5-actTabMain')]//textarea)[1]")
	private WebElement inputDocumentContent;
	
	
	/*-------------------------The Methods of the "Response Document" Card --------------------------*/
	
	//Clicking on "Save"("Зберегти") button in Card
	@Override
	public void clickButtonSaveCard() {
		buttonSaveCard.click();
	}
	
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
	
	

}
