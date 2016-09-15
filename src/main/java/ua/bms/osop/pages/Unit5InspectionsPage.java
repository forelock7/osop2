package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
	
	/*
	 * Determines loading of Page
	 */
	public Unit5InspectionsPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit5Inspection));
		return this;
	}
	
	/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

	//Title "List Inspections"("Перелік перевірок")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Перелік перевірок')]")
	private WebElement titleUnit5Inspection;

	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//table[1]//td[13]/div")
	WebElement buttonEdit;
	
	/*------------------The Web-Elements of the Card------------------------------------------------------*/
	
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
	
	/*------------------Methods---------------------------------------------------------------------------*/

	//Sets the new card with filling all fields in
	public Unit5InspectionsPage setInspectionCardUnit5(Unit5InspectionCard unit5InspectionCard) {
		type(inputInspectionDate, unit5InspectionCard.inspectionDate);
		setAgencyName();
		type(inputAgencyName, unit5InspectionCard.agencyName);
		return this;
	}
	
	//Sets field "Agency Name"
	private void setAgencyName() {
		inputSuperAgencyType.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'boundlist')]//li[1]"))).click();
		inputSuperAgencyType.sendKeys(Keys.ESCAPE);
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditInspectionCardUnit5() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonEdit)).click();
	}
	
	//Getting value from input-field "Claim Number" in formerly created card
	public String getInputAgencyNameUnit5() {
		return inputAgencyName.getAttribute("value");
	}
	
}
