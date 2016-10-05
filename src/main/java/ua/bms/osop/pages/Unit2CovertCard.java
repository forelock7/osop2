package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.bms.osop.model.Unit2CovertCardModel;

public class Unit2CovertCard extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2CovertCard(PageManager pages) {
		super(pages);
	}
	
	/*------------------The Web-Elements of the Card------------------------------------------------------*/
	
	//Input field "Type of Document" ("Вид документа")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actNSRDTabMain')]//span[contains(., 'Вид документа')]")
	private WebElement inputDocumentType;
	//First item of Type of Document
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[1]") 
	private WebElement itemDocumentType;
	
	//Input field "Pre-Investigation Bodies" ("Органи досудового розслідування.")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actNSRDTabMain')]//span[contains(., 'Органи досудового')]")
	private WebElement inputPreInvestigationBodies;
	//First item of Pre-Investigation Bodies
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[2]") 
	private WebElement itemPreInvestigationBodies;
	
	//Input field "Decision of Prosecutor" ("Рішення прокурора")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actNSRDTabMain')]//span[contains(., 'Рішення прокурора')]")
	private WebElement inputProsecutorDecision;
	//First item of "Decision of Prosecutor"
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[3]") 
	private WebElement itemProsecutorDecision;
	
	//Input field "Date of Prosecutor's Decision" ("Дата рішення прокурора")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actNSRDTabMain')]/div[2]//input[contains(@id, 'datefield')]")
	private WebElement inputProsecutorDecisionDate;
	
	//Input field "Result of court review" ("Результат розгляду суду")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actNSRDTabMain')]//span[contains(., 'Результат розгляду суду')]")
	private WebElement inputCourtResult;
	//First item of "Result court review"
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[4]") 
	private WebElement itemCourtResult;
	
	//Input field "Date of Result of court review" ("Дата рішення суду")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actNSRDTabMain')]/div[3]//input[contains(@id, 'datefield')]")
	private WebElement inputCourtResultDate;
	
	/*------------------Methods of Act of Card-------------------------------------------------------------*/
	
	//Sets the new card with filling all fields in
	public Unit2CovertCard setCovertCardUnit2(Unit2CovertCardModel unit2CovertCardModel){
		inputDocumentType.click();
		fluientWaitforElement(itemDocumentType).click();
		inputPreInvestigationBodies.click();
		fluientWaitforElement(itemPreInvestigationBodies).click();
		inputProsecutorDecision.click();
		fluientWaitforElement(itemProsecutorDecision).click();
		type(inputProsecutorDecisionDate, unit2CovertCardModel.getProsecutorDecisionDate());
		inputCourtResult.click();
		fluientWaitforElement(itemCourtResult).click();
		type(inputCourtResultDate, unit2CovertCardModel.getCourtResultDate());
		return this;
	}
		
	//Getting value from input-field in formerly created card
	public String getInputProsecutorDecisionDate() {
		return inputProsecutorDecisionDate.getAttribute("value");
	}
	
	//Editing SOME field "Date of Result of court review" ("Дата рішення суду")
	public void setInputCourtResultDate(String someText){
		type(inputCourtResultDate, someText);
	}
	
	//Getting existing value from input-field "Date of Result of court review" ("Дата рішення суду")
	public String getInputCourtResultDate() {
		return inputCourtResultDate.getAttribute("value");
	}
	
}
