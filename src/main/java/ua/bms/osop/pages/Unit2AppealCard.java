package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.bms.osop.model.Unit2AppealCardModel;

public class Unit2AppealCard extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2AppealCard(PageManager pages) {
		super(pages);
	}
	
	/*------------------The Web-Elements of the Appeal Card------------------------------------------------------*/
	
	//Field "Registration Number"("Реєстраційний №")
	@FindBy(xpath = "//div[contains(@id, 'unit23-appealDRTabMain')]//label[contains(., 'Реєстраційний')]/following-sibling::div//input")
	private WebElement fieldRegistrationNumber;
	
	//Input field "Type of Complaint" ("Тип скарги")
	@FindBy(xpath = "//div[contains(@id, 'unit23-appealDRTabMain')]//span[contains(., 'Тип скарги')]")
	private WebElement inputComplaintType;
	//Third item of Type of Complaint
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[3])[1]") 
	private WebElement itemComplaintType;
	
	//Input field "Department of Pretrial Investigation" ("Орган досудового розслідування")
	@FindBy(xpath = "//div[contains(@id, 'unit23-appealDRTabMain')]//span[contains(., 'Орган досудового розслідування')]")
	private WebElement inputInvestDepartment;
	//First item of Type of Act
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[2]") 
	private WebElement itemInvestDepartment;
	
	//Input field "Number of proceeding / case" ("Номер провадження / справи")
	@FindBy(xpath = "//div[contains(@id, 'unit23-appealDRTabMain')]//label[contains(., 'Номер провадження')]/following-sibling::div//input")
	private WebElement inputProceedingNumber;
	
	//Input field "Qualification of offense/crime" ("Кваліфікація правопорушення / злочину")
	@FindBy(xpath = "//div[contains(@id, 'unit23-appealDRTabMain')]//label[contains(., 'Кваліфікація правопорушення')]/following-sibling::div//input")
	private WebElement inputOffenseQualification;
	
	//Input field "Name suspected person" ("ПІБ підозрюваного / обвинуваченого")
	@FindBy(xpath = "//div[contains(@id, 'unit23-appealDRTabMain')]//label[contains(., 'ПІБ підозрюваного')]/following-sibling::div//input")
	private WebElement inputSuspectedName;
	
	//Input field "Grounds for Appeal" ("Підстави для оскарження")
	@FindBy(xpath = "//div[contains(@id, 'unit23-appealDRTabMain')]//label[contains(., 'Підстави для оскарження')]/following-sibling::div//input")
	private WebElement inputGroundsForAppeal;
	
	/*------------------Methods of Act of Pre-Investigation  Card-------------------------------------------------------------*/
	
	//Sets the new card with filling all fields in
	public Unit2AppealCard setAppealCardUnit2(Unit2AppealCardModel unit2AppealCardModel){
		inputComplaintType.click();
		fluientWaitforElement(itemComplaintType).click();
		inputInvestDepartment.click();
		fluientWaitforElement(itemInvestDepartment).click();
		type(inputProceedingNumber, unit2AppealCardModel.getProceedingNumber());
		type(inputOffenseQualification, unit2AppealCardModel.getOffenseQualification());
		type(inputSuspectedName, unit2AppealCardModel.getSuspectedName());
		type(inputGroundsForAppeal, unit2AppealCardModel.getGroundsForAppeal());
		return this;
	}
	
	//Getting value from field "Registration Number" in formerly created card
	public String getValueRegistrationNumber() {
		return fieldRegistrationNumber.getAttribute("value");
	}
		
	//Getting value from input-field "Proceeding Number" in formerly created card
	public String getInputProceedingNumber() {
		return inputProceedingNumber.getAttribute("value");
	}
	
	//Editing SOME field ("Grounds For Appeal" ("Підстави для оскарження"))
	public void setInputGroundsForAppeal(String someText){
		type(inputGroundsForAppeal, someText);
	}
	
	//Getting existing value from input-field ("Grounds For Appeal" ("Підстави для оскарження"))
	public String getInputGroundsForAppeal() {
		return inputGroundsForAppeal.getAttribute("value");
	}

}
