package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ua.bms.osop.model.Unit1ProceedingToPrcCardModel;

public class Unit1ProceedingToPrcCard extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit1ProceedingToPrcCard(PageManager pages) {
		super(pages);
	}
	
	/*------------------The Web-Elements of the Review To Procuracy Card on Basic Statements----------------------------------------------------*/

	//Tab "Stages"("Стадії")
	@FindBy(xpath = "//div[contains(@id, 'unit1-reviewToPrcCard')]//div[contains(@id, 'tabbar')]/a[2]")
	private WebElement tabStages;

	//Title Card "Review Proceeding"("НП за позовом до органів прокуратури")
	@FindBy(xpath = "//div[contains(@id, 'unit1-reviewToPrcCard')]//div[contains(., 'до органів прокуратури')]")
	private WebElement titleUnit1ProceedingToPrcCard;

	//Type of justice
	@FindBy(xpath = "//div[contains(@id, 'unit1-reviewToPrcTabMain')]//span[contains(., 'Вид судочинства')]")
	private WebElement inputJusticeType;
	//First item of Type of justice
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[1]")
	private WebElement itemJusticeType;

	//General subject matter
	@FindBy(xpath = "//div[contains(@id, 'unit1-reviewToPrcTabMain')]//span[contains(., 'Тематика питання')]")
	private WebElement inputGeneralSubject;
	//First item of General subject matter
	@FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[2]")
	private WebElement itemGeneralSubject;

	//Input field "Plaintiff" ("Позивач")
	@FindBy(xpath = "//div[contains(@id, 'unit1-reviewToPrcTabMain')]//label[contains(., 'Позивач')]/following-sibling::div//input")
	private WebElement inputPlaintiff;

	//Input field "Defendant" ("Відповідач")
	@FindBy(xpath = "//div[contains(@id, 'unit1-reviewToPrcTabMain')]//label[contains(., 'Відповідач')]/following-sibling::div//input")
	private WebElement inputDefendant;


	/*-----------------The Web-Elements of the "Proceeding to Procuracy" Card on "Stages" Tab-------------*/

	//Title of Grid "Creation of stages is available after saving RP"("Створення стадій доступно після збереження НП")
	@FindBy(xpath = "//div[contains(text(), 'Створення стадій доступно після збереження НП')]")
	private WebElement titleStageCreatingIsUnable;


	//Button "First Instance" for creating a new First Instance Card
	@FindBy(xpath = "//a[contains(@id, 'button')]//span[contains(text(), 'Перша інстанція')]")
	private WebElement buttonFirstInstance;

	/*------------------Methods of the Review To Procuracy Card-------------------------------------------------------------*/

	//Checks if Title of Proceeding Card exists
	public boolean isTitleOfCardIsPresent() {
		return isElementPresent(titleUnit1ProceedingToPrcCard);
	}

	public void clickOnStagesTab() {
		fluientWaitforElement(tabStages).click();
	}

	//Sets the new card with filling all fields in
	public Unit1ProceedingToPrcCard setProceedingToPrcCardUnit1(Unit1ProceedingToPrcCardModel unit1ProceedingToPrcCardModel){
		inputJusticeType.click();
		fluientWaitforElement(itemJusticeType).click();
		inputGeneralSubject.click();
		fluientWaitforElement(itemGeneralSubject).click();
		type(inputPlaintiff, unit1ProceedingToPrcCardModel.getPlaintiff());
		type(inputDefendant, unit1ProceedingToPrcCardModel.getDefendant());
		return this;
	}

	//Getting value from input-field "Plaintiff" in formerly created card
	public String getInputPlaintiff() {
		return inputPlaintiff.getAttribute("value");
	}

	//Editing SOME field ("Defendant" ("Відповідач(боржник)"))
	public void setInputDefendant(String someText){
		type(inputDefendant, someText);
	}

	//Getting existing value from input-field ("Defendant" ("Відповідач(боржник)"))
	public String getInputDefendant() {
		return inputDefendant.getAttribute("value");
	}

		/*------------------Methods of Proceeding Card on "Stages" Tab----------------------------------*/

	//Checks if title of Grid is present on "Stages" tab in "Proceeding" Card
	public boolean isTitleOfGridStageCreatingIsUnablePresent() {
		return isElementPresent(titleStageCreatingIsUnable);
	}

	//Checks if button "First Instance" is present on "Stages" tab in "Proceeding" Card
	public boolean isButtonCreateFirstInstancePresent() {
		return isElementPresent(buttonFirstInstance);
	}
}
