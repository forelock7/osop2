package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.bms.osop.model.Unit8CardModel;

public class Unit8RequestCard extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit8RequestCard(PageManager pages) {
		super(pages);
	}
	
	/*------------------The Web-Elements of the Request Card------------------------------------------------------*/
	
	//Input field "Number of Request" ("№ запиту")
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimTabMain')]//label[contains(., '№ запиту:')]/following-sibling::div//input")
	private WebElement inputRequestNumber;
	
	//Input field "Requesters of Information" ("Запитувачі інформації")
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimTabMain')]//span[contains(., 'Запитувачі інформації:')]")
	private WebElement inputRequesters;
	//First item of Requesters of Information - Individuals
	@FindBy (xpath = "//div[contains(@id, 'treepanel')]//span[contains(., 'Фізичні особи')]")/*table[1]*/
	private WebElement itemRequester;
	
	//Input field "Request received" ("Запит отримано")
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimTabMain')]//span[contains(., 'Запит отримано:')]")
	private WebElement inputRequestReceived;
	//First item of "Request received" - writing
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[1]") 
	private WebElement itemRequestReceived;
	
	//Input field "Receipt Date" ("Дата надходження")
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimTabMain')]//label[contains(., 'Дата надходження:')]/following-sibling::div//input")
	private WebElement inputReceiptDate;
	
	//Input field "Specificity of Request" ("Характер запиту")
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimTabMain')]//span[text() = 'Характер запиту:']")
	private WebElement inputRequestSpecificity;
	//First item of "Specificity of Request"
	@FindBy (xpath = "//div[contains(@id, 'treepanel')]//span[contains(., 'З питань досудового розслідування')]") 
	private WebElement itemRequestSpecificity;
	
	//Input field "Summary" ("Стислий зміст")
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimTabMain')]//textarea")
	private WebElement inputSummary;
	
	/*------------------Methods of Request Card---------------------------------------------------------------------------*/
	
	//Setting the new card with filling all fields in
	public Unit8RequestCard setCardUnit8(Unit8CardModel unit8CardModel){
		type(inputRequestNumber, unit8CardModel.requestNumber);
		inputRequesters.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'treepanel')]//span[contains(., 'Фізичні особи')]"))).click();
		inputRequestReceived.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'boundlist')]//li[1]"))).click();
		type(inputReceiptDate, unit8CardModel.receiptDate);
		inputRequestSpecificity.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'treepanel')]//span[contains(., 'З питань досудового розслідування')]"))).click();
		type(inputSummary, unit8CardModel.summary);
		return this;
	}
	
	//Editing SOME field ("Summary" ("Стислий зміст"))
	public void setInputSummaryUnit8(String someText){
		type(inputSummary, someText);
	}
		
	//Getting value from input-field "Request Number" in formerly created card
	public String getInputRequestNumberUnit8() {
		return inputRequestNumber.getAttribute("value");
	}
		
	//Getting existing value from input-field ("Summary" ("Стислий зміст"))
	public String getInputSummaryUnit8() {
		return inputSummary.getAttribute("value");
	}
}
