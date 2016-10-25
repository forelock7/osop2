package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ua.bms.osop.model.Unit2AppealCardModel;
import ua.bms.osop.model.Unit2PreventiveCardModel;

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
	
	//Button "Add"("Додати") reference to Preventive Card
	@FindBy (xpath = "//div[contains(@id, 'unit23-appealDRAsPreventiveActionGrid')]//span[contains(@id, 'button')]")
	private WebElement buttonAddReference;
	
	//Cell "Registration Number" in first record of Order Preventive Card Grid
	@FindBy(xpath = "//div[contains(@id, 'unit23-appealDRAsPreventiveActionCard')]//table[1]//td[2]/div")
	private WebElement cellRegNumberInOrderPreventiveGrid;
	
	//Cell "Registration Number" in first record of Preventive Card Grid
	@FindBy(xpath = "//div[contains(@id, 'unit23-appealDRAsPreventiveActionGrid')]//table[1]//td[2]/div")
	private WebElement cellRegNumberInPreventiveGrid;
	
	/*------------------Methods of Act of Appeal Card-------------------------------------------------------------*/
	
	//Sets the new card with filling all fields in
	public Unit2AppealCard setRequiredFieldOfCardUnit2(Unit2AppealCardModel unit2AppealCardModel){
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
	
	//Clicks button "Add" for adding reference to Preventive Card
	public void clickButtonAddReference() {
		buttonAddReference.click();
	}
	
	//Opens to review Card
	public void doubleClickOnFirstRecordInOrderGrid() {
		Actions action = new Actions(driver);
		action.doubleClick(fluientWaitforElement(cellRegNumberInOrderPreventiveGrid)).perform();
	}
		
	//Editing SOME field ("Grounds For Appeal" ("Підстави для оскарження"))
	public void setInputGroundsForAppeal(String someText){
		type(inputGroundsForAppeal, someText);
	}
	
	//Gets Registration Number of added Preventive Card
	public String getRegistrationNumberInPreventiveGrid() {
		return cellRegNumberInPreventiveGrid.getText();
	}
	
	//Gets Registration Number of Preventive Card will be added
	public void getRegistrationNumberFirstRecordInOrderGrid(Unit2PreventiveCardModel unit2PreventiveCardModel) {
		unit2PreventiveCardModel.setRegistrationNumber(cellRegNumberInOrderPreventiveGrid.getText());
	}
		
	//Getting value from field "Registration Number" in formerly created card
	public String getValueRegistrationNumber() {
		return fieldRegistrationNumber.getAttribute("value");
	}
		
	//Getting value from input-field "Proceeding Number" in formerly created card
	public String getInputProceedingNumber() {
		return inputProceedingNumber.getAttribute("value");
	}
	
	//Getting existing value from input-field ("Grounds For Appeal" ("Підстави для оскарження"))
	public String getInputGroundsForAppeal() {
		return inputGroundsForAppeal.getAttribute("value");
	}

}
