package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.bms.osop.model.Unit1CriminalCardModel;

public class Unit1CriminalCard extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit1CriminalCard(PageManager pages) {
		super(pages);
	}
	
	/*------------------------The Web-Elements of Crime Card----------------------------------------------------*/
	
	//Input field "Number of Criminal Proceeding" ("Номер кримінального провадження")
	@FindBy(xpath = "//div[contains(@id, 'unit1-crimeTabMain')]//label[contains(., 'Номер кримінального провадження')]/following-sibling::div//input")
	private WebElement inputCriminalProceedingNumber;
	
	//Input field "Date of Registration" ("Дата реєстрації")
	@FindBy(xpath = "//div[contains(@id, 'unit1-crimeTabMain')]/div[1]//input[contains(@id, 'datefield')]")
	private WebElement inputRegistrationDate;
	
	//Input field "Section of Law-book" ("Статті КК України за ознаками яких розпочато кримінальне провадження")
	@FindBy(xpath = "//div[contains(@id, 'unit1-crimeTabMain')]//div[1]/div[5]//input")
	private WebElement inputSection;
	
	//Input field "Theory" ("Фабула")
	@FindBy(xpath = "//div[contains(@id, 'unit1-crimeTabMain')]//div[3]//textarea")
	private WebElement inputTheory;
	
	/*------------------------Methods of Crime Card-------------------------------------------------------------*/
	
	//Sets the new card with filling all fields in
	public Unit1CriminalCard setCriminalCardUnit1(Unit1CriminalCardModel unit1CriminalCardModel){
		type(inputCriminalProceedingNumber, unit1CriminalCardModel.getCriminalProceedingNumber());
		type(inputRegistrationDate, unit1CriminalCardModel.getRegistrationDate());
		type(inputSection, unit1CriminalCardModel.getSection());
		type(inputTheory, unit1CriminalCardModel.getTheory());
		return this;
	}
		
	//Getting value from input-field "Criminal Proceeding Number" in formerly created card
	public String getInputCriminalProceedingNumber() {
		return inputCriminalProceedingNumber.getAttribute("value");
	}
	
	//Editing SOME field ("Theory" ("Фабула"))
	public void setInputTheory(String someText){
		type(inputTheory, someText);
	}
	
	//Getting existing value from input-field ("Theory" ("Фабула"))
	public String getInputTheory() {
		return inputTheory.getAttribute("value");
	}
	
}
