package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.bms.osop.model.Unit2ReleaseCardModel;

public class Unit2ReleaseCard extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2ReleaseCard(PageManager pages) {
		super(pages);
	}
	
	/*------------------The Web-Elements of the Card------------------------------------------------------*/
	
	//Input field "Department" ("ОДР, який здійснює досудове розслідування")
	@FindBy(xpath = "//div[contains(@id, 'unit23-releaseTabMain')]//span[contains(., 'ОДР')]")
	private WebElement inputDepartment;
	//First item of Type of Department
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[1]") 
	private WebElement itemDepartment;
	
	//Input field "Number of proceeding" ("Номер провадження")
	@FindBy(xpath = "//div[contains(@id, 'unit23-releaseTabMain')]//label[contains(., 'Номер провадження')]/following-sibling::div//input")
	private WebElement inputProceedingNumber;
	
	//Input field "Type of Release" ("Вид звільнення")
	@FindBy(xpath = "//div[contains(@id, 'unit23-releaseTabMain')]//span[contains(., 'Вид звільнення')]")
	private WebElement inputReleaseType;
	//First item of Type of Act
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[2]") 
	private WebElement itemReleaseType;
	
	//Input field "Result adjudication" ("Результат розгляду судом")
	@FindBy(xpath = "//div[contains(@id, 'unit23-releaseTabMain')]//span[contains(., 'Результат розгляду судом')]")
	private WebElement inputResultAdjudication;
	//First item of Type of Act
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[3]") 
	private WebElement itemResultAdjudication;
	
	//Input field "Number of case" ("Номер справи")
	@FindBy(xpath = "//div[contains(@id, 'unit23-releaseTabMain')]//label[contains(., 'Номер справи')]/following-sibling::div//input")
	private WebElement inputCaseNumber;
	
	//Input field "Date of the final procedural decision in relation CP persons" ("Дата прийняття остаточного процесуального рішення у КП стосовно особи")
	@FindBy(xpath = "(//div[contains(@id, 'unit23-releaseTabMain')]//input[contains(@id, 'datefield')])[1]")
	private WebElement inputFinalDecisionDate;
	
	/*------------------Methods of Act of the Card-------------------------------------------------------------*/
	
	//Sets the new card with filling all fields in
	public Unit2ReleaseCard setReleaseCardUnit2(Unit2ReleaseCardModel unit2ReleaseCardModel){
		inputDepartment.click();
		fluientWaitforElement(itemDepartment).click();
		type(inputProceedingNumber, unit2ReleaseCardModel.getProceedingNumber());
		inputReleaseType.click();
		fluientWaitforElement(itemReleaseType).click();
		type(inputCaseNumber, unit2ReleaseCardModel.getProceedingNumber());
		type(inputFinalDecisionDate, unit2ReleaseCardModel.getFinalDecisionDate());
		return this;
	}
		
	//Getting value from input-field "Proceeding Number" in formerly created card
	public String getInputProceedingNumber() {
		return inputProceedingNumber.getAttribute("value");
	}
	
	//Editing SOME field "Number of case" ("Номер справи")
	public void setInputCaseNumber(String someText){
		type(inputCaseNumber, someText);
	}
	
	//Getting existing value from input-field "Number of case" ("Номер справи")
	public String getInputCaseNumber() {
		return inputCaseNumber.getAttribute("value");
	}

}
