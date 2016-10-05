package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.bms.osop.model.Unit2ActOACardModel;

public class Unit2ActOACard extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2ActOACard(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of the Card----------------------------------------------------*/
	
	//Input field "Result of Supervision" ("Результат нагляду")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actORDTabMain')]//span[contains(., 'Результат нагляду')]")
	private WebElement inputSupervisionResult;
	//First item of "Result of Supervision"
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[1]") 
	private WebElement itemSupervisionResult;
	
	//Input field "Law Enforcement" ("Правоохоронні органи")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actORDTabMain')]//span[contains(., 'Правоохоронні органи')]")
	private WebElement inputLawEnforcement;
	//First item of "Law Enforcement"
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[2]") 
	private WebElement itemLawEnforcement;
	
	//Input field "Date of Decision" ("Дата  прийняття рішення")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actORDTabMain')]/div[3]//input[contains(@id, 'datefield')]")
	private WebElement inputDecisionDate;
	
	//Input field "Amount of Checked OAC" ("Кількість перевірених ОРС")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actORDTabMain')]//label[contains(., 'Кількість перевірених')]/following-sibling::div//input")
	private WebElement inputAmountOfChecked;
	
	/*------------------Methods of Act of Pre-Investigation  Card-------------------------------------------------------------*/
	
	//Sets the new card with filling all fields in
	public Unit2ActOACard setActOACardUnit2(Unit2ActOACardModel unit2ActOACardModel){
		inputSupervisionResult.click();
		fluientWaitforElement(itemSupervisionResult).click();
		inputLawEnforcement.click();
		fluientWaitforElement(itemLawEnforcement).click();
		type(inputDecisionDate, unit2ActOACardModel.getDecisionDate());
		type(inputAmountOfChecked, unit2ActOACardModel.getAmountOfChecked());
		return this;
	}
		
	//Getting value from input-field "Amount of Checked OAC" ("Кількість перевірених ОРС") in formerly created card
	public String getInputAmountOfChecked() {
		return inputAmountOfChecked.getAttribute("value");
	}
	
	//Editing SOME field "Amount of Checked OAC" ("Кількість перевірених ОРС")
	public void setInputAmountOfChecked(String someText){
		type(inputAmountOfChecked, someText);
	}

}
