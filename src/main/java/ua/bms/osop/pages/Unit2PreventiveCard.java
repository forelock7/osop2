package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.bms.osop.model.Unit2PreventiveCardModel;

public class Unit2PreventiveCard extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2PreventiveCard(PageManager pages) {
		super(pages);
	}
	
	/*------------------The Web-Elements of the Prevent Card------------------------------------------------------*/
	
	//Input field "Preventive Action" ("Запобіжний захід")
	@FindBy(xpath = "//div[contains(@id, 'unit23-preventiveActionTabMain')]//span[contains(., 'Запобіжний захід')]")
	private WebElement inputActType;
	//First item of Type of Act
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[1]") 
	private WebElement itemActType;
	
	//Input field "Department" ("ОДР, який здійснює досудове розслідування")
	@FindBy(xpath = "//div[contains(@id, 'unit23-preventiveActionTabMain')]//span[contains(., 'ОДР')]")
	private WebElement inputDepartment;
	//First item of Type of Act
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[2]") 
	private WebElement itemDepartment;
	
	//Input field "Number of proceeding / case" ("Номер провадження / справи")
	@FindBy(xpath = "//div[contains(@id, 'unit23-preventiveActionTabMain')]//label[contains(., 'Номер провадження')]/following-sibling::div//input")
	private WebElement inputProceedingNumber;
	
	//Input field "Qualification of offense/crime" ("Кваліфікація правопорушення / злочину")
	@FindBy(xpath = "//div[contains(@id, 'unit23-preventiveActionTabMain')]//label[contains(., 'Кваліфікація правопорушення')]/following-sibling::div//input")
	private WebElement inputOffenseQualification;
	
	//Input field "Date of pretrial investigation beginning" ("Дата  початку досудового розслідування:")
	@FindBy(xpath = "(//div[contains(@id, 'unit23-preventiveActionTabMain')]//input[contains(@id, 'datefield')])[1]")
	private WebElement inputInvestigationBeginDate;
	
	//Input field "Last Name" ("Прізвище")
	@FindBy(xpath = "//div[contains(@id, 'unit23-preventiveActionTabMain')]//label[contains(., 'Прізвище')]/following-sibling::div//input")
	private WebElement inputLastName;
	
	//Input field "Last Name" ("Ім'я")
	@FindBy(xpath = "//div[contains(@id, 'unit23-preventiveActionTabMain')]//label[contains(., 'Ім')]/following-sibling::div//input")
	private WebElement inputFirstName;
	
	//Input field "Birthday" ("Дата народження")
	@FindBy(xpath = "(//div[contains(@id, 'unit23-preventiveActionTabMain')]//input[contains(@id, 'datefield')])[2]")
	private WebElement inputBirthday;
	
	/*------------------Methods of Act of Prevetive Card-------------------------------------------------------------*/
	
	//Sets the new card with filling all fields in
	public Unit2PreventiveCard setPreventiveCardUnit2(Unit2PreventiveCardModel unit2PreventiveCardModel){
		inputActType.click();
		fluientWaitforElement(itemActType).click();
		inputDepartment.click();
		fluientWaitforElement(itemDepartment).click();
		type(inputProceedingNumber, unit2PreventiveCardModel.getProceedingNumber());
		type(inputOffenseQualification, unit2PreventiveCardModel.getOffenseQualification());
		type(inputInvestigationBeginDate, unit2PreventiveCardModel.getInvestigationBeginDate());
		type(inputLastName, unit2PreventiveCardModel.getLastName());
		type(inputFirstName, unit2PreventiveCardModel.getFirstName());
		type(inputBirthday, unit2PreventiveCardModel.getBirthday());
		return this;
	}
		
	//Getting value from input-field "Proceeding Number" in formerly created card
	public String getInputProceedingNumber() {
		return inputProceedingNumber.getAttribute("value");
	}
	
	//Editing SOME field "Qualification of offense/crime" ("Кваліфікація правопорушення / злочину")
	public void setInputOffenseQualification(String someText){
		type(inputOffenseQualification, someText);
	}
	
	//Getting existing value from input-field "Qualification of offense/crime" ("Кваліфікація правопорушення / злочину")
	public String getInputOffenseQualification() {
		return inputOffenseQualification.getAttribute("value");
	}
	
}
