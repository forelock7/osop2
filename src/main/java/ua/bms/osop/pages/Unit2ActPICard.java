package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.bms.osop.model.Unit2ActPICardModel;

public class Unit2ActPICard extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2ActPICard(PageManager pages) {
		super(pages);
	}
	
	/*------------------The Web-Elements of the Pre-Investigation Act Card------------------------------------------------------*/
	
	//Input field "Type of Act" ("Вид акту")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actDRTabMain')]//span[contains(., 'Вид акту')]")
	private WebElement inputActType;
	//First item of Type of Act
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[1]") 
	private WebElement itemActType;
	
	//Input field "Number of proceeding / case" ("Номер провадження / справи")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actDRTabMain')]//label[contains(., 'Номер провадження')]/following-sibling::div//input")
	private WebElement inputProceedingNumber;
	
	//Input field "Qualification of offense/crime" ("Кваліфікація правопорушення / злочину")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actDRTabMain')]//label[contains(., 'Кваліфікація правопорушення')]/following-sibling::div//input")
	private WebElement inputOffenseQualification;
	
	//Input field "Department" ("Орган, яким укрито від обліку")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actDRTabMain')]//span[contains(., 'Орган')]")
	private WebElement inputDepartment;
	//First item of Type of Act
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[2]") 
	private WebElement itemDepartment;
	
	//Input field "Date of pretrial investigation beginning" ("Дата  початку досудового розслідування:")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actDRTabMain')]/div[5]//input[contains(@id, 'datefield')]")
	private WebElement inputInvestigationBeginDate;
	
	//Input field "Content(story)" ("Зміст(Фабула)")
	@FindBy(xpath = "(//div[contains(@id, 'unit23-actDRTabMain')]//textarea)[1]")
	private WebElement inputContent;
	
	/*------------------Methods of Act of Pre-Investigation  Card-------------------------------------------------------------*/
	
	//Sets the new card with filling all fields in
	public Unit2ActPICard setActPICardUnit2(Unit2ActPICardModel unit2ActPICardModel){
		inputActType.click();
		fluientWaitforElement(itemActType).click();
		type(inputProceedingNumber, unit2ActPICardModel.getProceedingNumber());
		type(inputOffenseQualification, unit2ActPICardModel.getOffenseQualification());
		inputDepartment.click();
		fluientWaitforElement(itemDepartment).click();
		type(inputInvestigationBeginDate, unit2ActPICardModel.getInvestigationBeginDate());
		type(inputContent, unit2ActPICardModel.getContent());
		return this;
	}
		
	//Getting value from input-field "Proceeding Number" in formerly created card
	public String getInputProceedingNumber() {
		return inputProceedingNumber.getAttribute("value");
	}
	
	//Editing SOME field ("Content(story)" ("Зміст(фабула)"))
	public void setInputContent(String someText){
		type(inputContent, someText);
	}
	
	//Getting existing value from input-field ("Summary" ("Стислий зміст"))
	public String getInputContent() {
		return inputContent.getAttribute("value");
	}
	
}
