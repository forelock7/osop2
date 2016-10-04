package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.bms.osop.model.Unit4CardModel;

public class Unit4InternationalCard extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit4InternationalCard(PageManager pages) {
		super(pages);
	}
	
	/*------------------The Web-Elements of the International Card------------------------------------------------------*/
	
	//Input field "Number of Claim" ("№ звернення")
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestTabMain')]//label[contains(., '№ звернення:')]/following-sibling::div//input")
	private WebElement inputClaimNumber;
	
	//Input field "Receipt Date" ("Дата надходження")
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestTabMain')]//label[contains(., 'Дата надходження:')]/following-sibling::div//input")
	private WebElement inputReceiptDate;
	
	//Input field "Type of Claim" ("Вид звернення")
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestTabMain')]//span[contains(., 'Вид звернення:')]")
	private WebElement inputClaimType;
	//First item of Type of Claim
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[contains(., 'Звернення (запит) іноземних установ')]") 
	private WebElement itemClaimType;
		
	//Input field "Type of legal assistance" ("Вид правової допомоги")
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestTabMain')]//span[contains(., 'Вид правової допомоги:')]")
	private WebElement inputLegalAssistType;
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[contains(., 'Виконання процесуальних дій')]")
	private WebElement itemLegalAssistType;
	
	//Input field "Summary" ("Стислий зміст")
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestTabMain')]//label[contains(., 'Стислий зміст:')]/following-sibling::div//textarea")
	private WebElement inputSummary;
	
	//Input field "Country Claim" ("Країна звернення")
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestTabMain')]//div[contains(@id, 'listcombo')]//a")
	private WebElement inputCountryClaim;
	@FindBy (xpath = "//div[contains(@id, 'listcombowindow')]//table[6]//td[3]//img")
	private WebElement itemCountryClaim;
		
	/*------------------Methods of International Card-------------------------------------------------------------*/
	
	//Sets the new card with filling all fields in
	public Unit4InternationalCard setCardUnit4(Unit4CardModel unit4CardModel){
		type(inputClaimNumber, unit4CardModel.claimNumber);
		type(inputReceiptDate, unit4CardModel.receiptDate);
		inputClaimType.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'boundlist')]//li[contains(., 'Звернення (запит) іноземних установ')]"))).click();
		inputLegalAssistType.click();
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'boundlist')]//li[contains(., 'Виконання процесуальних дій')]"))).click();
		inputCountryClaim.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'listcombowindow')]//table[6]//td[3]//img"))).click();
		type(inputSummary, unit4CardModel.summary);
		return this;
	}
		
	//Getting value from input-field "Claim Number" in formerly created card
	public String getInputClaimNumberUnit4() {
		return inputClaimNumber.getAttribute("value");
	}
	
	//Editing SOME field ("Summary" ("Стислий зміст"))
	public void setInputSummaryUnit4(String someText){
		type(inputSummary, someText);
	}
	
	//Getting existing value from input-field ("Summary" ("Стислий зміст"))
	public String getInputSummaryUnit4() {
		return inputSummary.getAttribute("value");
	}
}
